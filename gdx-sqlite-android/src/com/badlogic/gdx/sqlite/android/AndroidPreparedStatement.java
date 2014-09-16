package com.badlogic.gdx.sqlite.android;

import com.badlogic.gdx.sql.SQLitePreparedStatement;
import android.database.sqlite.SQLiteStatement;

public class AndroidPreparedStatement implements SQLitePreparedStatement{

  private SQLiteStatement stmt;

	public void setInt(int pos , int value){
      stmt.bindLong(pos , (long)value);
	}
	
	public void setString(int pos , String value){
	    stmt.binfString(pos , value);
	}
	
	public void setDouble(int post , double value){
	    stmt,bindDouble(pos , value);
	}
	
	public void setFloat(int pos , float value){
	    stmt.bindDouble(pos , (double)value);
	}
	
	public void setBytes(int pos , byte[] bytes){
	    stmt.bindBlob(pos , bytes);
	}
	
	public void setLong(int pos , long value){
	    stmt.bindLong(post , value);
	}
	
	public boolean execute(){
	    stmt.execute();
	}

}
