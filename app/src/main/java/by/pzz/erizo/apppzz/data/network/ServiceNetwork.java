package by.pzz.erizo.apppzz.data.network;


import by.pzz.erizo.apppzz.data.ResponseModel.ResponseCountry;
import io.reactivex.Observable;

public interface ServiceNetwork {

    Observable<ResponseCountry> checkCountry();
}
