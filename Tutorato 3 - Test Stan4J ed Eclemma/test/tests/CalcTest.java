package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mvcCompleto.CalcModel;

class CalcTest {

	@Test
	void test() {
		CalcModel model = new CalcModel();
		model.multiplyBy("3");
		assertEquals(model.getValue(), "3");
	}

}
