package com.solvd.dao;

import org.apache.ibatis.session.SqlSession;

import com.solvd.dao.interfaces.IPerformersDAO;
import com.solvd.model.Performers;
import com.solvd.utils.MyBatisConfigUtil;

public class PerformersDAO implements IPerformersDAO {
	private IPerformersDAO entityDAO;
	private Class<IPerformersDAO> DAOPerformersClass = IPerformersDAO.class;

	@Override
	public Performers getPerformersByName(String performer_name) {
	        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOPerformersClass);
	        Performers entity =  entityDAO.getPerformersByName(performer_name);
	        session.close();
	        return entity;
	}

	@Override
	public void insertPerformers(Performers entity) {
	        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOPerformersClass);
	        entityDAO.insertPerformers(entity);
	        session.commit();
	        session.close();
	    }
		
	

	@Override
	public void deletePerformers(Performers entity) {
		SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOPerformersClass);
        entityDAO.deletePerformers(entity);
        session.commit();
        session.close();
		
	}

	@Override
	public void updatePerformers(Performers entity) {
		 SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOPerformersClass);
	        entityDAO.updatePerformers(entity);
	        session.commit();
	        session.close();
	    }
		
	}

