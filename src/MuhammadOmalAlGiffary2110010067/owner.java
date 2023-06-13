package MuhammadOmalAlGiffary2110010067;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Horizz
 */
public class owner {
     private int id_owner;
    private String nama_owner;
    private String alamat_owner;
    private String nomor_telepon_owner;

    public owner(int id_owner, String nama_owner, String alamat_owner, String nomor_telepon_owner) {
        this.id_owner = id_owner;
        this.nama_owner = nama_owner;
        this.alamat_owner = alamat_owner;
        this.nomor_telepon_owner = nomor_telepon_owner;
    }

    // Getter and Setter methods

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getNama_owner() {
        return nama_owner;
    }

    public void setNama_owner(String nama_owner) {
        this.nama_owner = nama_owner;
    }

    public String getAlamat_owner() {
        return alamat_owner;
    }

    public void setAlamat_owner(String alamat_owner) {
        this.alamat_owner = alamat_owner;
    }

    public String getNomor_telepon_owner() {
        return nomor_telepon_owner;
    }

    public void setNomor_telepon_owner(String nomor_telepon_owner) {
        this.nomor_telepon_owner = nomor_telepon_owner;
    }
}
