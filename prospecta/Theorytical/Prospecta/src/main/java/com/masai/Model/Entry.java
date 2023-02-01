package com.masai.Model;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Entry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String Api;
	
	private String Link;
	
	private String description;
	
	private String auth;
	
	private boolean https;
	
	private String cors;
	
	private String category;

	public Entry() {
		super();
	}

	public Entry(String api, String link, String description, String auth, boolean https, String cors,
			String category) {
		super();
		Api = api;
		Link = link;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.cors = cors;
		this.category = category;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getApi() {
		return Api;
	}

	public void setApi(String api) {
		Api = api;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public boolean isHttps() {
		return https;
	}

	public void setHttps(boolean https) {
		this.https = https;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
