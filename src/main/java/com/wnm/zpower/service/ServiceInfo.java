package com.wnm.zpower.service;


public class ServiceInfo {
    private String title;
    private String description;
    private String tag;
    private String icon;

    // Constructor, Getters and Setters
    public ServiceInfo(String title, String description, String tag, String icon) {
        this.title = title;
        this.description = description;
        this.tag = tag;
        this.icon = icon;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
   
    
    
}