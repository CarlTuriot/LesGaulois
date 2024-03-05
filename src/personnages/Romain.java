package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0 ;                                            //j'me suis arreter ici
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");

		}
		
	}
	
	public static void main(String[] args) {
		Romain minus= new Romain("minus",-6);
		minus.parler("Bonjour");
		minus.recevoirCoup(5);
	}

}
