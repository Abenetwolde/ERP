/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.businessLogic.employee;

import et.gov.eep.hrms.entity.employee.HrEmpFamilies;
import javax.ejb.Local;

/**
 *
 * @author Benin
 */
@Local
public interface HrEmpFamilyBeanLocal {
    public void delete(HrEmpFamilies hrEmpFamilies);
}
