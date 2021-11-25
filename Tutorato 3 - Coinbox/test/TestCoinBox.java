import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoinBox {

	@Test
	public void testInit() {
		Coinbox cb = new Coinbox();
		assertEquals(0, cb.getNMonete());
	}
	
	@Test
	public void testSingleVend() {
		Coinbox cb = new Coinbox();
		// Inserisco due monete
		cb.addMoneta();
		cb.addMoneta();
		
		// Controllo che il caffè venga erogato
		assertTrue(cb.erogaCaffe());
		assertEquals(0, cb.getNMonete());
	}
	
	@Test
	public void testNotEnough() {
		Coinbox cb = new Coinbox();
		// Inserisco una moneta
		cb.addMoneta();
		
		// Controllo che il caffè non venga erogato
		assertFalse(cb.erogaCaffe());
		assertEquals(1, cb.getNMonete());
	}

}
