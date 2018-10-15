package com.zqw.atcrowd.manager.service.impl;

import com.zqw.atcrowd.manager.dao.TestDao;
import com.zqw.atcrowd.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;

import java.util.HashMap;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void insert() {
        System.out.println("zzzz2342342zz");
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "zhang3");
        testDao.insert(map);
    }
}
