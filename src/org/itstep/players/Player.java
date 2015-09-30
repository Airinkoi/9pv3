package org.itstep.players;

import org.itstep.Observe;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Вадим on 30.09.2015.
 */
public class Player {
    private List<PlayerObserver> observers = new LinkedList<>();
    private int x = 0, y = 0, speed = 0, dir = 0;

    public void move(int speed, int dir) {
        this.speed = speed;
        this.dir = dir;

        notifyMoved();
    }

    public void addListener(PlayerObserver observer) {
        observers.add(observer);
    }

    private void notifyMoved() {
        for(PlayerObserver observer : observers) {
            observer.moved(this.x, this.y, this.speed, this.dir);
        }
    }
}
