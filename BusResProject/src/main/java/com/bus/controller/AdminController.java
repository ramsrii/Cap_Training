package com.bus.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
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
@RequestMapping(value="/admin")
public class AdminController {

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

	AnnotationConfigApplicationContext adminctx= 
			new AnnotationConfigApplicationContext(Admin.class);


	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test()
	{
		return "testing";
	}
		
	//admin home page
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage(){
		return "home";
	}

	@RequestMapping(value="/adminHome",method=RequestMethod.GET)
	public String HomePage(){
		return "AdminHomePage";
	}


	//user login
	@GetMapping("/login")
	public String loginPage(){
		return "adminLogin";
	}

	@PostMapping("/adminLogin")
	public ModelAndView login(HttpServletRequest req,
			ModelAndView mv){
		int adminId = Integer.parseInt(req.getParameter("adminId"));
		String passwd = req.getParameter("passwd");

		Admin admin = services.adminLogin(adminId, passwd);
		if(admin != null){
			HttpSession session = req.getSession();	
			session.setAttribute("admin", admin);
			mv.setViewName("redirect:./adminHome");
		}else{
			mv.setViewName("redirect:./login");
		}
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

	//	@GetMapping("/search")
	//	public String loginPage () {
	//		return "adminLogin";
	//	}

	@GetMapping("/searchUser")
	public String searchPage () {
		return "searchUser";
	}
	@PostMapping("/searchUser")

	public ModelAndView searchUser(HttpServletRequest req, 
			ModelAndView mv ){
		int userid = Integer.parseInt(req.getParameter("user_id"));

		User user = services.searchUser(userid);
		if(user !=null) {	
			mv.addObject("user1", user);
			mv.setViewName("searchUser");
		}

		return mv;
	}

	@GetMapping("/busUpdate")
	public String updateBusPage () {
		return "busUpdate";
	}
	@PostMapping("/searchBusUpdate")
	public ModelAndView searchBusUpdate(HttpServletRequest req,
			ModelAndView mv){


		int busId=0;
		String sBusId = req.getParameter("busId");
		busId=Integer.parseInt(sBusId);

		Bus bus = busctx.getBean(Bus.class,"bus");

		bus=services.searchBus(busId);
		mv.addObject("bus", bus); 
		mv.setViewName("busUpdate");
		req.setAttribute("bus", bus);
		return mv;
	}


	@PostMapping("/busUpdate")
	public ModelAndView updateBus(HttpServletRequest req, 
			ModelAndView mv ){
		Bus bus = busctx.getBean(Bus.class);
		bus.setBusId(Integer.parseInt(req.getParameter("busid")));
		//bus.setBusId(tempBus.getBusId());
		bus.setBusname(req.getParameter("busname"));
		bus.setBusType(req.getParameter("bustype"));
		bus.setSource(req.getParameter("source"));
		bus.setDestination(req.getParameter("destination"));
		bus.setTotalSeats(Integer.parseInt(req.getParameter("totalseats")));
		bus.setPrice(Double.parseDouble(req.getParameter("price")));


		Boolean b = services.updateBus(bus);
		String msg ="Fail to Update Bus";
		if(b) {	
			msg = "Bus Successfully Updated ";

		}
		mv.addObject("msg",msg);
		mv.setViewName("busUpdate");

		return mv;
	}


	@GetMapping("/addBus")
	public String addBusPage () {
		return "busRegister";
	}

	@PostMapping("/addBus")
	public ModelAndView addBus(HttpServletRequest req, 
			ModelAndView mv ){
		Bus bus = busctx.getBean(Bus.class);
		bus.setBusId(Integer.parseInt(req.getParameter("busid")));
		bus.setBusname(req.getParameter("busname"));
		bus.setBusType(req.getParameter("bustype"));
		bus.setSource(req.getParameter("source"));
		bus.setDestination(req.getParameter("destination"));
		bus.setTotalSeats(Integer.parseInt(req.getParameter("totalseats")));
		bus.setPrice(Double.parseDouble(req.getParameter("price")));


		Boolean b = services.createBus(bus);
		String msg ="Fail to Add Bus";
		if(b) {	
			msg = "Bus Successfully Added ";

		}
		mv.addObject("msg", msg);
		mv.addObject("bus",bus);
		mv.setViewName("busRegister");

		return mv;
	}

	@GetMapping("/deleteBus")
	public String deleteBusPage () {
		return "busDelete";
	}

	@PostMapping("/deleteBus")
	public ModelAndView deleteBus(HttpServletRequest req, 
			ModelAndView mv ){
		int bus_id = Integer.parseInt(req.getParameter("busid"));

		Boolean b = services.deletebus(bus_id);
		String msg ="Fail to Delete Bus";
		if(b) {	
			msg = "Bus Successfully Deleted ";

		}
		mv.addObject("msg", msg);
		mv.setViewName("busDelete");

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

		bus=services.searchBus(busId);
		mv.addObject("bus", bus); 
		mv.setViewName("searchBus");
		return mv;
	}
		@GetMapping("/setAvailibilityBus")
	public String setAvailableBusPage () {
		return "setBusAvailability";
	}

	@PostMapping("/setAvailibilityBus")
	public ModelAndView setAvailableBus(HttpServletRequest req, 
			ModelAndView mv ){
		Availability available = availctx.getBean(Availability.class);
		int bus_id = Integer.parseInt(req.getParameter("busid"));
		Bus bus=services.searchBus(bus_id);			

		available.setBusId(bus_id);
		available.setAvailSeats(Integer.parseInt(req.getParameter("availseats")));
		String tempdate = req.getParameter("journeydate");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = sdf.parse(tempdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		available.setAvailDate(date);

		Boolean avail = services.setBusAvailability(available);
		//String msg ="Fail to Delete Bus";
		if(avail) {	
			mv.addObject("bus", bus);

			mv.addObject("available", available);
			mv.setViewName("setBusAvailability");	
		}

		return mv;
	}




	@GetMapping("/viewFeedback")
	public ModelAndView viewFeedback(HttpServletRequest req, 
			ModelAndView mv ){
		List<Feedback> feedbackList = services.viewFeedbac();
		mv.addObject("feedbackList", feedbackList);
		mv.setViewName("ViewFeedback");

		return mv;
	}
	
	//check Availability and ticket booking

		@GetMapping("/checkAvaialability")
		public String availPage(){
			return "busAvailability";
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
			mv.setViewName("busAvailability");
			return mv;
		}
		
		//view Booked Ticket
		

				@GetMapping("/bookedTicket")
				public String getBookedTicketPage(){
					return "bookedTicketAdmin";
				}

				@PostMapping("/bookedTicket")
				public ModelAndView getBookedTicket(HttpServletRequest req, 
						ModelAndView mv){

					String sBusId = req.getParameter("busId");
					int busId=Integer.parseInt(sBusId);

					String tempDate = req.getParameter("date");
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					Date date=null;
					try {
						date = sdf.parse(tempDate);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					List<Ticket> ticketList=services.getTicketByBus(busId, date);

					System.out.println(ticketList);

					mv.addObject("ticketList", ticketList);  
					mv.setViewName("bookedTicket");
					return mv;
				}






}

