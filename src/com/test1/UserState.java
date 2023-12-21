package com.test1;

public class UserState {
	private String stateId;
	private String newState;
	private String actionState;
	private String blockedState;
	private String bannedState;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserState() {

	}

	public UserState(String stateId, String newState, String actionState, String blockedState, String bannedState,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.stateId = stateId;
		this.newState = newState;
		this.actionState = actionState;
		this.blockedState = blockedState;
		this.bannedState = bannedState;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getNewState() {
		return newState;
	}

	public void setNewState(String newState) {
		this.newState = newState;
	}

	public String getActionState() {
		return actionState;
	}

	public void setActionState(String actionState) {
		this.actionState = actionState;
	}

	public String getBlockedState() {
		return blockedState;
	}

	public void setBlockedState(String blockedState) {
		this.blockedState = blockedState;
	}

	public String getBannedState() {
		return bannedState;
	}

	public void setBannedState(String bannedState) {
		this.bannedState = bannedState;
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
