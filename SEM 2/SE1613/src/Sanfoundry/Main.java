/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanfoundry;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author acer
 */
public class Main {
    
    public static void main(String args[]) {
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(10.5);
        ar.add("Hello");
        ar.add(true);
        System.out.println("ar: "+ar);
        Vector br = new Vector();
        br.add(11);
        br.add("Hello");
        ar.add(0, br);
        System.out.println("ar: "+ar);
        System.out.println("br: "+br);
        ar.removeAll(br);//xóa tất cả element ar trong br
        System.out.println("br: "+br);
        System.out.println("ar: "+ar);
        ar.remove((Object)10);
        System.out.println("ar: "+ar);
        System.out.println("Nguyễn Tiền Khôi");
    } 
    
}
