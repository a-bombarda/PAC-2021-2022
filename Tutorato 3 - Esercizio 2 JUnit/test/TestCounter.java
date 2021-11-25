import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCounter {
	
	private int nRipetizioni;
	private int outputAtteso;
	
	public TestCounter(int nRipetizioni, int outputAtteso) {
		this.nRipetizioni = nRipetizioni;
		this.outputAtteso = outputAtteso;
	}
	
	@Parameters
	public static Collection generaParametri() {
		return Arrays.asList(new Object[][] {{1, 1}, {3, 3}});
	}
	
	@Test
	public void testInc() {
		Counter c = new Counter();
		// Chiamo il metodo di incremento
		for (int i=0; i<nRipetizioni; i++)
			c.inc();
		// Controllo che l'incremento sia andato correttamente
		assertEquals(outputAtteso, c.getN());
	}
	
	@Test
	public void testDec() {
		Counter c = new Counter();
		c.dec();
		assertTrue(c.getN() == -1);
	}
	
	@Test
	public void testCostruttore() {
		Counter c = new Counter();
		assertEquals(0, c.getN());
	}

}
