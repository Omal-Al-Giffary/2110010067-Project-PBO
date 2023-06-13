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
public class dsKasir {
    
    private ArrayList<Integer> idKasir;
    private ArrayList<String> namaKasir;
    private ArrayList<String> alamatKasir;
    private ArrayList<String> nomorTeleponKasir;
    
    public dsKasir() {
        idKasir = new ArrayList<Integer>();
        namaKasir = new ArrayList<String>();
        alamatKasir = new ArrayList<String>();
        nomorTeleponKasir = new ArrayList<String>(); 
    }
    
    public void tambahIdKasir(int id) {
        idKasir.add(id);
    }
    
    public ArrayList<Integer> getDataSetIdKasir() {
        return idKasir;
    }
    
    public void tambahNamaKasir(String nama) {
        namaKasir.add(nama);
    }
    
    public ArrayList<String> getDataSetNamaKasir() {
        return namaKasir;
    }
    
    public void tambahAlamatKasir(String alamat) {
        alamatKasir.add(alamat);
    }
    
    public ArrayList<String> getDataSetAlamatKasir() {
        return alamatKasir;
    }
    
    public void tambahNomorTeleponKasir(String nomorTelepon) {
        nomorTeleponKasir.add(nomorTelepon);
    }
    
    public ArrayList<String> getDataSetNomorTeleponKasir() {
        return nomorTeleponKasir;
    }
    
    public void tambahData(int idKasir, String namaKasir, String alamatKasir, String nomorTeleponKasir) {
        this.idKasir.add(idKasir);
        this.namaKasir.add(namaKasir);
        this.alamatKasir.add(alamatKasir);
        this.nomorTeleponKasir.add(nomorTeleponKasir);
    }
}
    
