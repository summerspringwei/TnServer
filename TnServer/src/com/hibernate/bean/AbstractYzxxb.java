package com.hibernate.bean;

/**
 * AbstractYzxxb entity provides the base persistence definition of the Yzxxb
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYzxxb implements java.io.Serializable {

	// Fields

	private Long yzid;
	private Long userid;
	private String scjm;
	private String dttm;

	// Constructors

	/** default constructor */
	public AbstractYzxxb() {
	}

	/** minimal constructor */
	public AbstractYzxxb(Long yzid) {
		this.yzid = yzid;
	}

	/** full constructor */
	public AbstractYzxxb(Long yzid, Long userid, String scjm, String dttm) {
		this.yzid = yzid;
		this.userid = userid;
		this.scjm = scjm;
		this.dttm = dttm;
	}

	// Property accessors

	public Long getYzid() {
		return this.yzid;
	}

	public void setYzid(Long yzid) {
		this.yzid = yzid;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getScjm() {
		return this.scjm;
	}

	public void setScjm(String scjm) {
		this.scjm = scjm;
	}

	public String getDttm() {
		return this.dttm;
	}

	public void setDttm(String dttm) {
		this.dttm = dttm;
	}

}