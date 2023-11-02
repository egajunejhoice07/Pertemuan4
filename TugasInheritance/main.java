/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author X1
 */
public class main {
    public static void main(String[] args) {
        Animals hewan = new Animals();
        
        hewan.bersuara("Doggy");
        Anjing anjing = new Anjing();
        anjing.suara();
        
        hewan.bersuara("Katty");
        Kucing kucing = new Kucing();
        kucing.suara();
        
        hewan.bersuara("goat");        
        kambing kambing = new kambing();
        kambing.suara();
        
        hewan.bersuara("Wofly");
        Serigala serigala = new Serigala();
        serigala.suara();

        hewan.bersuara("Lion");        
        Singa singa = new Singa();
        singa.suara();
    }
    
}