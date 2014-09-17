package com.badlogic.gdx.sqlite.android;

import com.badlogic.gdx.sql.SQLitePreparedStatement;
import android.database.sqlite.SQLiteStatement;
import com.badlogic.gdx.sql.SQLiteGdxRuntimeException;
import com.badlogic.gdx.Gdx;
import android.database.SQLException;
import com.badlogic.gdx.sql.DatabaseFactory;

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
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the int", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}
      	    
	}
	
	public void setString(int pos , String value){
		try{
			stmt.bindString(pos , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the string", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}
	}
	
	public void setDouble(int pos , double value){
		try{
			stmt.bindDouble(pos , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the double", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}
	}
	
	public void setFloat(int pos , float value){
		try{
			stmt.bindDouble(pos , (double)value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the float", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}		
		
	    
	}
	
	public void setBytes(int pos , byte[] bytes){
		try{
			stmt.bindBlob(pos , bytes);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the bytes", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}
	    
	}
	
	public void setLong(int pos , long value){
		try{
			stmt.bindLong(pos , value);
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in setting the long", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}		
	    
	}
	
	public boolean execute(){
		try{
			stmt.execute();
			return true;
		}
		catch(SQLException ex){
			Gdx.app.log(DatabaseFactory.ERROR_TAG, "There was an error in executing", ex);
			throw new SQLiteGdxRuntimeException(ex);
		}
	    
	}

}
