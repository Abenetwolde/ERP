/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.mapper.lookup;

import et.gov.eep.commonApplications.mapper.AbstractFacade;
import et.gov.eep.hrms.entity.lookup.HrLuTitles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class HrLuTitlesFacade extends AbstractFacade<HrLuTitles> {
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
    public HrLuTitlesFacade() {
        super(HrLuTitles.class);
    }
    
}
