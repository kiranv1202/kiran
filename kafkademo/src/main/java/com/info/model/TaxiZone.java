package com.info.model;

public class TaxiZone {
	private int locationId;
	private String borough;
	private String zone;
	private String serviceZone;
	
	public TaxiZone() {
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getServiceZone() {
		return serviceZone;
	}

	public void setServiceZone(String serviceZone) {
		this.serviceZone = serviceZone;
	}

	@Override
	public String toString() {
		return "TaxiZone [locationId=" + locationId + ", borough=" + borough + ", zone=" + zone + ", serviceZone="
				+ serviceZone + "]";
	}
	
	

}
