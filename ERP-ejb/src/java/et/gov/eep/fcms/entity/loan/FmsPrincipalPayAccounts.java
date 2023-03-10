/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.fcms.entity.loan;

import et.gov.eep.fcms.entity.admin.FmsGeneralLedger;
import et.gov.eep.fcms.entity.admin.FmsSubsidiaryLedger;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PO
 */
@Entity
@Table(name = "FMS_PRINCIPAL_PAY_ACCOUNTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FmsPrincipalPayAccounts.findAll", query = "SELECT f FROM FmsPrincipalPayAccounts f"),
    @NamedQuery(name = "FmsPrincipalPayAccounts.findByPpAccountId", query = "SELECT f FROM FmsPrincipalPayAccounts f WHERE f.ppAccountId = :ppAccountId"),
    @NamedQuery(name = "FmsPrincipalPayAccounts.findByAmount", query = "SELECT f FROM FmsPrincipalPayAccounts f WHERE f.amount = :amount"),
    @NamedQuery(name = "FmsPrincipalPayAccounts.findByRemark", query = "SELECT f FROM FmsPrincipalPayAccounts f WHERE f.remark = :remark")})
public class FmsPrincipalPayAccounts implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PP_ACCOUNT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FMS_PRINCIPAL_PAY_ACCOUNTS_SEQ")
    @SequenceGenerator(name = "FMS_PRINCIPAL_PAY_ACCOUNTS_SEQ", sequenceName = "FMS_PRINCIPAL_PAY_ACCOUNTS_SEQ", allocationSize = 1)
    private BigDecimal ppAccountId;
    @Column(name = "AMOUNT")
    private BigInteger amount;
    @Size(max = 50)
    @Column(name = "REMARK")
    private String remark;
    @JoinColumn(name = "GENERAL_LEDGER_ID_FK", referencedColumnName = "GENERAL_LEDGER_ID")
    @ManyToOne
    private FmsGeneralLedger generalLedgerIdFk;
    @JoinColumn(name = "PRINCIPAL_PAY_ID_FK", referencedColumnName = "PRINCIPAL_PAY_ID")
    @ManyToOne
    private FmsPrincipalPayment principalPayIdFk;
    @JoinColumn(name = "SUBSIDIARY_LEDGER_ID_FK", referencedColumnName = "SUBSIDIARY_ID")
    @ManyToOne
    private FmsSubsidiaryLedger subsidiaryLedgerIdFk;

    public FmsPrincipalPayAccounts() {
    }

    public FmsPrincipalPayAccounts(BigDecimal ppAccountId) {
        this.ppAccountId = ppAccountId;
    }

    public BigDecimal getPpAccountId() {
        return ppAccountId;
    }

    public void setPpAccountId(BigDecimal ppAccountId) {
        this.ppAccountId = ppAccountId;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public FmsGeneralLedger getGeneralLedgerIdFk() {
        return generalLedgerIdFk;
    }

    public void setGeneralLedgerIdFk(FmsGeneralLedger generalLedgerIdFk) {
        this.generalLedgerIdFk = generalLedgerIdFk;
    }

    public FmsPrincipalPayment getPrincipalPayIdFk() {
        return principalPayIdFk;
    }

    public void setPrincipalPayIdFk(FmsPrincipalPayment principalPayIdFk) {
        this.principalPayIdFk = principalPayIdFk;
    }

    public FmsSubsidiaryLedger getSubsidiaryLedgerIdFk() {
        return subsidiaryLedgerIdFk;
    }

    public void setSubsidiaryLedgerIdFk(FmsSubsidiaryLedger subsidiaryLedgerIdFk) {
        this.subsidiaryLedgerIdFk = subsidiaryLedgerIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ppAccountId != null ? ppAccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmsPrincipalPayAccounts)) {
            return false;
        }
        FmsPrincipalPayAccounts other = (FmsPrincipalPayAccounts) object;
        if ((this.ppAccountId == null && other.ppAccountId != null) || (this.ppAccountId != null && !this.ppAccountId.equals(other.ppAccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "et.gov.eep.fcms.entity.loan.FmsPrincipalPayAccounts[ ppAccountId=" + ppAccountId + " ]";
    }
    
}
