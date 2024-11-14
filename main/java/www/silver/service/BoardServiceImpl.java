package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDao;
import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

@Service
public class BoardServiceImpl implements IF_BoardService{

	@Inject
	IF_BoardDao boarddao;
	
	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		
		if(boardvo.getViewmember()!=null) {
			boardvo.setViewmember("비공개");
		}else {
			boardvo.setViewmember("공개");
		}
		// dao > mapper > DB insert
		// 게시글을 kboard에 저장해라
		boarddao.insertBoard(boardvo);
		
		// 만약 첨부파일이 있다면 첨부파일을 kboard_attach로 별도로 저장해라
		String[] fname = boardvo.getFilename();
		if(fname.length>=1) {
			for (int i = 0; i < fname.length; i++) {
				// kboard_attach 테이블에 저장하는 코드
				if(fname[i]!=null) {
					boarddao.insertAttach(fname[i]);
				}
			}
		}
	}

	@Override
	public List<BoardVO> boardlist(PageVO pagevo) throws Exception {
		// TODO Auto-generated method stub
		List<BoardVO> list = boarddao.selectAll(pagevo);
		for(BoardVO b : list) {
			String date = b.getIndate();
			b.setIndate(date.substring(0, 10));
		}
		// 이렇게하면 날짜의 앞 10글자만 값이 재세팅된다. 하지만, 이방법은 서버에게 부담을 주는 방법이다.
		// 따라서 클라이언트측인 view에서 이를 처리할 수 있는 방안을 적용시켜볼것.
		// jstl로 문자열을 잘라서 view에서 보이도록,,,
		// boarddao로부터 넘겨받은 list를 다시 controller에게 넘겨주는 코드
		return list;
	}

	@Override
	public void deleteBoard(String delno) throws Exception {
		// TODO Auto-generated method stub
		boarddao.delete(delno);
	}

	@Override
	public BoardVO modBoard(String modno) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectone(modno);
	}

	@Override
	public void modBoard(BoardVO bvo) throws Exception {
		// TODO Auto-generated method stub
		if(bvo.getViewmember()!=null) {
			bvo.setViewmember("비공개");
		}else {
			bvo.setViewmember("공개");
		}
		boarddao.updateBoard(bvo);
		
	}

	@Override
	public int totalCountBoard() throws Exception {
		// TODO Auto-generated method stub
		return boarddao.totalCountBoard();
	}

	@Override
	public BoardVO getBoard(String no) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectone(no);
	}

	@Override
	public List<String> getAttach(String no) throws Exception {
		// TODO Auto-generated method stub
		return boarddao.selectAllAttach(no);
	}

}
