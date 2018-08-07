package com.septaroutes.demo.Bus;

import com.septaroutes.demo.models.Bus;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SeptaAPI {

	//input your api url
	private static final String url = "http://www3.septa.org/hackathon/TransitView/";
	private final RestTemplate restTemplate;
	private BusRepository busRepository;

	@Autowired
	public SeptaAPI(RestTemplateBuilder restTemplateBuilder, BusRepository busRepository) {
		this.restTemplate = restTemplateBuilder.build();
		this.busRepository = busRepository;
	}

// public void insertData() throws ParseException {
//
	public List<Bus> getAllBuses() {
		List<Bus> buses = new ArrayList<>();
		busRepository.findAll()
				.forEach(buses::add);
		return buses;
	}

//	public Bus getBus(String id) {
//		return getAllBuses().stream().filter(t -> t.getId().equals(id)).findFirst().get();
//	}
//
//	public Bus getBusRoutes(Bus busId) {
//		return restTemplate.getForObject(busId);
//	}

	public Bus save(Bus bus) {
		return this.busRepository.save(bus); }


}
