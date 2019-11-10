package org.ct.learn.java.a.inheritance;

import java.sql.DataTruncation;
import java.sql.SQLWarning;

/**
 * @author ct
 *
 */
public abstract class Derived extends Base {

	// can override an abstract method
	/*
	 * @Override public abstract void throwsAnSQLException();
	 */
	/*
	 * Cannot override with a Generic Exception in throws
	 * 
	 * @see
	 * org.ct.maven.archetype.quickstart.inheritance.Base#throwsAnSQLException()
	 */
	
	  @Override public void throwsAnSQLException() /*throws Exception is not
	  Compatible with Throws Clause */{
	  
	  }
	 

	/*
	 * Can override with any exception that "is-a"
	 * 
	 * @see org.ct.maven.archetype.quickstart.inheritance.Base#throwsAnSQLWarning()
	 */
	@Override
	public void throwsAnSQLWarning() throws DataTruncation {

	}

	@Override
	public void paramIsSQLWarning(/* Exception e - method must override a superclass method */
			SQLWarning e) {

	}

}
