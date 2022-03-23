/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Region;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimmi
 */
public class ModelPageRegionD extends AbstractTableModel
{
    //    Les pages MODEL sont les pages qui communiquant avec la BDD.
    //    Donc tous les pages dans le package ENTITY qui doivent travailler avec la BDD doivent avoir des connection ici.
    
    private String[] nomsColonnes = {"Code Région", "Nom Région", "Code Secteur"};
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
    
    public void loadDatas(ArrayList<Region> lesRegions)
    {
        rows = new Vector<>();
        for(Region reg : lesRegions)
        {
            rows.add(new String[]{String.valueOf(reg.getRegCode()), reg.getRegNom(), String.valueOf(reg.getSecCode())});
        }
        fireTableChanged(null);
    }
    
}
