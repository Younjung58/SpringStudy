package www.silver.util;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller	// 주입과 다운로드 서비스에 대한 정의를 동시에 해결하기 위하여 Controller로 어노테이션 설정
public class FileDataUtil {
	
	private ArrayList<String> extNameArray = new ArrayList<String>() // 허용하는 확장자 정의를 한 것.
	{
		{
			add("gif");
			add("jpg");
			add("png");
		}
	};     //<-- 현재 코드는 활용하지는 않는다.. 얘는 선언이지 기능이 동작하지는 않는다. 절대 미리 예측 금지..
	
	
	//첨부파일 업로드 경로 변수값으로 가져옴 servlet-context.xml
	// @Resource도 @Inject와 마찬가지로 객체주소 주입받는 코드
	// @Resource는 name(이름)을 통하여 객체의 주소를 주입받음
	// 즉,컨테이너로부터 uploadPath의 이름을 가진 객체 주소를 주입받겠다는 의미
	@Resource(name="uploadPath")			// beans의 id 값이 name과 일치해야함	
	private String uploadPath;	
	// DI : 객체의 주소를 컨테이너로부터 주입받겠다.
	// 주소를 개발자가 입력하는 것이 아니라, 스프링 컨테이너가 주소를 주는대로 저장하겠습니다(그러니 값을 주세요)라는 느낌 
	// 이것이 IOC(개발이 역전됨, 주체가 바뀜, Inverse Of Control)의 개념. 개발에 있어서 개발자가 아닌 스프링이 주체이다. 
	// 개발자는 받아오는 값을  신경쓰지 않겠다.
	
	public String getUploadPath() {
		// 첨부파일의 위치를 지정, 이곳에다가 저장하겠다는 것
		return uploadPath;
		
//		return uploadPath="/tmp";
		// 위와 같이 코드를 작성한다면, 변경사항이 생겼을 때 자바 소스를 변경해야하는데, 
		// 스프링은 자바소스를 건들지 않고, 환경 설정만을 바꾸겠다는 컨셉
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	/**
	 * 게시물 상세보기에서 첨부파일 다운로드 메서드 구현(공통)
	 */
	@RequestMapping(value="/download", method=RequestMethod.GET)
	@ResponseBody   // 어떤 데이터를 포함하여 전송.. 어노테이션.. view지정하지 않고 바로 클라이언트 요청으로 응답.
	// 리턴타입을 String이 아닌 파일을 보내야하므로 @ResponseBody설정 
	public FileSystemResource fileDownload(@RequestParam("filename") String fileName, HttpServletResponse response) {
		File file = new File(uploadPath + "/" + fileName);
		response.setContentType("application/download; utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		return new FileSystemResource(file);
	}
	
	/**
	 * 파일 업로드 메서드(공통)
	 * @throws IOException 
	 */
	public String[] fileUpload(MultipartFile[] file) throws IOException {
		String[] files = new String[file.length];
		for(int i=0; i < file.length; i++) {
			if(file[i].getOriginalFilename()!="") {  // 실제 file객체가 존재한다면
				String originalName = file[i].getOriginalFilename();//확장자가져오기 위해서 전체파일명을 가져옴.
				UUID uid = UUID.randomUUID();//랜덤문자 구하기 맘에안든다. 
				String saveName = uid.toString() + "." + originalName.split("\\.")[1];
												// 파일명.jpg이라면 .을 기준으로 잘려서 1번째값인 확장자(jpg) 저장
				
				//한글 파일명 처리 때문에...      split으로 첨부파일만 끊어옴(확장자는 가져온 이름으로 올려주기 위해)
				// 
				
				
				
//			String[] files = new String[] {saveName}; //형변환  files[0] 파일명이 들어 간다..
				byte[] fileData = file[i].getBytes();
				// binary파일 -> 2진수로 바꾸어 용량저장
				File target = new File(uploadPath, saveName);		// 위치, 파일명
				FileCopyUtils.copy(fileData, target);	// 2진수로 바꾼 파일명을, 그 위치에 저장해라
				files[i]=saveName;		// 변경된 파일명만 가지고 있음
			}			
		}		
		return files;
	}

	public ArrayList<String> getExtNameArray() {
		return extNameArray;
	}

	public void setExtNameArray(ArrayList<String> extNameArray) {
		this.extNameArray = extNameArray;
	}
}
