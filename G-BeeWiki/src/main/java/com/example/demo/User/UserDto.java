package com.example.demo.User;

public class UserDto {
	 String userNumber, userEmail, userPassword, userNickname, userName;

	 public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(String userNumber, String userEmail, String userPassword, String userNickname, String userName) {
		this.userNumber = userNumber;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userNickname = userNickname;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "[userNumber=" + userNumber + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userNickname=" + userNickname + ", userName=" + userName + "]";
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}