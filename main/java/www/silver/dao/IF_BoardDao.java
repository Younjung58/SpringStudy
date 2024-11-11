package www.silver.dao;

import www.silver.vo.BoardVO;

public interface IF_BoardDao {
	// DB 작업이 목적
	// mybatis mapper랑 매핑해서 DB작업을 수행
	public void insertBoard(BoardVO boardvo) throws Exception;
}
