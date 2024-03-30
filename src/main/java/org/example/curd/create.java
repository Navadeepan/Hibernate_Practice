package org.example.curd;

import org.example.entities.songs;
import org.example.utilities.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class create{
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        //create a session object
        Session session = sessionFactory.openSession();

        songs song1 = new songs(5, "Hey ma ma ma ma !", "bebe rexha");
//        songs song2 = new songs(4, "kanmani anbodu", "illayaraja");
        System.out.println(song1);
//        song1.setSinger("bebe rexha");
//        System.out.println(song1);

        //transaction to insert data to database
        session.beginTransaction();
        session.save(song1);
//        session.save(song2);
        session.getTransaction().commit();

        System.out.println("SAVED A SONG - " + song1.getSinger());

        session.close();

    }
}
