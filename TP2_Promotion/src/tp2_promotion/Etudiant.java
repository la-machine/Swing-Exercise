package tp2_promotion;

/**
 *
 * @author metos
 */
public class Etudiant {
    private int idetudiant;
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(int idetudiant, String nom, String prenom, int age) {
        this.idetudiant = idetudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
