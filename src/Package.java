
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD
 */
public abstract class Package {
    public String name;
    public boolean isInstalled;
    public Set<Package> prereqs;
    
    public Package(String name) {
        this.name = name;
        this.isInstalled = false;
        prereqs = new HashSet<>();
    }
    
    public abstract void install ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Set<Package> getPrereqs () {
        return prereqs;
    }
    
    public void addPrereq (Package p) {
        prereqs.add(p);
    }
    
    public boolean getIsInstalled () {
        return isInstalled;
    }
    
    public void setIsInstalled (boolean status) {
        this.isInstalled = status;
    }
}
