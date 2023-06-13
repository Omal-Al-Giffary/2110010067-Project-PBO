/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author Horizz
 */
public class dsOwner {
    
   private ArrayList<Integer> idOwner;
    private ArrayList<String> namaOwner;
    private ArrayList<String> alamatOwner;
    private ArrayList<String> nomorTeleponOwner;
    
    public dsOwner() {
        idOwner = new ArrayList<Integer>();
        namaOwner = new ArrayList<String>();
        alamatOwner = new ArrayList<String>();
        nomorTeleponOwner = new ArrayList<String>(); 
    }
    
    public void tambahIdOwner(int id) {
        idOwner.add(id);
    }
    
    public ArrayList<Integer> getDataSetIdOwner() {
        return idOwner;
    }
    
    public void tambahNamaOwner(String nama) {
        namaOwner.add(nama);
    }
    
    public ArrayList<String> getDataSetNamaOwner() {
        return namaOwner;
    }
    
    public void tambahAlamatOwner(String alamat) {
        alamatOwner.add(alamat);
    }
    
    public ArrayList<String> getDataSetAlamatOwner() {
        return alamatOwner;
    }
    
    public void tambahNomorTeleponOwner(String nomorTelepon) {
        nomorTeleponOwner.add(nomorTelepon);
    }
    
    public ArrayList<String> getDataSetNomorTeleponOwner() {
        return nomorTeleponOwner;
    }
    
    public void tambahData(int idOwner, String namaOwner, String alamatOwner, String nomorTeleponOwner) {
        this.idOwner.add(idOwner);
        this.namaOwner.add(namaOwner);
        this.alamatOwner.add(alamatOwner);
        this.nomorTeleponOwner.add(nomorTeleponOwner);
    }
}
