package com.pany.po;

/**
 * Student entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String love;
	private String dece;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String username, String love, String dece) {
		this.username = username;
		this.love = love;
		this.dece = dece;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLove() {
		return this.love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getDece() {
		return this.dece;
	}

	public void setDece(String dece) {
		this.dece = dece;
	}

}