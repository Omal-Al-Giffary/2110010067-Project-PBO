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
public class dsPelanggan {
    
   private ArrayList<Integer> id_pelanggan;
    private ArrayList<String> nama_pelanggan;
    private ArrayList<String> alamat_pelanggan;
    private ArrayList<String> nomor_telepon_pelanggan;
    
    public dsPelanggan() {
        id_pelanggan = new ArrayList<Integer>();
        nama_pelanggan = new ArrayList<String>();
        alamat_pelanggan = new ArrayList<String>();
        nomor_telepon_pelanggan = new ArrayList<String>();
    }
    
    public void insertid_pelanggan(int isi){
        this.id_pelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordid_pelanggan(){
        return this.id_pelanggan;
    }
    
    public void insertnama_pelanggan(String isi){
        this.nama_pelanggan.add(isi);
    }
    public ArrayList<String> getRecordnama_pelanggan(){
        return this.nama_pelanggan;
    }
    
    public void insertalamat_pelanggan(String isi){
        this.alamat_pelanggan.add(isi);
    }
    public ArrayList<String> getRecordalamat_pelanggan(){
        return this.alamat_pelanggan;
    }
    
    public void insertnomor_telepon_pelanggan(String isi){
        this.nomor_telepon_pelanggan.add(isi);
    }
    public ArrayList<String> getRecordnomor_telepon_pelanggan(){
        return this.nomor_telepon_pelanggan;
    }
    
    public void insertPelanggan(int id_pelanggan, String nama_pelanggan,String alamat_pelanggan, 
            String nomor_telepon_pelanggan){
        this.id_pelanggan.add(id_pelanggan);
        this.nama_pelanggan.add(nama_pelanggan);
        this.alamat_pelanggan.add(alamat_pelanggan);
        this.nomor_telepon_pelanggan.add(nomor_telepon_pelanggan);
    }
}
