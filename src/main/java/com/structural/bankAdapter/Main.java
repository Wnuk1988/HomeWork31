package com.structural.bankAdapter;

public class Main {
    public static void main(String[] args) {
        Bank bank = new RegularClient();
        bank.addClient();
        Bank bankVip = new BankAdapter();
        bankVip.addClient();
    }
}
