package MuhammadOmalAlGiffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
import java.util.Date;

public class transaksi {
    
    private int id_transaksi;
    private String barang;
    private String kasir;
    private String pelanggan;
    private String tanggal_transaksi;
    private int jumlah_barang;
    private String total_harga;

    public transaksi(int id_transaksi, String barang, String kasir, String pelanggan,
                     String tanggal_transaksi, int jumlah_barang, String total_harga) {
        this.id_transaksi = id_transaksi;
        this.barang = barang;
        this.kasir = kasir;
        this.pelanggan = pelanggan;
        this.tanggal_transaksi = tanggal_transaksi;
        this.jumlah_barang = jumlah_barang;
        this.total_harga = total_harga;
    }

    // Getter and Setter methods

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getbarang() {
        return barang;
    }

    public void setbarang(String barang) {
        this.barang = barang;
    }

    public String getkasir() {
        return kasir;
    }

    public void setkasir(String kasir) {
        this.kasir = kasir;
    }

    public String getpelanggan() {
        return pelanggan;
    }

    public void setpelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String gettanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void settanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public String getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(String total_harga) {
        this.total_harga = total_harga;
    }
    
}
