/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Horizz
 */
public class dsTransaksi {
    private ArrayList<Integer> idTransaksi;
    private ArrayList<String> barang;
    private ArrayList<String> kasir;
    private ArrayList<String> pelanggan;
    private ArrayList<String> tanggalTransaksi;
    private ArrayList<Integer> jumlahBarang;
    private ArrayList<String> totalHarga;
    
    public dsTransaksi() {
        idTransaksi = new ArrayList<Integer>();
        barang = new ArrayList<String>();
        kasir = new ArrayList<String>();
        pelanggan = new ArrayList<String>();
        tanggalTransaksi = new ArrayList<String>();
        jumlahBarang = new ArrayList<Integer>();
        totalHarga = new ArrayList<String>(); 
    }
    
    public void tambahIdTransaksi(int id) {
        idTransaksi.add(id);
    }
    
    public ArrayList<Integer> getDataSetIdTransaksi() {
        return idTransaksi;
    }
    
    public void tambahBarang(String brg) {
        barang.add(brg);
    }
    
    public ArrayList<String> getDataSetBarang() {
        return barang;
    }
    
    public void tambahKasir(String ksr) {
        kasir.add(ksr);
    }
    
    public ArrayList<String> getDataSetKasir() {
        return kasir;
    }
    
    public void tambahPelanggan(String plg) {
        pelanggan.add(plg);
    }
    
    public ArrayList<String> getDataSetPelanggan() {
        return pelanggan;
    }
    
    public void tambahTanggalTransaksi(String tanggal) {
        tanggalTransaksi.add(tanggal);
    }
    
    public ArrayList<String> getDataSetTanggalTransaksi() {
        return tanggalTransaksi;
    }
    
    public void tambahJumlahBarang(int jumlah) {
        jumlahBarang.add(jumlah);
    }
    
    public ArrayList<Integer> getDataSetJumlahBarang() {
        return jumlahBarang;
    }
    
    public void tambahTotalHarga(String harga) {
        totalHarga.add(harga);
    }
    
    public ArrayList<String> getDataSetTotalHarga() {
        return totalHarga;
    }
    
    public void tambahData(int idTransaksi, String barang, String kasir, String pelanggan, String tanggalTransaksi, int jumlahBarang, String totalHarga) {
        this.idTransaksi.add(idTransaksi);
        this.barang.add(barang);
        this.kasir.add(kasir);
        this.pelanggan.add(pelanggan);
        this.tanggalTransaksi.add(tanggalTransaksi);
        this.jumlahBarang.add(jumlahBarang);
        this.totalHarga.add(totalHarga);
    }
}
