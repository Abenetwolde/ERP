/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.entity.promotion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "HR_LU_PROM_EXP_RELATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrLuPromExpRelation.findAll", query = "SELECT h FROM HrLuPromExpRelation h"),
    @NamedQuery(name = "HrLuPromExpRelation.findById", query = "SELECT h FROM HrLuPromExpRelation h WHERE h.id = :id"),
    @NamedQuery(name = "HrLuPromExpRelation.findByDescription", query = "SELECT h FROM HrLuPromExpRelation h WHERE h.description = :description")})
public class HrLuPromExpRelation implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HR_LU_PROM_EXP_RELATION_SEQ")
    @SequenceGenerator(name = "HR_LU_PROM_EXP_RELATION_SEQ", sequenceName = "HR_LU_PROM_EXP_RELATION_SEQ", allocationSize = 1)
    private Integer id;
    @Size(max = 40)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(mappedBy = "luPromExprienceRelation")
    private List<HrPromExprinceCriteria> hrPromExprinceCriteriaList;

    public HrLuPromExpRelation() {
    }

    public HrLuPromExpRelation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<HrPromExprinceCriteria> getHrPromExprinceCriteriaList() {
        return hrPromExprinceCriteriaList;
    }

    public void setHrPromExprinceCriteriaList(List<HrPromExprinceCriteria> hrPromExprinceCriteriaList) {
        this.hrPromExprinceCriteriaList = hrPromExprinceCriteriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HrLuPromExpRelation)) {
            return false;
        }
        HrLuPromExpRelation other = (HrLuPromExpRelation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return description;//"et.gov.eep.hrms.entity.promotion.HrLuPromExpRelation[ id=" + id + " ]";
    }

}
