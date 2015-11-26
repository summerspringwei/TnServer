package com.hibernate.bean;

import java.sql.Timestamp;
import java.util.Date;


/**
 * AbstractTablesviewId entity provides the base persistence definition of the TablesviewId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTablesviewId  implements java.io.Serializable {


    // Fields    

     private String tabschema;
     private String tabname;
     private String owner;
     private String ownertype;
     private String type;
     private String status;
     private String baseTabschema;
     private String baseTabname;
     private String rowtypeschema;
     private String rowtypename;
     private Timestamp createTime;
     private Timestamp alterTime;
     private Timestamp invalidateTime;
     private Timestamp statsTime;
     private Short colcount;
     private Short tableid;
     private Short tbspaceid;
     private Long card;
     private Long npages;
     private Long fpages;
     private Long overflow;
     private String tbspace;
     private String indexTbspace;
     private String longTbspace;
     private Short parents;
     private Short children;
     private Short selfrefs;
     private Short keycolumns;
     private Short keyindexid;
     private Short keyunique;
     private Short checkcount;
     private String datacapture;
     private String constChecked;
     private Short pmapId;
     private String partitionMode;
     private String logAttribute;
     private Short pctfree;
     private String appendMode;
     private String refresh;
     private Timestamp refreshTime;
     private String locksize;
     private String volatile_;
     private String rowFormat;
     private String property;
     private String statisticsProfile;
     private String compression;
     private String accessMode;
     private String clustered;
     private Long activeBlocks;
     private String droprule;
     private Short maxfreespacesearch;
     private Short avgcompressedrowsize;
     private Float avgrowcompressionratio;
     private Short avgrowsize;
     private Float pctrowscompressed;
     private String logindexbuild;
     private Short codepage;
     private String collationschema;
     private String collationname;
     private String collationschemaOrderby;
     private String collationnameOrderby;
     private String encodingScheme;
     private Short pctpagessaved;
     private Timestamp lastRegenTime;
     private Integer secpolicyid;
     private String protectiongranularity;
     private Integer auditpolicyid;
     private String auditpolicyname;
     private String definer;
     private String oncommit;
     private String logged;
     private String onrollback;
     private Date lastused;
     private String remarks;


    // Constructors

    /** default constructor */
    public AbstractTablesviewId() {
    }

	/** minimal constructor */
    public AbstractTablesviewId(String tabschema, String tabname, String owner, String ownertype, String type, String status, Timestamp createTime, Timestamp alterTime, Timestamp invalidateTime, Short colcount, Short tableid, Short tbspaceid, Long card, Long npages, Long fpages, Long overflow, Short keyunique, Short checkcount, String datacapture, String constChecked, String partitionMode, String logAttribute, Short pctfree, String appendMode, String refresh, String locksize, String volatile_, String rowFormat, String property, String compression, String accessMode, Long activeBlocks, String droprule, Short maxfreespacesearch, Short avgcompressedrowsize, Float avgrowcompressionratio, Short avgrowsize, Float pctrowscompressed, Short codepage, String collationschema, String collationschemaOrderby, String encodingScheme, Short pctpagessaved, Integer secpolicyid, String protectiongranularity, String definer, String oncommit, String logged, String onrollback, Date lastused) {
        this.tabschema = tabschema;
        this.tabname = tabname;
        this.owner = owner;
        this.ownertype = ownertype;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.alterTime = alterTime;
        this.invalidateTime = invalidateTime;
        this.colcount = colcount;
        this.tableid = tableid;
        this.tbspaceid = tbspaceid;
        this.card = card;
        this.npages = npages;
        this.fpages = fpages;
        this.overflow = overflow;
        this.keyunique = keyunique;
        this.checkcount = checkcount;
        this.datacapture = datacapture;
        this.constChecked = constChecked;
        this.partitionMode = partitionMode;
        this.logAttribute = logAttribute;
        this.pctfree = pctfree;
        this.appendMode = appendMode;
        this.refresh = refresh;
        this.locksize = locksize;
        this.volatile_ = volatile_;
        this.rowFormat = rowFormat;
        this.property = property;
        this.compression = compression;
        this.accessMode = accessMode;
        this.activeBlocks = activeBlocks;
        this.droprule = droprule;
        this.maxfreespacesearch = maxfreespacesearch;
        this.avgcompressedrowsize = avgcompressedrowsize;
        this.avgrowcompressionratio = avgrowcompressionratio;
        this.avgrowsize = avgrowsize;
        this.pctrowscompressed = pctrowscompressed;
        this.codepage = codepage;
        this.collationschema = collationschema;
        this.collationschemaOrderby = collationschemaOrderby;
        this.encodingScheme = encodingScheme;
        this.pctpagessaved = pctpagessaved;
        this.secpolicyid = secpolicyid;
        this.protectiongranularity = protectiongranularity;
        this.definer = definer;
        this.oncommit = oncommit;
        this.logged = logged;
        this.onrollback = onrollback;
        this.lastused = lastused;
    }
    
    /** full constructor */
    public AbstractTablesviewId(String tabschema, String tabname, String owner, String ownertype, String type, String status, String baseTabschema, String baseTabname, String rowtypeschema, String rowtypename, Timestamp createTime, Timestamp alterTime, Timestamp invalidateTime, Timestamp statsTime, Short colcount, Short tableid, Short tbspaceid, Long card, Long npages, Long fpages, Long overflow, String tbspace, String indexTbspace, String longTbspace, Short parents, Short children, Short selfrefs, Short keycolumns, Short keyindexid, Short keyunique, Short checkcount, String datacapture, String constChecked, Short pmapId, String partitionMode, String logAttribute, Short pctfree, String appendMode, String refresh, Timestamp refreshTime, String locksize, String volatile_, String rowFormat, String property, String statisticsProfile, String compression, String accessMode, String clustered, Long activeBlocks, String droprule, Short maxfreespacesearch, Short avgcompressedrowsize, Float avgrowcompressionratio, Short avgrowsize, Float pctrowscompressed, String logindexbuild, Short codepage, String collationschema, String collationname, String collationschemaOrderby, String collationnameOrderby, String encodingScheme, Short pctpagessaved, Timestamp lastRegenTime, Integer secpolicyid, String protectiongranularity, Integer auditpolicyid, String auditpolicyname, String definer, String oncommit, String logged, String onrollback, Date lastused, String remarks) {
        this.tabschema = tabschema;
        this.tabname = tabname;
        this.owner = owner;
        this.ownertype = ownertype;
        this.type = type;
        this.status = status;
        this.baseTabschema = baseTabschema;
        this.baseTabname = baseTabname;
        this.rowtypeschema = rowtypeschema;
        this.rowtypename = rowtypename;
        this.createTime = createTime;
        this.alterTime = alterTime;
        this.invalidateTime = invalidateTime;
        this.statsTime = statsTime;
        this.colcount = colcount;
        this.tableid = tableid;
        this.tbspaceid = tbspaceid;
        this.card = card;
        this.npages = npages;
        this.fpages = fpages;
        this.overflow = overflow;
        this.tbspace = tbspace;
        this.indexTbspace = indexTbspace;
        this.longTbspace = longTbspace;
        this.parents = parents;
        this.children = children;
        this.selfrefs = selfrefs;
        this.keycolumns = keycolumns;
        this.keyindexid = keyindexid;
        this.keyunique = keyunique;
        this.checkcount = checkcount;
        this.datacapture = datacapture;
        this.constChecked = constChecked;
        this.pmapId = pmapId;
        this.partitionMode = partitionMode;
        this.logAttribute = logAttribute;
        this.pctfree = pctfree;
        this.appendMode = appendMode;
        this.refresh = refresh;
        this.refreshTime = refreshTime;
        this.locksize = locksize;
        this.volatile_ = volatile_;
        this.rowFormat = rowFormat;
        this.property = property;
        this.statisticsProfile = statisticsProfile;
        this.compression = compression;
        this.accessMode = accessMode;
        this.clustered = clustered;
        this.activeBlocks = activeBlocks;
        this.droprule = droprule;
        this.maxfreespacesearch = maxfreespacesearch;
        this.avgcompressedrowsize = avgcompressedrowsize;
        this.avgrowcompressionratio = avgrowcompressionratio;
        this.avgrowsize = avgrowsize;
        this.pctrowscompressed = pctrowscompressed;
        this.logindexbuild = logindexbuild;
        this.codepage = codepage;
        this.collationschema = collationschema;
        this.collationname = collationname;
        this.collationschemaOrderby = collationschemaOrderby;
        this.collationnameOrderby = collationnameOrderby;
        this.encodingScheme = encodingScheme;
        this.pctpagessaved = pctpagessaved;
        this.lastRegenTime = lastRegenTime;
        this.secpolicyid = secpolicyid;
        this.protectiongranularity = protectiongranularity;
        this.auditpolicyid = auditpolicyid;
        this.auditpolicyname = auditpolicyname;
        this.definer = definer;
        this.oncommit = oncommit;
        this.logged = logged;
        this.onrollback = onrollback;
        this.lastused = lastused;
        this.remarks = remarks;
    }

   
    // Property accessors

    public String getTabschema() {
        return this.tabschema;
    }
    
    public void setTabschema(String tabschema) {
        this.tabschema = tabschema;
    }

    public String getTabname() {
        return this.tabname;
    }
    
    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnertype() {
        return this.ownertype;
    }
    
    public void setOwnertype(String ownertype) {
        this.ownertype = ownertype;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getBaseTabschema() {
        return this.baseTabschema;
    }
    
    public void setBaseTabschema(String baseTabschema) {
        this.baseTabschema = baseTabschema;
    }

    public String getBaseTabname() {
        return this.baseTabname;
    }
    
    public void setBaseTabname(String baseTabname) {
        this.baseTabname = baseTabname;
    }

    public String getRowtypeschema() {
        return this.rowtypeschema;
    }
    
    public void setRowtypeschema(String rowtypeschema) {
        this.rowtypeschema = rowtypeschema;
    }

    public String getRowtypename() {
        return this.rowtypename;
    }
    
    public void setRowtypename(String rowtypename) {
        this.rowtypename = rowtypename;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getAlterTime() {
        return this.alterTime;
    }
    
    public void setAlterTime(Timestamp alterTime) {
        this.alterTime = alterTime;
    }

    public Timestamp getInvalidateTime() {
        return this.invalidateTime;
    }
    
    public void setInvalidateTime(Timestamp invalidateTime) {
        this.invalidateTime = invalidateTime;
    }

    public Timestamp getStatsTime() {
        return this.statsTime;
    }
    
    public void setStatsTime(Timestamp statsTime) {
        this.statsTime = statsTime;
    }

    public Short getColcount() {
        return this.colcount;
    }
    
    public void setColcount(Short colcount) {
        this.colcount = colcount;
    }

    public Short getTableid() {
        return this.tableid;
    }
    
    public void setTableid(Short tableid) {
        this.tableid = tableid;
    }

    public Short getTbspaceid() {
        return this.tbspaceid;
    }
    
    public void setTbspaceid(Short tbspaceid) {
        this.tbspaceid = tbspaceid;
    }

    public Long getCard() {
        return this.card;
    }
    
    public void setCard(Long card) {
        this.card = card;
    }

    public Long getNpages() {
        return this.npages;
    }
    
    public void setNpages(Long npages) {
        this.npages = npages;
    }

    public Long getFpages() {
        return this.fpages;
    }
    
    public void setFpages(Long fpages) {
        this.fpages = fpages;
    }

    public Long getOverflow() {
        return this.overflow;
    }
    
    public void setOverflow(Long overflow) {
        this.overflow = overflow;
    }

    public String getTbspace() {
        return this.tbspace;
    }
    
    public void setTbspace(String tbspace) {
        this.tbspace = tbspace;
    }

    public String getIndexTbspace() {
        return this.indexTbspace;
    }
    
    public void setIndexTbspace(String indexTbspace) {
        this.indexTbspace = indexTbspace;
    }

    public String getLongTbspace() {
        return this.longTbspace;
    }
    
    public void setLongTbspace(String longTbspace) {
        this.longTbspace = longTbspace;
    }

    public Short getParents() {
        return this.parents;
    }
    
    public void setParents(Short parents) {
        this.parents = parents;
    }

    public Short getChildren() {
        return this.children;
    }
    
    public void setChildren(Short children) {
        this.children = children;
    }

    public Short getSelfrefs() {
        return this.selfrefs;
    }
    
    public void setSelfrefs(Short selfrefs) {
        this.selfrefs = selfrefs;
    }

    public Short getKeycolumns() {
        return this.keycolumns;
    }
    
    public void setKeycolumns(Short keycolumns) {
        this.keycolumns = keycolumns;
    }

    public Short getKeyindexid() {
        return this.keyindexid;
    }
    
    public void setKeyindexid(Short keyindexid) {
        this.keyindexid = keyindexid;
    }

    public Short getKeyunique() {
        return this.keyunique;
    }
    
    public void setKeyunique(Short keyunique) {
        this.keyunique = keyunique;
    }

    public Short getCheckcount() {
        return this.checkcount;
    }
    
    public void setCheckcount(Short checkcount) {
        this.checkcount = checkcount;
    }

    public String getDatacapture() {
        return this.datacapture;
    }
    
    public void setDatacapture(String datacapture) {
        this.datacapture = datacapture;
    }

    public String getConstChecked() {
        return this.constChecked;
    }
    
    public void setConstChecked(String constChecked) {
        this.constChecked = constChecked;
    }

    public Short getPmapId() {
        return this.pmapId;
    }
    
    public void setPmapId(Short pmapId) {
        this.pmapId = pmapId;
    }

    public String getPartitionMode() {
        return this.partitionMode;
    }
    
    public void setPartitionMode(String partitionMode) {
        this.partitionMode = partitionMode;
    }

    public String getLogAttribute() {
        return this.logAttribute;
    }
    
    public void setLogAttribute(String logAttribute) {
        this.logAttribute = logAttribute;
    }

    public Short getPctfree() {
        return this.pctfree;
    }
    
    public void setPctfree(Short pctfree) {
        this.pctfree = pctfree;
    }

    public String getAppendMode() {
        return this.appendMode;
    }
    
    public void setAppendMode(String appendMode) {
        this.appendMode = appendMode;
    }

    public String getRefresh() {
        return this.refresh;
    }
    
    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public Timestamp getRefreshTime() {
        return this.refreshTime;
    }
    
    public void setRefreshTime(Timestamp refreshTime) {
        this.refreshTime = refreshTime;
    }

    public String getLocksize() {
        return this.locksize;
    }
    
    public void setLocksize(String locksize) {
        this.locksize = locksize;
    }

    public String getVolatile_() {
        return this.volatile_;
    }
    
    public void setVolatile_(String volatile_) {
        this.volatile_ = volatile_;
    }

    public String getRowFormat() {
        return this.rowFormat;
    }
    
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    public String getProperty() {
        return this.property;
    }
    
    public void setProperty(String property) {
        this.property = property;
    }

    public String getStatisticsProfile() {
        return this.statisticsProfile;
    }
    
    public void setStatisticsProfile(String statisticsProfile) {
        this.statisticsProfile = statisticsProfile;
    }

    public String getCompression() {
        return this.compression;
    }
    
    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getAccessMode() {
        return this.accessMode;
    }
    
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public String getClustered() {
        return this.clustered;
    }
    
    public void setClustered(String clustered) {
        this.clustered = clustered;
    }

    public Long getActiveBlocks() {
        return this.activeBlocks;
    }
    
    public void setActiveBlocks(Long activeBlocks) {
        this.activeBlocks = activeBlocks;
    }

    public String getDroprule() {
        return this.droprule;
    }
    
    public void setDroprule(String droprule) {
        this.droprule = droprule;
    }

    public Short getMaxfreespacesearch() {
        return this.maxfreespacesearch;
    }
    
    public void setMaxfreespacesearch(Short maxfreespacesearch) {
        this.maxfreespacesearch = maxfreespacesearch;
    }

    public Short getAvgcompressedrowsize() {
        return this.avgcompressedrowsize;
    }
    
    public void setAvgcompressedrowsize(Short avgcompressedrowsize) {
        this.avgcompressedrowsize = avgcompressedrowsize;
    }

    public Float getAvgrowcompressionratio() {
        return this.avgrowcompressionratio;
    }
    
    public void setAvgrowcompressionratio(Float avgrowcompressionratio) {
        this.avgrowcompressionratio = avgrowcompressionratio;
    }

    public Short getAvgrowsize() {
        return this.avgrowsize;
    }
    
    public void setAvgrowsize(Short avgrowsize) {
        this.avgrowsize = avgrowsize;
    }

    public Float getPctrowscompressed() {
        return this.pctrowscompressed;
    }
    
    public void setPctrowscompressed(Float pctrowscompressed) {
        this.pctrowscompressed = pctrowscompressed;
    }

    public String getLogindexbuild() {
        return this.logindexbuild;
    }
    
    public void setLogindexbuild(String logindexbuild) {
        this.logindexbuild = logindexbuild;
    }

    public Short getCodepage() {
        return this.codepage;
    }
    
    public void setCodepage(Short codepage) {
        this.codepage = codepage;
    }

    public String getCollationschema() {
        return this.collationschema;
    }
    
    public void setCollationschema(String collationschema) {
        this.collationschema = collationschema;
    }

    public String getCollationname() {
        return this.collationname;
    }
    
    public void setCollationname(String collationname) {
        this.collationname = collationname;
    }

    public String getCollationschemaOrderby() {
        return this.collationschemaOrderby;
    }
    
    public void setCollationschemaOrderby(String collationschemaOrderby) {
        this.collationschemaOrderby = collationschemaOrderby;
    }

    public String getCollationnameOrderby() {
        return this.collationnameOrderby;
    }
    
    public void setCollationnameOrderby(String collationnameOrderby) {
        this.collationnameOrderby = collationnameOrderby;
    }

    public String getEncodingScheme() {
        return this.encodingScheme;
    }
    
    public void setEncodingScheme(String encodingScheme) {
        this.encodingScheme = encodingScheme;
    }

    public Short getPctpagessaved() {
        return this.pctpagessaved;
    }
    
    public void setPctpagessaved(Short pctpagessaved) {
        this.pctpagessaved = pctpagessaved;
    }

    public Timestamp getLastRegenTime() {
        return this.lastRegenTime;
    }
    
    public void setLastRegenTime(Timestamp lastRegenTime) {
        this.lastRegenTime = lastRegenTime;
    }

    public Integer getSecpolicyid() {
        return this.secpolicyid;
    }
    
    public void setSecpolicyid(Integer secpolicyid) {
        this.secpolicyid = secpolicyid;
    }

    public String getProtectiongranularity() {
        return this.protectiongranularity;
    }
    
    public void setProtectiongranularity(String protectiongranularity) {
        this.protectiongranularity = protectiongranularity;
    }

    public Integer getAuditpolicyid() {
        return this.auditpolicyid;
    }
    
    public void setAuditpolicyid(Integer auditpolicyid) {
        this.auditpolicyid = auditpolicyid;
    }

    public String getAuditpolicyname() {
        return this.auditpolicyname;
    }
    
    public void setAuditpolicyname(String auditpolicyname) {
        this.auditpolicyname = auditpolicyname;
    }

    public String getDefiner() {
        return this.definer;
    }
    
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    public String getOncommit() {
        return this.oncommit;
    }
    
    public void setOncommit(String oncommit) {
        this.oncommit = oncommit;
    }

    public String getLogged() {
        return this.logged;
    }
    
    public void setLogged(String logged) {
        this.logged = logged;
    }

    public String getOnrollback() {
        return this.onrollback;
    }
    
    public void setOnrollback(String onrollback) {
        this.onrollback = onrollback;
    }

    public Date getLastused() {
        return this.lastused;
    }
    
    public void setLastused(Date lastused) {
        this.lastused = lastused;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractTablesviewId) ) return false;
		 AbstractTablesviewId castOther = ( AbstractTablesviewId ) other; 
         
		 return ( (this.getTabschema()==castOther.getTabschema()) || ( this.getTabschema()!=null && castOther.getTabschema()!=null && this.getTabschema().equals(castOther.getTabschema()) ) )
 && ( (this.getTabname()==castOther.getTabname()) || ( this.getTabname()!=null && castOther.getTabname()!=null && this.getTabname().equals(castOther.getTabname()) ) )
 && ( (this.getOwner()==castOther.getOwner()) || ( this.getOwner()!=null && castOther.getOwner()!=null && this.getOwner().equals(castOther.getOwner()) ) )
 && ( (this.getOwnertype()==castOther.getOwnertype()) || ( this.getOwnertype()!=null && castOther.getOwnertype()!=null && this.getOwnertype().equals(castOther.getOwnertype()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getBaseTabschema()==castOther.getBaseTabschema()) || ( this.getBaseTabschema()!=null && castOther.getBaseTabschema()!=null && this.getBaseTabschema().equals(castOther.getBaseTabschema()) ) )
 && ( (this.getBaseTabname()==castOther.getBaseTabname()) || ( this.getBaseTabname()!=null && castOther.getBaseTabname()!=null && this.getBaseTabname().equals(castOther.getBaseTabname()) ) )
 && ( (this.getRowtypeschema()==castOther.getRowtypeschema()) || ( this.getRowtypeschema()!=null && castOther.getRowtypeschema()!=null && this.getRowtypeschema().equals(castOther.getRowtypeschema()) ) )
 && ( (this.getRowtypename()==castOther.getRowtypename()) || ( this.getRowtypename()!=null && castOther.getRowtypename()!=null && this.getRowtypename().equals(castOther.getRowtypename()) ) )
 && ( (this.getCreateTime()==castOther.getCreateTime()) || ( this.getCreateTime()!=null && castOther.getCreateTime()!=null && this.getCreateTime().equals(castOther.getCreateTime()) ) )
 && ( (this.getAlterTime()==castOther.getAlterTime()) || ( this.getAlterTime()!=null && castOther.getAlterTime()!=null && this.getAlterTime().equals(castOther.getAlterTime()) ) )
 && ( (this.getInvalidateTime()==castOther.getInvalidateTime()) || ( this.getInvalidateTime()!=null && castOther.getInvalidateTime()!=null && this.getInvalidateTime().equals(castOther.getInvalidateTime()) ) )
 && ( (this.getStatsTime()==castOther.getStatsTime()) || ( this.getStatsTime()!=null && castOther.getStatsTime()!=null && this.getStatsTime().equals(castOther.getStatsTime()) ) )
 && ( (this.getColcount()==castOther.getColcount()) || ( this.getColcount()!=null && castOther.getColcount()!=null && this.getColcount().equals(castOther.getColcount()) ) )
 && ( (this.getTableid()==castOther.getTableid()) || ( this.getTableid()!=null && castOther.getTableid()!=null && this.getTableid().equals(castOther.getTableid()) ) )
 && ( (this.getTbspaceid()==castOther.getTbspaceid()) || ( this.getTbspaceid()!=null && castOther.getTbspaceid()!=null && this.getTbspaceid().equals(castOther.getTbspaceid()) ) )
 && ( (this.getCard()==castOther.getCard()) || ( this.getCard()!=null && castOther.getCard()!=null && this.getCard().equals(castOther.getCard()) ) )
 && ( (this.getNpages()==castOther.getNpages()) || ( this.getNpages()!=null && castOther.getNpages()!=null && this.getNpages().equals(castOther.getNpages()) ) )
 && ( (this.getFpages()==castOther.getFpages()) || ( this.getFpages()!=null && castOther.getFpages()!=null && this.getFpages().equals(castOther.getFpages()) ) )
 && ( (this.getOverflow()==castOther.getOverflow()) || ( this.getOverflow()!=null && castOther.getOverflow()!=null && this.getOverflow().equals(castOther.getOverflow()) ) )
 && ( (this.getTbspace()==castOther.getTbspace()) || ( this.getTbspace()!=null && castOther.getTbspace()!=null && this.getTbspace().equals(castOther.getTbspace()) ) )
 && ( (this.getIndexTbspace()==castOther.getIndexTbspace()) || ( this.getIndexTbspace()!=null && castOther.getIndexTbspace()!=null && this.getIndexTbspace().equals(castOther.getIndexTbspace()) ) )
 && ( (this.getLongTbspace()==castOther.getLongTbspace()) || ( this.getLongTbspace()!=null && castOther.getLongTbspace()!=null && this.getLongTbspace().equals(castOther.getLongTbspace()) ) )
 && ( (this.getParents()==castOther.getParents()) || ( this.getParents()!=null && castOther.getParents()!=null && this.getParents().equals(castOther.getParents()) ) )
 && ( (this.getChildren()==castOther.getChildren()) || ( this.getChildren()!=null && castOther.getChildren()!=null && this.getChildren().equals(castOther.getChildren()) ) )
 && ( (this.getSelfrefs()==castOther.getSelfrefs()) || ( this.getSelfrefs()!=null && castOther.getSelfrefs()!=null && this.getSelfrefs().equals(castOther.getSelfrefs()) ) )
 && ( (this.getKeycolumns()==castOther.getKeycolumns()) || ( this.getKeycolumns()!=null && castOther.getKeycolumns()!=null && this.getKeycolumns().equals(castOther.getKeycolumns()) ) )
 && ( (this.getKeyindexid()==castOther.getKeyindexid()) || ( this.getKeyindexid()!=null && castOther.getKeyindexid()!=null && this.getKeyindexid().equals(castOther.getKeyindexid()) ) )
 && ( (this.getKeyunique()==castOther.getKeyunique()) || ( this.getKeyunique()!=null && castOther.getKeyunique()!=null && this.getKeyunique().equals(castOther.getKeyunique()) ) )
 && ( (this.getCheckcount()==castOther.getCheckcount()) || ( this.getCheckcount()!=null && castOther.getCheckcount()!=null && this.getCheckcount().equals(castOther.getCheckcount()) ) )
 && ( (this.getDatacapture()==castOther.getDatacapture()) || ( this.getDatacapture()!=null && castOther.getDatacapture()!=null && this.getDatacapture().equals(castOther.getDatacapture()) ) )
 && ( (this.getConstChecked()==castOther.getConstChecked()) || ( this.getConstChecked()!=null && castOther.getConstChecked()!=null && this.getConstChecked().equals(castOther.getConstChecked()) ) )
 && ( (this.getPmapId()==castOther.getPmapId()) || ( this.getPmapId()!=null && castOther.getPmapId()!=null && this.getPmapId().equals(castOther.getPmapId()) ) )
 && ( (this.getPartitionMode()==castOther.getPartitionMode()) || ( this.getPartitionMode()!=null && castOther.getPartitionMode()!=null && this.getPartitionMode().equals(castOther.getPartitionMode()) ) )
 && ( (this.getLogAttribute()==castOther.getLogAttribute()) || ( this.getLogAttribute()!=null && castOther.getLogAttribute()!=null && this.getLogAttribute().equals(castOther.getLogAttribute()) ) )
 && ( (this.getPctfree()==castOther.getPctfree()) || ( this.getPctfree()!=null && castOther.getPctfree()!=null && this.getPctfree().equals(castOther.getPctfree()) ) )
 && ( (this.getAppendMode()==castOther.getAppendMode()) || ( this.getAppendMode()!=null && castOther.getAppendMode()!=null && this.getAppendMode().equals(castOther.getAppendMode()) ) )
 && ( (this.getRefresh()==castOther.getRefresh()) || ( this.getRefresh()!=null && castOther.getRefresh()!=null && this.getRefresh().equals(castOther.getRefresh()) ) )
 && ( (this.getRefreshTime()==castOther.getRefreshTime()) || ( this.getRefreshTime()!=null && castOther.getRefreshTime()!=null && this.getRefreshTime().equals(castOther.getRefreshTime()) ) )
 && ( (this.getLocksize()==castOther.getLocksize()) || ( this.getLocksize()!=null && castOther.getLocksize()!=null && this.getLocksize().equals(castOther.getLocksize()) ) )
 && ( (this.getVolatile_()==castOther.getVolatile_()) || ( this.getVolatile_()!=null && castOther.getVolatile_()!=null && this.getVolatile_().equals(castOther.getVolatile_()) ) )
 && ( (this.getRowFormat()==castOther.getRowFormat()) || ( this.getRowFormat()!=null && castOther.getRowFormat()!=null && this.getRowFormat().equals(castOther.getRowFormat()) ) )
 && ( (this.getProperty()==castOther.getProperty()) || ( this.getProperty()!=null && castOther.getProperty()!=null && this.getProperty().equals(castOther.getProperty()) ) )
 && ( (this.getStatisticsProfile()==castOther.getStatisticsProfile()) || ( this.getStatisticsProfile()!=null && castOther.getStatisticsProfile()!=null && this.getStatisticsProfile().equals(castOther.getStatisticsProfile()) ) )
 && ( (this.getCompression()==castOther.getCompression()) || ( this.getCompression()!=null && castOther.getCompression()!=null && this.getCompression().equals(castOther.getCompression()) ) )
 && ( (this.getAccessMode()==castOther.getAccessMode()) || ( this.getAccessMode()!=null && castOther.getAccessMode()!=null && this.getAccessMode().equals(castOther.getAccessMode()) ) )
 && ( (this.getClustered()==castOther.getClustered()) || ( this.getClustered()!=null && castOther.getClustered()!=null && this.getClustered().equals(castOther.getClustered()) ) )
 && ( (this.getActiveBlocks()==castOther.getActiveBlocks()) || ( this.getActiveBlocks()!=null && castOther.getActiveBlocks()!=null && this.getActiveBlocks().equals(castOther.getActiveBlocks()) ) )
 && ( (this.getDroprule()==castOther.getDroprule()) || ( this.getDroprule()!=null && castOther.getDroprule()!=null && this.getDroprule().equals(castOther.getDroprule()) ) )
 && ( (this.getMaxfreespacesearch()==castOther.getMaxfreespacesearch()) || ( this.getMaxfreespacesearch()!=null && castOther.getMaxfreespacesearch()!=null && this.getMaxfreespacesearch().equals(castOther.getMaxfreespacesearch()) ) )
 && ( (this.getAvgcompressedrowsize()==castOther.getAvgcompressedrowsize()) || ( this.getAvgcompressedrowsize()!=null && castOther.getAvgcompressedrowsize()!=null && this.getAvgcompressedrowsize().equals(castOther.getAvgcompressedrowsize()) ) )
 && ( (this.getAvgrowcompressionratio()==castOther.getAvgrowcompressionratio()) || ( this.getAvgrowcompressionratio()!=null && castOther.getAvgrowcompressionratio()!=null && this.getAvgrowcompressionratio().equals(castOther.getAvgrowcompressionratio()) ) )
 && ( (this.getAvgrowsize()==castOther.getAvgrowsize()) || ( this.getAvgrowsize()!=null && castOther.getAvgrowsize()!=null && this.getAvgrowsize().equals(castOther.getAvgrowsize()) ) )
 && ( (this.getPctrowscompressed()==castOther.getPctrowscompressed()) || ( this.getPctrowscompressed()!=null && castOther.getPctrowscompressed()!=null && this.getPctrowscompressed().equals(castOther.getPctrowscompressed()) ) )
 && ( (this.getLogindexbuild()==castOther.getLogindexbuild()) || ( this.getLogindexbuild()!=null && castOther.getLogindexbuild()!=null && this.getLogindexbuild().equals(castOther.getLogindexbuild()) ) )
 && ( (this.getCodepage()==castOther.getCodepage()) || ( this.getCodepage()!=null && castOther.getCodepage()!=null && this.getCodepage().equals(castOther.getCodepage()) ) )
 && ( (this.getCollationschema()==castOther.getCollationschema()) || ( this.getCollationschema()!=null && castOther.getCollationschema()!=null && this.getCollationschema().equals(castOther.getCollationschema()) ) )
 && ( (this.getCollationname()==castOther.getCollationname()) || ( this.getCollationname()!=null && castOther.getCollationname()!=null && this.getCollationname().equals(castOther.getCollationname()) ) )
 && ( (this.getCollationschemaOrderby()==castOther.getCollationschemaOrderby()) || ( this.getCollationschemaOrderby()!=null && castOther.getCollationschemaOrderby()!=null && this.getCollationschemaOrderby().equals(castOther.getCollationschemaOrderby()) ) )
 && ( (this.getCollationnameOrderby()==castOther.getCollationnameOrderby()) || ( this.getCollationnameOrderby()!=null && castOther.getCollationnameOrderby()!=null && this.getCollationnameOrderby().equals(castOther.getCollationnameOrderby()) ) )
 && ( (this.getEncodingScheme()==castOther.getEncodingScheme()) || ( this.getEncodingScheme()!=null && castOther.getEncodingScheme()!=null && this.getEncodingScheme().equals(castOther.getEncodingScheme()) ) )
 && ( (this.getPctpagessaved()==castOther.getPctpagessaved()) || ( this.getPctpagessaved()!=null && castOther.getPctpagessaved()!=null && this.getPctpagessaved().equals(castOther.getPctpagessaved()) ) )
 && ( (this.getLastRegenTime()==castOther.getLastRegenTime()) || ( this.getLastRegenTime()!=null && castOther.getLastRegenTime()!=null && this.getLastRegenTime().equals(castOther.getLastRegenTime()) ) )
 && ( (this.getSecpolicyid()==castOther.getSecpolicyid()) || ( this.getSecpolicyid()!=null && castOther.getSecpolicyid()!=null && this.getSecpolicyid().equals(castOther.getSecpolicyid()) ) )
 && ( (this.getProtectiongranularity()==castOther.getProtectiongranularity()) || ( this.getProtectiongranularity()!=null && castOther.getProtectiongranularity()!=null && this.getProtectiongranularity().equals(castOther.getProtectiongranularity()) ) )
 && ( (this.getAuditpolicyid()==castOther.getAuditpolicyid()) || ( this.getAuditpolicyid()!=null && castOther.getAuditpolicyid()!=null && this.getAuditpolicyid().equals(castOther.getAuditpolicyid()) ) )
 && ( (this.getAuditpolicyname()==castOther.getAuditpolicyname()) || ( this.getAuditpolicyname()!=null && castOther.getAuditpolicyname()!=null && this.getAuditpolicyname().equals(castOther.getAuditpolicyname()) ) )
 && ( (this.getDefiner()==castOther.getDefiner()) || ( this.getDefiner()!=null && castOther.getDefiner()!=null && this.getDefiner().equals(castOther.getDefiner()) ) )
 && ( (this.getOncommit()==castOther.getOncommit()) || ( this.getOncommit()!=null && castOther.getOncommit()!=null && this.getOncommit().equals(castOther.getOncommit()) ) )
 && ( (this.getLogged()==castOther.getLogged()) || ( this.getLogged()!=null && castOther.getLogged()!=null && this.getLogged().equals(castOther.getLogged()) ) )
 && ( (this.getOnrollback()==castOther.getOnrollback()) || ( this.getOnrollback()!=null && castOther.getOnrollback()!=null && this.getOnrollback().equals(castOther.getOnrollback()) ) )
 && ( (this.getLastused()==castOther.getLastused()) || ( this.getLastused()!=null && castOther.getLastused()!=null && this.getLastused().equals(castOther.getLastused()) ) )
 && ( (this.getRemarks()==castOther.getRemarks()) || ( this.getRemarks()!=null && castOther.getRemarks()!=null && this.getRemarks().equals(castOther.getRemarks()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTabschema() == null ? 0 : this.getTabschema().hashCode() );
         result = 37 * result + ( getTabname() == null ? 0 : this.getTabname().hashCode() );
         result = 37 * result + ( getOwner() == null ? 0 : this.getOwner().hashCode() );
         result = 37 * result + ( getOwnertype() == null ? 0 : this.getOwnertype().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getStatus() == null ? 0 : this.getStatus().hashCode() );
         result = 37 * result + ( getBaseTabschema() == null ? 0 : this.getBaseTabschema().hashCode() );
         result = 37 * result + ( getBaseTabname() == null ? 0 : this.getBaseTabname().hashCode() );
         result = 37 * result + ( getRowtypeschema() == null ? 0 : this.getRowtypeschema().hashCode() );
         result = 37 * result + ( getRowtypename() == null ? 0 : this.getRowtypename().hashCode() );
         result = 37 * result + ( getCreateTime() == null ? 0 : this.getCreateTime().hashCode() );
         result = 37 * result + ( getAlterTime() == null ? 0 : this.getAlterTime().hashCode() );
         result = 37 * result + ( getInvalidateTime() == null ? 0 : this.getInvalidateTime().hashCode() );
         result = 37 * result + ( getStatsTime() == null ? 0 : this.getStatsTime().hashCode() );
         result = 37 * result + ( getColcount() == null ? 0 : this.getColcount().hashCode() );
         result = 37 * result + ( getTableid() == null ? 0 : this.getTableid().hashCode() );
         result = 37 * result + ( getTbspaceid() == null ? 0 : this.getTbspaceid().hashCode() );
         result = 37 * result + ( getCard() == null ? 0 : this.getCard().hashCode() );
         result = 37 * result + ( getNpages() == null ? 0 : this.getNpages().hashCode() );
         result = 37 * result + ( getFpages() == null ? 0 : this.getFpages().hashCode() );
         result = 37 * result + ( getOverflow() == null ? 0 : this.getOverflow().hashCode() );
         result = 37 * result + ( getTbspace() == null ? 0 : this.getTbspace().hashCode() );
         result = 37 * result + ( getIndexTbspace() == null ? 0 : this.getIndexTbspace().hashCode() );
         result = 37 * result + ( getLongTbspace() == null ? 0 : this.getLongTbspace().hashCode() );
         result = 37 * result + ( getParents() == null ? 0 : this.getParents().hashCode() );
         result = 37 * result + ( getChildren() == null ? 0 : this.getChildren().hashCode() );
         result = 37 * result + ( getSelfrefs() == null ? 0 : this.getSelfrefs().hashCode() );
         result = 37 * result + ( getKeycolumns() == null ? 0 : this.getKeycolumns().hashCode() );
         result = 37 * result + ( getKeyindexid() == null ? 0 : this.getKeyindexid().hashCode() );
         result = 37 * result + ( getKeyunique() == null ? 0 : this.getKeyunique().hashCode() );
         result = 37 * result + ( getCheckcount() == null ? 0 : this.getCheckcount().hashCode() );
         result = 37 * result + ( getDatacapture() == null ? 0 : this.getDatacapture().hashCode() );
         result = 37 * result + ( getConstChecked() == null ? 0 : this.getConstChecked().hashCode() );
         result = 37 * result + ( getPmapId() == null ? 0 : this.getPmapId().hashCode() );
         result = 37 * result + ( getPartitionMode() == null ? 0 : this.getPartitionMode().hashCode() );
         result = 37 * result + ( getLogAttribute() == null ? 0 : this.getLogAttribute().hashCode() );
         result = 37 * result + ( getPctfree() == null ? 0 : this.getPctfree().hashCode() );
         result = 37 * result + ( getAppendMode() == null ? 0 : this.getAppendMode().hashCode() );
         result = 37 * result + ( getRefresh() == null ? 0 : this.getRefresh().hashCode() );
         result = 37 * result + ( getRefreshTime() == null ? 0 : this.getRefreshTime().hashCode() );
         result = 37 * result + ( getLocksize() == null ? 0 : this.getLocksize().hashCode() );
         result = 37 * result + ( getVolatile_() == null ? 0 : this.getVolatile_().hashCode() );
         result = 37 * result + ( getRowFormat() == null ? 0 : this.getRowFormat().hashCode() );
         result = 37 * result + ( getProperty() == null ? 0 : this.getProperty().hashCode() );
         result = 37 * result + ( getStatisticsProfile() == null ? 0 : this.getStatisticsProfile().hashCode() );
         result = 37 * result + ( getCompression() == null ? 0 : this.getCompression().hashCode() );
         result = 37 * result + ( getAccessMode() == null ? 0 : this.getAccessMode().hashCode() );
         result = 37 * result + ( getClustered() == null ? 0 : this.getClustered().hashCode() );
         result = 37 * result + ( getActiveBlocks() == null ? 0 : this.getActiveBlocks().hashCode() );
         result = 37 * result + ( getDroprule() == null ? 0 : this.getDroprule().hashCode() );
         result = 37 * result + ( getMaxfreespacesearch() == null ? 0 : this.getMaxfreespacesearch().hashCode() );
         result = 37 * result + ( getAvgcompressedrowsize() == null ? 0 : this.getAvgcompressedrowsize().hashCode() );
         result = 37 * result + ( getAvgrowcompressionratio() == null ? 0 : this.getAvgrowcompressionratio().hashCode() );
         result = 37 * result + ( getAvgrowsize() == null ? 0 : this.getAvgrowsize().hashCode() );
         result = 37 * result + ( getPctrowscompressed() == null ? 0 : this.getPctrowscompressed().hashCode() );
         result = 37 * result + ( getLogindexbuild() == null ? 0 : this.getLogindexbuild().hashCode() );
         result = 37 * result + ( getCodepage() == null ? 0 : this.getCodepage().hashCode() );
         result = 37 * result + ( getCollationschema() == null ? 0 : this.getCollationschema().hashCode() );
         result = 37 * result + ( getCollationname() == null ? 0 : this.getCollationname().hashCode() );
         result = 37 * result + ( getCollationschemaOrderby() == null ? 0 : this.getCollationschemaOrderby().hashCode() );
         result = 37 * result + ( getCollationnameOrderby() == null ? 0 : this.getCollationnameOrderby().hashCode() );
         result = 37 * result + ( getEncodingScheme() == null ? 0 : this.getEncodingScheme().hashCode() );
         result = 37 * result + ( getPctpagessaved() == null ? 0 : this.getPctpagessaved().hashCode() );
         result = 37 * result + ( getLastRegenTime() == null ? 0 : this.getLastRegenTime().hashCode() );
         result = 37 * result + ( getSecpolicyid() == null ? 0 : this.getSecpolicyid().hashCode() );
         result = 37 * result + ( getProtectiongranularity() == null ? 0 : this.getProtectiongranularity().hashCode() );
         result = 37 * result + ( getAuditpolicyid() == null ? 0 : this.getAuditpolicyid().hashCode() );
         result = 37 * result + ( getAuditpolicyname() == null ? 0 : this.getAuditpolicyname().hashCode() );
         result = 37 * result + ( getDefiner() == null ? 0 : this.getDefiner().hashCode() );
         result = 37 * result + ( getOncommit() == null ? 0 : this.getOncommit().hashCode() );
         result = 37 * result + ( getLogged() == null ? 0 : this.getLogged().hashCode() );
         result = 37 * result + ( getOnrollback() == null ? 0 : this.getOnrollback().hashCode() );
         result = 37 * result + ( getLastused() == null ? 0 : this.getLastused().hashCode() );
         result = 37 * result + ( getRemarks() == null ? 0 : this.getRemarks().hashCode() );
         return result;
   }   





}