package com.WebApp.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="College")
public class college {
	
	@Id
	@Column(name="College_Id")
	private int collegeid;
	
	@Column(name="College_Name")
	private String name;
	
	@Column(name="College_Strength")
	private int strength;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="colg")
	@JsonIgnoreProperties("colg")
	private List<students> student;
	
	
	public college(int collegeid, String name, int strength, List<students> student) {
		super();
		this.collegeid = collegeid;
		this.name = name;
		this.strength = strength;
		this.student = student;
	}
	public college() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public List<students> getStudent() {
		return student;
	}
	public void setStudent(List<students> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "college [collegeid=" + collegeid + ", name=" + name + ", strength=" + strength + ", student=" + student
				+ "]";
	}
	
	
	
}
