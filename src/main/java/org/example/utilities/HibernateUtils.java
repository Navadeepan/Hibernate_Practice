package org.example.utilities;

import org.example.entities.songs;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    public static org.hibernate.SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(songs.class);

        //create a session factory
        org.hibernate.SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
