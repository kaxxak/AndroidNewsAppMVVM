package am.ith.myapplication.service;

import am.ith.myapplication.model.AppResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/temp//json.php")
    Call<AppResponse> getAllProduct();
}
