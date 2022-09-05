package innernested;

public class Parcel {

    private String recepiend;
    private int mass;




    class Destination{
        private String street;
        private int homeNumber;
        private int roomNumber;

        public void doSmth(){

            System.out.println(mass);
        }

    }



}

