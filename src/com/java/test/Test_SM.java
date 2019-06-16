package com.java.test;


import com.alpha.mapper.CategoryMapper;

import com.alpha.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test_SM {
    @Autowired
    private CategoryMapper categoryMapper;

    //<editor-fold desc="Description">
    @Test
    public void testAdd(){
        Category category=new Category();
        category.setName("new Category");
        categoryMapper.add(category);
    }

    @Test
    public void testList(){
        System.out.println(categoryMapper);
        List<Category> cs=categoryMapper.list();
        cs.forEach(c->{
            System.out.println(c.getName());
        });
    }
    //</editor-fold>
// FIXME: 2019-06-07

}
