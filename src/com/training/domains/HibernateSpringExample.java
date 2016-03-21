package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Students;
import com.training.iface.MyDAO;


public class HibernateSpringExample extends HibernateDaoSupport implements MyDAO<Students> {

	@Override
	public Serializable add(Students t) {
	
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Students find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Students obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
