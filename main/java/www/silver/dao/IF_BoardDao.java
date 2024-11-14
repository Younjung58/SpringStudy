package www.silver.dao;

import java.util.List;

import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

public interface IF_BoardDao {
	// DB 작업이 목적
	// mybatis mapper랑 매핑해서 DB작업을 수행
	public void insertBoard(BoardVO boardvo) throws Exception;
	public List<BoardVO> selectAll(PageVO pagevo) throws Exception;
	public void delete(String delno) throws Exception;
	public BoardVO selectone(String modno) throws Exception;
	public void updateBoard(BoardVO bvo) throws Exception;
	public int totalCountBoard() throws Exception;
	public void insertAttach(String fname) throws Exception;
	public List<String> selectAllAttach(String no) throws Exception;
}
