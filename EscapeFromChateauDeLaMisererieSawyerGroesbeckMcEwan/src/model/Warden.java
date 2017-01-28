
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tim McEwan
 */
public class Warden implements Serializable {
   private String Name;
   private String  Decription;

    public Warden() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Name);
        hash = 29 * hash + Objects.hashCode(this.Decription);
        return hash;
    }

    @Override
    public String toString() {
        return "Warden{" + "Name=" + Name + ", Decription=" + Decription + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Warden other = (Warden) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Decription, other.Decription)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String Decription) {
        this.Decription = Decription;
    }
  
 }
