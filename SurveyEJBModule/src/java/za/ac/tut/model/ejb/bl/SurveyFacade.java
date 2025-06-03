/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entities.Survey;

/**
 *
 * @author user
 */
@Stateless
public class SurveyFacade extends AbstractFacade<Survey> implements SurveyFacadeLocal {

    @PersistenceContext(unitName = "SurveyEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SurveyFacade() {
        super(Survey.class);
    }

    @Override
    public Double averageAge() {
        
        Query query = em.createQuery("SELECT AVG(s.age) FROM Survey s");
        
        Double cnt = (Double)query.getSingleResult();
        return cnt;
    }

    @Override
    public Integer lowAge() {
        
        Query query = em.createQuery("SELECT MIN(s.age) FROM Survey s");
        
        Integer cnt = (Integer)query.getSingleResult();
        return cnt;
    }

    @Override
    public Integer highAge() {
        
        Query query = em.createQuery("SELECT MAX(s.age) FROM Survey s");
        
        Integer cnt = (Integer)query.getSingleResult();
        return cnt;
    }

    @Override
    public Integer countPizza() {
        
        Query query = em.createQuery("SELECT COUNT(s.countPizza) FROM Survey s");
        
        Long cnt = (Long)query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer countPasta() {
        
        Query query = em.createQuery("SELECT COUNT(s.countPasta) FROM Survey s");
        
         Long cnt = (Long)query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer countPapWors() {
        
        Query query = em.createQuery("SELECT COUNT(s.countPapAndWors) FROM Survey s");
        
         Long cnt = (Long)query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Double avgWatchMovie() {
        
        Query query = em.createQuery("SELECT AVG(s.countWatchMovie) FROM Survey s");
        
        Double cnt = (Double)query.getSingleResult();
        return cnt;
    }

    @Override
    public Double avgListenRadio() {
        
        Query query = em.createQuery("SELECT AVG(s.countListenRadio) FROM Survey s");
        
        Double cnt = (Double)query.getSingleResult();
        return cnt;
    }

    @Override
    public Double avgEatOut() {
        
        Query query = em.createQuery("SELECT AVG(s.countEatOut) FROM Survey s");
        
        Double cnt = (Double)query.getSingleResult();
        return cnt;
    }

    @Override
    public Double avgWatchTv() {
        
        Query query = em.createQuery("SELECT AVG(s.countWatchTv) FROM Survey s");
        
        Double cnt = (Double)query.getSingleResult();
        return cnt;
    }
    
}
