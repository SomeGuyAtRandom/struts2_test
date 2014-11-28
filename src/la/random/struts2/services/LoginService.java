package la.random.struts2.services;

public class LoginService {
	// no getter nor setters
	private String user;
	private String password;
	
	public LoginService(String user, String password){
		
		if(user==null && password== null){
			System.out.println("LoginService(null,null)");
		} else if(user==null){
			System.out.println("LoginService(null," + password + ")");
		}else if(password==null){
			System.out.println("LoginService(" + user + ",null)");
		} else{
			System.out.println("LoginService(" + user + "," + password + ")");
		}
		
		this.user = user;
		this.password = password;
	}
	
	public boolean isValid(){
		if(this.user.equals("username") && this.password.equals("password")){
			return true;
		}
		return false;
	}

}
