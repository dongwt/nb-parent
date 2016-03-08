package com.dongwt.nb.model.b;

import java.io.Serializable;

/**
 * b端用户对象
 * @author dongwt
 *
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String realName;
	private String nickName;
	private String passWord;
	private String email;
	private String phone;
	private Long recentLoginTime;
	private Integer status;
	
	
	
	public User() {}


	public User(String id, String realName, String nickName, String passWord, String email, String phone, Long recentLoginTime, Integer status) {
		this.id = id;
		this.realName = realName;
		this.nickName = nickName;
		this.passWord = passWord;
		this.email = email;
		this.phone = phone;
		this.recentLoginTime = recentLoginTime;
		this.status = status;
	}
	
	
	
	public User(String realName, String nickName, String passWord, String email, String phone, Integer status) {
		super();
		this.realName = realName;
		this.nickName = nickName;
		this.passWord = passWord;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getRecentLoginTime() {
		return recentLoginTime;
	}
	public void setRecentLoginTime(Long recentLoginTime) {
		this.recentLoginTime = recentLoginTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
	
	

}
