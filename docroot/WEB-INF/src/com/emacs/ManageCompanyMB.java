/*   1:    */ package com.emacs;
/*   2:    */ 
/*   3:    */ import com.emacs.model.Company;
/*   4:    */ import com.emacs.model.CompanyCurrency;
/*   5:    */ import com.emacs.util.HibernateUtil;
/*   6:    */ import org.hibernate.Session;
/*   7:    */ import org.hibernate.Transaction;
/*   8:    */ 
/*   9:    */ public class ManageCompanyMB
/*  10:    */ {
/*  11:    */   public CompanyCurrency getCurrency()
/*  12:    */   {
/*  13: 24 */     return this.currency;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void setCurrency(CompanyCurrency currency)
/*  17:    */   {
/*  18: 33 */     this.currency = currency;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public Company getCompany()
/*  22:    */   {
/*  23: 42 */     return this.company;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void setCompany(Company company)
/*  27:    */   {
/*  28: 51 */     this.company = company;
/*  29:    */   }
/*  30:    */   
/*  31: 56 */   private CompanyCurrency currency = new CompanyCurrency();
/*  32: 57 */   private Company company = new Company();
/*  33:    */   
/*  34:    */   public String saveDetails()
/*  35:    */   {
/*  36:    */     try
/*  37:    */     {
/*  38: 63 */       addEntity(this.company);
/*  39:    */     }
/*  40:    */     catch (Exception e)
/*  41:    */     {
/*  42: 66 */       e.printStackTrace();
/*  43:    */     }
/*  44: 68 */     return null;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static void addEntity(Object entity)
/*  48:    */     throws Exception
/*  49:    */   {
/*  50: 73 */     Session session = null;
/*  51:    */     try
/*  52:    */     {
/*  53: 76 */       session = HibernateUtil.openSession();
/*  54:    */       
/*  55: 78 */       session.beginTransaction();
/*  56:    */       
/*  57: 80 */       session.save(entity);
/*  58:    */       
/*  59: 82 */       session.flush();
/*  60:    */       
/*  61: 84 */       session.getTransaction().commit();
/*  62:    */     }
/*  63:    */     catch (Exception e)
/*  64:    */     {
/*  65: 86 */       throw new Exception(e);
/*  66:    */     }
/*  67:    */     finally
/*  68:    */     {
/*  69: 88 */       HibernateUtil.closeSession(session);
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public static void deleteEntity(long entityId, Class entityType)
/*  74:    */     throws Exception
/*  75:    */   {
/*  76: 93 */     Session session = null;
/*  77:    */     try
/*  78:    */     {
/*  79: 96 */       session = HibernateUtil.openSession();
/*  80:    */       
/*  81: 98 */       session.beginTransaction();
/*  82:    */       
/*  83:100 */       Object entity = entityType.cast(session.get(entityType, new Long(entityId)));
/*  84:102 */       if (entity != null)
/*  85:    */       {
/*  86:103 */         session.delete(entity);
/*  87:    */         
/*  88:105 */         session.flush();
/*  89:    */       }
/*  90:108 */       session.getTransaction().commit();
/*  91:    */     }
/*  92:    */     catch (Exception e)
/*  93:    */     {
/*  94:110 */       throw new Exception(e);
/*  95:    */     }
/*  96:    */     finally
/*  97:    */     {
/*  98:112 */       HibernateUtil.closeSession(session);
/*  99:    */     }
/* 100:    */   }
/* 101:    */   
/* 102:    */   public static Object getEntityDetails(long entityId, Class entityType)
/* 103:    */     throws Exception
/* 104:    */   {
/* 105:117 */     Session session = null;
/* 106:    */     try
/* 107:    */     {
/* 108:120 */       session = HibernateUtil.openSession();
/* 109:    */       
/* 110:122 */       session.beginTransaction();
/* 111:    */       
/* 112:124 */       Object item = entityType.cast(session.get(entityType, new Long(entityId)));
/* 113:    */       
/* 114:126 */       session.getTransaction().commit();
/* 115:    */       
/* 116:128 */       return item;
/* 117:    */     }
/* 118:    */     catch (Exception e)
/* 119:    */     {
/* 120:130 */       throw new Exception(e);
/* 121:    */     }
/* 122:    */     finally
/* 123:    */     {
/* 124:132 */       HibernateUtil.closeSession(session);
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   public static void updateEntity(Object entity, Class entityType)
/* 129:    */     throws Exception
/* 130:    */   {
/* 131:137 */     Session session = null;
/* 132:    */     try
/* 133:    */     {
/* 134:140 */       session = HibernateUtil.openSession();
/* 135:    */       
/* 136:142 */       session.beginTransaction();
/* 137:    */       
/* 138:144 */       session.update(entity);
/* 139:    */       
/* 140:146 */       session.flush();
/* 141:    */       
/* 142:148 */       session.getTransaction().commit();
/* 143:    */     }
/* 144:    */     catch (Exception e)
/* 145:    */     {
/* 146:150 */       throw new Exception(e);
/* 147:    */     }
/* 148:    */     finally
/* 149:    */     {
/* 150:152 */       HibernateUtil.closeSession(session);
/* 151:    */     }
/* 152:    */   }
/* 153:    */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.ManageCompanyMB
 * JD-Core Version:    0.7.0.1
 */