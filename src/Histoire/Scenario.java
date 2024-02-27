package Histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 8);
		Romain minus= new Romain("Minus",6);
		Druide panoramix= new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion(panoramix.getMin(),panoramix.getMax());
		panoramix.booster(asterix,obelix);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
