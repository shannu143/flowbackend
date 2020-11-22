package com.saleem.flow.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.saleem.flow.model.app;

@Entity
@Table(name="app_authentication")
public class app_authentication {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="is_active")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean is_active;
	
	private String name;
	
	@Column(name="credentials", length=5250)
	private String credentials;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date created_date;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "upadte_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@UpdateTimestamp
	private Date upadte_date;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "app_id", referencedColumnName = "id",nullable = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private app app;
	
	@Transient
	private Long appId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpadte_date() {
		return upadte_date;
	}

	public void setUpadte_date(Date upadte_date) {
		this.upadte_date = upadte_date;
	}

	public app getApp() {
		return app;
	}

	public void setApp(app app) {
		this.app = app;
	}

	public app_authentication() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}



}
