package com.wasperstore.cryptocurrencyconverter.Model;


/**
 * Created by Habeex on 10/5/2017.
 */

public class CryptoCrcy {
    //Create getter & setter for response objects
    private BTC BTC;
    private ETH ETH;

    public BTC getBTC() {
        return BTC;
    }

    public void setBTC(BTC BTC) {
        this.BTC = BTC;
    }

    public ETH getETH() {
        return ETH;
    }

    public void setETH(ETH ETH) {
        this.ETH = ETH;
    }
}
