/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.Travailler;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimmi
 */
public class ModelRegionNonDispo extends AbstractTableModel
{
    private String[] nomsColonnes = {"Région Code", "Nom Région"};
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
    
    public void loadDatas(ArrayList<Travailler> lesTravailleurs)
    {
        rows = new Vector<>();
        for(Travailler tra : lesTravailleurs)
        {
            rows.add(new String[]{String.valueOf(tra.getVisMatricule()), String.valueOf(tra.getRegCode()), tra.getDate(), tra.getRoleTravail()});
        }
        fireTableChanged(null);
    }
}
