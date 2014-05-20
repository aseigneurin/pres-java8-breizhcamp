package com.seigneurin.breizhcamp.step3;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainJava8 {

    public static void main(String[] args) {
        doSomething(() -> 42, System.out::println, ex -> System.err.println("Error: " + ex.getMessage()));
    }

    static <T> void doSomething(Supplier<T> function, Consumer<T> onSuccess, Consumer<Exception> onError) {
        try {
            T res = function.get();
            onSuccess.accept(res);
        } catch (Exception ex) {
            onError.accept(ex);
        }
    }
}
