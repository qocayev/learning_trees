/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ali.qocayev.trees;

/**
 *
 * @author ali
 */
public class Node<T extends Comparable> {

    public T getKey() {
        return key;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }
    
    public Node(T arg){
        key=arg;
    }
    private T key;
    private Node<T> left;
    private Node<T> right;

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "key=" + key + ", left=" + left + ", right=" + right + '}';
    }
    
    
}
