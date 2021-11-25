
public class Coinbox {
	int nMonete;
	
	public Coinbox() {
		// Inizialmente il coinbox ha credito zero
		nMonete = 0;
	}
	
	public boolean erogaCaffe() {
		// Se il numero di monete è >= 2, eroga il caffè, altrimenti no
		if (nMonete >=2) {
			nMonete -= 2;
			return true;
		} else {
			return false;
		}
	}
	
	public void addMoneta() {
		nMonete++;
	}
	
	public int getNMonete() {
		return nMonete;
	}
}
