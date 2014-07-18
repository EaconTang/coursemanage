package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "type_relation")
public class Relation {
	private Integer id;
	private Integer grade;
	private String devtype;
	private String type;
	
	//Ĭ�Ϲ��캯��
	public Relation(){
		
	}
	
	public void setRelation (Relation temp) {
		this.id = temp.id;
		this.grade = temp.grade;
		this.devtype = temp.devtype;
		this.type = temp.type;
	}
	
	public Relation(Integer grade,String devtype,String type) {
		this.id = id;
		this.grade = grade;
		this.devtype = devtype;
		this.type = type;
	}
	
	@Column(name="grade", length=10,nullable=false, unique=true)
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	@Column(name="devtype", length=30, nullable=false,unique=true)
	public String getDevtype() {
		return devtype;
	}
	public void setDevtype(String devtype) {
		this.devtype = devtype;
	}
	
	@Column(name="type", length=30, nullable=false,unique=true)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}




	@Id
	//�������ݿ�������ʽ��������
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

