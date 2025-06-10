package com.example.datastructureandalgorithms.BST

class BT {


    fun inorderTraversal(root: TreeNode?) {
        val stack = ArrayDeque<TreeNode>()
        var current = root

        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.addFirst(current)
                current = current.left
            }

            current = stack.removeFirst()
            print("${current.value} ")
            current = current.right
        }
    }

    fun preorderTraversal(root: TreeNode?) {
        if (root == null) return

        val stack = ArrayDeque<TreeNode>()
        stack.addFirst(root)

        while (stack.isNotEmpty()) {
            val node = stack.removeFirst()
            print("${node.value} ")


            node.right?.let { stack.addFirst(it) }
            node.left?.let { stack.addFirst(it) }
        }
    }


    // TODO: check again
    fun postorderTraversal(root: TreeNode?) {
        if (root == null) return
        val stack = ArrayDeque<TreeNode>()
        var current = root
        var prev: TreeNode

        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                prev = current
                current = current.left
            }

            current = stack.removeFirst()
            println(current.value)
            current = current.right
        }


    }

    fun levelOrderTraversal(root: TreeNode?) {

        if (root == null) return

        val queue = ArrayDeque<TreeNode>()

        queue.addLast(root)

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            println(node.value)

            node.left?.let { queue.addLast(it) }
            node.right?.let { queue.addLast(it) }
        }

    }

    fun zigzagTraversal(root: TreeNode?) {
        if (root == null) return

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)



    }

}