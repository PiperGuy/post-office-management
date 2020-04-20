/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postoffice;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author naveen
 */
@Entity
@Table(name = "FCUST", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "Fcust.findAll", query = "SELECT f FROM Fcust f")
    , @NamedQuery(name = "Fcust.findByFname", query = "SELECT f FROM Fcust f WHERE f.fname = :fname")
    , @NamedQuery(name = "Fcust.findByFaddr", query = "SELECT f FROM Fcust f WHERE f.faddr = :faddr")
    , @NamedQuery(name = "Fcust.findByPhno", query = "SELECT f FROM Fcust f WHERE f.phno = :phno")
    , @NamedQuery(name = "Fcust.findByParcelid", query = "SELECT f FROM Fcust f WHERE f.parcelid = :parcelid")})
public class Fcust implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "FADDR")
    private String faddr;
    @Id
    @Basic(optional = false)
    @Column(name = "PHNO")
    private Long phno;
    @Column(name = "PARCELID")
    private String parcelid;

    public Fcust() {
    }

    public Fcust(Long phno) {
        this.phno = phno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getFaddr() {
        return faddr;
    }

    public void setFaddr(String faddr) {
        String oldFaddr = this.faddr;
        this.faddr = faddr;
        changeSupport.firePropertyChange("faddr", oldFaddr, faddr);
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        Long oldPhno = this.phno;
        this.phno = phno;
        changeSupport.firePropertyChange("phno", oldPhno, phno);
    }

    public String getParcelid() {
        return parcelid;
    }

    public void setParcelid(String parcelid) {
        String oldParcelid = this.parcelid;
        this.parcelid = parcelid;
        changeSupport.firePropertyChange("parcelid", oldParcelid, parcelid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phno != null ? phno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fcust)) {
            return false;
        }
        Fcust other = (Fcust) object;
        if ((this.phno == null && other.phno != null) || (this.phno != null && !this.phno.equals(other.phno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.Fcust[ phno=" + phno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
