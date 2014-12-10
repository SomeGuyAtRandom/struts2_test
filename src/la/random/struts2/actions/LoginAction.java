package la.random.struts2.actions;

import com.opensymphony.xwork2.Action;

import la.random.struts2.services.LoginService;
// Some change....

public class LoginAction implements Action{

	private String user;
	private String password;

	public String execute() {
		System.out.println("LoginAction.execute()");
		String result = LOGIN;
		

		LoginService service = new LoginService(user, password);
		if (service.isValid()) {
			return SUCCESS;
		}
		return result;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
