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
@Table(name = "POSTOFFICE", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "Postoffice_1.findAll", query = "SELECT p FROM Postoffice_1 p")
    , @NamedQuery(name = "Postoffice_1.findByPid", query = "SELECT p FROM Postoffice_1 p WHERE p.pid = :pid")
    , @NamedQuery(name = "Postoffice_1.findByPname", query = "SELECT p FROM Postoffice_1 p WHERE p.pname = :pname")
    , @NamedQuery(name = "Postoffice_1.findByPaddr", query = "SELECT p FROM Postoffice_1 p WHERE p.paddr = :paddr")
    , @NamedQuery(name = "Postoffice_1.findByPhno", query = "SELECT p FROM Postoffice_1 p WHERE p.phno = :phno")
    , @NamedQuery(name = "Postoffice_1.findByPincode", query = "SELECT p FROM Postoffice_1 p WHERE p.pincode = :pincode")})
public class Postoffice_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PID")
    private String pid;
    @Column(name = "PNAME")
    private String pname;
    @Column(name = "PADDR")
    private String paddr;
    @Column(name = "PHNO")
    private BigInteger phno;
    @Column(name = "PINCODE")
    private Long pincode;

    public Postoffice_1() {
    }

    public Postoffice_1(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        String oldPid = this.pid;
        this.pid = pid;
        changeSupport.firePropertyChange("pid", oldPid, pid);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
    }

    public String getPaddr() {
        return paddr;
    }

    public void setPaddr(String paddr) {
        String oldPaddr = this.paddr;
        this.paddr = paddr;
        changeSupport.firePropertyChange("paddr", oldPaddr, paddr);
    }

    public BigInteger getPhno() {
        return phno;
    }

    public void setPhno(BigInteger phno) {
        BigInteger oldPhno = this.phno;
        this.phno = phno;
        changeSupport.firePropertyChange("phno", oldPhno, phno);
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        Long oldPincode = this.pincode;
        this.pincode = pincode;
        changeSupport.firePropertyChange("pincode", oldPincode, pincode);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postoffice_1)) {
            return false;
        }
        Postoffice_1 other = (Postoffice_1) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.Postoffice_1[ pid=" + pid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
