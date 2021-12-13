/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Secteur 
{
    private int secCode;
    private String secNom;
    
    public Secteur (int unCode, String unNom)
    {
        secCode = unCode;
        secNom = unNom;
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @return the secNom
     */
    public String getSecNom() {
        return secNom;
    }
    
}
