package innernested;

public class Main {
    public static void main(String[] args){
        // Destination destination = new Destination();

        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSomething();
    }
}
