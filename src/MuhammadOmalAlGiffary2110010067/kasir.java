package MuhammadOmalAlGiffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
public class kasir {
    private int id_kasir;
    private String nama_kasir;
    private String alamat_kasir;
    private String nomor_telepon_kasir;

    public kasir(int id_kasir, String nama_kasir, String alamat_kasir, String nomor_telepon_kasir) {
        this.id_kasir = id_kasir;
        this.nama_kasir = nama_kasir;
        this.alamat_kasir = alamat_kasir;
        this.nomor_telepon_kasir = nomor_telepon_kasir;
    }

    public int getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(int id_kasir) {
        this.id_kasir = id_kasir;
    }

    public String getNama_kasir() {
        return nama_kasir;
    }

    public void setNama_kasir(String nama_kasir) {
        this.nama_kasir = nama_kasir;
    }

    public String getAlamat_kasir() {
        return alamat_kasir;
    }

    public void setAlamat_kasir(String alamat_kasir) {
        this.alamat_kasir = alamat_kasir;
    }

    public String getNomor_telepon_kasir() {
        return nomor_telepon_kasir;
    }

    public void setNomor_telepon_kasir(String nomor_telepon_kasir) {
        this.nomor_telepon_kasir = nomor_telepon_kasir;
    }
}
