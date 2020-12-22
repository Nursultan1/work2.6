package com.company;

public class Main {

    public static void main(String[] args) {
        Abstract<Integer> Ab  = new Abstract<>(67,"Яблок");
        Ab.print();
        Abstract <Float> Abs = new Abstract<>(10.4f,"Черешня");
        Abs.print();
        Abstract<Double> AD = new Abstract<>(15.88,"Груш");
        AD.print();

    }
}

