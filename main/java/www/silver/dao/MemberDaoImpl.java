package www.silver.dao;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.MemberVO;

// @Repository는 퍼시스턴스 테이어로, DB나 파일같은 외부 I/O작업을 처리 + 해당 클래스틑 루트 컨테이너에 bean객체로 생성
@Repository
public class MemberDaoImpl implements IF_MemberDao{
	// 여기서 Mybatis로 데이터를 넘겨주는 것.
	
	// sqlSession의 객체 필요(import부분 확인)
	// 주소가 올바르게 주입되려면 root-context.xml에서 설정이 잘 되어있어야 한다.
	@Inject
	SqlSession sqlSession;
	private static String mapperQuery = "www.silver.dao.IF_MemberDao";
	@Override
	public void insertOne(MemberVO membervo) throws Exception {
		// TODO Auto-generated method stub
		// sqlSessionTemplate의 객체의 메소드를 call
		// sqlSession.insert("mapper와 매핑정보","파마미터 값");
		sqlSession.insert(mapperQuery+".insertOne",membervo);
		// www.silver.dao.IF_MemeberDao.inserOne	<<	매핑의 정보
		// 이 정보를 가지고 memberMapper.xml에서 매칭을 시키고, 쿼리문으로 매핑을 한다.
	}

}
