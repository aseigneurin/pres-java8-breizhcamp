package com.seigneurin.breizhcamp.step2;

public class Main {
    public static void main(String[] args) {

        NameParser parser = new NameParser();

        Name res = parser.parse("Eric Clapton", new Creator<Name>() {
            @Override
            public Name create(String firstName, String lastName) {
                return new Name(firstName, lastName);
            }
        });

    }
}
