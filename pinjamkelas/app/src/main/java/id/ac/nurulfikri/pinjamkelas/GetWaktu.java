package id.ac.nurulfikri.pinjamkelas;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetWaktu {
    @SerializedName("result")
    List<Waktu> waktuList;

    public List<Waktu> getWaktuList() {
        return waktuList;
    }

    public void setWaktuList(List<Waktu> waktuList) {
        this.waktuList = waktuList;
    }
}


