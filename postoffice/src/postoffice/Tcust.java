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
@Table(name = "TCUST", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "Tcust.findAll", query = "SELECT t FROM Tcust t")
    , @NamedQuery(name = "Tcust.findByTname", query = "SELECT t FROM Tcust t WHERE t.tname = :tname")
    , @NamedQuery(name = "Tcust.findByTaddr", query = "SELECT t FROM Tcust t WHERE t.taddr = :taddr")
    , @NamedQuery(name = "Tcust.findByTphno", query = "SELECT t FROM Tcust t WHERE t.tphno = :tphno")})
public class Tcust implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "TNAME")
    private String tname;
    @Column(name = "TADDR")
    private String taddr;
    @Id
    @Basic(optional = false)
    @Column(name = "TPHNO")
    private Long tphno;

    public Tcust() {
    }

    public Tcust(Long tphno) {
        this.tphno = tphno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        String oldTname = this.tname;
        this.tname = tname;
        changeSupport.firePropertyChange("tname", oldTname, tname);
    }

    public String getTaddr() {
        return taddr;
    }

    public void setTaddr(String taddr) {
        String oldTaddr = this.taddr;
        this.taddr = taddr;
        changeSupport.firePropertyChange("taddr", oldTaddr, taddr);
    }

    public Long getTphno() {
        return tphno;
    }

    public void setTphno(Long tphno) {
        Long oldTphno = this.tphno;
        this.tphno = tphno;
        changeSupport.firePropertyChange("tphno", oldTphno, tphno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tphno != null ? tphno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tcust)) {
            return false;
        }
        Tcust other = (Tcust) object;
        if ((this.tphno == null && other.tphno != null) || (this.tphno != null && !this.tphno.equals(other.tphno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.Tcust[ tphno=" + tphno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
