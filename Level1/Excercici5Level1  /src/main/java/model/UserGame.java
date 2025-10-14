package model;

import java.io.Serializable;
import java.util.Objects;

public class UserGame implements Serializable {

    private static final long serialVersionUID = 1L;
    private int life;
    private String name;
    private String world;
    private int powerAtack;

    public UserGame(int life, String name, String world, int powerAtack) {
        this.life = life;
        this.name = name;
        this.world = world;
        this.powerAtack = powerAtack;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return this.world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public int getPowerAtack() {
        return this.powerAtack;
    }

    public void setPowerAtack(int powerAtack) {
        this.powerAtack = powerAtack;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserGame userGame = (UserGame) o;
        return life == userGame.life && Objects.equals(name, userGame.name) && Objects.equals(world, userGame.world);
    }

    @Override
    public int hashCode() {
        return Objects.hash(life, name, world);
    }

    @Override
    public String toString() {
        return "model.UserGame{" +
                "life=" + life +
                ", name='" + name + '\'' +
                ", world='" + world + '\'' +
                ", powerAtack=" + powerAtack +
                '}';
    }
}
