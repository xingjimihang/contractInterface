package com.mk.service;

import com.mk.entity.Contract;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContractService {
    @Autowired
    private SqlSession sqlSession;


    public void updateContractFinancStatus(Map<String,Object> map){
        sqlSession.update("updateContractFinancStatus",map);
    }

    public Contract getContractByContractGuid(String contractGuid){
        return sqlSession.selectOne("getContractByContractGuid",contractGuid);
    }

    public List<Contract> getContractList(){
        return sqlSession.selectList("getContractList");
    }

    /**
     * 将项目和标项信息插入合同表里  使合同和项目有关联
     */
    public void updateContractInfo(){
        sqlSession.update("updateContractInfo");
    }
}
