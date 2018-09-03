package by.pzz.erizo.apppzz.data.network;



import by.pzz.erizo.apppzz.data.ResponseModel.ResponseCountry;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiMethods {

    @GET("json")
    Observable<ResponseCountry> checkCountry(@Header("User-Agent") String value);
}
