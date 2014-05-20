package com.seigneurin.breizhcamp.step2;

@FunctionalInterface
public interface Creator<T> {

    T create(String firstName, String lastName);

}