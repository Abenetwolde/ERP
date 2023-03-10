/**
 * *****************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 * ****************************************************************************
 */
package et.gov.eep.prms.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * *****************************************************************************
 *
 * @author User
 * ****************************************************************************
 */
@Entity
@Table(name = "PRMS_SUPP_SPECIFICATION_UPLOAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrmsSuppSpecificationUpload.findAll", query = "SELECT p FROM PrmsSuppSpecificationUpload p"),
    @NamedQuery(name = "PrmsSuppSpecificationUpload.findById", query = "SELECT p FROM PrmsSuppSpecificationUpload p WHERE p.id = :id"),
    @NamedQuery(name = "PrmsSuppSpecificationUpload.findByDocumentId", query = "SELECT p FROM PrmsSuppSpecificationUpload p " + " WHERE p.documentId = :documentId")})

public class PrmsSuppSpecificationUpload implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRMS_SUPP_SPE_UPLOAD_SEQ")
    @SequenceGenerator(name = "PRMS_SUPP_SPE_UPLOAD_SEQ", sequenceName = "PRMS_SUPP_SPE_UPLOAD_SEQ", allocationSize = 1)
    @Column(name = "ID", precision = 22)
    private Integer id;
    @Column(name = "DOCUMENT_ID")
    private Integer documentId;
    @JoinColumn(name = "SUPP_SPEC_ID", referencedColumnName = "SUPP_SPEC_ID")
    @ManyToOne
    private PrmsSuppSpecification suppSpecId;

    public PrmsSuppSpecificationUpload() {
    }

    public PrmsSuppSpecificationUpload(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public PrmsSuppSpecification getSuppSpecId() {
        if (suppSpecId == null) {
            suppSpecId = new PrmsSuppSpecification();
        }
        return suppSpecId;
    }

    public void setSuppSpecId(PrmsSuppSpecification suppSpecId) {
        this.suppSpecId = suppSpecId;
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
        if (!(object instanceof PrmsSuppSpecificationUpload)) {
            return false;
        }

        PrmsSuppSpecificationUpload other = (PrmsSuppSpecificationUpload) object;

        if ((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "et.gov.eep.prms.entity.PrmsSuppSpecificationUpload[ id=" + id + " ]";
//        return id.toString();
    }
}
