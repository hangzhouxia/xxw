package com.bbs.dao;
import java.io.Serializable;

public class Page{

    private String name;
    private String about;
    private String phone;
    private String website;

    public void setName(String name) {
		this.name = name;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

}