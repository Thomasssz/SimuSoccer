package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gui.ChronometerGUI;

class ChronometerGUITest {

	@Test
	void testtoStringB() {
		ChronometerGUI gui = new ChronometerGUI();
		String start = gui.toStringB();
		String result = "";
		if(start == result) {
			fail("String vide");
		}
	}
	
	/*@Test
	void testtoStringR0() {
		fail("Not yet implemented");
	}*/

}
