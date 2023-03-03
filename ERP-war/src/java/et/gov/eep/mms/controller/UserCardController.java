/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.mms.controller;

import et.gov.eep.mms.businessLogic.MmsFixedAssetRegistrationBeanLocal;
import et.gov.eep.hrms.businessLogic.organization.HrDepartmentsBeanLocal;
import et.gov.eep.hrms.entity.employee.HrEmployees;
import et.gov.eep.hrms.entity.organization.HrDepartments;
import et.gov.eep.hrms.integration.HREmployeesBeanLocal;
import et.gov.eep.mms.entity.MmsFixedassetRegstDetail;
import et.gov.eep.mms.entity.MmsFixedassetRegstration;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import securityBean.SessionBean;

/**
 *
 * @author INSA
 */
@Named(value = "userCardController")
@ViewScoped
public class UserCardController implements Serializable {

    /**
     * Creates a new instance of UserCardController
     */
    @Inject
    SessionBean SessionBean;
    @EJB
    private MmsFixedAssetRegistrationBeanLocal fixedAssetInterface;
    @EJB
    HREmployeesBeanLocal hREmployeesBeanLocal;
    private boolean disableReadolnly = true;
    private boolean renderPnlManPage = true;

    public UserCardController() {
    }

    @PostConstruct
    public void init() {
        findEmployee();
        employeesuc.setId(SessionBean.getEmpId());
        employeesuc = hREmployeesBeanLocal.getById(employeesuc);
        System.out.println("depid===" + employeesuc.getDeptId().getDepId());
        if (employeesuc.getDeptId().getDepId() == 698) {
            disableReadolnly = false;
        }
    }

    public boolean isRenderPnlManPage() {
        return renderPnlManPage;
    }

    public void setRenderPnlManPage(boolean renderPnlManPage) {
        this.renderPnlManPage = renderPnlManPage;
    }

    public boolean isDisableReadolnly() {
        return disableReadolnly;
    }

    public void setDisableReadolnly(boolean disableReadolnly) {
        this.disableReadolnly = disableReadolnly;
    }

    public SessionBean getSessionBean() {
        return SessionBean;
    }

    public void setSessionBean(SessionBean SessionBean) {
        this.SessionBean = SessionBean;
    }

    private HrEmployees employeesuc;

    public HrEmployees getEmployeesuc() {
        return employeesuc;
    }

    public void setEmployeesuc(HrEmployees employeesuc) {
        this.employeesuc = employeesuc;
    }

    public ArrayList<MmsFixedassetRegstration> regstrationsuc(String regstrationucs) {
        ArrayList<MmsFixedassetRegstration> arrayListuc = null;

        arrayListuc = fixedAssetInterface.regstrationsuc(regstrationucs);

        return arrayListuc;
    }

    public void SearchUC() {
//      employeesuc =regstrationDtluc.getSivId().getStoreReqId().getRequestedBy();
//      regstrationDtluc.setRequeistedBy(employeesuc.getId());
        //       System.out.println("empUc=="+employeesuc.getEmpId());
//         arrayListucsdtl = fixedAssetInterface.regstrationsucs(employeesuc.getEmpId());
        System.out.println("");

        recreateModelSearchucdtl();
//         System.out.println("rec=="+regstrationDtluc.getStoreReqId());

    }
    private DataModel<MmsFixedassetRegstration> dataModeluc;
    private DataModel<MmsFixedassetRegstDetail> dataModelucdtl;

    public DataModel<MmsFixedassetRegstration> getDataModeluc() {
        if (dataModeluc == null) {
            dataModeluc = new ListDataModel<>();
        }
        return dataModeluc;
    }

    public DataModel<MmsFixedassetRegstDetail> getDataModelucdtl() {
        if (dataModelucdtl == null) {
            dataModelucdtl = new ListDataModel<>();
        }
        return dataModelucdtl;
    }

    public void setDataModelucdtl(DataModel<MmsFixedassetRegstDetail> dataModelucdtl) {
        this.dataModelucdtl = dataModelucdtl;
    }

    public void setDataModeluc(DataModel<MmsFixedassetRegstration> dataModeluc) {
        this.dataModeluc = dataModeluc;
    }
    ArrayList<MmsFixedassetRegstration> arrayListucs;
    ArrayList<MmsFixedassetRegstDetail> arrayListucsdtl;

    public void recreateModelSearchuc() {
        dataModeluc = null;
        dataModeluc = new ListDataModel(new ArrayList<>(arrayListucs));
    }

    public void recreateModelSearchucdtl() {
        dataModelucdtl = null;
        dataModelucdtl = new ListDataModel(new ArrayList<>(arrayListucsdtl));
    }

    public void findEmployee() {
        try {

            employeesuc = new HrEmployees();
            String emplId = SessionBean.getUserName();
            HrEmployees employeeFirst = new HrEmployees();
            employeeFirst.setEmpId(emplId);
            employeesuc = fixedAssetInterface.findById(employeeFirst);
            arrayListucsdtl = fixedAssetInterface.regstrationsucs(employeesuc.getEmpId());
            recreateModelSearchucdtl();
            System.out.println("id     ------------------------------" + employeesuc.getFirstName());
        } catch (Exception e) {
        }
    }
}
