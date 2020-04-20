/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postoffice;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author naveen
 */
@Entity
@Table(name = "PARCEL_DETAILS", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "ParcelDetails.findAll", query = "SELECT p FROM ParcelDetails p")
    , @NamedQuery(name = "ParcelDetails.findByParcelid", query = "SELECT p FROM ParcelDetails p WHERE p.parcelid = :parcelid")
    , @NamedQuery(name = "ParcelDetails.findByOrddate", query = "SELECT p FROM ParcelDetails p WHERE p.orddate = :orddate")
    , @NamedQuery(name = "ParcelDetails.findByEid", query = "SELECT p FROM ParcelDetails p WHERE p.eid = :eid")
    , @NamedQuery(name = "ParcelDetails.findByPrice", query = "SELECT p FROM ParcelDetails p WHERE p.price = :price")})
public class ParcelDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARCELID")
    private String parcelid;
    @Column(name = "ORDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orddate;
    @Column(name = "EID")
    private String eid;
    @Column(name = "PRICE")
    private BigInteger price;

    public ParcelDetails() {
    }

    public ParcelDetails(String parcelid) {
        this.parcelid = parcelid;
    }

    public String getParcelid() {
        return parcelid;
    }

    public void setParcelid(String parcelid) {
        String oldParcelid = this.parcelid;
        this.parcelid = parcelid;
        changeSupport.firePropertyChange("parcelid", oldParcelid, parcelid);
    }

    public Date getOrddate() {
        return orddate;
    }

    public void setOrddate(Date orddate) {
        Date oldOrddate = this.orddate;
        this.orddate = orddate;
        changeSupport.firePropertyChange("orddate", oldOrddate, orddate);
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        String oldEid = this.eid;
        this.eid = eid;
        changeSupport.firePropertyChange("eid", oldEid, eid);
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        BigInteger oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parcelid != null ? parcelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParcelDetails)) {
            return false;
        }
        ParcelDetails other = (ParcelDetails) object;
        if ((this.parcelid == null && other.parcelid != null) || (this.parcelid != null && !this.parcelid.equals(other.parcelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.ParcelDetails[ parcelid=" + parcelid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
