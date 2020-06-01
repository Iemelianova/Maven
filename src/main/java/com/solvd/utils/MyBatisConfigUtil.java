package com.solvd.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisConfigUtil {

    private static final String CONFIG_FILE_NAME = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory = null;
    private final static Logger LOGGER = Logger.getLogger(MyBatisConfigUtil.class);

    public static SqlSessionFactory getSqlSessionFactory() {
        try {
            Reader reader = Resources.getResourceAsReader(CONFIG_FILE_NAME);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            LOGGER.info("Session creation complated successfully");
        } catch (IOException e) {
        	LOGGER.info(e.getStackTrace());
        }
        return sqlSessionFactory;
    }
}