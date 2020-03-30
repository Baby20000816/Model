package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entiy.Topic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class TopicDaoTest {

@Autowired
private TopicDao topicDao;
@Autowired
private DataSourceTransactionManager dataSourceTransactionManager;
    @Test
    public void selectAll() {
        System.out.println(topicDao.selectAll());
    }

    @Test
    public void insert() {
        TransactionStatus status =null;
        int update1;
        int update2 = 0;
        Topic topic = Topic.builder()
                .id("1")
                .topicName("test")
                .topicIcon("1.png")
                .description("111")
                .msgCount(111)
                .followsCount(111)
                .followed(true)
                .build();
        try{
            status = begin();
            update1 = topicDao.insert(topic);
//            int o=1/0;
            commit(status);
        }catch (Exception e){
            update1 =-100;
            update2 =-100;
            e.printStackTrace();
            rollback(status);
        }
        assertEquals(1,update1);
//        assertEquals(1,update2);

    }

    private void commit(TransactionStatus status) {
        commitTransaction(dataSourceTransactionManager,status);
    }

    private void commitTransaction(DataSourceTransactionManager transactionManager,TransactionStatus status) {
        transactionManager.commit(status);
    }

    private TransactionStatus begin() {
        return beginTransaction(dataSourceTransactionManager);
    }

    private TransactionStatus beginTransaction(DataSourceTransactionManager transactionManager) {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        return transactionManager.getTransaction(def);
    }

    public void rollback(TransactionStatus status){
        rollbackTransaction(dataSourceTransactionManager,status);
    }

    private void rollbackTransaction(DataSourceTransactionManager transactionManager, TransactionStatus status) {
        transactionManager.rollback(status);
    }

//    @Test
//    public void batchInsert() {
//        TransactionStatus status = null;
//        Topic[] topics={
//                new Topic("测试1","1.png",111,222),
//                new Topic("测试2","2.png",111,222),
//                new Topic("测试3","3.png",111,222)
//        };
//
//        int[] ints = topicDao.batchInsert(Arrays.asList(topics));
//        assertEquals(3,ints.length);
//    }
}