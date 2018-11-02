package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Tree tree = new Tree();
        tree.insertNode(5);
        tree.insertNode(4);
        tree.insertNode(6);
        if(tree.search(7)){
            System.out.println("Found!");
        }else{
            System.out.println("Not Found!");
        }

        System.out.println("Inorder");
        tree.inorderTravrsal();

        System.out.println("Postorder");
        tree.postorderTraversal();

        System.out.println("Preorder");
        tree.preorderTraversal();
    }
}
