package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name ="test_transient_table")
public class TransientAnnotationDomain {
	
	@Id
	@GeneratedValue
	public Long id;
	public int num1;
	public int num2;
	public int result;
	
	@Transient
	public int findResult() {
		return num1+num2;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = findResult();
	}
	
	//Output
	/*
	 * 
NUM1  	NUM2  	RESULT  	ID  
5	19	24	1
5	191	0	2
5	191	196	3
	 * */

}
