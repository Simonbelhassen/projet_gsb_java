/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tools;

import Entity.Laboratoire;
import Entity.Region;
import Entity.Secteur;
import Entity.Travailler;
import Entity.User;
import Entity.Visiteur;
import java.util.ArrayList;

/**
 *
 * @author dimmi
 */
public interface IMetier 
{
    public User GetUnUser(String login, String mdp);
    public ArrayList<Region> GetAllRegions();
    public ArrayList<Secteur> GetAllSecteurs();
    public ArrayList<Visiteur> GetAllVisiteurs();
    public ArrayList<Laboratoire> GetAllLaboratoires();
    public ArrayList<Travailler> GetListTravail();
    public void InsererRegion(int regCode, String regNom, int secCode);
    public void ModifierRegion(int secCode);
    public void InsererVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode);
    public void ModifierVisiteur(int secCode, int labCode);
    public ArrayList<Visiteur> GetVisiteursReg();
    
}
