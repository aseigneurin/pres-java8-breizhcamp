package com.seigneurin.breizhcamp.step2;

public class Main {
    public static void main(String[] args) {

        NameParser parser = new NameParser();

        // En Java < 8
        Name res = parser.parse("Eric Clapton", new Creator<Name>() {
            @Override
            public Name create(String firstName, String lastName) {
                return new Name(firstName, lastName);
            }
        });

        // Référence vers un constructeur
        res = parser.parse("Eric Clapton", Name::new);

        // Référence vers une méthode statique
        res = parser.parse("Eric Clapton", Factory::createNameStatic);

        // Référence vers une méthode d’instance
        Factory factory = new Factory();
        res = parser.parse("Eric Clapton", factory::createNameInstance);

        // Expression lambda
        res = parser.parse("Eric Clapton", (s1, s2) -> new Name(s1, s2));
        res = parser.parse("Eric Clapton", (s1, s2) -> Factory.createNameStatic(s1, s2));
        res = parser.parse("Eric Clapton", (s1, s2) -> factory.createNameInstance(s1, s2));
    }
}
