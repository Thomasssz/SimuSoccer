package process;

import chrono.CyclicCounter;
import gui.ChronometerGUI;

public class MiddleTime {

private String title;	


public MiddleTime() {
}



public boolean middletime(CyclicCounter minute) {
	  boolean middletime;
	  
	if(minute.getValue()==1) {
	
		middletime=true;
		
	}else {
		middletime=false;
		
	}
	
	return middletime;
}


	
	
	
	
	
	
}
