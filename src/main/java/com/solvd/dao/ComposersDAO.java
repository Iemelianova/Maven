package com.solvd.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.solvd.dao.interfaces.IComposersDAO;
import com.solvd.model.Composers;
import com.solvd.utils.MyBatisConfigUtil;

public class ComposersDAO implements IComposersDAO{
	
	
		private IComposersDAO entityDAO;
		private Class<IComposersDAO> DAOComposersClass = IComposersDAO.class;

		 @Override
		    public List<Composers> getComposers() {
		        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
		        entityDAO = session.getMapper(DAOComposersClass);
		        List<Composers> entities = entityDAO.getComposers();
		        session.close();
		        return entities;
		    }
		
		@Override
		public Composers getComposersByName(String composer_name) {
		        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
		        entityDAO = session.getMapper(DAOComposersClass);
		        Composers entity =  entityDAO.getComposersByName(composer_name);
		        session.close();
		        return entity;
		}

		@Override
		public void insertComposers(Composers entity) {
		        SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
		        entityDAO = session.getMapper(DAOComposersClass);
		        entityDAO.insertComposers(entity);
		        session.commit();
		        session.close();
		    }
			
		

		@Override
		public void deleteComposers(Composers entity) {
			SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOComposersClass);
	        entityDAO.deleteComposers(entity);
	        session.commit();
	        session.close();
			
		}

		@Override
		public void updateComposers(Composers entity) {
			 SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
		        entityDAO = session.getMapper(DAOComposersClass);
		        entityDAO.updateComposers(entity);
		        session.commit();
		        session.close();
		    }

		@Override
		public void deleteComposers(String authorName) {
			SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOComposersClass);
	        entityDAO.deleteComposers(authorName);
	        session.commit();
	        session.close();
			
		}
}
		