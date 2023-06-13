/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Horizz
 */
public class dsLaporan {
    
    private ArrayList<Integer> idLaporan;
    private ArrayList<String> transaksi;
    private ArrayList<String> tanggalLaporan;
    private ArrayList<String> keterangan;
    
    public dsLaporan() {
        idLaporan = new ArrayList<Integer>();
        transaksi = new ArrayList<String>();
        tanggalLaporan = new ArrayList<String>();
        keterangan = new ArrayList<String>(); 
    }
    
    public void tambahIdLaporan(int id) {
        idLaporan.add(id);
    }
    
    public ArrayList<Integer> getDataSetIdLaporan() {
        return idLaporan;
    }
    
    public void tambahTransaksi(String trx) {
        transaksi.add(trx);
    }
    
    public ArrayList<String> getDataSetTransaksi() {
        return transaksi;
    }
    
    public void tambahTanggalLaporan(String tanggal) {
        tanggalLaporan.add(tanggal);
    }
    
    public ArrayList<String> getDataSetTanggalLaporan() {
        return tanggalLaporan;
    }
    
    public void tambahKeterangan(String keterangan) {
        this.keterangan.add(keterangan);
    }
    
    public ArrayList<String> getDataSetKeterangan() {
        return keterangan;
    }
    
    public void tambahData(int idLaporan, String transaksi, String tanggalLaporan, String keterangan) {
        this.idLaporan.add(idLaporan);
        this.transaksi.add(transaksi);
        this.tanggalLaporan.add(tanggalLaporan);
        this.keterangan.add(keterangan);
    }
}
