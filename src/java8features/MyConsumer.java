/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.function.Consumer;

/**
 *
 * @author Tommi Going through Java 8 features. -> ForEach
 * This is class created for: 1) forEach & consumer interface -exercise
 */
public class MyConsumer implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t);
    }

}
