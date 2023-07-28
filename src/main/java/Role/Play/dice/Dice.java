package Role.Play.dice;

import jakarta.persistence.Entity;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
public class Dice {

    @NotNull
    private String name;

    @NotNull
    private int numFaces;

    public Dice(String name, int numFaces) {
        this.name = name;
        this.numFaces = numFaces;
    }

    public Dice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumFaces() {
        return numFaces;
    }

    public void setNumFace(int numFaces) {
        this.numFaces = numFaces;
    }


}
