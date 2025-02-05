package org.oxyl2.oxyl;

public interface Figure {
    public void deplacer(double distanceX, double distanceY);
    default void tourner (double theta) {};
    default void redimensionner(double f) {};
}
