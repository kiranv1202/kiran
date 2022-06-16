package com.info.model;

public class TaxiZone {
	
	private int locationId;
	private String borough;
	private String zone;
	private String service_zone;
	
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

	public String getService_zone() {
		return service_zone;
	}

	public void setService_zone(String service_zone) {
		this.service_zone = service_zone;
	}

	@Override
	public String toString() {
		return "TaxiZone [locationId=" + locationId + ", borough=" + borough + ", zone=" + zone + ", service_zone="
				+ service_zone + "]";
	}
	
}
