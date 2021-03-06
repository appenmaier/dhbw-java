package exercises.java.creature.v1;

/**
 * Kreatur
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Creature {

	/*
	 * Attribute
	 */
	private String name;
	private int attackValue;
	private int hitpoints;

	/*
	 * Konstruktoren
	 */
	public Creature(String name, int attackValue, int hitpoints) {
		this.name = name;
		this.attackValue = attackValue;
		this.hitpoints = hitpoints;
	}

	/*
	 * Setter und Getter
	 */
	public String getName() {
		return name;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	/*
	 * Methoden
	 */
	public void attackCreature(Creature creature) {
		creature.hitpoints -= this.attackValue;
		System.out.println(this.name + " greift " + creature.name + " an und erzielt " + this.attackValue + " Schaden");
		System.out.println(creature.name + " hat noch " + creature.hitpoints + " Lebenspunkte");
	}

}