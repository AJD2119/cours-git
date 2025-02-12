package org.oxyl;

//hello
//hello
//hello
abstract class AUnCentre {
    private Point centre;

    private AUnCentre (Point centre) {
        this.centre = centre;
    }

    public AUnCentre () {
        this(new Point())
    }

    public Point getCentre() {
        return centre;
    }

    public Point setCentre(Point centre) {
        this.centre = centre;
    }

    public void deplacer(double distanceX, double distanceY) {
        this.centre.deplacer(distanceX, distanceY);
    }

    public boolean isAuCentre() {
        return (centre.getX() == 0.0 && centre.getY() == 0.0) ;
    }
}
