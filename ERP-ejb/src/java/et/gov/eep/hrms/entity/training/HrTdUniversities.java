/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et.gov.eep.hrms.entity.training;

import et.gov.eep.hrms.entity.address.HrAddresses;
import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Benin
 */
@Entity
@Table(name = "HR_TD_UNIVERSITIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrTdUniversities.findAll", query = "SELECT h FROM HrTdUniversities h"),
    @NamedQuery(name = "HrTdUniversities.insu", query = "SELECT h FROM HrTdIspStudents h WHERE h.universityId.id =:sid"),
    @NamedQuery(name = "HrTdUniversities.findById", query = "SELECT h FROM HrTdUniversities h WHERE h.id = :id"),
    @NamedQuery(name = "HrTdUniversities.findByUniversityName", query = "SELECT h FROM HrTdUniversities h WHERE h.universityName = :universityName"),
    @NamedQuery(name = "HrTdUniversities.findByUniversityNameLike", query = "SELECT h FROM HrTdUniversities h WHERE UPPER(h.universityName) Like :universityName"),
    @NamedQuery(name = "HrTdUniversities.findDuplicationByUniversityName", query = "SELECT h FROM HrTdUniversities h WHERE h.universityName = :universityName"),
    @NamedQuery(name = "HrTdUniversities.findByAddressId", query = "SELECT h FROM HrTdUniversities h WHERE h.addressId = :addressId"),
    @NamedQuery(name = "HrTdUniversities.findByContactPerson", query = "SELECT h FROM HrTdUniversities h WHERE h.contactPerson = :contactPerson"),
    @NamedQuery(name = "HrTdUniversities.findByPhoneNumber", query = "SELECT h FROM HrTdUniversities h WHERE h.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "HrTdUniversities.findByEmail", query = "SELECT h FROM HrTdUniversities h WHERE h.email = :email"),
    @NamedQuery(name = "HrTdUniversities.findByFax", query = "SELECT h FROM HrTdUniversities h WHERE h.fax = :fax"),
    @NamedQuery(name = "HrTdUniversities.findByWebSite", query = "SELECT h FROM HrTdUniversities h WHERE h.webSite = :webSite"),
    @NamedQuery(name = "HrTdUniversities.findByRemark", query = "SELECT h FROM HrTdUniversities h WHERE h.remark = :remark")})
public class HrTdUniversities implements Serializable {

    @OneToMany(mappedBy = "universityId")
    private List<HrTdIspStudents> hrTdIspStudentsList;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HR_TD_UNIVERSITIES_SEQ")
    @SequenceGenerator(name = "HR_TD_UNIVERSITIES_SEQ", sequenceName = "HR_TD_UNIVERSITIES_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "UNIVERSITY_NAME")
    private String universityName;
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    @ManyToOne
    private HrAddresses addressId;
    @Size(max = 20)
    @Column(name = "CONTACT_PERSON")
    private String contactPerson;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "OFFICE_NUMBER")
    private String officeNumber;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "EMAIL")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "FAX")
    private String fax;
    @Size(max = 20)
    @Column(name = "WEB_SITE")
    private String webSite;
    @Size(max = 20)
    @Column(name = "REMARK")
    private String remark;

    public HrTdUniversities() {
    }

    public HrTdUniversities(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public HrAddresses getAddressId() {
        return addressId;
    }

    public void setAddressId(HrAddresses addressId) {
        this.addressId = addressId;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        if (!(object instanceof HrTdUniversities)) {
            return false;
        }
        HrTdUniversities other = (HrTdUniversities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return universityName;
    }

    @XmlTransient
    public List<HrTdIspStudents> getHrTdIspStudentsList() {
        return hrTdIspStudentsList;
    }

    public void setHrTdIspStudentsList(List<HrTdIspStudents> hrTdIspStudentsList) {
        this.hrTdIspStudentsList = hrTdIspStudentsList;
    }

}
