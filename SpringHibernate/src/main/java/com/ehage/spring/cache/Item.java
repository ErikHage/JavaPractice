package com.ehage.spring.cache;

import java.io.Serializable;

public class Item  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public Item(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
