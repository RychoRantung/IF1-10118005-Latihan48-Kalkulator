/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan48.kalkulator;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Berisi program yang menampilkan kalkulator
 */
public class IF110118005Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("VALUE 1 = " + kal.getValue1());
        System.out.println("VALUE 2 = " + kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject();
        System.out.println("Result Add is = " + kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Minus is  = " + kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Multiple is = " + kal.multiplication(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Division is = " + kal.division(kal.getValue1(), kal.getValue2()));
        
        
    }
    
}
