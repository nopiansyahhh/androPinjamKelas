package id.ac.nurulfikri.pinjamkelas;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetRiwayat {

    @SerializedName("result")
    List<Riwayat> riwayatList;

    public List<Riwayat> getRiwayatList() {
        return riwayatList;
    }

    public void setRiwayatList(List<Riwayat> riwayatList) {
        this.riwayatList = riwayatList;
    }
}
