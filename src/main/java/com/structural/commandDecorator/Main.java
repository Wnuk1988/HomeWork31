package com.structural.commandDecorator;

public class Main {
    public static void main(String[] args) {
        CommonSoldier commonSoldier = new CommonSoldier();
        Sergeant sergeant = new Sergeant(commonSoldier);
        OfficerLieutenant officerLieutenant = new OfficerLieutenant(sergeant);
        officerLieutenant.oder();
    }
}
