package com.pmsapp.view.vo;

import com.jpa.entities.TicketPriority;

public class SLADetailsVO {


	private TicketPriority ticketPriority = new TicketPriority();

	private Long slaId;

	private int slaValue;

	private String duration;

	private String unit;


	public TicketPriority getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(TicketPriority ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	public int getSlaValue() {
		return slaValue;
	}

	public void setSlaValue(int slaValue) {
		this.slaValue = slaValue;
	}

	public void setSlaId(Long slaId) {
		this.slaId = slaId;
	}

	public Long getSlaId() {
		return slaId;
	}


}
