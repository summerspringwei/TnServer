package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Spb entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hibernate.bean.Spb
  * @author MyEclipse Persistence Tools 
 */

public class SpbDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(SpbDAO.class);
		//property constants
	public static final String SPDJ = "spdj";
	public static final String KCL = "kcl";
	public static final String SPMS = "spms";
	public static final String SPTP = "sptp";
	public static final String BYZD1 = "byzd1";
	public static final String BYZD2 = "byzd2";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Spb transientInstance) {
        log.debug("saving Spb instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Spb persistentInstance) {
        log.debug("deleting Spb instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Spb findById( java.lang.Long id) {
        log.debug("getting Spb instance with id: " + id);
        try {
            Spb instance = (Spb) getHibernateTemplate()
                    .get("com.xjgl.Spb", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Spb instance) {
        log.debug("finding Spb instance by example");
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
      log.debug("finding Spb instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Spb as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findBySpdj(Object spdj
	) {
		return findByProperty(SPDJ, spdj
		);
	}
	
	public List findByKcl(Object kcl
	) {
		return findByProperty(KCL, kcl
		);
	}
	
	public List findBySpms(Object spms
	) {
		return findByProperty(SPMS, spms
		);
	}
	
	public List findBySptp(Object sptp
	) {
		return findByProperty(SPTP, sptp
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
		log.debug("finding all Spb instances");
		try {
			String queryString = "from Spb";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Spb merge(Spb detachedInstance) {
        log.debug("merging Spb instance");
        try {
            Spb result = (Spb) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Spb instance) {
        log.debug("attaching dirty Spb instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Spb instance) {
        log.debug("attaching clean Spb instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static SpbDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (SpbDAO) ctx.getBean("SpbDAO");
	}
}