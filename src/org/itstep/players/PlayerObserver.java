package org.itstep.players;

/**
 * Created by ����� on 30.09.2015.
 */
public interface PlayerObserver {
    void moved(int x, int y, int speed, int dir);
}
