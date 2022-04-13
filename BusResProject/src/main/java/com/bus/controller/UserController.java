package com.bus.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bus.model.Admin;
import com.bus.model.Availability;
import com.bus.model.Bus;
import com.bus.model.Feedback;
import com.bus.model.Ticket;
import com.bus.model.User;
import com.bus.service.ServiceDAO;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private ServiceDAO services;



	AnnotationConfigApplicationContext userctx= 
			new AnnotationConfigApplicationContext(User.class);

	AnnotationConfigApplicationContext busctx= 
			new AnnotationConfigApplicationContext(Bus.class);

	AnnotationConfigApplicationContext ticketctx= 
			new AnnotationConfigApplicationContext(Ticket.class);

	AnnotationConfigApplicationContext availctx= 
			new AnnotationConfigApplicationContext(Availability.class);

	AnnotationConfigApplicationContext feedctx= 
			new AnnotationConfigApplicationContext(Feedback.class);


	//user home page
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage(){
		return "home";
	}

	@RequestMapping(value="/userHome",method=RequestMethod.GET)
	public String HomePage(){
		return "UserHomePage";
	}


	//user login
	@GetMapping("/login")
	public String loginPage(){
		return "userLogin";
	}

	@PostMapping("/userLogin")
	public ModelAndView login(HttpServletRequest req,
			ModelAndView mv){
		int userId = Integer.parseInt(req.getParameter("user_id"));
		String passwd = req.getParameter("passwd");

		User user = services.loginUser(userId, passwd);
		if(user != null){
			HttpSession session = req.getSession();	
			session.setAttribute("user", user);
			mv.setViewName("redirect:./userHome");
		}else{
			mv.setViewName("redirect:./login");
		}
		return mv;
	}




	//user registration

	@GetMapping("/register")
	public String addUserPage(){
		return "userRegister";
	}

	@PostMapping("/userRegister")
	public ModelAndView addUser(HttpServletRequest req, 
			ModelAndView mv){
		User user = userctx.getBean(User.class,"user");

		String sUserId=req.getParameter("userId");


		user.setUserId(Integer.parseInt(sUserId));
		user.setPassword(req.getParameter("password"));
		user.setUsername(req.getParameter("userName"));

		String sEmail=req.getParameter("email");
		user.setEmail(sEmail);

		String sContact=req.getParameter("contact");


		user.setContact(Long.parseLong(sContact));

		System.out.println(user);

		boolean state=services.createUser(user);
		String msg="Failed";
		if(state) {
			msg="Successful";
		}

		mv.addObject("msg", msg); 
		mv.setViewName("userRegister");
		return mv;
	}


	//user update

	@GetMapping("/update")
	public String updateUserPage(){
		return "userUpdate";
	}

	@PostMapping("/userUpdate")
	public ModelAndView updateUser(HttpServletRequest req, 
			ModelAndView mv){
		User user = userctx.getBean(User.class,"user");
		User tempUser=(User) req.getSession().getAttribute("user");

		user.setUserId(tempUser.getUserId());

		user.setPassword(req.getParameter("password"));
		user.setUsername(req.getParameter("userName"));

		String sEmail=req.getParameter("email");
		user.setEmail(sEmail);

		String sContact=req.getParameter("contact");


		user.setContact(Long.parseLong(sContact));

		System.out.println(user);

		boolean state=services.updateUser(user);
		String msg="Failed";
		if(state) {
			msg="Successful";
		}

		mv.addObject("msg", msg);  
		mv.setViewName("userUpdate");
		return mv;
	}


	//user delete
	@GetMapping("/delete")
	public String deletePage(){
		return "userDelete";
	}

	@PostMapping("/userDelete")
	public ModelAndView deleteUser(HttpServletRequest req,
			ModelAndView mv){

		User tempUser=(User) req.getSession().getAttribute("user");

		int userId = tempUser.getUserId();
		String passwd = req.getParameter("passwd");



		String msg=null;
		if(tempUser.getPassword().equals(passwd)) {
			boolean state=services.deleteUser(userId);
			msg="Failed";
			if(state) {
				msg="Successful";
				mv.setViewName("redirect:./login");
			}
		}
		mv.addObject("msg", msg);  
		mv.setViewName("userDelete");
		return mv;
	}

	//search bus
	@GetMapping("/searchBus")
	public String searchBusPage(){
		return "searchBus";
	}

	@PostMapping("/searchBus")
	public ModelAndView searchBus(HttpServletRequest req,
			ModelAndView mv){


		int busId=0;
		String sBusId = req.getParameter("busId");
		busId=Integer.parseInt(sBusId);

		Bus bus = busctx.getBean(Bus.class,"bus");

		bus=services.searchBus(busId);		mv.addObject("bus", bus); 
		mv.setViewName("searchBus");
		return mv;
	}

	//write feedback
	@GetMapping("/writeFeedback")
	public String writeFeedPage(){
		return "writeFeedback";
	}

	@PostMapping("/writeFeedback")
	public ModelAndView writeFeed(HttpServletRequest req,
			ModelAndView mv){


		User tempUser=(User) req.getSession().getAttribute("user");
		Feedback feedback=feedctx.getBean(Feedback.class);

		int userId = tempUser.getUserId();
		feedback.setUserId(userId);

		String message = req.getParameter("feedback");
		feedback.setFeedback(message);




		Boolean state=services.writeFeedback(feedback);
		String msg="Failed";
		if(state) {
			msg="Successful";
		}

		mv.addObject("msg", msg);  
		mv.setViewName("writeFeedback");
		return mv;
	}


	//check Availability and ticket booking

	@GetMapping("/bookTicket")
	public String addBooking(){
		return "bookTicket";
	}

	@PostMapping("/checkAvaialability")
	public ModelAndView checkAvaialability(HttpServletRequest req, 
			ModelAndView mv){

		String source = req.getParameter("source");
		String destination = req.getParameter("destination");

		String tempDate = req.getParameter("journeyDate");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = sdf.parse(tempDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		List<Availability> avaiList=services.checkAvailability(source, destination, date);

		System.out.println(avaiList);

		mv.addObject("avaiList", avaiList);  
		mv.setViewName("bookTicket");
		return mv;
	}

	//bookTicket
	@PostMapping("/bookTicket")
	public ModelAndView bookTicket(HttpServletRequest req, 
			ModelAndView mv){

		Ticket ticket=ticketctx.getBean(Ticket.class);

		User tempUser=(User) req.getSession().getAttribute("user");
		int userId = tempUser.getUserId();
		ticket.setUserId(userId);

		String sBusId = req.getParameter("busId");
		int busId=Integer.parseInt(sBusId);
		ticket.setBusId(busId);



		String snoOfSeats = req.getParameter("noOfseats");
		int noOfseats=Integer.parseInt(snoOfSeats);
		ticket.setNumofseats(noOfseats);


		String tempDate = req.getParameter("journeyDate");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = sdf.parse(tempDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ticket.setJourneyDate(date);

		Ticket bookedTicket=services.bookTicket(ticket);
		System.out.println(bookedTicket);
		String state="Ticket booking Failed";
		if(bookedTicket!=null) {
			state=bookedTicket.toString();

		}


		mv.addObject("state", state);  
		mv.setViewName("bookTicket");
		return mv;
	}
	//get All ticket

	@GetMapping("/getTicket")
	public String getTicket(){
		return "getTicket";
	}

	@PostMapping("/getAllTicket")
	public ModelAndView getTicket(HttpServletRequest req, 
			ModelAndView mv){

		User tempUser=(User) req.getSession().getAttribute("user");
		int userId = tempUser.getUserId();

		List<Ticket> ticketList=services.getAllTicket(userId);

		System.out.println(ticketList);

		mv.addObject("ticketList", ticketList);  
		mv.setViewName("getTicket");
		return mv;
	}

	//cancel Ticket
	@PostMapping("/cancelTicket")
	public ModelAndView cancelTicket(HttpServletRequest req, 
			ModelAndView mv){


		User tempUser=(User) req.getSession().getAttribute("user");
		int userId = tempUser.getUserId();

		String sBookingId = req.getParameter("bookingId");
		int bookingId=Integer.parseInt(sBookingId);



		boolean state=services.cancelTicket(bookingId, userId);

		String ticketMsg="Ticket Cancellation Failed";
		if(state) {
			ticketMsg="Successfully cancelled the ticket";					
		}


		mv.addObject("ticketMsg", ticketMsg);  
		mv.setViewName("getTicket");
		return mv;
	}
	//logout
	@GetMapping("/logout")
	public void logOut(HttpServletRequest req,HttpServletResponse resp)
	{
		HttpSession session=req.getSession();
		if(session!=null){
			session.invalidate();
			Cookie cookie [] = req.getCookies();
			if(cookie!=null){
				for(Cookie c: cookie){
					if(c.getName().equals("JSESSIONID")){
						c.setMaxAge(0);
						resp.addCookie(c);
						break;
					}
				}
			}
			try {
				resp.sendRedirect("./login");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			try {
				resp.sendRedirect("./login");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}





}
