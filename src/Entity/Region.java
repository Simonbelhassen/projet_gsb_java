/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Region 
{
    private int regCode;
    private String regNom;
    private int secCode;
    
    public Region (int unCodeRegion, String unNom, int unCodeSecteur)
    {
        regCode = unCodeRegion;
        regNom = unNom;
        secCode = unCodeSecteur;
    }

    /**
     * @return the regCode
     */
    public int getRegCode() {
        return regCode;
    }

    /**
     * @return the regNom
     */
    public String getRegNom() {
        return regNom;
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
}
