package com.changhong.test;

/**
 * @date:2019/10/8 17:15
 * @author:lilair
 */
import com.changhong.dao.com.changhong.dao.CustomerDao;
import com.changhong.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring容器的配置信息
public class CustomerDaoTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 根据id查询
     */
    @Test
    public void testFindOne() {
        Customer customer = customerDao.findOne(1l);
        System.out.println(customer);
    }
    @Test
    public void testFindOne2() {
        Customer customer = customerDao.findOne(2l);
        System.out.println(customer);
    }
}
