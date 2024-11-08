package www.silver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_MemberDao;
import www.silver.vo.MemberVO;
// @Service는 서비스레이어로, 내부에서 자바 로직을 처리 + 해당 클래스를 루트 컨테이너에 bean객체로 생성해주는 어노테이션
@Service		// 해당 클래스를 객체로 만들어라는 의미로 어노테이션 지정
public class MemberServiceImpl implements IF_MemberService{
							// 스프링에서는 인터페이스 한개당 하나의 클래스만 구현받아야함 ******
							// 따라서 아래의 @Inject이 가능한 것이다.(구현받은 클래스가 하나뿐이기 때문에 주입이 가능한 것임)
	@Inject
	IF_MemberDao memberdao;		// 인터페이스 타입으로 구현받은 객체를 생성하도록 정의하고 있음
	// 인터페이스를 구현받은 다른 클래스가 생성된다면, 해당 객체의 타입또한 같이 바꿔줘야하지만,
	// 인터페이스 타입으로 객체를 생성하게 된다면 타입은 바꾸지 않아도 되기때문에 해당 방법 사용 
	@Override
	public void join(MemberVO membervo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("join 서비스");
		// 아이디 검사 등 중복체크를 할 수 있다.
		// dao에게 작업을 지시해야한다.
		
		// 아래와같이 실제 데이터를 저장하도록 지시
		memberdao.insertOne(membervo);
	}

}
