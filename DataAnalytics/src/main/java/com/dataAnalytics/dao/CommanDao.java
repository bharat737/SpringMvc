/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataAnalytics.dao;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author clover
 */
@Repository
@Transactional
public class CommanDao {

    @Autowired
    private SessionFactory sessionFactory;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

    // size of the password to generate
    public int Create(Object obj) throws Exception {
        System.out.println("###############---Create---#################");
        int id = 0;

        if (obj != null) {
//            id = sessionFactory.getCurrentSession().save(obj);
        	
        	id=(Integer) sessionFactory.getCurrentSession().save(obj);

            Method[] methods = obj.getClass().getMethods();
            for (int i = 0; i < methods.length; i++) {
                Method method = methods[i];
                if (method.getName().equalsIgnoreCase("getParent")) {
                    Object parentObj = method.invoke(obj);
                    if (parentObj != null) {
                    	id=(Integer) sessionFactory.getCurrentSession().save(parentObj);
//                        id = (int) sessionFactory.getCurrentSession().save(parentObj);
                    }
                }
            }
        }
        return id;
    }

    public boolean Modify(Object obj) throws Exception {
        if (obj != null) {

            sessionFactory.getCurrentSession().update(obj);

            Method[] methods = obj.getClass().getMethods();
            for (int i = 0; i < methods.length; i++) {
                Method method = methods[i];
                if (method.getName().equalsIgnoreCase("getParent")) {
                    Object parentObj = method.invoke(obj);
                    if (parentObj != null) {
                        sessionFactory.getCurrentSession().saveOrUpdate(parentObj);
                    }
                }
            }
        }
        return true;

    }

   

    public <T> T getMaster(Class<T> clazz, Integer id) {
        System.out.println("????????getMaster =" + id);

        return (T) sessionFactory.getCurrentSession().get(clazz, id);
        // return obj;
    }

    public <T> T getMaster(Class<T> clazz, String id) {
        System.out.println("????????getMaster =" + id);
        return (T) sessionFactory.getCurrentSession().get(clazz, id);

    }

    public <T> T getMaster1(Class<T> clazz, Integer id) {
        System.out.println("????????getMaster =" + id);

        return (T) sessionFactory.getCurrentSession().load(clazz, id);
        // return obj;
    }

   

    public Integer getMaxId(Class clazz, String colid) {
        System.out.println("????????getMaxDocumentId =");
        String hql = "select max(" + colid + ") FROM " + clazz.getName();
        Integer id = (Integer) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
        return id;
    }

    public Long getEmployeeCount(String value, String colName) {
        System.out.println("????????getEmployeeCount =");
        String hql = "select count(*) From SmtEmployeemaster where " + colName + "=:Id";
        Long id = (Long) sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", value).uniqueResult();

        return id;
    }

    public Long getEmployeeEmail(String value, String colName) {
        System.out.println("????????getEmployeeCount =");
        String hql = "select count(*) From SmtEmployeemaster where " + colName + "=:Id";
        Long id = (Long) sessionFactory.getCurrentSession().createQuery(hql).setParameter("Id", value).uniqueResult();

        return id;
    }

    public <T> T getMaster(Class<T> clazz, String col1, String col1Value, String col2, String col2Value) {
        System.out.println("????????getMaster  =");
        String hql = "From " + clazz + " where " + col1 + "=:col1Value and " + col2 + "=:col2Value";
        T t = (T) sessionFactory.getCurrentSession().createQuery(hql).setParameter("col1Value", col1Value).setParameter("col2Value", col2Value).uniqueResult();
        return t;
    }

 
    
}
