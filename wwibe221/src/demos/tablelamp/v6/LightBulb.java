package demos.tablelamp.v6;

import java.awt.Color;

/**
 * Gluehbirne
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 */
public record LightBulb(Color color) {

	/*
	 * Konstruktoren
	 */
	public LightBulb() {
		this(Color.WHITE);
	}

}
