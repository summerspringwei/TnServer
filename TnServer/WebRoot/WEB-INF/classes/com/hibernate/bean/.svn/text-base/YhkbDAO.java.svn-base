package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Yhkb entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hibernate.bean.Yhkb
  * @author MyEclipse Persistence Tools 
 */

public class YhkbDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(YhkbDAO.class);
		//property constants
	public static final String USERID = "userid";
	public static final String BYZD = "byzd";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Yhkb transientInstance) {
        log.debug("saving Yhkb instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Yhkb persistentInstance) {
        log.debug("deleting Yhkb instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Yhkb findById( java.lang.String id) {
        log.debug("getting Yhkb instance with id: " + id);
        try {
            Yhkb instance = (Yhkb) getHibernateTemplate()
                    .get("com.xjgl.Yhkb", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Yhkb instance) {
        log.debug("finding Yhkb instance by example");
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
      log.debug("finding Yhkb instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Yhkb as model where model." 
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
	
	public List findByByzd(Object byzd
	) {
		return findByProperty(BYZD, byzd
		);
	}
	

	public List findAll() {
		log.debug("finding all Yhkb instances");
		try {
			String queryString = "from Yhkb";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Yhkb merge(Yhkb detachedInstance) {
        log.debug("merging Yhkb instance");
        try {
            Yhkb result = (Yhkb) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Yhkb instance) {
        log.debug("attaching dirty Yhkb instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Yhkb instance) {
        log.debug("attaching clean Yhkb instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static YhkbDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (YhkbDAO) ctx.getBean("YhkbDAO");
	}
}