package util;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class NavigationBean {
	
	private String selectedIncludePath = "/WEB-INF/includes/main/home.xhtml";

	public String getSelectedIncludePath() {
		return selectedIncludePath;
	}

	public void setSelectedIncludePath(String selectedIncludePath) {
		this.selectedIncludePath = selectedIncludePath;
	}
	
	
	public void navigationPathChange(ActionEvent event){
		FacesContext context = FacesContext.getCurrentInstance();
		Map map = context.getExternalContext().getRequestParameterMap();
		selectedIncludePath = (String) map.get("includePath");
		
	}
	

}
