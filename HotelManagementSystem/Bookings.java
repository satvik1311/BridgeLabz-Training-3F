package HMS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookings {
    private String booking_id;
    private String room_id;
    private String guest_id;
    private LocalDate check_in;
    private LocalDate check_out;

    public Bookings(String booking_id, String room_id, String guest_id, LocalDate check_in, LocalDate check_out) {
        this.booking_id = booking_id;
        this.room_id = room_id;
        this.guest_id = guest_id;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public String getGuest_id() {
        return guest_id;
    }

    public LocalDate getCheck_in() {
        return check_in;
    }

    public LocalDate getCheck_out() {
        return check_out;
    }

    public static  void showroomBookingCount(List<Bookings> bookings) {
        HashMap<String,Integer> mp = new HashMap<>();
        for(Bookings booking:bookings){
            String room_id=booking.getRoom_id();
            mp.put(room_id, mp.getOrDefault(room_id,0)+1);
        }
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println("Room " + e.getKey() + " booked " + e.getValue() + " time");
        }
    }

    public static void main(String[] args){
        List<Bookings> bookings = new ArrayList<>();
        bookings.add(new Bookings("B001", "R101", "G001", LocalDate.of(2025,9,1), LocalDate.of(2025,9,5)));
        bookings.add(new Bookings("B002", "R101", "G002", LocalDate.of(2025,9,10), LocalDate.of(2025,9,12)));
        bookings.add(new Bookings("B003", "R102", "G003", LocalDate.of(2025,9,15), LocalDate.of(2025,9,18)));

        showroomBookingCount(bookings);

    }

}