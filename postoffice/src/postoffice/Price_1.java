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
@Table(name = "PRICE", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "Price_1.findAll", query = "SELECT p FROM Price_1 p")
    , @NamedQuery(name = "Price_1.findBySlno", query = "SELECT p FROM Price_1 p WHERE p.slno = :slno")
    , @NamedQuery(name = "Price_1.findByFromcity", query = "SELECT p FROM Price_1 p WHERE p.fromcity = :fromcity")
    , @NamedQuery(name = "Price_1.findByFrompin", query = "SELECT p FROM Price_1 p WHERE p.frompin = :frompin")
    , @NamedQuery(name = "Price_1.findByTocity", query = "SELECT p FROM Price_1 p WHERE p.tocity = :tocity")
    , @NamedQuery(name = "Price_1.findByTopin", query = "SELECT p FROM Price_1 p WHERE p.topin = :topin")
    , @NamedQuery(name = "Price_1.findByPrice", query = "SELECT p FROM Price_1 p WHERE p.price = :price")})
public class Price_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SLNO")
    private Long slno;
    @Column(name = "FROMCITY")
    private String fromcity;
    @Column(name = "FROMPIN")
    private Long frompin;
    @Column(name = "TOCITY")
    private String tocity;
    @Column(name = "TOPIN")
    private Long topin;
    @Column(name = "PRICE")
    private Long price;

    public Price_1() {
    }

    public Price_1(Long slno) {
        this.slno = slno;
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        Long oldSlno = this.slno;
        this.slno = slno;
        changeSupport.firePropertyChange("slno", oldSlno, slno);
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        String oldFromcity = this.fromcity;
        this.fromcity = fromcity;
        changeSupport.firePropertyChange("fromcity", oldFromcity, fromcity);
    }

    public Long getFrompin() {
        return frompin;
    }

    public void setFrompin(Long frompin) {
        Long oldFrompin = this.frompin;
        this.frompin = frompin;
        changeSupport.firePropertyChange("frompin", oldFrompin, frompin);
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        String oldTocity = this.tocity;
        this.tocity = tocity;
        changeSupport.firePropertyChange("tocity", oldTocity, tocity);
    }

    public Long getTopin() {
        return topin;
    }

    public void setTopin(Long topin) {
        Long oldTopin = this.topin;
        this.topin = topin;
        changeSupport.firePropertyChange("topin", oldTopin, topin);
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        Long oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (slno != null ? slno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Price_1)) {
            return false;
        }
        Price_1 other = (Price_1) object;
        if ((this.slno == null && other.slno != null) || (this.slno != null && !this.slno.equals(other.slno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.Price_1[ slno=" + slno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
