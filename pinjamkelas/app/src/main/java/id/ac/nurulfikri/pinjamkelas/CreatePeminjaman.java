package id.ac.nurulfikri.pinjamkelas;

import com.google.gson.annotations.SerializedName;

public class CreatePeminjaman {

    @SerializedName("message")
    String message;
    @SerializedName("result")
    Waktu mWaktu;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Waktu getWaktu() {
        return mWaktu;
    }

    public void setWaktu(Waktu Waktu) {
        mWaktu = Waktu;
    }
}
