package demos.tablelamp.v8;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Die Schnittstellen Comparable<T> und Comparator<T>
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo38 {

	public static void main(String[] args) {

		ArrayList<TableLamp> tableLamps = new ArrayList<>();

		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb()));
		tableLamps.add(new TableLamp(PlugType.TYPE_B, new LightBulb(Color.BLUE)));
		tableLamps.add(new TableLamp(PlugType.TYPE_I, new LightBulb(Color.RED)));
		tableLamps.add(new TableLamp(PlugType.TYPE_I));
		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.RED)));

		System.out.println("Unsortiere Liste");
		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}

		Collections.sort(tableLamps);

		System.out.println("Sortierte Liste (Helligkeit aufsteigend)");
		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}

		Collections.sort(tableLamps, new TableLampByBrightnessComparator());

		System.out.println("Sortierte Liste (Helligkeit absteigend)");
		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}

	}

}
