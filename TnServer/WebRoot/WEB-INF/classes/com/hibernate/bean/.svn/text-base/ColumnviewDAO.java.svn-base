package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Columnview entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hibernate.bean.Columnview
  * @author MyEclipse Persistence Tools 
 */

public class ColumnviewDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(ColumnviewDAO.class);
		//property constants



	protected void initDao() {
		//do nothing
	}
    
    public void save(Columnview transientInstance) {
        log.debug("saving Columnview instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Columnview persistentInstance) {
        log.debug("deleting Columnview instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Columnview findById( com.hibernate.bean.ColumnviewId id) {
        log.debug("getting Columnview instance with id: " + id);
        try {
            Columnview instance = (Columnview) getHibernateTemplate()
                    .get("com.xjgl.Columnview", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Columnview instance) {
        log.debug("finding Columnview instance by example");
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
      log.debug("finding Columnview instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Columnview as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all Columnview instances");
		try {
			String queryString = "from Columnview";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Columnview merge(Columnview detachedInstance) {
        log.debug("merging Columnview instance");
        try {
            Columnview result = (Columnview) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Columnview instance) {
        log.debug("attaching dirty Columnview instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Columnview instance) {
        log.debug("attaching clean Columnview instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static ColumnviewDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (ColumnviewDAO) ctx.getBean("ColumnviewDAO");
	}
}