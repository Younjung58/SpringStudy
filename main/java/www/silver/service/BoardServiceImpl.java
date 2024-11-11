package www.silver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDao;
import www.silver.vo.BoardVO;

@Service
public class BoardServiceImpl implements IF_BoardService{

	@Inject
	IF_BoardDao boarddao;
	
	@Override
	public void addBoard(BoardVO boardvo) throws Exception {
		// TODO Auto-generated method stub
		if(boardvo.getViewmember()!=null) {
			boardvo.setViewmember("공개");
		}else {
			boardvo.setViewmember("비공개");
		}
		// dao > mapper > DB insert
		boarddao.insertBoard(boardvo);
	}
}
