package com.javatpoint;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class sales {
	
	@Id
	@Column(name="stor_id")
	private String stor_id;
	public String getStor_id() {
		return stor_id;
	}
	public void setStor_id(String stor_id) {
		this.stor_id = stor_id;
	}
	public String getOrd_num() {
		return ord_num;
	}
	public void setOrd_num(String ord_num) {
		this.ord_num = ord_num;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Column(name="ord_num")
	private String ord_num;
	@Column(name="date")
	private Date date;

}
