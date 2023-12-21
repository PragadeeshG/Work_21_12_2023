package com.test1;

public class Account {
	private long id;
	private long hedgeAccId;
	private long accNum;
	private String hedgeAccNum;
	private String address;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Account() {

	}

	public Account(long id, long hedgeAccId, long accNum, String hedgeAccNum, String address, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.hedgeAccId = hedgeAccId;
		this.accNum = accNum;
		this.hedgeAccNum = hedgeAccNum;
		this.address = address;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getHedgeAccId() {
		return hedgeAccId;
	}

	public void setHedgeAccId(long hedgeAccId) {
		this.hedgeAccId = hedgeAccId;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getHedgeAccNum() {
		return hedgeAccNum;
	}

	public void setHedgeAccNum(String hedgeAccNum) {
		this.hedgeAccNum = hedgeAccNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
