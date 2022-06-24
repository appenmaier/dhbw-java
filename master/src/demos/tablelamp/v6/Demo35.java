package demos.tablelamp.v6;

import java.awt.Color;

/**
 * Die Mutter aller Klassen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo35 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Color.RED);

		TableLamp tableLamp1 = new TableLamp(PlugType.TYPE_F, redLightBulb);
		TableLamp tableLamp2 = new TableLamp(PlugType.TYPE_F, redLightBulb);

		/*
		 * Die hashCode-Methode
		 */
		System.out.println("tableLamp1.hashCode: " + Integer.toHexString(tableLamp1.hashCode()));
		System.out.println("tableLamp2.hashCode: " + Integer.toHexString(tableLamp2.hashCode()));

		/*
		 * Die equals-Methode
		 */
		System.out.println(tableLamp1.equals(tableLamp2));

		/*
		 * Die toString-Methode
		 */
		System.out.println(tableLamp1);
		System.out.println(tableLamp2);

	}

}
