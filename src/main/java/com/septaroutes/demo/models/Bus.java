package com.septaroutes.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "bus")
public class Bus implements Serializable {

	@Id
	@Column(unique = true)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String label;
	private String lat;
	private String lng;
	private String vehicleId;
	private String blockId;
	private String direction;
	private String destination;
	private String offset;
	private String heading;
	private String late;
	private String offsetSec;
	private String trip;

	public Bus(){}

	public Bus(Long id, String label, String lat, String lng, String vehicleId, String blockId, String direction, String destination, String offset, String heading, String late, String offsetSec, String trip) {
		this.label = label;
		this.lat = lat;
		this.lng = lng;
		this.vehicleId = vehicleId;
		this.blockId = blockId;
		this.direction = direction;
		this.destination = destination;
		this.offset = offset;
		this.heading = heading;
		this.late = late;
		this.offsetSec = offsetSec;
		this.trip = trip;

	}
		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getLat() {
			return lat;
		}

		public void setLat(String lat) {
			this.lat = lat;
		}

		public String getLng() {
			return lng;
		}

		public void setLng(String lng) {
			this.lng = lng;
		}

		public String getVehicleId() {
			return vehicleId;
		}

		public void setVehicleId(String vehicleId) {
			this.vehicleId = vehicleId;
		}

		public String getBlockId() {
			return blockId;
		}

		public void setBlockId(String blockId) {
			this.blockId = blockId;
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getOffset() {
			return offset;
		}

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getHeading() {
			return heading;
		}

		public void setHeading(String heading) {
			this.heading = heading;
		}

		public String getLate() {
			return late;
		}

		public void setLate(String late) {
			this.late = late;
		}

		public String getOffsetSec() {
			return offsetSec;
		}

		public void setOffsetSec(String offsetSec) {
			this.offsetSec = offsetSec;
		}

		public String getTrip() {
			return trip;
		}

		public void setTrip(String trip) {
			this.trip = trip;
		}
	}

	//setters and getters
