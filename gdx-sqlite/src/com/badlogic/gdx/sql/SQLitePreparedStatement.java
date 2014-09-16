package com.badlogic.gdx.sql;


public interface SQLitePreparedStatement {
		
	public void setInt(int pos , int value) throws SQLiteGdxException;
	
	public void setString(int pos , String value) throws SQLiteGdxException;
	
	public void setDouble(int post , double value) throws SQLiteGdxException;
	
	public void setFloat(int pos , float value) throws SQLiteGdxException;
	
	public void setBytes(int pos , byte[] bytes) throws SQLiteGdxException;
	
	public void setLong(int pos , long value) throws SQLiteGdxException;
	
	public boolean execute() throws SQLiteGdxException;

}

