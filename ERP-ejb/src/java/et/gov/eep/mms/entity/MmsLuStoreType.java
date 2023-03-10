/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.mms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author insa
 */
@Entity
@Table(name = "MMS_LU_STORE_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MmsLuStoreType.findAll", query = "SELECT m FROM MmsLuStoreType m"),
    @NamedQuery(name = "MmsLuStoreType.findById", query = "SELECT m FROM MmsLuStoreType m WHERE m.id = :id"),
    @NamedQuery(name = "MmsLuStoreType.findByName", query = "SELECT m FROM MmsLuStoreType m WHERE m.name = :name"),
    @NamedQuery(name = "MmsLuStoreType.findByDescription", query = "SELECT m FROM MmsLuStoreType m WHERE m.description = :description")})
public class MmsLuStoreType implements Serializable {
    @OneToMany(mappedBy = "storeType", fetch = FetchType.LAZY)
    private Collection<MmsStoreInformation> mmsStoreInformationCollection;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 45)
    @Column(name = "NAME")
    private String name;
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;

    public MmsLuStoreType() {
    }

    public MmsLuStoreType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof MmsLuStoreType)) {
            return false;
        }
        MmsLuStoreType other = (MmsLuStoreType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "et.gov.eep.mms.entity.MmsLuStoreType[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<MmsStoreInformation> getMmsStoreInformationCollection() {
        return mmsStoreInformationCollection;
    }

    public void setMmsStoreInformationCollection(Collection<MmsStoreInformation> mmsStoreInformationCollection) {
        this.mmsStoreInformationCollection = mmsStoreInformationCollection;
    }
    
}
