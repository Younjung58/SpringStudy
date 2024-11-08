package www.silver.service;

import www.silver.vo.MemberVO;

// 결합도 낮추기 위하여 인터페이스 정의
public interface IF_MemberService {
	
	// 서비스 작업을 메서드로 정의
	// 컨트롤러가 조인 작업을 요청한다. 이때 매개변수로 객체의 주소를 전달한다.
	public void join(MemberVO mvo) throws Exception;
									// 예외 처리
	
}
