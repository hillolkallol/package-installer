/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD
 */
public class WindowsPackage extends Package {

    public WindowsPackage(String name) {
        super(name);
    }
    
    @Override
    public void install() {
        System.out.println(name + ": Windows Package Installed!");
    }
    
}
