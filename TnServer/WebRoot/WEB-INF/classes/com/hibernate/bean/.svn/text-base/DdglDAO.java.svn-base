package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Ddgl
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.hibernate.bean.Ddgl
 * @author MyEclipse Persistence Tools
 */

public class DdglDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DdglDAO.class);
	// property constants
	public static final String DDRQ = "ddrq";
	public static final String SPID = "spid";
	public static final String USERID = "userid";
	public static final String SPSL = "spsl";
	public static final String DZID = "dzid";
	public static final String DDZT = "ddzt";
	public static final String BYZD1 = "byzd1";
	public static final String BYZD2 = "byzd2";

	protected void initDao() {
		// do nothing
	}

	public void save(Ddgl transientInstance) {
		log.debug("saving Ddgl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ddgl persistentInstance) {
		log.debug("deleting Ddgl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ddgl findById(java.lang.Long id) {
		log.debug("getting Ddgl instance with id: " + id);
		try {
			Ddgl instance = (Ddgl) getHibernateTemplate().get("com.xjgl.Ddgl",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ddgl instance) {
		log.debug("finding Ddgl instance by example");
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
		log.debug("finding Ddgl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ddgl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDdrq(Object ddrq) {
		return findByProperty(DDRQ, ddrq);
	}

	public List findBySpid(Object spid) {
		return findByProperty(SPID, spid);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findBySpsl(Object spsl) {
		return findByProperty(SPSL, spsl);
	}

	public List findByDzid(Object dzid) {
		return findByProperty(DZID, dzid);
	}

	public List findByDdzt(Object ddzt) {
		return findByProperty(DDZT, ddzt);
	}

	public List findByByzd1(Object byzd1) {
		return findByProperty(BYZD1, byzd1);
	}

	public List findByByzd2(Object byzd2) {
		return findByProperty(BYZD2, byzd2);
	}

	public List findAll() {
		log.debug("finding all Ddgl instances");
		try {
			String queryString = "from Ddgl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ddgl merge(Ddgl detachedInstance) {
		log.debug("merging Ddgl instance");
		try {
			Ddgl result = (Ddgl) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ddgl instance) {
		log.debug("attaching dirty Ddgl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ddgl instance) {
		log.debug("attaching clean Ddgl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DdglDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DdglDAO) ctx.getBean("DdglDAO");
	}
}