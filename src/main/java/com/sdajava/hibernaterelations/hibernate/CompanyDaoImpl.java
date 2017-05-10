package com.sdajava.hibernaterelations.hibernate;

import com.sdajava.hibernaterelations.CompanyDao;
import com.sdajava.hibernaterelations.Company;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class CompanyDaoImpl extends HibernateDaoSupport implements CompanyDao {

    public Company get(long id) {
        return getHibernateTemplate().get(Company.class, id);
    }
}
