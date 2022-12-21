package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignment")
public class User {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "pincode")
	private long pincode;

	@Column(name = "state")
	private String state;

	@Column(name = "row_creation_timestamp")
	private String row_creation_timestamp;

	public User() {
	}

	public User(String name, String address, long pincode, String state, String row_creation_timestamp) {
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.state = state;
		this.row_creation_timestamp = row_creation_timestamp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRow_creation_timestamp() {
		return row_creation_timestamp;
	}

	public void setRow_creation_timestamp(String row_creation_timestamp) {
		this.row_creation_timestamp = row_creation_timestamp;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode
				+ ", state =" + state + ",row_creation_timestamp=" + row_creation_timestamp + "]";
	}

}

