package com.hibernate.bean;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibernate.bean.Usertb;

/**
 * A data access object (DAO) providing persistence and search support for
 * Usertb entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hibernate.bean.Usertb
 * @author MyEclipse Persistence Tools
 */

public class UsertbDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(UsertbDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PWD = "pwd";
	public static final String DHHM = "dhhm";
	public static final String JF = "jf";
	public static final String MAILAD = "mailad";
	public static final String ROLEID = "roleid";
	public static final String ZT = "zt";
	public static final String BYZD1 = "byzd1";
	public static final String BYZD2 = "byzd2";
	public static final String XLDJ = "xldj";
	public static final String BYXX = "byxx";
	public static final String ZYJB = "zyjb";
	public static final String ZYZW = "zyzw";
	public static final String SFXMJL = "sfxmjl";
	public static final String ZYZY = "zyzy";
	public static final String ZYZC = "zyzc";
	public static final String RZRQ = "rzrq";
	public static final String ZZRQ = "zzrq";
	public static final String LRR = "lrr";
	public static final String ZJHM = "zjhm";
	public static final String CWCS = "cwcs";
	public static final String YXBZ = "yxbz";
	public static final String ZJLB = "zjlb";

	protected void initDao() {
		// do nothing
	}

	public void save(Usertb transientInstance) {
		log.debug("saving Usertb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Usertb persistentInstance) {
		log.debug("deleting Usertb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usertb findById(java.lang.Long id) {
		log.debug("getting Usertb instance with id: " + id);
		try {
			Usertb instance = (Usertb) getHibernateTemplate().get(
					"com.xjgl.Usertb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Usertb instance) {
		log.debug("finding Usertb instance by example");
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
		log.debug("finding Usertb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Usertb as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByDhhm(Object dhhm) {
		return findByProperty(DHHM, dhhm);
	}

	public List findByJf(Object jf) {
		return findByProperty(JF, jf);
	}

	public List findByMailad(Object mailad) {
		return findByProperty(MAILAD, mailad);
	}

	public List findByRoleid(Object roleid) {
		return findByProperty(ROLEID, roleid);
	}

	public List findByZt(Object zt) {
		return findByProperty(ZT, zt);
	}

	public List findByByzd1(Object byzd1) {
		return findByProperty(BYZD1, byzd1);
	}

	public List findByByzd2(Object byzd2) {
		return findByProperty(BYZD2, byzd2);
	}

	public List findByXldj(Object xldj) {
		return findByProperty(XLDJ, xldj);
	}

	public List findByByxx(Object byxx) {
		return findByProperty(BYXX, byxx);
	}

	public List findByZyjb(Object zyjb) {
		return findByProperty(ZYJB, zyjb);
	}

	public List findByZyzw(Object zyzw) {
		return findByProperty(ZYZW, zyzw);
	}

	public List findBySfxmjl(Object sfxmjl) {
		return findByProperty(SFXMJL, sfxmjl);
	}

	public List findByZyzy(Object zyzy) {
		return findByProperty(ZYZY, zyzy);
	}

	public List findByZyzc(Object zyzc) {
		return findByProperty(ZYZC, zyzc);
	}

	public List findByRzrq(Object rzrq) {
		return findByProperty(RZRQ, rzrq);
	}

	public List findByZzrq(Object zzrq) {
		return findByProperty(ZZRQ, zzrq);
	}

	public List findByLrr(Object lrr) {
		return findByProperty(LRR, lrr);
	}

	public List findByZjhm(Object zjhm) {
		return findByProperty(ZJHM, zjhm);
	}

	public List findByCwcs(Object cwcs) {
		return findByProperty(CWCS, cwcs);
	}

	public List findByYxbz(Object yxbz) {
		return findByProperty(YXBZ, yxbz);
	}

	public List findByZjlb(Object zjlb) {
		return findByProperty(ZJLB, zjlb);
	}

	public List findAll() {
		log.debug("finding all Usertb instances");
		try {
			String queryString = "from Usertb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public Usertb merge(Usertb detachedInstance) {
		log.debug("merging Usertb instance");
		try {
			Usertb result = (Usertb) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Usertb instance) {
		log.debug("attaching dirty Usertb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usertb instance) {
		log.debug("attaching clean Usertb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsertbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsertbDAO) ctx.getBean("UsertbDAO");
	}
}