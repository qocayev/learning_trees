/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ali.qocayev.trees.main;

import ali.qocayev.trees.ads.BST;

/**
 *
 * @author ali
 */
public class EntryPoint {
    public static void main(String[] args){
        BST<Integer> bst = new BST<Integer>();
        bst.add(1);
        bst.add(5);
        bst.add(2);
        bst.add(-1);
        System.out.println("");
    }
}
