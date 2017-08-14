package com.ives.core.bean;

import java.io.Serializable;
import java.util.Date;

public class UserLogin implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String mobile; // 手机/登录账号
	private String email; // 邮箱/登录账号
	private String password; // 密码
	private Boolean status; // 状态
	private Date lastLoginTime; // 上次登录时间
	private Date createTime; // 创建时间

	public UserLogin() {
		super();
	}

	public UserLogin(Long id, String mobile, String email, String password, Boolean status, Date lastLoginTime,
			Date createTime) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.status = status;
		this.lastLoginTime = lastLoginTime;
		this.createTime = createTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
