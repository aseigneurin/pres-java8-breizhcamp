package com.seigneurin.breizhcamp.step2;

public class Factory {

    public static Name createNameStatic(String firstName, String lastName) {
        return new Name(firstName, lastName);
    }

    public  Name createNameInstance(String firstName, String lastName) {
        return new Name(firstName, lastName);
    }

}