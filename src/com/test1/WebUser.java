package com.test1;

public class WebUser {
	private String loginID;
	private String password;
	private String sessionId;
	private String state;
	private String sessionAttr;
	private String sessionAttrValues;
	private String remarks;

	public WebUser() {

	}

	public WebUser(String loginID, String password, String sessionId, String state, String sessionAttr,
			String sessionAttrValues, String remarks) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.sessionId = sessionId;
		this.state = state;
		this.sessionAttr = sessionAttr;
		this.sessionAttrValues = sessionAttrValues;
		this.remarks = remarks;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSessionAttr() {
		return sessionAttr;
	}

	public void setSessionAttr(String sessionAttr) {
		this.sessionAttr = sessionAttr;
	}

	public String getSessionAttrValues() {
		return sessionAttrValues;
	}

	public void setSessionAttrValues(String sessionAttrValues) {
		this.sessionAttrValues = sessionAttrValues;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
