package com.example.datastructureandalgorithms.BST

fun main() {

    val root = TreeNode(14).apply {
        left = TreeNode(9).apply {
            left = TreeNode(4)
            right = TreeNode(11)
        }
        right = TreeNode(24).apply {
            left = TreeNode(19)
            right = TreeNode(29)
        }
    }

    val bt=BT()

    println("Inorder:")
    bt.inorderTraversal(root)

    println("\nPreorder:")
    bt. preorderTraversal(root)

    println("\nPostorder:")
    bt. postorderTraversal(root)
}
