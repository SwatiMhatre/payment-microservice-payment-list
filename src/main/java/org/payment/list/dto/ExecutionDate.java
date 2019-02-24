package org.payment.list.dto;

import javax.persistence.Embeddable;

@Embeddable
public class ExecutionDate {
	
	String year;
	String month;
	String day;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "ExecutionDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
