package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potin peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public int getMin() {
		return effetPotionMin;
	}
	
	public int getMax() {
		return effetPotionMax;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion(int effetPotionMin,int effetPotionMax) {
		Random r= new Random();
		forcePotion = r.nextInt(effetPotionMax-effetPotionMin)+effetPotionMin;
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois, Gaulois obelix) {
		parler("Non, Obélix !... Tu n’auras pas de potion magique!");
		obelix.parler("Par Bélénos, ce n'est pas juste!");
		gaulois.boirePotion(forcePotion);
	}

	public static void main(String[] args) {
		Druide panoramix= new Druide("panoramix", 5, 10);
		panoramix.preparerPotion(panoramix.getMin(),panoramix.getMax());
	}
	
}
