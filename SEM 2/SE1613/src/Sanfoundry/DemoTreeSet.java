/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

import java.util.TreeSet;

/**
 *
 * @author acer
 */
public class DemoTreeSet {
    public static void main(String[] args) {
        MySort my = new MySort();
        TreeSet<Student> ts = new TreeSet();
        ts.add(new Student("Nguyen Van A", "he123", 80));
        ts.add(new Student("Nguyen Van B", "he124", 81));
        ts.add(new Student("Nguyen Van C", "he125", 82));
        ts.add(new Student("Nguyen Van D", "he126", 82));
        
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
