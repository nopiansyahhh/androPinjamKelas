package id.ac.nurulfikri.pinjamkelas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PinjamService {
    @GET("statuspeminjaman")
    Call<List<Waktu>> getWaktu();

    @GET("statuspeminjaman")
    Call<List<Riwayat>> getRiwayat();
    @FormUrlEncoded
    @POST("createpeminjaman")
    Call<CreatePeminjaman> postPeminjaman(@Field("mahasiswa_id") String mahasiswa_id,
                                          @Field("ruangan_id") String ruangan_id,
                                          @Field("ket") String ket,
                                          @Field("tanggal") String tanggal);

    //Call<CreatePeminjaman> postPeminjaman(String toString, String toString1);
}
