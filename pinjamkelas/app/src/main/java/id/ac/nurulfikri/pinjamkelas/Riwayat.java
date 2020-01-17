package id.ac.nurulfikri.pinjamkelas;

import com.google.gson.annotations.SerializedName;

public class Riwayat {

    @SerializedName("pinjamstatus")
    private String pinjamstatus;
    @SerializedName("mahasiswa_id")
    private String mahasiswa_id;
    @SerializedName("ruangan")
    private String ruangan;
    @SerializedName("gedung")
    private String gedung;
    @SerializedName("jamawal")
    private String jamawal;
    @SerializedName("jamakhir")
    private String jamakhir;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("kettolak")
    private String kettolak;
    @SerializedName("hari")
    private String hari;

    @Override
    public String toString() {
        return "Riwayat{" +
                "pinjamstatus='" + pinjamstatus + '\'' +
                ", mahasiswa_id='" + mahasiswa_id + '\'' +
                ", ruangan='" + ruangan + '\'' +
                ", gedung='" + gedung + '\'' +
                ", jamawal='" + jamawal + '\'' +
                ", jamaakhir='" + jamakhir + '\'' +
                ", tanggal='" + tanggal + '\'' +
                ", tanggapan='" + kettolak + '\'' +
                ", hari='" + hari + '\'' +
                '}';
    }

    public Riwayat(String pinjamstatus, String mahasiswa_id, String ruangan, String gedung, String jamawal, String jamakhir, String tanggal, String kettolak, String hari) {
        this.pinjamstatus = pinjamstatus;
        this.mahasiswa_id = mahasiswa_id;
        this.ruangan = ruangan;
        this.gedung = gedung;
        this.jamawal = jamawal;
        this.jamakhir = jamakhir;
        this.tanggal = tanggal;
        this.kettolak = kettolak;
        this.hari = hari;
    }

    public String getPinjamstatus() {
        return pinjamstatus;
    }

    public void setPinjamstatus(String pinjamstatus) {
        this.pinjamstatus = pinjamstatus;
    }


    public String getMahasiswa_id() {
        return mahasiswa_id;
    }

    public void setMahasiswa_id(String mahasiswa_id) {
        this.mahasiswa_id = mahasiswa_id;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getGedung() {
        return gedung;
    }

    public void setGedung(String gedung) {
        this.gedung = gedung;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKettolak() {
        return kettolak;
    }

    public void setKettolak(String kettolak) {
        this.kettolak = kettolak;
    }

    public String getJamawal() {
        return jamawal;
    }

    public void setJamawal(String jamawal) {
        this.jamawal = jamawal;
    }

    public String getJamakhir() {
        return jamakhir;
    }

    public void setJamakhir(String jamakhir) {
        this.jamakhir = jamakhir;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
}
