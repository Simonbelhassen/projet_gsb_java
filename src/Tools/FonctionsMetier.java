/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entity.Laboratoire;
import Entity.Region;
import Entity.Secteur;
import Entity.Travailler;
import Entity.User;
import Entity.Visiteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimmi
 */
public class FonctionsMetier implements IMetier
{

    @Override
    public User GetUnUser(String login, String mdp) {
        User unUser = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select idUser, userName from users where loginUser = '"+login+"' and pwdUser = '"+mdp+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                unUser = new User(rs.getInt("idUser"), rs.getString("userName"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unUser;
    }

    @Override
    public ArrayList<Region> GetAllRegions() 
    {
        ArrayList<Region> lesRegions = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select reg_code, reg_nom, sec_code from region");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Region regs = new Region(rs.getInt("reg_code"), rs.getString("reg_nom"), rs.getInt("sec_code"));
                lesRegions.add(regs);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesRegions;
    }

    @Override
    public ArrayList<Secteur> GetAllSecteurs() 
    {
        ArrayList<Secteur> lesSecteurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select sec_code, sec_libelle from secteur");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Secteur sec = new Secteur(rs.getInt("sec_code"), rs.getString("sec_libelle"));
                lesSecteurs.add(sec);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesSecteurs;
    }

    @Override
    public ArrayList<Visiteur> GetAllVisiteurs() 
    {
        ArrayList<Visiteur> lesVisiteurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select vis_matricule, vis_nom, vis_prenom, vis_adresse, vis_cp, vis_ville, vis_dateembauche, sec_code, lab_code from visiteur");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Visiteur vis = new Visiteur(rs.getInt("vis_matricule"), rs.getString("vis_nom"), rs.getString("vis_prenom"), rs.getString("vis_adresse"), rs.getInt("vis_cp"), rs.getString("vis_ville"), rs.getString("vis_dateembauche"), rs.getInt("sec_code"), rs.getInt("lab_code"));
                lesVisiteurs.add(vis);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVisiteurs;
    }

    @Override
    public ArrayList<Laboratoire> GetAllLaboratoires() 
    {
        ArrayList<Laboratoire> lesLaboratoires = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select lab_code, lab_nom, lab_chefvente from labo");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Laboratoire lab = new Laboratoire(rs.getInt("lab_code"), rs.getString("lab_nom"), rs.getString("lab_chefvente"));
                lesLaboratoires.add(lab);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLaboratoires;
    }

    @Override
    public ArrayList<Travailler> GetListTravail() {
        ArrayList<Travailler> lesTravailleurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select vis_matricule, reg_code, aaaammjj, tra_role from travailler");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Travailler tra = new Travailler(rs.getInt("vis_matricule"), rs.getInt("reg_code"), rs.getString("aaaammjj") , rs.getString("tra_role"));
                lesTravailleurs.add(tra);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesTravailleurs;
    }

    @Override
    public void InsererRegion(int regCode, String regNom, int secCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into region values('"+regCode+"', '"+regNom+"', '"+secCode+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void InsererVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into visiteur values("+visMatricule+", '"+visNom+"', '"+visPrenom+"', '"+visAdresse+"', "+visCodePostal+", '"+visVille+"', '"+visDateEmbauche+"', "+secCode+", "+labCode+" )");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int GetLastRegCode() {
        int CodeRegion = 0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select max(reg_code) as num from region");
            ResultSet rs = ps.executeQuery();
            rs.next();
            CodeRegion = rs.getInt("num") + 1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CodeRegion;
    }

    @Override
    public int GetLastMatriculeCode() {
        int Matricule = 0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select max(vis_matricule) as num from visiteur");
            ResultSet rs = ps.executeQuery();
            rs.next();
            Matricule = rs.getInt("num") + 1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Matricule;
    }
    
    @Override
    public String GetNomVille(int codePostal) {
        String nomVille = "";
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT vis_ville FROM visiteur WHERE vis_cp = "+codePostal+" LIMIT 1");
            ResultSet rs = ps.executeQuery();
            rs.next();
            nomVille = rs.getString("vis_ville");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomVille;
    }

    @Override
    public void InsererTravailleur(int visMatricule, String regCode, String date, String role) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into travailler values("+visMatricule+", "+regCode+", '"+date+"', '"+role+"' )");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
