/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class Travailler 
{
    private int visMatricule;
    private int regCode;
    private String date;
    private String roleTravail;
    
    public Travailler (int visId, int unCodeReg, String uneDate, String unRoleTravail)
    {
        visMatricule = visId;
        regCode = unCodeReg;
        date = uneDate;
        roleTravail = unRoleTravail;
    }

    /**
     * @return the visMatricule
     */
    public int getVisMatricule() {
        return visMatricule;
    }

    /**
     * @return the regCode
     */
    public int getRegCode() {
        return regCode;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the roleTravail
     */
    public String getRoleTravail() {
        return roleTravail;
    }
}
