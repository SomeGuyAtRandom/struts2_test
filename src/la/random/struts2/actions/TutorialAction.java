package la.random.struts2.actions;

public class TutorialAction {
	
	
	public TutorialAction(){
		System.out.println("TutorialAction()");
	}

	// Required by Struts2
	public String execute(){
		System.out.println("TutorialAction.execute()");
		return "success";
	}
	

}
