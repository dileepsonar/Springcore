package com.sspringcore.collections;




import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String>phones;
	private Set<String> adresses;
	private Map<String,String> coursee;
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
	public Set<String> getAdresses() {
		return adresses;
	}
	public void setAdresses(Set<String> adresses) {
		this.adresses = adresses;
	}
	public Map<String, String> getCoursee() {
		return coursee;
	}
	public void setCoursee(Map<String, String> coursee) {
		this.coursee = coursee;
	}
	public Emp(String name, List<String> phones, Set<String> adresses, Map<String, String> coursee) {
		super();
		this.name = name;
		this.phones = phones;
		this.adresses = adresses;
		this.coursee = coursee;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}

