/*   1:    */ package com.emacs.util;
/*   2:    */ 
/*   3:    */ import org.hibernate.Session;
/*   4:    */ import org.hibernate.Transaction;
/*   5:    */ 
/*   6:    */ public class EmacsDBUtil
/*   7:    */ {
/*   8:    */   public static void addEntity(Object entity)
/*   9:    */     throws Exception
/*  10:    */   {
/*  11: 25 */     Session session = null;
/*  12:    */     try
/*  13:    */     {
/*  14: 28 */       session = HibernateUtil.openSession();
/*  15:    */       
/*  16: 30 */       session.beginTransaction();
/*  17:    */       
/*  18: 32 */       session.save(entity);
/*  19:    */       
/*  20: 34 */       session.flush();
/*  21:    */       
/*  22: 36 */       session.getTransaction().commit();
/*  23:    */     }
/*  24:    */     catch (Exception e)
/*  25:    */     {
/*  26: 38 */       throw new Exception(e);
/*  27:    */     }
/*  28:    */     finally
/*  29:    */     {
/*  30: 40 */       HibernateUtil.closeSession(session);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static void deleteEntity(long entityId, Class entityType)
/*  35:    */     throws Exception
/*  36:    */   {
/*  37: 45 */     Session session = null;
/*  38:    */     try
/*  39:    */     {
/*  40: 48 */       session = HibernateUtil.openSession();
/*  41:    */       
/*  42: 50 */       session.beginTransaction();
/*  43:    */       
/*  44: 52 */       Object entity = entityType.cast(session.get(entityType, new Long(entityId)));
/*  45: 54 */       if (entity != null)
/*  46:    */       {
/*  47: 55 */         session.delete(entity);
/*  48:    */         
/*  49: 57 */         session.flush();
/*  50:    */       }
/*  51: 60 */       session.getTransaction().commit();
/*  52:    */     }
/*  53:    */     catch (Exception e)
/*  54:    */     {
/*  55: 62 */       throw new Exception(e);
/*  56:    */     }
/*  57:    */     finally
/*  58:    */     {
/*  59: 64 */       HibernateUtil.closeSession(session);
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static Object getEntityDetails(long entityId, Class entityType)
/*  64:    */     throws Exception
/*  65:    */   {
/*  66: 69 */     Session session = null;
/*  67:    */     try
/*  68:    */     {
/*  69: 72 */       session = HibernateUtil.openSession();
/*  70:    */       
/*  71: 74 */       session.beginTransaction();
/*  72:    */       
/*  73: 76 */       Object item = entityType.cast(session.get(entityType, new Long(entityId)));
/*  74:    */       
/*  75: 78 */       session.getTransaction().commit();
/*  76:    */       
/*  77: 80 */       return item;
/*  78:    */     }
/*  79:    */     catch (Exception e)
/*  80:    */     {
/*  81: 82 */       throw new Exception(e);
/*  82:    */     }
/*  83:    */     finally
/*  84:    */     {
/*  85: 84 */       HibernateUtil.closeSession(session);
/*  86:    */     }
/*  87:    */   }
/*  88:    */   
/*  89:    */   public static void updateEntity(Object entity, Class entityType)
/*  90:    */     throws Exception
/*  91:    */   {
/*  92: 89 */     Session session = null;
/*  93:    */     try
/*  94:    */     {
/*  95: 92 */       session = HibernateUtil.openSession();
/*  96:    */       
/*  97: 94 */       session.beginTransaction();
/*  98:    */       
/*  99: 96 */       session.update(entity);
/* 100:    */       
/* 101: 98 */       session.flush();
/* 102:    */       
/* 103:100 */       session.getTransaction().commit();
/* 104:    */     }
/* 105:    */     catch (Exception e)
/* 106:    */     {
/* 107:102 */       throw new Exception(e);
/* 108:    */     }
/* 109:    */     finally
/* 110:    */     {
/* 111:104 */       HibernateUtil.closeSession(session);
/* 112:    */     }
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.util.EmacsDBUtil
 * JD-Core Version:    0.7.0.1
 */