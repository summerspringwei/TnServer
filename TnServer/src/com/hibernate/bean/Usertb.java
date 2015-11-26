package com.hibernate.bean;

/**
 * Usertb entity. @author MyEclipse Persistence Tools
 */
public class Usertb extends AbstractUsertb implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Usertb() {
	}

	/** minimal constructor */
	public Usertb(Long userid) {
		super(userid);
	}

	/** full constructor */
	public Usertb(Long userid, String username, String pwd, String dhhm,
			Integer jf, String mailad, String roleid, String zt, String byzd1,
			String byzd2, String xldj, String byxx, String zyjb, String zyzw,
			String sfxmjl, String zyzy, String zyzc, String rzrq, String zzrq,
			String lrr, String zjhm, String cwcs, String yxbz, String zjlb) {
		super(userid, username, pwd, dhhm, jf, mailad, roleid, zt, byzd1,
				byzd2, xldj, byxx, zyjb, zyzw, sfxmjl, zyzy, zyzc, rzrq, zzrq,
				lrr, zjhm, cwcs, yxbz, zjlb);
	}

}
