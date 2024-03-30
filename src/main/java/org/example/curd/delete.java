package org.example.curd;

import org.example.entities.songs;
import org.example.utilities.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class delete {
    public static void main(String[] args) {

//        //create configuration
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(songs.class);

        //create a session factory
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        //create a session object
        Session session = sessionFactory.openSession();

        songs songs = session.get(songs.class, 11);

        session.beginTransaction();
        session.delete(songs);
        session.getTransaction().commit();

        session.close();
    }
}
