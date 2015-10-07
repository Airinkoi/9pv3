package org.itstep.other;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Вадим on 28.09.2015.
 */
public class Compare {
    public static void main(String[] args) {
        LinkedList<Player> players = new LinkedList();
        players.add(new Player("Player1", 12414));
        players.add(new Player("Player2", 21412));
        players.add(new Player("Player3", 235));
        players.add(new Player("Player4", 3421));
        players.add(new Player("Player5", 21456));
        players.add(new Player("Player6", 8329444));


        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                if(p1.getScore() > p2.getScore())
                    return 1;
                else if (p1.getScore() < p2.getScore())
                    return -1;
                else
                    return 0;
            }
        });


        for (Player player : players) {
            System.out.println(player.getNickName() + ": " + player.getScore());
        }
    }
}

class PlayerComparator implements Comparator {

    @Override
    public int compare(Object player1, Object player2) {
        Player p1 = (Player)player1;
        Player p2 = (Player)player2;

        if(p1.getScore() > p2.getScore())
            return 1;
        else if (p1.getScore() < p2.getScore())
            return -1;
        else
            return 0;
    }
}

class Player {
    private String nickName;
    private int score;

    public Player(String nick, int score) {
        this.nickName = nick;
        this.score = score;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
