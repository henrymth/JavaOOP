package com.mudah_technology_javaoop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //block instantiate object
        Vehicle vehicle = new Vehicle();
        Owner owner= new Owner();
        ParkingSpot parkingSpot = new ParkingSpot();
        Transmission transmission=new Transmission();

        //set value ke setiap object. value string. ini bis didapat dari pilihan combo atau isian dari console .nextString
        vehicle.setType("Mobil");
        owner.setOwnerName("Budi");
        transmission.setName("Automatic");
        parkingSpot.setSpotPlace("ada di garasi.");

        //set value relasi antar object
        vehicle.setOwner(owner);
        vehicle.setParkingSpot(parkingSpot);
        vehicle.setTransmission(transmission);

        System.out.println(vehicle.getType() + " "
                + vehicle.getTransmission().getName() + " "
                + vehicle.getOwner().getOwnerName()+ " "
                + vehicle.getParkingSpot().getSpotPlace());


        vehicle.setType("Motor");
        owner.setOwnerName("Agus");
        transmission.setName("Manual");
        parkingSpot.setSpotPlace("ada di parkiran.");

        vehicle.setOwner(owner);
        vehicle.setParkingSpot(parkingSpot);
        vehicle.setTransmission(transmission);

        System.out.println(vehicle.getType() + " " + vehicle.getTransmission().getName() + " " + vehicle.getOwner().getOwnerName()+ " " + vehicle.getParkingSpot().getSpotPlace());

        //semua mobil di move parking spot nya
        vehicle.setType("Motor");
        owner.setOwnerName("Agus");
        transmission.setName("Manual");
        parkingSpot.setSpotPlace("di lapangan bola");
        vehicle.moveParkingSpot(parkingSpot);


/*        mobil.budi.parkir.digarasi;
        mobil.budi.merek.bmw;
        mobil.budi.bermesin.bensin;

        motor.budi.parkir.digarasi;
        motor.budi.merek.bmw;
        motor.budi.bermesin.bensin;*/
    }
}
