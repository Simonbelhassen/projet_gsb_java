/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimmi
 */
public class ModelPageVisiteurD extends AbstractTableModel
{
    
    private String[] nomsColonnes = {"Matricule", "Nom", "Prénom", "Adresse", "Code Postal", "Ville", "Date d'embauche", "Nom Secteur", "Nom Laboratoire"};
    private Vector<String[]> rows;

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //    public void loadDatas(ArrayList<User> lesUsers)
//    {
//        rows = new Vector<>();
//        for(User use : lesUsers)
//        {
//            rows.add(new String[]{String.valueOf(use.getIdUser()),use.getUserName()});
//        }
//        fireTableChanged(null);
//    }
    
}
