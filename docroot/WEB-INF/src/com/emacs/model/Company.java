/*   1:    */ package com.emacs.model;
/*   2:    */ 
/*   3:    */ import java.util.Date;
/*   4:    */ 
/*   5:    */ public class Company
/*   6:    */ {
/*   7:    */   private long companyId;
/*   8:    */   private long companyCurrencyId;
/*   9:    */   private String companyName;
/*  10:    */   private String symbol;
/*  11:    */   private String maintain;
/*  12:    */   private Date financialYearFrom;
/*  13:    */   private Date booksBeginFrom;
/*  14:    */   private String mailingName;
/*  15:    */   private String address;
/*  16:    */   private String statutoryCompliance;
/*  17:    */   private String state;
/*  18:    */   private String pincode;
/*  19:    */   private String telephoneNumber;
/*  20:    */   private String mobileNumber;
/*  21:    */   private String email;
/*  22:    */   
/*  23:    */   public Company() {}
/*  24:    */   
/*  25:    */   public Company(int id)
/*  26:    */   {
/*  27: 13 */     this.companyId = id;
/*  28: 14 */     this.address = ("Test Address " + id);
/*  29: 15 */     this.booksBeginFrom = new Date();
/*  30: 16 */     this.companyName = ("Test Company Name " + id);
/*  31: 17 */     this.email = (id + "test@test.com");
/*  32: 18 */     this.financialYearFrom = new Date();
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getCompanyName()
/*  36:    */   {
/*  37: 25 */     return this.companyName;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCompanyName(String companyName)
/*  41:    */   {
/*  42: 31 */     this.companyName = companyName;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getSymbol()
/*  46:    */   {
/*  47: 37 */     return this.symbol;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setSymbol(String symbol)
/*  51:    */   {
/*  52: 43 */     this.symbol = symbol;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getMaintain()
/*  56:    */   {
/*  57: 49 */     return this.maintain;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setMaintain(String maintain)
/*  61:    */   {
/*  62: 55 */     this.maintain = maintain;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Date getFinancialYearFrom()
/*  66:    */   {
/*  67: 61 */     return this.financialYearFrom;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setFinancialYearFrom(Date financialYearFrom)
/*  71:    */   {
/*  72: 67 */     this.financialYearFrom = financialYearFrom;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public Date getBooksBeginFrom()
/*  76:    */   {
/*  77: 73 */     return this.booksBeginFrom;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setBooksBeginFrom(Date booksBeginFrom)
/*  81:    */   {
/*  82: 79 */     this.booksBeginFrom = booksBeginFrom;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getMailingName()
/*  86:    */   {
/*  87: 85 */     return this.mailingName;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setMailingName(String mailingName)
/*  91:    */   {
/*  92: 91 */     this.mailingName = mailingName;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getAddress()
/*  96:    */   {
/*  97: 97 */     return this.address;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setAddress(String address)
/* 101:    */   {
/* 102:103 */     this.address = address;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getStatutoryCompliance()
/* 106:    */   {
/* 107:109 */     return this.statutoryCompliance;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setStatutoryCompliance(String statutoryCompliance)
/* 111:    */   {
/* 112:115 */     this.statutoryCompliance = statutoryCompliance;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getState()
/* 116:    */   {
/* 117:121 */     return this.state;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setState(String state)
/* 121:    */   {
/* 122:127 */     this.state = state;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getPincode()
/* 126:    */   {
/* 127:133 */     return this.pincode;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPincode(String pincode)
/* 131:    */   {
/* 132:139 */     this.pincode = pincode;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getTelephoneNumber()
/* 136:    */   {
/* 137:145 */     return this.telephoneNumber;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setTelephoneNumber(String telephoneNumber)
/* 141:    */   {
/* 142:151 */     this.telephoneNumber = telephoneNumber;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getMobileNumber()
/* 146:    */   {
/* 147:157 */     return this.mobileNumber;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setMobileNumber(String mobileNumber)
/* 151:    */   {
/* 152:163 */     this.mobileNumber = mobileNumber;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getEmail()
/* 156:    */   {
/* 157:169 */     return this.email;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setEmail(String email)
/* 161:    */   {
/* 162:175 */     this.email = email;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public long getCompanyId()
/* 166:    */   {
/* 167:182 */     return this.companyId;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setCompanyId(long companyId)
/* 171:    */   {
/* 172:188 */     this.companyId = companyId;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public long getCompanyCurrencyId()
/* 176:    */   {
/* 177:195 */     return this.companyCurrencyId;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setCompanyCurrencyId(long companyCurrencyId)
/* 181:    */   {
/* 182:202 */     this.companyCurrencyId = companyCurrencyId;
/* 183:    */   }
/* 184:    */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.model.Company
 * JD-Core Version:    0.7.0.1
 */