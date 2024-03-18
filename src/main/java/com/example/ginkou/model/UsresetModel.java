package com.example.ginkou.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="userset")
public class UsresetModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long user_id;
	
	@Column(length = 32, nullable = false)
	private String name;
	
	@Column(length = 250, nullable = false)
	private String address;
	
	@Column(length = 20, nullable = false)
	private String phone_number;
	
	@Column(length = 32, nullable = false)
	private String password;
	
	public long getuser_id() {
		return user_id;
	}
	public void setuser_id(long user_id) {
		this.user_id = user_id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getphone_number() {
		return phone_number;
	}
	public void setphone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String password() {
		return password;
	}
	public void password(String password) {
		this.password = password;
	}
}