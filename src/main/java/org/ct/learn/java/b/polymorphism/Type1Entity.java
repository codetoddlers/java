package org.ct.learn.java.b.polymorphism;

public class Type1Entity extends Entity {

	String type = "Type1Entity";
	
	short s;
	
	char c;
	
	float f;

	double d;
	
	boolean b;
	
	int primitiveId;	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + "Type1Entity [type=");
		builder.append(type);
		builder.append(", s=");
		builder.append(s);
		builder.append(", c=");
		builder.append(c);
		builder.append(", f=");
		builder.append(f);
		builder.append(", d=");
		builder.append(d);
		builder.append(", b=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}
	
}
