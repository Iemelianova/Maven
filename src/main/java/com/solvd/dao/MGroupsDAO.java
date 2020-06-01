package com.solvd.dao;

import org.apache.ibatis.session.SqlSession;

import com.solvd.dao.interfaces.IMGroupsDAO;
import com.solvd.dao.interfaces.IPerformersDAO;
import com.solvd.model.MusicGroups;
import com.solvd.model.Performers;
import com.solvd.utils.MyBatisConfigUtil;

public class MGroupsDAO implements IMGroupsDAO{
	private IMGroupsDAO entityDAO;
	private Class<IMGroupsDAO> DAOMGroupsClass = IMGroupsDAO.class;

	@Override
	public MusicGroups getMusicGroupsByName(String music_group_name) {
		SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOMGroupsClass);
        MusicGroups entity =  entityDAO.getMusicGroupsByName(music_group_name);
        session.close();
        return entity;
	}

	@Override
	public void insertMusicGroups(MusicGroups entity) {
		 SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOMGroupsClass);
	        entityDAO.insertMusicGroups(entity);
	        session.commit();
	        session.close();
		
	}

	@Override
	public void deleteMusicGroups(MusicGroups entity) {
		SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
        entityDAO = session.getMapper(DAOMGroupsClass);
        entityDAO.deleteMusicGroups(entity);
        session.commit();
        session.close();
		
	}

	@Override
	public void updateMusicGroups(MusicGroups entity) {
		 SqlSession session = MyBatisConfigUtil.getSqlSessionFactory().openSession();
	        entityDAO = session.getMapper(DAOMGroupsClass);
	        entityDAO.updateMusicGroups(entity);
	        session.commit();
	        session.close();
		
	}

}
