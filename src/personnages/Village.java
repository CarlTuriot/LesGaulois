package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom, int nbVillageoisMaximum, String chef, int force) {
		this.nom = nom;
		this.chef = new Chef(chef, force,this);
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageois = 0;
	}

	public Village(String nom) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dnas le village du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for (Gaulois g: villageois)
			System.out.println(g);
	}

	public static void main(String[] args) {
		Village village =new Village("Village des irréductibles", 30, "abra", 6);
//		Gaulois gaulois = village.trouverHabitant(29);
//    index out of bound
//		Gaulois gaulois = village.trouverHabitant(1); 
//		System.out.println(gaulois);
		Chef abra=new Chef("Abraracourcix", 6, village);
		village.setChef(abra);
		Gaulois asterix=new Gaulois("asterix",8);
		Gaulois obelix=new Gaulois("Obelix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
