/*  1:   */ package com.emacs.util;
/*  2:   */ 
/*  3:   */ import com.liferay.portal.kernel.log.Log;
/*  4:   */ import com.liferay.portal.kernel.log.LogFactoryUtil;
/*  5:   */ import org.hibernate.HibernateException;
/*  6:   */ import org.hibernate.Session;
/*  7:   */ import org.hibernate.SessionFactory;
/*  8:   */ import org.hibernate.cfg.Configuration;
/*  9:   */ 
/* 10:   */ public class HibernateUtil
/* 11:   */ {
/* 12:   */   public static final String COUNT_COLUMN_NAME = "COUNT_VALUE";
/* 13:   */   
/* 14:   */   public static void closeSession(Session session)
/* 15:   */   {
/* 16:   */     try
/* 17:   */     {
/* 18:34 */       if ((session != null) && (session.isOpen())) {
/* 19:35 */         session.close();
/* 20:   */       }
/* 21:   */     }
/* 22:   */     catch (HibernateException he)
/* 23:   */     {
/* 24:39 */       _log.error(he.getMessage());
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   public static String getCountColumnName()
/* 29:   */   {
/* 30:44 */     return "COUNT_VALUE";
/* 31:   */   }
/* 32:   */   
/* 33:   */   public static SessionFactory getSessionFactory()
/* 34:   */   {
/* 35:48 */     return _instance._sessionFactory;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public static Session openSession()
/* 39:   */     throws HibernateException
/* 40:   */   {
/* 41:52 */     return openSession(getSessionFactory());
/* 42:   */   }
/* 43:   */   
/* 44:   */   public static Session openSession(SessionFactory sessionFactory)
/* 45:   */     throws HibernateException
/* 46:   */   {
/* 47:58 */     return sessionFactory.getCurrentSession();
/* 48:   */   }
/* 49:   */   
/* 50:   */   private HibernateUtil()
/* 51:   */   {
/* 52:   */     try
/* 53:   */     {
/* 54:63 */       Configuration configuration = new Configuration();
/* 55:   */       
/* 56:65 */       configuration = configuration.configure();
/* 57:   */       
/* 58:67 */       this._sessionFactory = configuration.buildSessionFactory();
/* 59:   */     }
/* 60:   */     catch (Exception e)
/* 61:   */     {
/* 62:70 */       _log.error(e, e);
/* 63:   */     }
/* 64:   */   }
/* 65:   */   
/* 66:74 */   private static Log _log = LogFactoryUtil.getLog(HibernateUtil.class);
/* 67:76 */   private static HibernateUtil _instance = new HibernateUtil();
/* 68:   */   private SessionFactory _sessionFactory;
/* 69:   */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.util.HibernateUtil
 * JD-Core Version:    0.7.0.1
 */