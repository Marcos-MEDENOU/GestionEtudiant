import java.util.Scanner;


public class Etudiant {
	
	private String nom_etudiant; 
	
	private String prenom_etudiant; 
	
	private String filiere_etudiant; 
	
	private String nationalite_etudiant; 
	
	private int age_etudiant; 
	
	private static int nbreInstancesBis = 0;
	
	Scanner sc = new Scanner(System.in);
	
	

	
	
	public Etudiant(String name_etudiant, String p_etudiant, String f_etudiant, String n_etudiant, int a_etudiant)
	{ 
		System.out.println("Creation d'un etudiant avec des parametres!"); 
		nom_etudiant = name_etudiant; 
		
		prenom_etudiant = p_etudiant; 
		
		filiere_etudiant = f_etudiant; 
		
		nationalite_etudiant = n_etudiant;
		
		age_etudiant = a_etudiant;
		
		nbreInstancesBis++;
	}
	
	
	public String getNomEtudiant() {
		return nom_etudiant;
	}




	public void setNomEtudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}

	public String getPrenomEtudiant() {
		return prenom_etudiant;
	}




	public void setPrenomEtudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}
	
	
	public String getFiliereEtudiant() {
		return filiere_etudiant;
	}




	public void setFiliereEtudiant(String filiere_etudiant) {
		this.filiere_etudiant = filiere_etudiant;
	}
	
	
	
	public String getNationaliteEtudiant() {
		return nationalite_etudiant;
	}




	public void setNationaliteEtudiant(String nationalite_etudiant) {
		this.nationalite_etudiant = nationalite_etudiant;
	}
	
	
	
	public int getAgeEtudiant() {
		return age_etudiant;
	}




	public void setAgeEtudiant(int age_etudiant) {
		this.age_etudiant = age_etudiant;
	}
	
	
	public static int getNbreInstancesBis()
	{
		return nbreInstancesBis;
		
	}
	
	
	public String affiche()
	{
		return "\tLe nom et le prenom de l'etudiant est : " +this.nom_etudiant+" "+this.prenom_etudiant+" , de nationalite "+this.nationalite_etudiant+ " Il est en "+this.filiere_etudiant+" et est age de : "+this.age_etudiant ;
	}
	
	
}
