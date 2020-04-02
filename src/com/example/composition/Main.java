package com.example.composition;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Pod wyrwigroszem", "Warszawa, ul. Pod wyrwigroszem");

        Room room1 = new Room("First", 1);
        Room room2 = new Room("Second", 2);
        Room room3 = new Room("Third", 3);
        Room room4 = new Room("Fourth", 4);

        TV tv1 = new TV("F45Sam", "Samsung", 45, "Full HD");
        TV tv2 = new TV("F60Sony", "Sony", 60, "4K");

        AirConditioner airConditioner1 = new AirConditioner("FPH600","Philips", 600, 50);
        AirConditioner airConditioner2 = new AirConditioner("FTO540", "Toshiba", 540, 39);

        Restaurant restaurant1 = new Restaurant("Tasty", "24H");

        room1.setTv(tv1);
        room1.getTv();
        room1.setAirConditioner(airConditioner1);
        room1.getAirConditioner();
        room2.setTv(tv2);
        room2.getTv();
        room3.setAirConditioner(airConditioner2);
        room3.getAirConditioner();
        hotel.setRooms(new Room[]{room1,room2,room3,room4});
        hotel.getRooms();
        hotel.setRestaurant(restaurant1);
        hotel.getRestaurant();
        restaurant1.setHotel(hotel);
        restaurant1.getHotel();

        System.out.println(hotel);

    }
}
