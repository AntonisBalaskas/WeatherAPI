package Coordinates;

public class Coordinates {

    //Attributes
    private CoordinatesInfo coord; //coord refers to coordinates

    //constructor for use in serialization
    public Coordinates() {
    } //end of constructor

    //constructor
    public Coordinates(CoordinatesInfo coord) {
        super();
        this.coord = coord;
    } //end of constructor

    //get coordinates
    public CoordinatesInfo getCoord() {
        return coord;
    }

    //set coordinates
    public void setCoord(CoordinatesInfo coord) {
        this.coord = coord;
    }

    //return a string containing coordinates
    public String toString() {
        return String.format("%s", getCoord());
    }
    //end method toString
}
