/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ali.qocayev.trees.ads;

import ali.qocayev.trees.Node;
import ali.qocayev.trees.Tree;

/**
 *
 * @author ali
 */
public class BST<T extends Comparable> implements Tree<T> {

    private Node<T> root;

    @Override
    public void add(T element) {
        root = internallAdd(root, element);
    }
    
    private Node<T> internallAdd(Node<T> node, T element){
        
       if (node==null){
           return new Node<>(element);
       }
       if (node.getKey().compareTo(element) > 0 ){
           node.setLeft(internallAdd(node.getLeft(), element));
       }else
           node.setRight(internallAdd(node.getRight(), element));
       return node;
    }

}
