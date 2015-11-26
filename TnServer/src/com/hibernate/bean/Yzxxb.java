package com.hibernate.bean;

/**
 * Yzxxb entity. @author MyEclipse Persistence Tools
 */
public class Yzxxb extends AbstractYzxxb implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Yzxxb() {
	}

	/** minimal constructor */
	public Yzxxb(Long yzid) {
		super(yzid);
	}

	/** full constructor */
	public Yzxxb(Long yzid, Long userid, String scjm, String dttm) {
		super(yzid, userid, scjm, dttm);
	}

}
