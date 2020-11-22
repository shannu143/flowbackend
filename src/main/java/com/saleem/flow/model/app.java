package com.saleem.flow.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="app")
public class app {
   
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	private String logo;
	
	@Column(name="description")
	private String description;
	
	@Column(name="type")
	private String type;
	
	@Column(name="rules", length = 5250)
	private String rules;
	
	@Column(name="is_active")
	private boolean is_active;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_date;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "upadte_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date upadte_date;
	
	public app() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "app [id=" + id + ", name=" + name + ", logo=" + logo + ", description=" + description + ", type=" + type
				+ ", rules=" + rules + ", is_active=" + is_active + ", created_date=" + created_date + ", upadte_date="
				+ upadte_date + "]";
	}

	
}
