package www.silver.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.MemberVO;
@Repository
public class MemberDaoImpl implements IF_MemberDao {

	//sqlSession이 필요합니다.  Mybatis에서제공하는 객체
	//주소가 올바르게 주입되려면 root-context.xml에서 설정이 잘 되어 있어야 한다.
	@Inject
	SqlSession sqlSession;
	private final String mapperQuery="www.silver.dao.IF_MemberDao";
	@Override
	public void insertOne(MemberVO membervo) throws Exception {
		// sqlSessiomTemplate 의 객체의 메서드를  call하면된다.
		//sqlSession.insert("mapper와 매핑정보", "마라미터값");
		System.out.println("dao");
		sqlSession.insert(mapperQuery+".insertOne",membervo);
		//   www.silver.dao.IF_MemberDao.insertOne  << 매핑의정보
	}

}
