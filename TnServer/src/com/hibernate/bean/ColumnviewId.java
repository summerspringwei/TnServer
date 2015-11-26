package com.hibernate.bean;



/**
 * ColumnviewId entity. @author MyEclipse Persistence Tools
 */
public class ColumnviewId extends AbstractColumnviewId implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public ColumnviewId() {
    }

	/** minimal constructor */
    public ColumnviewId(String name, String tbname, String tbcreator, String coltype, String nulls, Short codepage, Short dbcscodepg, Short length, Short scale, Short colno, Long colcard, Integer avgcollen, String typename, String typeschema, Integer longlength, String logged, String compact, Short nquantiles, Short nmostfreq, Short compositeCodepage, String hidden, String generated, Integer inlineLength, Long numnulls, Integer avgcollenchar, Short subCount, Short subDelimLength, String identity, String compress, Integer seclabelid, Short pctinlined) {
        super(name, tbname, tbcreator, coltype, nulls, codepage, dbcscodepg, length, scale, colno, colcard, avgcollen, typename, typeschema, longlength, logged, compact, nquantiles, nmostfreq, compositeCodepage, hidden, generated, inlineLength, numnulls, avgcollenchar, subCount, subDelimLength, identity, compress, seclabelid, pctinlined);        
    }
    
    /** full constructor */
    public ColumnviewId(String name, String tbname, String tbcreator, String remarks, String coltype, String nulls, Short codepage, Short dbcscodepg, Short length, Short scale, Short colno, Long colcard, String high2key, String low2key, Integer avgcollen, Short keyseq, String typename, String typeschema, String default_, Integer longlength, String logged, String compact, Short nquantiles, Short nmostfreq, Short compositeCodepage, Short partkeyseq, String sourceTabschema, String sourceTabname, String hidden, String generated, Integer inlineLength, Long numnulls, Integer avgcollenchar, Short subCount, Short subDelimLength, String identity, String compress, Double avgdistinctperpage, Double pagevarianceratio, String implicitvalue, Integer seclabelid, String collationid, Short pctinlined) {
        super(name, tbname, tbcreator, remarks, coltype, nulls, codepage, dbcscodepg, length, scale, colno, colcard, high2key, low2key, avgcollen, keyseq, typename, typeschema, default_, longlength, logged, compact, nquantiles, nmostfreq, compositeCodepage, partkeyseq, sourceTabschema, sourceTabname, hidden, generated, inlineLength, numnulls, avgcollenchar, subCount, subDelimLength, identity, compress, avgdistinctperpage, pagevarianceratio, implicitvalue, seclabelid, collationid, pctinlined);        
    }
   
}
