package com.Flight.models;

public class Flight {
	int flightid;
	String source;
	String destination;
	int noofseats;
	double flightfare;
	public Flight(int flightid, String source, String destination, int noofseats, double flightfare) {
		super();
		this.flightid = flightid;
		this.source = source;
		this.destination = destination;
		this.noofseats = noofseats;
		this.flightfare = flightfare;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public double getFlightfare() {
		return flightfare;
	}
	public void setFlightfare(double flightfare) {
		this.flightfare = flightfare;
	}
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", source=" + source + ", destination=" + destination + ", noofseats="
				+ noofseats + ", flightfare=" + flightfare + "]";
	}
	
	

}
