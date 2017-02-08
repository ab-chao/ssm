package com.ssm.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssm.demo.dao.DemoDao;
import com.ssm.demo.entity.DemoEntity;
import com.ssm.demo.service.DemoService;

import java.util.List;

/**
 * Created by cyl on 2016/12/23.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;
    public List<DemoEntity> getEmp() {
        return demoDao.getEmp();
    }
}
