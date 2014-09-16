package com.badlogic.gdx.sqlite.android;

import com.badlogic.gdx.sql.SQLitePreparedStatement;
import android.database.sqlite.SQLiteStatement;
import com.badlogic.gdx.sql.SQLiteGdxRuntimeException;
import com.badlogic.gdx.Gdx;

public class AndroidPreparedStatement implements SQLitePreparedStatement{

  private SQLiteStatement stmt;
  
  	void setPreparedStatement(SQLiteStatement stmt){
  		this.stmt = stmt;
  	}

	public void setInt(int pos , int value){
		try{
			stmt.bindLong(pos , (long)value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the int", e);
			throw new SQLiteGdxRuntimeException(e);
		}
      	    
	}
	
	public void setString(int pos , String value){
		try{
			stmt.binfString(pos , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the string", e);
			throw new SQLiteGdxRuntimeException(e);
		}
	}
	
	public void setDouble(int post , double value){
		try{
			stmt.bindDouble(pos , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the double", e);
			throw new SQLiteGdxRuntimeException(e);
		}
	}
	
	public void setFloat(int pos , float value){
		try{
			stmt.bindDouble(pos , (double)value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the float", e);
			throw new SQLiteGdxRuntimeException(e);
		}		
		
	    
	}
	
	public void setBytes(int pos , byte[] bytes){
		try{
			stmt.bindBlob(pos , bytes);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the bytes", e);
			throw new SQLiteGdxRuntimeException(e);
		}
	    
	}
	
	public void setLong(int pos , long value){
		try{
			stmt.bindLong(post , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the long", e);
			throw new SQLiteGdxRuntimeException(e);
		}		
	    
	}
	
	public boolean execute(){
		try{
			stmt.execute();	
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in executing", e);
			throw new SQLiteGdxRuntimeException(e);
		}
	    
	}

}
