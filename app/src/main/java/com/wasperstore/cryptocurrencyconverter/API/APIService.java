package com.wasperstore.cryptocurrencyconverter.API;


import com.wasperstore.cryptocurrencyconverter.Model.CryptoCrcy;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Habeex on 10/5/2017.
 */

public interface APIService {
    //API call to get json object & append the URL
    @GET("/data/pricemulti?fsyms=BTC,ETH&tsyms=USD&e=Coinbase&extraParams=your_app_name")
    Call<CryptoCrcy> getBTC();
}
