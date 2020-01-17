package id.ac.nurulfikri.pinjamkelas;

import com.google.gson.annotations.SerializedName;

public class Waktu {

    @SerializedName("gedung")
    private String gedung;
    @SerializedName("ruangan")
    private String ruangan;
    @SerializedName("hari")
    private String hari;
    @SerializedName("jamawal")
    private String jamawal;
    @SerializedName("jamakhir")
    private String jamakhir;
    @SerializedName("status")
    private String status;
    @SerializedName("ruangan_id")
    private String ruangan_id;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("mahasiswa_id")
    private String mahasiswa_id;
    @SerializedName("ket")
    private String ket;

    @Override
    public String toString() {
        return "Waktu{" +
                "gedung='" + gedung + '\'' +
                ", ruangan='" + ruangan + '\'' +
                ", hari='" + hari + '\'' +
                ", jamawal='" + jamawal + '\'' +
                ", jamakhir='" + jamakhir + '\'' +
                ", status='" + status + '\'' +
                ", ruangan_id='" + ruangan_id + '\'' +
                ", mahasiswa_id='" + mahasiswa_id + '\'' +
                ", tanggal='" + tanggal + '\'' +
                ", ket='" + ket + '\'' +
                '}';
    }

    public Waktu(String gedung, String ruangan, String hari, String jamawal, String jamakhir, String status, String ruangan_id,String mahasiswa_id,String tanggal,String ket) {
        this.gedung = gedung;
        this.ruangan = ruangan;
        this.hari = hari;
        this.jamawal = jamawal;
        this.jamakhir = jamakhir;
        this.status = status;
        this.ruangan_id = ruangan_id;
        this.mahasiswa_id = mahasiswa_id;
        this.tanggal = tanggal;
        this.ket = ket;
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

    public String getGedung() {
        return gedung;
    }

    public void setGedung(String gedung) {
        this.gedung = gedung;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRuangan_id() {
        return ruangan_id;
    }

    public void setRuangan_id(String ruangan_id) {
        this.ruangan_id = ruangan_id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMahasiswa_id() {
        return mahasiswa_id;
    }

    public void setMahasiswa_id(String mahasiswa_id) {
        this.mahasiswa_id = mahasiswa_id;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}

