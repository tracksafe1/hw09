package inheritance;

public class Truck extends Vehicle1{
    public static void main(String[] args) {
        Truck object=new Truck();

        object.calculatingFueleffiency(100,10);
        object.distancetravelled(150);
        object.maximumspeed(100);
        object.features("Mercedes","Arocs 4151",2020,"Petrol");
    }
}
