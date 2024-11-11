package www.silver.service;

import www.silver.vo.BoardVO;

public interface IF_BoardService {
	// 서비스를 정의
	public void addBoard(BoardVO boardvo) throws Exception ;
	// 의미: 클라이언트의 글작성 요청을 처리하기 위한 서비스 정의
}
