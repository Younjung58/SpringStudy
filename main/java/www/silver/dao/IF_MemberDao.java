package www.silver.dao;

import www.silver.vo.MemberVO;

public interface IF_MemberDao {
	//디비 작업을 메서드로 정의 합니다.
	public void insertOne(MemberVO membervo)throws Exception;
	

}
