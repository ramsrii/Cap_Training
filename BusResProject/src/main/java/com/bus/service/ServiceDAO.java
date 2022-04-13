package com.bus.service;

import java.util.Date;
import java.util.List;

import com.bus.model.Admin;
import com.bus.model.Availability;
import com.bus.model.Bus;
import com.bus.model.Feedback;
import com.bus.model.Ticket;
import com.bus.model.User;


public interface ServiceDAO {

	// user manipulation
	public Boolean createUser(User user);

	public Boolean updateUser(User user);

	public Boolean deleteUser(int userId);

	public User loginUser(int userId, String password);

	public User searchUser(int userId);

	// bus manipulations
	public Boolean createBus(Bus bus);

	public Boolean updateBus(Bus bus);

	public Bus searchBus(int busId);

	public Boolean deletebus(int busId);

	// admin
	public Admin adminLogin(int adminId, String password);

	// Feedback
	public Boolean writeFeedback(Feedback feed);

	public List<Feedback> viewFeedbac();

	// ticket booking
	public Ticket bookTicket(Ticket ticket);

	public Boolean cancelTicket(int bookingId, int userId);

	public Ticket getTicket(int bookingId);

	public List<Ticket> getAllTicket(int userId);

	public List<Availability> checkAvailability(String source, String destination, Date date);

	public Integer checkAvailability(int busId, Date date);

	public List<Ticket> getTicketByBus(int busId,Date date);

	public Boolean setBusAvailability(Availability availability);
	
	//validate
	public Integer validateId(String id);

	public String validateEmail(String email);



}
