package com.cagla.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Konfigürasyon dosyasını yüklemeyi dene
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // HATAYI KONSOLA KIRMIZI OLARAK YAZDIR
            System.err.println("Hibernate başlatılırken kritik hata oluştu: " + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}