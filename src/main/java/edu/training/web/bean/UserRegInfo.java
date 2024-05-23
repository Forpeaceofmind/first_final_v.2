package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class UserRegInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;
	private String password;
	private String name;
	private String bithDate;
	private String residence;
	private String email;
	private String phone;
	private String adress;

	public UserRegInfo() {
		super();
	}

	public UserRegInfo(String login, String password, String name, String bithDate, String residence, String email,
			String phone, String adress) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
		this.bithDate = bithDate;
		this.residence = residence;
		this.email = email;
		this.phone = phone;
		this.adress = adress;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBithDate() {
		return bithDate;
	}

	public void setBithDate(String bithDate) {
		this.bithDate = bithDate;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, adress, bithDate, email, login, password, phone, residence);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRegInfo other = (UserRegInfo) obj;
		return Objects.equals(name, other.name) && Objects.equals(adress, other.adress)
				&& Objects.equals(bithDate, other.bithDate) && Objects.equals(email, other.email)
				&& Objects.equals(login, other.login) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(residence, other.residence);
	}

	@Override
	public String toString() {
		return "UserRegInfo [login=" + login + ", password=" + password + ", name=" + name + ", bithDate=" + bithDate
				+ ", residence=" + residence + ", email=" + email + ", phone=" + phone + ", adress=" + adress + "]";
	}

}
