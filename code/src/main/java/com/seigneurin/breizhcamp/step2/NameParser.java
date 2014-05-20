package com.seigneurin.breizhcamp.step2;

public class NameParser {

    public <T> T parse(String name, Creator<T> creator) {
        String[] tokens = name.split(" ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        return creator.create(firstName, lastName);
    }

}
