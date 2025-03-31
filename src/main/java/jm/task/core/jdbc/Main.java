package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        User user = new User("John", "Doe", (byte) 25);


        try (Session session = Util.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();


            session.save(user);


            transaction.commit();

            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

