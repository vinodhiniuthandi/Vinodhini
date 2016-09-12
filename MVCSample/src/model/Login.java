package model;

import javax.servlet.RequestDispatcher;

public class Login {
	String uname,passwd;
	//getter and setter methods
	public String getUname(){
		return uname;
	}
	public void setUname(String uname){
		this.uname=uname;
	}
	public String getpasswd(){
		return passwd;
	}
	public void setPasswd(String passwd){
		this.passwd=passwd;
	}
	//business logic
	public boolean isValidLogin()
	{
if(uname.equals("NIIT")&&passwd.equals("12345"))
			return true;
		else
			return false;
	}

}
