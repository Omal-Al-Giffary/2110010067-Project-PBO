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
public class dsBarang {

    private ArrayList<Integer> id_barang;
    private ArrayList<String> nama_barang;
    private ArrayList<String> harga_barang;
    private ArrayList<Integer> stok_barang;
    
    public dsBarang() {
        id_barang = new ArrayList<Integer>();
        nama_barang = new ArrayList<String>();
        harga_barang = new ArrayList<String>();
        stok_barang = new ArrayList<Integer>();
    }
    
    public void insertid_barang(int isi){
        this.id_barang.add(isi);
    }
    public ArrayList<Integer> getRecordid_barang(){
        return this.id_barang;
    }
    
    public void insertnama_barang(String isi){
        this.nama_barang.add(isi);
    }
    public ArrayList<String> getRecordnama_barang(){
        return this.nama_barang;
    }
    
    public void insertharga_barang(String isi){
        this.harga_barang.add(isi);
    }
    public ArrayList<String> getRecordharga_barang(){
        return this.harga_barang;
    }
    
    public void insertstok_barang(int isi){
        this.stok_barang.add(isi);
    }
    public ArrayList<Integer> getRecordstok_barang(){
        return this.stok_barang;
    }
    
    public void insertBarang(int id_barang, String nama_barang, String harga_barang, int stok_barang, 
            int hrgJual){
        this.id_barang.add(id_barang);
        this.nama_barang.add(nama_barang);
        this.harga_barang.add(harga_barang);
        this.stok_barang.add(stok_barang);
        
    }
}
