/*  1:   */ package com.emacs.portlet;
/*  2:   */ 
/*  3:   */ import java.io.IOException;
/*  4:   */ import java.io.PrintStream;
/*  5:   */ import javax.portlet.ActionRequest;
/*  6:   */ import javax.portlet.ActionResponse;
/*  7:   */ import javax.portlet.PortletException;
/*  8:   */ import javax.portlet.RenderRequest;
/*  9:   */ import javax.portlet.RenderResponse;
/* 10:   */ import javax.portlet.faces.GenericFacesPortlet;
/* 11:   */ 
/* 12:   */ public class ManageCompanyPortlet
/* 13:   */   extends GenericFacesPortlet
/* 14:   */ {
/* 15:   */   public void render(RenderRequest request, RenderResponse response)
/* 16:   */     throws PortletException, IOException
/* 17:   */   {
/* 18:17 */     System.out.println("INSIDE render");
/* 19:18 */     super.render(request, response);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
/* 23:   */     throws PortletException, IOException
/* 24:   */   {
/* 25:24 */     System.out.println("INSIDE processAction");
/* 26:25 */     super.processAction(actionRequest, actionResponse);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Users\eklovya.maini\Desktop\EMACS-portlet-6.2.0.1.jar
 * Qualified Name:     WEB-INF.classes.com.emacs.portlet.ManageCompanyPortlet
 * JD-Core Version:    0.7.0.1
 */