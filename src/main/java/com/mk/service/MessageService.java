package com.mk.service;

import com.mk.entity.SendMessage;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MessageService {
    @Autowired
    private SqlSession sqlSession;


    public void insertMessage(SendMessage message){
        sqlSession.insert("insertMessage",message);
    }
}
