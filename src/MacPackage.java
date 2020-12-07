/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD
 */
public class MacPackage extends Package{

    public MacPackage(String name) {
        super(name);
    }
    
    @Override
    public void install() {
        System.out.println(name + ": Mac Package Installed!");
    }
}
