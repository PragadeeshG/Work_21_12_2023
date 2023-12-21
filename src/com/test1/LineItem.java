package com.test1;

public class LineItem {
	private long skuCode;
	private long quantity;
	private double price;
	private String onHold;
	private String isDraft;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LineItem() {

	}

	public LineItem(long skuCode, long quantity, double price, String onHold, String isDraft, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.skuCode = skuCode;
		this.quantity = quantity;
		this.price = price;
		this.onHold = onHold;
		this.isDraft = isDraft;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(long skuCode) {
		this.skuCode = skuCode;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOnHold() {
		return onHold;
	}

	public void setOnHold(String onHold) {
		this.onHold = onHold;
	}

	public String getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(String isDraft) {
		this.isDraft = isDraft;
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
