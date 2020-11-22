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

@Entity
@Table(name="action")
public class action {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="rest_body", length=5250)
	private String rest_body;
	
	@Column(name="rest_url")
	private String rest_url;
	
	@Column(name="rest_header")
	private String rest_header;
	
	@Column(name="rest_type")
	private String rest_type;
	
	@Column(name="rules")
	private String rules;
	
	@Column(name="is_active")
	private boolean is_active;
	
	@OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinColumn(name = "app_id", referencedColumnName = "id",nullable = true)
	private app app_id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_date;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "upadte_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date upadte_date;

	public action() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRest_body() {
		return rest_body;
	}

	public void setRest_body(String rest_body) {
		this.rest_body = rest_body;
	}

	public String getRest_url() {
		return rest_url;
	}

	public void setRest_url(String rest_url) {
		this.rest_url = rest_url;
	}

	public String getRest_header() {
		return rest_header;
	}

	public void setRest_header(String rest_header) {
		this.rest_header = rest_header;
	}

	public String getRest_type() {
		return rest_type;
	}

	public void setRest_type(String rest_type) {
		this.rest_type = rest_type;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
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

	public app getApp_id() {
		return app_id;
	}

	public void setApp_id(app app_id) {
		this.app_id = app_id;
	}
	
	
}
