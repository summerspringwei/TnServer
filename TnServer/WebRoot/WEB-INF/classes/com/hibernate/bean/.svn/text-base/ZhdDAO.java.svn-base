package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Zhd
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hibernate.bean.Zhd
 * @author MyEclipse Persistence Tools
 */

public class ZhdDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ZhdDAO.class);
	// property constants
	public static final String USERID = "userid";
	public static final String SCRQ = "scrq";
	public static final String CZE = "cze";
	public static final String XFE = "xfe";
	public static final String JSJG = "jsjg";

	protected void initDao() {
		// do nothing
	}

	public void save(Zhd transientInstance) {
		log.debug("saving Zhd instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zhd persistentInstance) {
		log.debug("deleting Zhd instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zhd findById(java.lang.Long id) {
		log.debug("getting Zhd instance with id: " + id);
		try {
			Zhd instance = (Zhd) getHibernateTemplate().get("com.xjgl.Zhd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zhd instance) {
		log.debug("finding Zhd instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Zhd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zhd as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByScrq(Object scrq) {
		return findByProperty(SCRQ, scrq);
	}

	public List findByCze(Object cze) {
		return findByProperty(CZE, cze);
	}

	public List findByXfe(Object xfe) {
		return findByProperty(XFE, xfe);
	}

	public List findByJsjg(Object jsjg) {
		return findByProperty(JSJG, jsjg);
	}

	public List findAll() {
		log.debug("finding all Zhd instances");
		try {
			String queryString = "from Zhd";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zhd merge(Zhd detachedInstance) {
		log.debug("merging Zhd instance");
		try {
			Zhd result = (Zhd) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zhd instance) {
		log.debug("attaching dirty Zhd instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zhd instance) {
		log.debug("attaching clean Zhd instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZhdDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZhdDAO) ctx.getBean("ZhdDAO");
	}
}