package personnages;

public class Romain {
	private static final int NB_EQUIPEMENTS = 2;
	
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement[] equipements = new Equipement[NB_EQUIPEMENTS];

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
		assert force>0 ;
		int postDiminution = force ;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");

		}
		assert force < postDiminution;
	}
	
	public Equipement[] getEquipements(int num) {
		return equipements[num];
	}
	
	public void setEquipements(Equipement[] equipements) {
		this.equipements = equipements;
	}
	
	
//	public void sEquiper (Equipement equipement) {
//		assert nbEquipement <=NB_EQUIPEMENTS ;
//		if (nbEquipement == NB_EQUIPEMENTS) {
//			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
//		}
//		else if (nbEquipement == 1) {
//				
//		}
//		else {
//			System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement);
//			nbEquipement += 1;
//			}
//	}
		
	public void sEquiper (Equipement equipement) {
		assert nbEquipement <=NB_EQUIPEMENTS ;
		string thisEquipement = getEquipements();
		switch (equipement) {
			case CASQUE:
				if (Equipement[0]== equipement) {   //faux
				}
				else {

				}
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Romain minus= new Romain("minus",-6);
		minus.parler("Bonjour");
		minus.recevoirCoup(5);
	}

}
