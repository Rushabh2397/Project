package com.app.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	
	private Integer abstractId;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getAbstractId() {
		return abstractId;
	}

	public void setAbstractId(Integer abstractId) {
		this.abstractId = abstractId;
	}

	
	
}
