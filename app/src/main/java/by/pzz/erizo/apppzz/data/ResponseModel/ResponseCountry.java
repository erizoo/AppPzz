package by.pzz.erizo.apppzz.data.ResponseModel;

import com.google.gson.annotations.SerializedName;

public class ResponseCountry {

    private String country;

    public ResponseCountry() {
    }

    public ResponseCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
