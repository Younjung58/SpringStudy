package www.silver.vo;

public class BoardVO {
	String type;
	String username;
	String pass;
	String title;
	String content;
	String viewmember;
	String indate;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getViewmember() {
		return viewmember;
	}
	public void setViewmember(String viewmember) {
		this.viewmember = viewmember;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "BoardVO [type=" + type + ", username=" + username + ", pass=" + pass + ", title=" + title + ", content="
				+ content + ", viewmember=" + viewmember + ", indate=" + indate + "]";
	}
}
