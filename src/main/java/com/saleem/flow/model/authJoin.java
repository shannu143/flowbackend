package com.saleem.flow.model;

public class authJoin {

	  private long id;
	  private String name;
	  private String credentials;
	  private boolean is_active;
	  private String app_name;
	  private String rules;
	  private long app_id;
	  private String logo;
	  private String type;
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
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public long getApp_id() {
		return app_id;
	}
	public void setApp_id(long app_id) {
		this.app_id = app_id;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "authJoin [id=" + id + ", name=" + name + ", credentials=" + credentials + ", is_active=" + is_active
				+ ", app_name=" + app_name + ", rules=" + rules + ", app_id=" + app_id + ", logo=" + logo + ", type="
				+ type + "]";
	}
	public authJoin() {
		super();
	}
	public authJoin(long id, String name, String credentials, boolean is_active, String app_name, String rules,
			long app_id, String logo, String type) {
		super();
		this.id = id;
		this.name = name;
		this.credentials = credentials;
		this.is_active = is_active;
		this.app_name = app_name;
		this.rules = rules;
		this.app_id = app_id;
		this.logo = logo;
		this.type = type;
	}
}
