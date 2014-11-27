package la.random.struts2.services;

public class TutroialService {
	
	
	public String getRandomSite(String param){
		// Next: how do we pass a parameter to this method??
		System.out.println("TutroialService.getRandomSite()");
		System.out.println("param : " + param);
		return param;
	}

	
}
