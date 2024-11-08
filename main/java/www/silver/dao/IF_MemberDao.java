package www.silver.dao;

import www.silver.vo.MemberVO;

public interface IF_MemberDao {
	// DB작업을 메서드로 정의
	public void insertOne(MemberVO membervo)throws Exception;
}
