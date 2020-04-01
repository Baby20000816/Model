package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.spider.BilibiliSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class RankDaoTest {
    @Autowired
    private RankDao rankDao;
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Test
    public void selectAll() {
        System.out.println(rankDao.selectAll());
    }

    @Test
    public void batchInsert() {
        rankDao.batchInsert(BilibiliSpider.getRanks());
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
}