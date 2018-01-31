package com.bve.stationparser1.service;

import com.bve.stationparser1.model.StationSQLformat;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationSQLformatService {

    private final SqlSession sqlSession;

    public StationSQLformatService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<StationSQLformat> getStationById(int id){
        return sqlSession.selectList("getStationById", (id));
    }
}
