/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.mapper.payroll;

import et.gov.eep.hrms.entity.payroll.HrPayrollMaintanBackPymt;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import et.gov.eep.commonApplications.mapper.AbstractFacade;

/**
 *
 * @author user
 */
@Stateless
public class HrPayrollMaintanBackPymtFacade extends AbstractFacade<HrPayrollMaintanBackPymt> {

    @PersistenceContext(unitName = "ERP-ejbPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     */
    public HrPayrollMaintanBackPymtFacade() {
        super(HrPayrollMaintanBackPymt.class);
    }

}
