package br.ufc.mandacaru.springProject.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private double terrain;
	private double construction;
	private int rooms;
	private int bathrooms;
	private int garage;
	private double price;
	private boolean status;
	private String purpose;
	private String time;
	private int owner;

	@OneToMany(mappedBy = "product")
	private List<Feedback> feedbacks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTerrain() {
		return terrain;
	}

	public void setTerrain(double terrain) {
		this.terrain = terrain;
	}

	public double getConstruction() {
		return construction;
	}

	public void setConstruction(double construction) {
		this.construction = construction;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getGarage() {
		return garage;
	}

	public void setGarage(int garage) {
		this.garage = garage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Product(int id, String name, String address, double terrain, double construction, int rooms, int bathrooms,
			int garage, double price, boolean status, String purpose, String time, int owner,
			List<Feedback> feedbacks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.terrain = terrain;
		this.construction = construction;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.garage = garage;
		this.price = price;
		this.status = status;
		this.purpose = purpose;
		this.time = time;
		this.owner = owner;
		this.feedbacks = feedbacks;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", address=" + address + ", terrain=" + terrain
				+ ", construction=" + construction + ", rooms=" + rooms + ", bathrooms=" + bathrooms + ", garage="
				+ garage + ", price=" + price + ", status=" + status + ", purpose=" + purpose + ", time=" + time
				+ ", owner=" + owner + ", feedbacks=" + feedbacks + "]";
	}

	public Product() {
		super();
	}
	
}
