package hu.nl.hibernate;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;



import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
  private static SessionFactory factory;
  public static void main(String[] args) throws SQLException, ParseException {

      //Starten Hibernate
      StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
      Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();

      //CRUD functies Reiziger

      //aanmaken reizigers
      Reiziger r1 = new Reiziger();
      r1.setReizigerID(17);
      r1.setVoorl("RR");
      r1.setAchternaam("Teutler");
      r1.setGbdatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-97"));

      Reiziger r2 = new Reiziger();
      r2.setReizigerID(18);
      r2.setVoorl("BP");
      r2.setAchternaam("Deutler");
      r2.setGbdatum(new SimpleDateFormat("dd-mm-yy").parse("01-01-01"));

      Reiziger r3 = new Reiziger();
      r2.setReizigerID(19);
      r2.setVoorl("JJ");
      r2.setAchternaam("Hitch");
      r2.setGbdatum(new SimpleDateFormat("dd-mm-yy").parse("02-02-02"));

      //opslaan reizigers
      session.save(r1);
      session.save(r2);
      session.save(r3);

      //UPDATE voorletters reiziger 2
      r2.setVoorl("GK");
      session.update(r2);

      //DELETE reiziger r3 van database
      session.delete(r3);


      //Transactie committen
      t.commit();  
      System.out.println("successfully saved");    
      factory.close();  
      session.close();   
  }
}
