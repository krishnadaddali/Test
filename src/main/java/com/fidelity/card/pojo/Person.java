package com.fidelity.card.pojo;

public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private String graduation;
	private String address;
	private String status;

	public Person(int id, String name, String graduation, String address,
			String status) {

		this.id = id;
		this.name = name;
		this.graduation = graduation;
		this.address = address;
		this.status = status;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", graduation="
				+ graduation + ", address=" + address + ", status=" + status
				+ "]";
	}

	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

}
