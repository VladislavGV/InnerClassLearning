package innernested;

public class Parcel {
    private String recipient;
    private int mass;

    ///...



     class Destination {
        private String street;
        private int homeNumber;
        private int roomNumber;



        public void doSomething(){
            System.out.println(mass);
        }
    }

    ///...

}

