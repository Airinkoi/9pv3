package org.itstep.players;

/**
 * Created by Вадим on 30.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Player p = new Player();

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
