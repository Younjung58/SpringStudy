package www.silver.vo;
// spring에서는 dto대신에 VO사용
public class MemberVO {
	// html의 name이름과 VO의 변수명과 데이터베이스의 컬럼명이 일치해야 자동으로 매핑해준다. - Mybatis가
	String id = null;
	String pass = null;
	String tel = null;
	String email = null;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pass=" + pass + ", tel=" + tel + ", email=" + email + "]";
	}
}
