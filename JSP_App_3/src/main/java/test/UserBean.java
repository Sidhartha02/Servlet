package test;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable 
{
	private String name,mId;
	private long phNo;
	public UserBean() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	

}
