package com.ohgiraffers.section01.xmlmapper;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectCacheTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        for(int i = 0; i < 10; i++) {
            // 조회 시간 확인 용 시작 시간
            Long startTime = System.currentTimeMillis();

            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            // 조회 시간 확인 용 끝나는 시간
            Long endTime = System.currentTimeMillis();

            Long interval = endTime - startTime;
            System.out.println("수행 시간 : " + interval + "(ms)");

        }

        sqlSession.close();
    }
}
