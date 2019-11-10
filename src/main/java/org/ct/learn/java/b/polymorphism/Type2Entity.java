package org.ct.learn.java.b.polymorphism;

import java.math.BigDecimal;

public class Type2Entity extends Entity {

	String type = "Type2Entity";
	
	Integer wrapperInteger;
	
	Float wrapperFloat;
	
	Double wrapperDouble;
	
	BigDecimal bigDecimal;

	@Override
	public String toString() {
		return String.format(super.toString() +
				"Type2Entity [type=%s, wrapperInteger=%s, wrapperFloat=%s, wrapperDouble=%s, bigDecimal=%s]", type,
				wrapperInteger, wrapperFloat, wrapperDouble, bigDecimal);
	}
	
	
}
