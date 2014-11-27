package la.random.struts2.actions;

import la.random.struts2.services.TutroialService;

public class TutorialAction {

	private String targetSite;
	private String param;

	// Required by Struts2
	public String execute() {
		System.out.println("param :" + param);
		setTargetSite(param);
		System.out.println("TutorialAction.execute()");
		// Prime candidate for spring injection
		TutroialService service = new TutroialService();
		String result = service.getRandomSite(param);
		System.out.println("targetSite" + getTargetSite());
		return result;
	}

	// Required by Struts2
	public String execute_00() {
		System.out.println("TutorialAction.execute()");
		return "success";
	}

	public String getTargetSite() {
		return targetSite;
	}

	public void setTargetSite(String targetSite) {
		this.targetSite = targetSite;
	}

	public TutorialAction() {
		System.out.println("TutorialAction()");
	}
	
	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

}
