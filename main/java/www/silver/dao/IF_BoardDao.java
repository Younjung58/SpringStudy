package www.silver.dao;

import java.util.List;

import www.silver.vo.BoardVO;

public interface IF_BoardDao {
	// DB 작업이 목적
	// mybatis mapper랑 매핑해서 DB작업을 수행
	public void insertBoard(BoardVO boardvo) throws Exception;
	public List<BoardVO> selectAll() throws Exception;
	public void delete(String delno) throws Exception;
}
