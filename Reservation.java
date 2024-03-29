package models.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private int roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {
	}
	
	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		
		long diff =  checkOut.getTime() - checkIn.getTime();		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override 
	public String toString() {
		return "Reservation: Room " 
	+ roomNumber 
	+ ", check-in: "
	+ sdf.format(getCheckIn())
	+ ", check-out:"
	+ sdf.format(getCheckOut())
	+ ", "
	+ duration()
	+ " nigths";
	}
	
	
	



}
