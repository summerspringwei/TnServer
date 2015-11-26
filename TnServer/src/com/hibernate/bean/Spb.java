package com.hibernate.bean;



/**
 * Spb entity. @author MyEclipse Persistence Tools
 */
public class Spb extends AbstractSpb implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Spb() {
    }

	/** minimal constructor */
    public Spb(Long spid) {
        super(spid);        
    }
    
    /** full constructor */
    public Spb(Long spid, Double spdj, Integer kcl, String spms, String sptp, String byzd1, String byzd2) {
        super(spid, spdj, kcl, spms, sptp, byzd1, byzd2);        
    }
   
}
