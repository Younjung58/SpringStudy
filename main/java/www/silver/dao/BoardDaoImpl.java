package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.BoardVO;
@Repository
public class BoardDaoImpl implements IF_BoardDao{
	
	@Inject
	SqlSession sqlsession;
	private final String mapperquery = "www.silver.dao.IF_BoardDao";
	
	@Override
	public void insertBoard(BoardVO boardvo) throws Exception{
		// TODO Auto-generated method stub
		// sqlsession을 통해서 mapper와 매핑해야하기에 정보를 넘겨준다.
		sqlsession.insert(mapperquery+".inin", boardvo);
	}

	@Override
	public List<BoardVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList(mapperquery+".selectall");
	}

	@Override
	public void delete(String delno) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.delete(mapperquery+".delone", delno);
	}

}
