package com.javarush.games.minesweeper;

public class GameObject {
    public int x;
    public int y;
    public boolean isMine;
    public int countMineNeighbors;

    public GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }

    public GameObject(int x, int y, boolean isMine, int countMineNeighbors) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
        this.countMineNeighbors = countMineNeighbors;
    }
}