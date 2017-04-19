package com.learn.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Subtimental on 2017/4/19.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CompactDiscTest {
    @Autowired
    private CompactDisc sgtPeppers;
    @Test
    public void cdIsNotNull(){
        assertNotNull(sgtPeppers);
    }
}