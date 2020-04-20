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
@Table(name = "EMPLOYEE", catalog = "", schema = "POSTOFFICE")
@NamedQueries({
    @NamedQuery(name = "Employee_1.findAll", query = "SELECT e FROM Employee_1 e")
    , @NamedQuery(name = "Employee_1.findByEid", query = "SELECT e FROM Employee_1 e WHERE e.eid = :eid")
    , @NamedQuery(name = "Employee_1.findByEname", query = "SELECT e FROM Employee_1 e WHERE e.ename = :ename")
    , @NamedQuery(name = "Employee_1.findByEphno", query = "SELECT e FROM Employee_1 e WHERE e.ephno = :ephno")
    , @NamedQuery(name = "Employee_1.findBySalary", query = "SELECT e FROM Employee_1 e WHERE e.salary = :salary")
    , @NamedQuery(name = "Employee_1.findByPid", query = "SELECT e FROM Employee_1 e WHERE e.pid = :pid")})
public class Employee_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EID")
    private String eid;
    @Column(name = "ENAME")
    private String ename;
    @Column(name = "EPHNO")
    private Long ephno;
    @Column(name = "SALARY")
    private BigInteger salary;
    @Column(name = "PID")
    private String pid;

    public Employee_1() {
    }

    public Employee_1(String eid) {
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        String oldEid = this.eid;
        this.eid = eid;
        changeSupport.firePropertyChange("eid", oldEid, eid);
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        String oldEname = this.ename;
        this.ename = ename;
        changeSupport.firePropertyChange("ename", oldEname, ename);
    }

    public Long getEphno() {
        return ephno;
    }

    public void setEphno(Long ephno) {
        Long oldEphno = this.ephno;
        this.ephno = ephno;
        changeSupport.firePropertyChange("ephno", oldEphno, ephno);
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        BigInteger oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        String oldPid = this.pid;
        this.pid = pid;
        changeSupport.firePropertyChange("pid", oldPid, pid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eid != null ? eid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee_1)) {
            return false;
        }
        Employee_1 other = (Employee_1) object;
        if ((this.eid == null && other.eid != null) || (this.eid != null && !this.eid.equals(other.eid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "postoffice.Employee_1[ eid=" + eid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
