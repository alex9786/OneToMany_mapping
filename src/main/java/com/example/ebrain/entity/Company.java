package com.example.ebrain.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="bike_company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String place;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name="fk_no")
	private Bikes bike;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_no",referencedColumnName = "id")
//	private List<Bikes> bikes;
//		
}
