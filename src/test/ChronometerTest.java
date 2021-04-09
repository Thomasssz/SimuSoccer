package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chrono.Chronometer;

class ChronometerTest {
	int value;
	String result;
	String res;

	@Test
	void testtransform() {
		//Chronometer chrono = new Chronometer();
		value = 0;
		result = "0" + value;
		res = String.valueOf(value);
		if((Chronometer.transform(value) != result) && (Chronometer.transform(value) != res)) {
			/*System.out.println("result"+result);
			System.out.println("res"+res);
			System.out.println("r"+Chronometer.transform(value));*/
			fail("erreur");
		}
	}

}
