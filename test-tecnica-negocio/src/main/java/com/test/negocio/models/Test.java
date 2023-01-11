package com.test.negocio.models;

import java.io.Serializable;
import java.util.Date;

public class Test implements Serializable {

	private int idUser;
	private String name;
	private String email;
	private Date createAt = new Date();

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", email=" + email + ", createAt=" + createAt + "]";
	}

	private static final long serialVersionUID = -3066852349466143738L;
}