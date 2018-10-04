package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class AcademicNode {
	@Id
	//private Long id;
	private String courseName;

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public AcademicNode(String courseName) {
		super();
		//this.id = id;
		this.courseName = courseName;
	//	this.criteria = criteria;
	}
	
	

}
