package MuhammadOmalAlGiffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
public class pelanggan {
    private int id_pelanggan;
    private String nama_pelanggan;
    private String alamat_pelanggan;
    private String nomor_telepon_pelanggan;

    public pelanggan(int id_pelanggan, String nama_pelanggan, String alamat_pelanggan, String nomor_telepon_pelanggan) {
        this.id_pelanggan = id_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat_pelanggan = alamat_pelanggan;
        this.nomor_telepon_pelanggan = nomor_telepon_pelanggan;
    }

    // Getter and Setter methods

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getNomor_telepon_pelanggan() {
        return nomor_telepon_pelanggan;
    }

    public void setNomor_telepon_pelanggan(String nomor_telepon_pelanggan) {
        this.nomor_telepon_pelanggan = nomor_telepon_pelanggan;
    }
}
