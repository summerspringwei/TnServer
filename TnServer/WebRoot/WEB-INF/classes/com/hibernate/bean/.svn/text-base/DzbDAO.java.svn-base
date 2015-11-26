package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Dzb entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hibernate.bean.Dzb
  * @author MyEclipse Persistence Tools 
 */

public class DzbDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(DzbDAO.class);
		//property constants
	public static final String USERID = "userid";
	public static final String AAC031 = "aac031";
	public static final String XXDZ = "xxdz";
	public static final String BYZD1 = "byzd1";
	public static final String BYZD2 = "byzd2";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Dzb transientInstance) {
        log.debug("saving Dzb instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Dzb persistentInstance) {
        log.debug("deleting Dzb instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Dzb findById( java.lang.Long id) {
        log.debug("getting Dzb instance with id: " + id);
        try {
            Dzb instance = (Dzb) getHibernateTemplate()
                    .get("com.xjgl.Dzb", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Dzb instance) {
        log.debug("finding Dzb instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Dzb instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Dzb as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByUserid(Object userid
	) {
		return findByProperty(USERID, userid
		);
	}
	
	public List findByAac031(Object aac031
	) {
		return findByProperty(AAC031, aac031
		);
	}
	
	public List findByXxdz(Object xxdz
	) {
		return findByProperty(XXDZ, xxdz
		);
	}
	
	public List findByByzd1(Object byzd1
	) {
		return findByProperty(BYZD1, byzd1
		);
	}
	
	public List findByByzd2(Object byzd2
	) {
		return findByProperty(BYZD2, byzd2
		);
	}
	

	public List findAll() {
		log.debug("finding all Dzb instances");
		try {
			String queryString = "from Dzb";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Dzb merge(Dzb detachedInstance) {
        log.debug("merging Dzb instance");
        try {
            Dzb result = (Dzb) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Dzb instance) {
        log.debug("attaching dirty Dzb instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Dzb instance) {
        log.debug("attaching clean Dzb instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static DzbDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (DzbDAO) ctx.getBean("DzbDAO");
	}
}