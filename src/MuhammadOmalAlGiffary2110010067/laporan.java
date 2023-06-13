package MuhammadOmalAlGiffary2110010067;
import java.time.LocalDate;

/**
 *
 * @author Horizz
 */


public class laporan {
    private int id_laporan;
    private transaksi transaksi;
    private LocalDate tanggal_laporan;
    private String keterangan;

    public laporan(int id_laporan, transaksi transaksi, LocalDate tanggal_laporan, String keterangan) {
        this.id_laporan = id_laporan;
        this.transaksi = transaksi;
        this.tanggal_laporan = tanggal_laporan;
        this.keterangan = keterangan;
    }

    public int getId_laporan() {
        return id_laporan;
    }

    public void setId_laporan(int id_laporan) {
        this.id_laporan = id_laporan;
    }

    public transaksi gettransaksi() {
        return transaksi;
    }

    public void settransaksi(transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public LocalDate getTanggal_laporan() {
        return tanggal_laporan;
    }

    public void setTanggal_laporan(LocalDate tanggal_laporan) {
        this.tanggal_laporan = tanggal_laporan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
