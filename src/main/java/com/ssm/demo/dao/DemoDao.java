package com.ssm.demo.dao;

import org.springframework.stereotype.Repository;
import com.ssm.demo.entity.DemoEntity;

import java.util.List;

/**
 * Created by cyl on 2016/12/23.
 */
@Repository
public interface DemoDao {
    List<DemoEntity> getEmp();
}
