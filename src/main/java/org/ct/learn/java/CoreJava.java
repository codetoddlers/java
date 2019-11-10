package org.ct.learn.java;

public class CoreJava {

	public static void main(String[] args) {
		System.out.println(tryCatchFinallyReturns(false,false));
		System.out.println(tryCatchFinallyReturns(true,false));

		stringManipulation();
		
		System.out.println(tryCatchFinallyReturns(false,true));
	}
	
	private static int tryCatchFinallyReturns(boolean throwException, boolean sysExit) {
		try {
			if(throwException) throw new Exception();
			if(sysExit)System.exit(0);
			return 1;
		}catch(Exception e){
			return 2;
		}finally {
			return 3; //finally block does not complete normally
		}
		//return 4; //unreachable code if finally or catch has return
	}
	
	private static void stringManipulation() {
		System.out.println(5+""+6);
		System.out.println("5"+6);
		System.out.println(5+6);
	}

}
