public interface SQLitePreparedStatement {
		
	public void setInt(int pos , int value);
	
	public void setString(int pos , String value);
	
	public void setDouble(int post , double value);
	
	public void setFloat(int pos , float value);
	
	public void setBytes(int pos , byte[] bytes);
	
	public void setLong(int pos , long value);
	
	public boolean execute();

}

