package id.ac.nurulfikri.pinjamkelas;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit = null;
    static Retrofit getClient(){
        OkHttpClient client = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .build();
        retrofit = new Retrofit
                .Builder()
                .baseUrl("http://10.107.231.227:8000/pinjamkelas/api/")
                //.baseUrl("https://gitlab.com/nopiansyahhh/pinjamkelas/blob/master/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }

}
