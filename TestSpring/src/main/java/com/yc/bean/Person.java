package com.yc.bean;

public class Person {
	private String name; //装配  注入值
	private int age;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Person(){
		System.out.println("Persion对象的构造方法被调用");
	}	
	public void showHello(){
		System.out.println("Hello world");
	}
	

}
