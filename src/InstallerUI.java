/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD
 */
public class InstallerUI {
    public static void main(String[] args) {
        Package A = new WindowsPackage("A");
        Package B = new WindowsPackage("B");
        Package C = new WindowsPackage("C");
        Package D = new WindowsPackage("D");
        
        A.getPrereqs().add(B);
//        B.getPrereqs().add(A);
        A.getPrereqs().add(C);
        B.getPrereqs().add(D);
        C.getPrereqs().add(D);
        
        PackageInstaller pi = new PackageInstaller();
        System.out.println(pi.install(A));
    }
}
