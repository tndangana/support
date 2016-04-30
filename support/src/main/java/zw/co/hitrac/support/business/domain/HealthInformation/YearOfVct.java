/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.HealthInformation;

import java.io.Serializable;
import java.time.Year;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hitrac
 */
@Entity
public class YearOfVct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Year vctyear;        

    public Long getId() {
        return id;
    }
    

    public void setId(Long id) {
        this.id = id;
    }
    
     public Year getVctyear(){
     return vctyear;
     }
     public void setVctyear(Year vctyear){
     this.vctyear = vctyear;
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
        if (!(object instanceof YearOfVct)) {
            return false;
        }
        YearOfVct other = (YearOfVct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.support.business.domain.HealthInformation.Year[ id=" + id + " ]";
    }
    
}
