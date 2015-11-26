package com.hibernate.bean;



/**
 * Dzb entity. @author MyEclipse Persistence Tools
 */
public class Dzb extends AbstractDzb implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Dzb() {
    }

	/** minimal constructor */
    public Dzb(Long dzid) {
        super(dzid);        
    }
    
    /** full constructor */
    public Dzb(Long dzid, Long userid, String aac031, String xxdz, String byzd1, String byzd2) {
        super(dzid, userid, aac031, xxdz, byzd1, byzd2);        
    }
   
}
