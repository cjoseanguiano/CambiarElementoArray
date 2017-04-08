package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Carlos");
        myArrayList.add("Jose");
        myArrayList.add("Anguiano");

        //Implementacion iteator y ciclo foreach
        Iterator<String> iterator = myArrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            myArrayList.set(0, "Carlos nuevo");
        }

        for (String elemento : myArrayList) {
            System.out.println(elemento);
        }
    }
}
