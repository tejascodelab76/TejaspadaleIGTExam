package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cutomer ID");
        int cid = sc.nextInt();
        
        System.out.println("Enter custmor Name");
        String name = sc.next();
        
        System.out.println("Enter place");
        String place = sc.next();
        
        System.out.println("Enter pan");
        int pan = sc.nextInt();

        
        customer e = new customer();
        e.setCid(200);
        e.setName("Rohit");
        e.setPlace("Nashik");
        e.setPan(250214500);

        session.save(e);
        tx.commit();

        System.out.println("Data Inserted.");
    }
}