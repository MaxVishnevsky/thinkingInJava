package thinkingInJava;

import java.util.Random;

public class Coin {
    private String state;

    public Coin() {
        this.state = " ";
    }

    public void flingUp() {
        Random rnd = new Random(System.currentTimeMillis());
        if (rnd.nextBoolean()) {
            this.state = "head";
        } else {
            this.state = "tail";
        }
    }

    @Override
    public String toString() {
        return this.state;
    }
}
