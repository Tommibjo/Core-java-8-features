/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author Tommi
 */
public class Java8Features {

    /**
     * @param args the command line arguments
     *
     * Exercising the most important java 8 features here.
     *
     * 1) forEach & consumer interface: - Helps to separate business logic from
     * iterating. - Supposed to bring java closer to functional programming
     */
    public static void main(String[] args) {

        // 1) Creating & populating arraylist for the forEach iteration
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        // 1) forEach & consumer interface implemented via anonymous inner class
        lista.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }

        });

        // 1) forEach & consumer interface implemented via consumer interface implementation
        MyConsumer action = new MyConsumer();
        lista.forEach(action);
    }

}
