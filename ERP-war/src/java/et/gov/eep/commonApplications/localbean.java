/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.commonApplications;

import java.beans.Transient;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import securityBean.Utility;

/**
 *
 * @author meles
 */
@SessionScoped
@Named(value = "localbean")

public class localbean implements Serializable {

    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    String saveOrupdate = "Save";
    String addOrModify = "Add";
    String reset = "Reset";
    String engBundle = "/et/gov/eep/hrms/en";
    String amhbundle = "/et/gov/eep/hrms/en_am_ET";
    int saveOrUpadetStatus = 0;
    int addOrModifyStatus = 0;
//    String engBundle = "/Local/am_en_US";
//    String amhbundle = "/Local/am";

    HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    HttpSession langsession = request.getSession();

    public void LanguageSession(String lang) throws IOException {
        System.out.println("insed LangSession method lang=1==" + lang);
        if (getLangsession().getAttribute("lang").toString().equalsIgnoreCase("am")) {
            langsession.setAttribute("lang", "am");
        } else {
            langsession.setAttribute("lang", "en");
        }

    }

    //<editor-fold defaultstate="collapsed" desc="getter and setter">
    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    @Transient
    public String getSaveOrupdate() {
        System.out.println("getLangsession().getAttribut.toString()===" + getLangsession().getAttribute("lang").toString());
        if (getLangsession().getAttribute("lang").toString().equalsIgnoreCase("am")) {
            System.out.println("======inside amharic bundle=======");
            if (saveOrUpadetStatus == 0) {
                saveOrupdate = Utility.getBundleValue(amhbundle, "save");
            } else {
                saveOrupdate = Utility.getBundleValue(amhbundle, "Update");
            }
        } else {
            System.out.println("=========inside english bundle============");
            if (saveOrUpadetStatus == 0) {
                saveOrupdate = Utility.getBundleValue(engBundle, "save");
            } else {
                saveOrupdate = Utility.getBundleValue(engBundle, "Update");
            }
        }
        setSaveOrupdate(saveOrupdate);
        return saveOrupdate;
    }

    public void setSaveOrupdate(String saveOrupdate) {
        this.saveOrupdate = saveOrupdate;
    }

//    @Transient
//    public String getUpdate() {
//        if (getLangsession().getAttribute("lang").toString().equalsIgnoreCase("am")) {
//            update = Utility.getBundleValue(amhbundle, "Update");
//        } else {
//            update = Utility.getBundleValue(engBundle, "Update");
//        }
//
//        return update;
//    }
//
//    public void setUpdate(String update) {
//        this.update = update;
//    }
    @Transient
    public String getAddOrModify() {
        if (getLangsession().getAttribute("lang").toString().equalsIgnoreCase("am")) {
            if (addOrModifyStatus == 0) {
                addOrModify = Utility.getBundleValue(amhbundle, "Add");
            } else {
                addOrModify = Utility.getBundleValue(amhbundle, "Modify");
            }
        } else {
            if (addOrModifyStatus == 0) {
                addOrModify = Utility.getBundleValue(engBundle, "Add");
            } else {
                addOrModify = Utility.getBundleValue(engBundle, "Modify");
            }
        }
        return addOrModify;
    }

    public void setAddOrModify(String addOrModify) {

        this.addOrModify = addOrModify;
    }

    

    public String getReset() {
        return reset;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }


    public int getAddOrModifyStatus() {
        return addOrModifyStatus;
    }

    public void setAddOrModifyStatus(int addOrModifyStatus) {
        this.addOrModifyStatus = addOrModifyStatus;
    }

    public HttpSession getLangsession() {
        return langsession;
    }

    public void setLangsession(HttpSession langsession) {
        this.langsession = langsession;
    }

    public int getSaveOrUpadetStatus() {
        return saveOrUpadetStatus;
    }

    public void setSaveOrUpadetStatus(int saveOrUpadetStatus) {
        this.saveOrUpadetStatus = saveOrUpadetStatus;
    }

//</editor-fold>
    public void changeLanguage(String language) {
        System.out.println("language=2==" + language);
        if (language.equalsIgnoreCase("ET")) {
            System.out.println("inside am");
            locale = new Locale("am", language);
            try {
                // LanguageSession("am");
                langsession.setAttribute("lang", "am");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        } else {
            System.out.println("inside en");
            locale = new Locale("en", language);
            try {
                langsession.setAttribute("lang", "en");
                //LanguageSession("en");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        }
    }

    public String englishAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        locale = new Locale("am", "ET");
        context.getViewRoot().setLocale(locale);

        return null;
    }

    public String amAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        locale = new Locale("am", "en");
        context.getViewRoot().setLocale(locale);

        return null;

    }

    public localbean() {
    }

    class CurrentController<Controller> {

        Controller obj;

        void add(Controller obj) {
            this.obj = obj;
        }

        Controller get() {
            return obj;
        }
    }
}
