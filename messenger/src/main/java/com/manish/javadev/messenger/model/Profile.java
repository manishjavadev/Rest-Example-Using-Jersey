package com.manish.javadev.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private String author;

	public Profile() {
	}

	
	
	public Profile(long id, String profileName, String firstName,
			String lastName, String author) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.author = author;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}