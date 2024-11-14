package www.silver.service;

import java.util.List;

import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

public interface IF_BoardService {
	// 서비스를 정의
	public void addBoard(BoardVO boardvo) throws Exception ;
	// 의미: 클라이언트의 글작성 요청을 처리하기 위한 서비스 정의
	public List<BoardVO> boardlist(PageVO pagevo) throws Exception; 
	// 서비스를 정의: 클라이언트가 요청한 전체목록보기 서비스를 정의함
	public void deleteBoard(String delno) throws Exception;
	public BoardVO modBoard(String modno) throws Exception;
	public void modBoard(BoardVO bvo) throws Exception;		// 메서드 오버로딩 기법 사용
	public int totalCountBoard() throws Exception;
	public BoardVO getBoard(String no) throws Exception;
	public List<String> getAttach(String no) throws Exception;
}
