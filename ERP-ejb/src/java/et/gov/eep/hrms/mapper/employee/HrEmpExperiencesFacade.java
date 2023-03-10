/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.mapper.employee;

import et.gov.eep.commonApplications.mapper.AbstractFacade;
import et.gov.eep.hrms.entity.employee.HrEmpExperiences;
import et.gov.eep.hrms.entity.employee.HrEmployees;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless
public class HrEmpExperiencesFacade extends AbstractFacade<HrEmpExperiences> {
    @PersistenceContext(unitName = "ERP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HrEmpExperiencesFacade() {
        super(HrEmpExperiences.class);
    }

    public List<HrEmpExperiences> findEmpExprience(HrEmployees hrEmployees) {
    try {
            Query query = em.createNamedQuery("HrEmpExperiences.findByEmpId", HrEmpExperiences.class);
            query.setParameter("empId", hrEmployees);
            return (List<HrEmpExperiences>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } }
    
}
