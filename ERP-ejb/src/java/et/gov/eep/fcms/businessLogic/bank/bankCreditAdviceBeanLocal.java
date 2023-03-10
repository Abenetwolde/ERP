/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.fcms.businessLogic.bank;

import java.util.List;
import javax.ejb.Local;
import et.gov.eep.fcms.entity.bank.FmsBankCreditAdvice;

/**
 *
 * @author mubejbl
 */
@Local
public interface bankCreditAdviceBeanLocal {

    public void create(FmsBankCreditAdvice fmsBankCreditAdvice);

    public void edit(FmsBankCreditAdvice fmsBankCreditAdvice);

    public List<FmsBankCreditAdvice> searchAllCredits(FmsBankCreditAdvice fmsBankCreditAdvice);

    public List<FmsBankCreditAdvice> getCreditAdviceDate(FmsBankCreditAdvice fmsBankCreditAdvice);

    public List<FmsBankCreditAdvice> getCreditTransactions(FmsBankCreditAdvice fmsBankCreditAdvice);

    public List<FmsBankCreditAdvice> searchAllByAcountNumberDateAndTranRef(FmsBankCreditAdvice fmsBankCreditAdvice);

    public FmsBankCreditAdvice getAllData(FmsBankCreditAdvice fmsBankCreditAdvice);

}
