package com.seigneurin.breizhcamp.step3;

public class MainTheOldWay {

    public static void main(String[] args) {
        doSomething(new Operation<Object>() {
            @Override
            public Object function() {
                return 42;
            }

            @Override
            public void onSuccess(Object res) {
                System.out.println(res);
            }

            @Override
            public void onError(Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        });
    }

    static <T> void doSomething(Operation<T> operation) {
        try {
            T res = operation.function();
            operation.onSuccess(res);
        } catch (Exception ex) {
            operation.onError(ex);
        }
    }

}
