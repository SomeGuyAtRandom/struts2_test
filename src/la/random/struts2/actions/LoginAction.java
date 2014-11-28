package la.random.struts2.actions;

import la.random.struts2.services.LoginService;

public class LoginAction {

	private String user;
	private String password;

	public String execute() {
		System.out.println("LoginAction.execute()");
		String result = "fail";

		LoginService service = new LoginService(user, password);
		if (service.isValid()) {
			return "success";
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
