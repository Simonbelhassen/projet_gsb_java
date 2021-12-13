/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Visiteur 
{
    private int visMatricule;
    private String visNom;
    private String visPrenom;
    private String visAdresse;
    private int visCodePostal;
    private String visVille;
    private String visDateEmbauche;
    private int secCode;
    private int labCode;
    
    public Visiteur (int idVisiteur, String nomVisiteur, String prenomVisiteur, String adresseVisiteur, int codePostalVisiteur, String villeVisiteur, String dateEmbaucheVisiteur, int unSecCode, int unLabCode)
    {
        visMatricule = idVisiteur;
        visNom = nomVisiteur;
        visPrenom = prenomVisiteur;
        visAdresse = adresseVisiteur;
        visCodePostal = codePostalVisiteur;
        visVille = villeVisiteur;
        visDateEmbauche = dateEmbaucheVisiteur;
        secCode = unSecCode;
        labCode = unLabCode;
    }

    /**
     * @return the visMatricule
     */
    public int getVisMatricule() {
        return visMatricule;
    }

    /**
     * @return the visNom
     */
    public String getVisNom() {
        return visNom;
    }

    /**
     * @return the visPrenom
     */
    public String getVisPrenom() {
        return visPrenom;
    }

    /**
     * @return the visAdresse
     */
    public String getVisAdresse() {
        return visAdresse;
    }

    /**
     * @return the visCodePostal
     */
    public int getVisCodePostal() {
        return visCodePostal;
    }

    /**
     * @return the visVille
     */
    public String getVisVille() {
        return visVille;
    }

    /**
     * @return the visDateEmbauche
     */
    public String getVisDateEmbauche() {
        return visDateEmbauche;
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @param secCode the secCode to set
     */
    public void setSecCode(int secCode) {
        this.secCode = secCode;
    }

    /**
     * @return the labCode
     */
    public int getLabCode() {
        return labCode;
    }

    /**
     * @param labCode the labCode to set
     */
    public void setLabCode(int labCode) {
        this.labCode = labCode;
    }
    
}
