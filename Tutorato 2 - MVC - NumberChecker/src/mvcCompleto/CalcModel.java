package mvcCompleto;

import java.util.ArrayList;
import java.util.Observable;

/*
 *  Definiamo il modello come "Observable". Una classe model che estende
 *  "Observable" può essere gestita in modo molto più sempice, in quanto ogni
 *  modifica fatta al suo contenuto, genera in automatico una notifica
 *  per gli observer
 */
public class CalcModel extends Observable{
	// Lista numeri inseriti
	private ArrayList<Integer> listaNumeri;
	String result;

	// Costruttore: chiama il reset per (re)impostare il valore inizale
	CalcModel() {
		listaNumeri = new ArrayList<Integer>();
		reset();
		result = "";
	}

	// Reset del valore iniziale
	public void reset() {
		System.out.println("[MODEL] reset ");
		listaNumeri.clear();
		result = "";
		// Comunica un cambio dello stato
		setChanged();
		// Notifica gli observer (la view)
		notifyObservers();
		System.out.println("[MODEL] Observers notified (reset)");
	}

	public void checkNumber(String operand) {
		result = "NUMERO NUOVO";
		for (int i=0; i<listaNumeri.size(); i++) {
			if (listaNumeri.get(i).equals(new Integer(operand))) {
				result = "NUMERO GIA' INSERITO";
			}
		}
		listaNumeri.add(new Integer(operand));
		System.out.println("[MODEL] Check "+ operand);
		// Comunica un cambio dello stato
		setChanged();
		// Notifica gli observer (la view)
		notifyObservers();
		System.out.println("[MODEL] Observers notified (checkNumber)");
	}

	// Ritorna il valore della "memoria"
	public String getValue() {
		return result;
	}
}
