package com.thinkinginjava.part3.bitmanipulation.model;

import java.util.Random;

/**
 * Created by Alex on 28.10.2017.
 */
public class BitOperations {
    private int ID;
    private int i;
    private int j;
    private int maxpos;
    private int maxneg;
    private long l;
    private long m;
    private long ll;
    private long lln;

    public BitOperations() {
        Random rand = new Random();
        i = rand.nextInt();
        j = rand.nextInt();
        maxpos = 2147483647;
        maxneg = -2147483648;
        l = rand.nextLong();
        m = rand.nextLong();
        ll = Long.MAX_VALUE;
        lln = Long.MIN_VALUE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getMaxpos() {
        return maxpos;
    }

    public void setMaxpos(int maxpos) {
        this.maxpos = maxpos;
    }

    public int getMaxneg() {
        return maxneg;
    }

    public void setMaxneg(int maxneg) {
        this.maxneg = maxneg;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public long getLl() {
        return ll;
    }

    public void setLl(long ll) {
        this.ll = ll;
    }

    public long getLln() {
        return lln;
    }

    public void setLln(long lln) {
        this.lln = lln;
    }
}
