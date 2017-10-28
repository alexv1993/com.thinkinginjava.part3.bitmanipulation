package com.thinkinginjava.part3.bitmanipulation.main;

import com.thinkinginjava.part3.bitmanipulation.model.BitOperations;
import com.thinkinginjava.part3.bitmanipulation.model.Show;
import com.thinkinginjava.part3.bitmanipulation.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Alex on 28.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext appletContext = new ClassPathXmlApplicationContext("Beans.xml");
        BitOperations bitOperations = (BitOperations) appletContext.getBean("bitOperations");
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();

            //start transaction
            session.beginTransaction();
            //Save the Model object
            session.save(bitOperations);
            //Commit transaction
            session.getTransaction().commit();
            System.out.println("BitOperation ID = " + bitOperations.getID());
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            //terminate session factory, otherwise program won't end
            HibernateUtil.getSessionFactory().close();
        }

        Show.printBinaryInt("-1", -1);
        Show.printBinaryInt("+1", +1);
        Show.printBinaryInt("max positive ", bitOperations.getMaxpos());
        Show.printBinaryInt("max negative ", bitOperations.getMaxneg());
        Show.printBinaryInt("i", bitOperations.getI());
        Show.printBinaryInt("~i", ~bitOperations.getI());
        Show.printBinaryInt("-i", -bitOperations.getI());
        Show.printBinaryInt("j", bitOperations.getJ());
        Show.printBinaryInt("i & j", bitOperations.getI() & bitOperations.getJ());
        Show.printBinaryInt("i | j", bitOperations.getI() | bitOperations.getJ());
        Show.printBinaryInt("i ^ j", bitOperations.getI() ^ bitOperations.getJ());
        Show.printBinaryInt("i << 5", bitOperations.getI() << 5);
        Show.printBinaryInt("i >> 5", bitOperations.getI() >> 5);
        Show.printBinaryInt("(~i) >> 5", (~bitOperations.getI()) >> 5);
        Show.printBinaryInt(" i >>> 5", bitOperations.getI() >>> 5);
        Show.printBinaryInt("(~i) >>> 5", (~bitOperations.getI()) >>> 5);
        Show.printBinaryLong("-1L", -1L);
        Show.printBinaryLong("1L", 1L);
        Show.printBinaryLong("max positive ", bitOperations.getLl());
        Show.printBinaryLong("max negative ", bitOperations.getLln());
        Show.printBinaryLong("l", bitOperations.getL());
        Show.printBinaryLong("~l", ~bitOperations.getL());
        Show.printBinaryLong("-l", -bitOperations.getL());
        Show.printBinaryLong("m", bitOperations.getM());
        Show.printBinaryLong("l & m", bitOperations.getL() & bitOperations.getM());
        Show.printBinaryLong("l | m", bitOperations.getL() | bitOperations.getM());
        Show.printBinaryLong("l ^ m", bitOperations.getL() ^ bitOperations.getM());
        Show.printBinaryLong("l << 5", bitOperations.getL() << 5);
        Show.printBinaryLong("l >> 5", bitOperations.getL() >> 5);
        Show.printBinaryLong("(~l) >> 5", (~bitOperations.getL()) >> 5);
        Show.printBinaryLong(" l >>> 5", bitOperations.getL() >>> 5);
        Show.printBinaryLong("(~l) >>> 5", (~bitOperations.getL()) >>> 5);
    }
}
