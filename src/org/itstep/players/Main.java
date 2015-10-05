package org.itstep.players;

import java.util.Vector;

/**
 * Created by Вадим on 30.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Player p = new Player();

        PlayersList list = new PlayersList();
        list.add(p);

        p.addListener(new PlayerObserver() {
            @Override
            public void moved(int x, int y, int speed, int dir) {
                System.out.println("Player moving with speed " + speed);
            }
        });

        p.move(100, -1);
        p.move(420, -1);
        p.move(122, -1);
    }
}
