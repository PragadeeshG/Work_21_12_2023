package com.test1;

public class Skultem {
	private long id;
	private String name;
	private String category;
	private String type;
	private String upStream;
	private String downStream;
	private String source;
	private String remarks;
	private String consumed;
	private String consumptionMode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Skultem() {

	}

	public Skultem(long id, String name, String category, String type, String upStream, String downStream,
			String source, String remarks, String consumed, String consumptionMode, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.type = type;
		this.upStream = upStream;
		this.downStream = downStream;
		this.source = source;
		this.remarks = remarks;
		this.consumed = consumed;
		this.consumptionMode = consumptionMode;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpStream() {
		return upStream;
	}

	public void setUpStream(String upStream) {
		this.upStream = upStream;
	}

	public String getDownStream() {
		return downStream;
	}

	public void setDownStream(String downStream) {
		this.downStream = downStream;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getConsumed() {
		return consumed;
	}

	public void setConsumed(String consumed) {
		this.consumed = consumed;
	}

	public String getConsumptionMode() {
		return consumptionMode;
	}

	public void setConsumptionMode(String consumptionMode) {
		this.consumptionMode = consumptionMode;
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
