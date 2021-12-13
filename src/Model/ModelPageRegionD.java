/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.User;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimmi
 */
public class ModelPageRegionD extends AbstractTableModel
{
    
    private String[] nomsColonnes = {"Code Région", "Nom Région", "Nom Secteur"};
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
