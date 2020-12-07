
import java.util.HashSet;
import java.util.LinkedList;
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
public class PackageInstaller {
    
    public boolean install (Package p) {
        Set<Package> packageList = new HashSet<>();
        LinkedList<Package> queue = new LinkedList<>();
        
        getPackageList (p, packageList);
        
        for (Package pack: packageList) {
            if (pack.getPrereqs().isEmpty()) {
                queue.add(pack);
            }
        }
        
        if (queue.isEmpty()) {
            System.out.println("Installation failed because of deadlock!");
            return false;
        }
        
        while (!queue.isEmpty()) {
            Package installed = queue.poll();
            if (!installed.getIsInstalled()) {
                installed.setIsInstalled(true);
                installed.install();
            }
            if (packageList.contains(installed)) packageList.remove(installed);
            
            for (Package pac: packageList) {
                if (pac.getPrereqs().contains(installed)) {
                    pac.getPrereqs().remove(installed);
                }
                if (pac.getPrereqs().isEmpty()) {
                    queue.add(pac);
                }
            }
        }
        
        return packageList.isEmpty();
    }
    
    private void getPackageList (Package p, Set<Package> packagaeList) {
        if (packagaeList.contains(p)) return;
        packagaeList.add(p);
        for (Package pre: p.getPrereqs()) {
            getPackageList (pre, packagaeList);
        }
    }
}
