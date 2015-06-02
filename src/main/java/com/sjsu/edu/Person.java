package com.sjsu.edu;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public Person(){
		
	}
	
	//factory method
	public static Person getInstance(int id, String name){
		System.out.println("Creating Person using factory methods");
		return new Person(id, name);
	}
	
	public void onCreate(){
		System.out.println("Person is created : " + this);
	}
	
	public void onDestroy(){
		System.out.println("Person Destroyed : " + this);
	}
	
	public void speak(){
		System.out.println("Hello !! I'm a person.");
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	
	
}
