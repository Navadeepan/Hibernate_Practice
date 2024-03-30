package org.example.curd;

import org.example.entities.songs;
import org.example.utilities.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class update {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        //create a session object
        Session session = sessionFactory.openSession();

        songs songs = session.get(songs.class, 5);
        songs.setSinger("BEBE REXHA");

        session.beginTransaction();
        session.update(songs);
        session.getTransaction().commit();

        session.close();

    }
}