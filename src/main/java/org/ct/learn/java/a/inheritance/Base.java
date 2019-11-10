package org.ct.learn.java.a.inheritance;

import java.sql.SQLException;
import java.sql.SQLWarning;

public abstract class Base {
	
	public abstract void throwsAnSQLException() throws SQLException;
	
	public abstract void throwsAnSQLWarning() throws SQLWarning;
	
	public abstract void paramIsSQLWarning(SQLWarning sqlWarnObj) ;

}
