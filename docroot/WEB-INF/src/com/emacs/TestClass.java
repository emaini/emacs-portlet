/*  1:   */ package com.emacs;
/*  2:   */ 
/*  3:   */ import com.emacs.model.CompanyCurrency;
/*  4:   */ import javax.persistence.EntityManager;
/*  5:   */ import javax.persistence.EntityManagerFactory;
/*  6:   */ import javax.persistence.EntityTransaction;
/*  7:   */ import javax.persistence.Persistence;
/*  8:   */ 
/*  9:   */ public class TestClass
/* 10:   */ {
/* 11:   */   public static void main(String[] args)
/* 12:   */   {
/* 13:12 */     EntityManagerFactory factory = Persistence.createEntityManagerFactory("EMACS");
/* 14:13 */     EntityManager manager = factory.createEntityManager();
/* 15:   */     
/* 16:15 */     manager.getTransaction().begin();
/* 17:16 */     manager.persist(new CompanyCurrency(1));
/* 18:17 */     manager.getTransaction().commit();
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.TestClass
 * JD-Core Version:    0.7.0.1
 */