/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author dimmi
 */
public class User 
{
    private int idUser;
    private String userName;
    private String userStatut; //Pour cette version de projet, le Statut n'est pas encore utiliser
    
    public User (int unId, String unNom)
    {
        idUser = unId;
        userName = unNom;
//        userStatut = unStatut;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the userStatut
     */
//    public String getUserStatut() {
//        return userStatut;
//    }
    
}
