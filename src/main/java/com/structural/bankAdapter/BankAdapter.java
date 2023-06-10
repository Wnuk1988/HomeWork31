package com.structural.bankAdapter;

public class BankAdapter extends Bank{
    VipClient vipClient = new VipClient();

    @Override
    void addClient() {
        vipClient.addVipClient();
    }
}
