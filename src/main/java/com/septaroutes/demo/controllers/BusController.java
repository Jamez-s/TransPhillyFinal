package com.septaroutes.demo.controllers;

import com.septaroutes.demo.models.Bus;
import com.septaroutes.demo.Bus.BusRepository;
import com.septaroutes.demo.Bus.SeptaAPI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
public class BusController {

	@Autowired
	SeptaAPI busService;

	@Autowired
	private BusRepository busRepository;

	public BusController(BusRepository busRepository) {
		this.busRepository = busRepository;
	}

	@GetMapping("/routes")
	public List<Bus> getAll() {
		busService.getAllBuses();
		return busRepository.findAll();
	}



}
