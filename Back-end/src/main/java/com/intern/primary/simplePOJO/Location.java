package com.intern.primary.simplePOJO;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class Location {	
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
}