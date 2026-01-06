package com.cagla.dao;
import com.cagla.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenelDao<T> implements IBaseDao<T> {
    @Override
    public void kaydet(T t) {
        Transaction tr = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tr = session.beginTransaction();
            session.persist(t); // veya session.save(t);
            tr.commit();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<T> listele(Class<T> clazz) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from " + clazz.getName(), clazz).list();
        }
    }
    
    // Kullanıcı Girişi için özel metot
    public com.cagla.entity.Kullanici girisYap(String ad, String sifre) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Kullanici WHERE kullaniciAD = :ad AND sifre = :sifre", com.cagla.entity.Kullanici.class)
                    .setParameter("ad", ad)
                    .setParameter("sifre", sifre)
                    .uniqueResult();
        }
    }
}