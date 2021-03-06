package demos.tablelamp.v9;

/**
 * Kabelgebundenes Geraet
 * 
 * @author Daniel appenmaier
 * @version 1.0
 */
public interface WiredDevice {

	/*
	 * Methoden
	 */
	/**
	 * Steckt das kabelgebundene Geraet ein
	 */
	void plugIn();

	/**
	 * Steckt das kabelgebundene Geraet aus
	 */
	void pullThePlug();

}
