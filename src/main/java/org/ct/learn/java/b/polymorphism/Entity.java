package org.ct.learn.java.b.polymorphism;

public class Entity {

	String type = "Entity";
	
	public static void main(String[] strings) {
		for(String s: strings) {
			System.out.println(s);
		}
		
		System.out.println(new Entity());
		System.out.println(new Type1Entity());
		System.out.println(new Type2Entity());		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Entity [type=").append(type).append("]");
		return builder.toString();
	}


}
