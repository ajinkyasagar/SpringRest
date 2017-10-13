package com.course.tutorialdsfg;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String name;
	String lname;
	
	List<questoinanswer> lista= new ArrayList<>();
	
 	public List<questoinanswer> getLista() {
		return lista;
	}
	public void setLista(List<questoinanswer> lista) {
		this.lista = lista;
	}
	public Employee(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
		lista.add(new questoinanswer("1","2"));
		lista.add(new questoinanswer("1","2"));
		lista.add(new questoinanswer("1","2"));
		lista.add(new questoinanswer("1","2"));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
