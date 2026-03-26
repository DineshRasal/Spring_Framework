package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> City;
	private Map<String, String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getCity() {
		return City;
	}
	public void setCity(Set<String> city) {
		City = city;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Emp(String name, List<String> phones, Set<String> city, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		City = city;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
