package com.sdajava.hibernaterelations.hibernate;

import com.sdajava.hibernaterelations.EmployeeDao;
import com.sdajava.hibernaterelations.Employee;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

    public Employee get(long id) {
        return getHibernateTemplate().get(Employee.class, id);
    }
}
