/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Visiteur;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimmi
 */
public class ModelPageVisiteurD extends AbstractTableModel
{
    //    Les pages MODEL sont les pages qui communiquant avec la BDD.
    //    Donc tous les pages dans le package ENTITY qui doivent travailler avec la BDD doivent avoir des connection ici.
    
    private String[] nomsColonnes = {"Matricule", "Nom", "Prénom", "Adresse", "Code Postal", "Ville", "Date d'embauche", "Code Secteur", "Code Laboratoire"};
    private Vector<String[]> rows;

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }
    
    @Override
    public String getColumnName(int column) {
        return nomsColonnes[column]; 
    }
    
    public void loadDatas(ArrayList<Visiteur> lesVisiteurs)
    {
        rows = new Vector<>();
        for(Visiteur tic : lesVisiteurs)
        {
            rows.add(new String[]{String.valueOf(tic.getVisMatricule()),tic.getVisNom(),tic.getVisPrenom(),tic.getVisAdresse(), String.valueOf(tic.getVisCodePostal()), tic.getVisVille(), tic.getVisDateEmbauche(), String.valueOf(tic.getSecCode()), String.valueOf(tic.getLabCode())});
        }
        fireTableChanged(null);
    }
}