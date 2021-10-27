package com.example.demo.User;

public class UserDto {
	private int userSeq;
	private String email;
	private String userId;
	private String userPassword;
	private String userNikname;
	
	public UserDto(int userSeq, String email, String userId, String userPassword, String userNikname) {
		this.userSeq = userSeq;
		this.email = email;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userNikname = userNikname;
	}
	
	public UserDto() {}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNikname() {
		return userNikname;
	}

	public void setUserNikname(String userNikname) {
		this.userNikname = userNikname;
	}
	
	
	

}
