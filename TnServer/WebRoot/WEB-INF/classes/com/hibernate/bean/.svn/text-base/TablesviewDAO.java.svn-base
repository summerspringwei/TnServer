package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for Tablesview entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hibernate.bean.Tablesview
  * @author MyEclipse Persistence Tools 
 */

public class TablesviewDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(TablesviewDAO.class);
		//property constants



	protected void initDao() {
		//do nothing
	}
    
    public void save(Tablesview transientInstance) {
        log.debug("saving Tablesview instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Tablesview persistentInstance) {
        log.debug("deleting Tablesview instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Tablesview findById( com.hibernate.bean.TablesviewId id) {
        log.debug("getting Tablesview instance with id: " + id);
        try {
            Tablesview instance = (Tablesview) getHibernateTemplate()
                    .get("com.xjgl.Tablesview", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Tablesview instance) {
        log.debug("finding Tablesview instance by example");
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
      log.debug("finding Tablesview instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Tablesview as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all Tablesview instances");
		try {
			String queryString = "from Tablesview";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Tablesview merge(Tablesview detachedInstance) {
        log.debug("merging Tablesview instance");
        try {
            Tablesview result = (Tablesview) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Tablesview instance) {
        log.debug("attaching dirty Tablesview instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Tablesview instance) {
        log.debug("attaching clean Tablesview instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static TablesviewDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (TablesviewDAO) ctx.getBean("TablesviewDAO");
	}
}