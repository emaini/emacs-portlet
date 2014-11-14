/*   1:    */ package com.emacs.model;
/*   2:    */ 
/*   3:    */ public class CompanyCurrency
/*   4:    */ {
/*   5:    */   private long companyCurrencyId;
/*   6:    */   private int noOfDecimalPlaces;
/*   7:    */   private int noOfDecimalPlacesWords;
/*   8:    */   private boolean showAmountsInMillions;
/*   9:    */   private boolean spaceBetweenAmountNSymbol;
/*  10:    */   private boolean symbolSuffixedToAmounts;
/*  11:    */   private String formalName;
/*  12:    */   private String symbolForDecimalPortion;
/*  13:    */   private String symbol;
/*  14:    */   
/*  15:    */   public CompanyCurrency() {}
/*  16:    */   
/*  17:    */   public CompanyCurrency(int id)
/*  18:    */   {
/*  19: 11 */     this.companyCurrencyId = id;
/*  20: 12 */     this.formalName = ("Test Formal Name " + id);
/*  21: 13 */     this.noOfDecimalPlaces = 2;
/*  22: 14 */     this.noOfDecimalPlacesWords = 2;
/*  23: 15 */     this.symbol = "₹";
/*  24: 16 */     this.symbolForDecimalPortion = "paise";
/*  25:    */   }
/*  26:    */   
/*  27:    */   public int getNoOfDecimalPlaces()
/*  28:    */   {
/*  29: 22 */     return this.noOfDecimalPlaces;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setNoOfDecimalPlaces(int noOfDecimalPlaces)
/*  33:    */   {
/*  34: 28 */     this.noOfDecimalPlaces = noOfDecimalPlaces;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public int getNoOfDecimalPlacesWords()
/*  38:    */   {
/*  39: 34 */     return this.noOfDecimalPlacesWords;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setNoOfDecimalPlacesWords(int noOfDecimalPlacesWords)
/*  43:    */   {
/*  44: 40 */     this.noOfDecimalPlacesWords = noOfDecimalPlacesWords;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public boolean isShowAmountsInMillions()
/*  48:    */   {
/*  49: 46 */     return this.showAmountsInMillions;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setShowAmountsInMillions(boolean showAmountsInMillions)
/*  53:    */   {
/*  54: 52 */     this.showAmountsInMillions = showAmountsInMillions;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean isSpaceBetweenAmountNSymbol()
/*  58:    */   {
/*  59: 58 */     return this.spaceBetweenAmountNSymbol;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setSpaceBetweenAmountNSymbol(boolean spaceBetweenAmountNSymbol)
/*  63:    */   {
/*  64: 64 */     this.spaceBetweenAmountNSymbol = spaceBetweenAmountNSymbol;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public boolean isSymbolSuffixedToAmounts()
/*  68:    */   {
/*  69: 70 */     return this.symbolSuffixedToAmounts;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSymbolSuffixedToAmounts(boolean symbolSuffixedToAmounts)
/*  73:    */   {
/*  74: 76 */     this.symbolSuffixedToAmounts = symbolSuffixedToAmounts;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getFormalName()
/*  78:    */   {
/*  79: 82 */     return this.formalName;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setFormalName(String formalName)
/*  83:    */   {
/*  84: 88 */     this.formalName = formalName;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getSymbolForDecimalPortion()
/*  88:    */   {
/*  89: 94 */     return this.symbolForDecimalPortion;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setSymbolForDecimalPortion(String symbolForDecimalPortion)
/*  93:    */   {
/*  94:100 */     this.symbolForDecimalPortion = symbolForDecimalPortion;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getSymbol()
/*  98:    */   {
/*  99:106 */     return this.symbol;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setSymbol(String symbol)
/* 103:    */   {
/* 104:112 */     this.symbol = symbol;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public long getCompanyCurrencyId()
/* 108:    */   {
/* 109:119 */     return this.companyCurrencyId;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setCompanyCurrencyId(long companyCurrencyId)
/* 113:    */   {
/* 114:125 */     this.companyCurrencyId = companyCurrencyId;
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.model.CompanyCurrency
 * JD-Core Version:    0.7.0.1
 */