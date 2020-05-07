/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author zakariasi_
 */
public class ListMataKuliah {
    
    public static void main(String args[]){
        List<String> mataKuliah = new ArrayList<>();
        
        mataKuliah.add("Sistem Operasi");
        mataKuliah.add("Routing Jaringan");
        mataKuliah.add("Kecerdasan Buatan");
        mataKuliah.add("Sistem Basis Data");
        mataKuliah.add("Interaksi Manusia dan Komputer");
        
        System.out.println("List mata kuliah awal : ");
        
        for(int i = 0; i < mataKuliah.size(); i++){
            System.out.println("Mata kuliah index ke-" + i + " = " + mataKuliah.get(i));
        }
        
        mataKuliah.remove("Sistem Operasi");
        
        System.out.println();
        
        System.out.println("List mata kuliah akhir : ");
        
        for(int i = 0; i < mataKuliah.size(); i++){
            System.out.println("Mata kuliah index ke-" + i + " = " + mataKuliah.get(i));
        }
    }
    
}
