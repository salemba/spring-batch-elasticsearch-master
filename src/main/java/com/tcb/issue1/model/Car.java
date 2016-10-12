package com.tcb.issue1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * This class represents a car.
 *
 * Created by Florian.Courtial on 11/01/16.
 */
//@Data
//@Document(indexName="db", type="car")
@Entity
public class Car {

    @Id
    private String id;

   // @Field(type = FieldType.String)
    private String model;

    //@Field(type = FieldType.Integer)
    private int milesNumber;

    //@Field(type = FieldType.Integer)
    private int age;
    
    public Car(String id, String model, int milesNumber, int age) {
        this.id = id;
        this.model = model;
        this.milesNumber = milesNumber;
        this.age = age;
    }

    public Car() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMilesNumber() {
		return milesNumber;
	}

	public void setMilesNumber(int milesNumber) {
		this.milesNumber = milesNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
	
}
