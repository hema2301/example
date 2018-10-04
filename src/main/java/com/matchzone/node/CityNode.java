package com.matchzone.node;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CityNode {
	

	 @Id 
	 //@GeneratedValue
	private String name;
	//private String level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CityNode( String name) {
		super();
		//this.id = id;
		this.name = name;
	//	this.level = level;
	}
	
}
