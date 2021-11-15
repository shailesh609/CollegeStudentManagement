package com.WebApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;


@Entity
@Table(name="Student")
public class students {
	

	@Id
	@Column(name="Student_Id")
	private int id;
	
	@Column(name="Student_Name")
	private String name;
	
	@Column(name="Student_Age")
	private int age;
	
	@Column(name="Student_Gender")
	private String gender;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="college_Id")
	@JsonIgnoreProperties("student")
	private college colg;

	public students(int id, String name, int age, String gender, college colg) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.colg = colg;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public college getColg() {
		return colg;
	}

	public void setColg(college colg) {
		this.colg = colg;
	}

	public students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "students [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", colg=" + colg.getCollegeid() + "]";
	}

	
	

}
