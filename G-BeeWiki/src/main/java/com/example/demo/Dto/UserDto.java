package com.example.demo.Dto;

public class UserDto {
	 String userNumber, userEmail, userEtype, userPassword, userName, userNickname, userImg;
	   int userAdmin;
	   
	   public UserDto() {
	      // TODO Auto-generated constructor stub
	   }

	   public UserDto(String userNumber, String userEmail, String userEtype, String userPassword, String userName,
	         String userNickname, String userImg, int userAdmin) {
	      this.userNumber = userNumber;
	      this.userEmail = userEmail;
	      this.userEtype = userEtype;
	      this.userPassword = userPassword;
	      this.userName = userName;
	      this.userNickname = userNickname;
	      this.userImg = userImg;
	      this.userAdmin = userAdmin;
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
	   
	   public String getUserEtype() {
	      return userEtype;
	   }
	   
	   public void setUserEtype(String userEtype) {
	      this.userEtype = userEtype;
	   }
	   
	   public String getUserPassword() {
	      return userPassword;
	   }
	   
	   public void setUserPassword(String userPassword) {
	      this.userPassword = userPassword;
	   }
	   
	   public String getUserName() {
	      return userName;
	   }
	   
	   public void setUserName(String userName) {
	      this.userName = userName;
	   }
	   
	   public String getUserNickname() {
	      return userNickname;
	   }
	   
	   public void setUserNickname(String userNickname) {
	      this.userNickname = userNickname;
	   }
	   
	   public String getUserImg() {
	      return userImg;
	   }
	   
	   public void setUserImg(String userImg) {
	      this.userImg = userImg;
	   }
	   
	   public int getUserAdmin() {
	      return userAdmin;
	   }
	   
	   public void setUserAdmin(int userAdmin) {
	      this.userAdmin = userAdmin;
	   }
}