package org.itstep.other;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Observer;

/**
 * Created by Вадим on 30.09.2015.
 */
public class Observe {
    public static void main(String[] args) {
        ObservableList<String> strings = FXCollections.observableArrayList();

        strings.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("List invalidatet");
            }
        });

        strings.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> c) {
                System.out.println("Changed: " + c.getList());
            }
        });

        strings.add("Hello");
        strings.add("Hello2");
        strings.add("Hello2");
        strings.add("Hello2");

    }
}
