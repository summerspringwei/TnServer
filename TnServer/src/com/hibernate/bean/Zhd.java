package com.hibernate.bean;

/**
 * Zhd entity. @author MyEclipse Persistence Tools
 */
public class Zhd extends AbstractZhd implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Zhd() {
	}

	/** minimal constructor */
	public Zhd(Long zhdid) {
		super(zhdid);
	}

	/** full constructor */
	public Zhd(Long zhdid, Long userid, String scrq, Double cze, Double xfe,
			Double jsjg) {
		super(zhdid, userid, scrq, cze, xfe, jsjg);
	}

}
