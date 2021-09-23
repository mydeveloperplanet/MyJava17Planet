package com.mydeveloperplanet.myjava17planet;

import java.awt.*;
import java.util.Objects;

public class GrapeClass {

    private final Color color;
    private final int nbrOfPits;

    public GrapeClass(Color color, int nbrOfPits) {
        this.color = color;
        this.nbrOfPits = nbrOfPits;
    }

    public Color getColor() {
        return color;
    }

    public int getNbrOfPits() {
        return nbrOfPits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrapeClass that = (GrapeClass) o;
        return nbrOfPits == that.nbrOfPits && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, nbrOfPits);
    }

    @Override
    public String toString() {
        return "GrapeClass{" +
                "color=" + color +
                ", nbrOfPits=" + nbrOfPits +
                '}';
    }

}
