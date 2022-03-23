/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Laboratoire 
{
    private int labCode;
    private String labNom;
    private String labChefVente;
    
    public Laboratoire(int unCode, String unNom, String leChefVente)
    {
        labCode = unCode;
        labNom = unNom;
        labChefVente = leChefVente;
    }

    /**
     * @return the labCode
     */
    public int getLabCode() {
        return labCode;
    }

    /**
     * @return the labNom
     */
    public String getLabNom() {
        return labNom;
    }
    
}
