/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_he182568_lab7_binarysearchtree;

/**
 *
 * @author VAN NGUYEN
 */
class StudentTree {
    private StudentNode root;

    public StudentNode insert(StudentNode node, String name, int score) {
        if (node == null) {
            return new StudentNode(name, score);
        }

        if (score < node.score) {
            node.left = insert(node.left, name, score);
        } else {
            node.right = insert(node.right, name, score);
        }

        return node;
    }

    public StudentNode findStudentByScore(StudentNode node, int score) {
        if (node == null) {
            return null;
        }

        if (node.score == score) {
            return node;
        } else if (score < node.score) {
            return findStudentByScore(node.left, score);
        } else {
            return findStudentByScore(node.right, score);
        }
    }

    public StudentNode findHighestScore(StudentNode node) {
        if (node == null) {
            return null;
        }

        StudentNode current = node;
        while (current.right != null) {
            current = current.right;
        }

        return current;
    }

    public StudentNode deleteNode(StudentNode node, int score) {
        if (node == null) {
            return node;
        }

        if (score < node.score) {
            node.left = deleteNode(node.left, score);
        } else if (score > node.score) {
            node.right = deleteNode(node.right, score);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            StudentNode minLargerNode = node.right;
            while (minLargerNode.left != null) {
                minLargerNode = minLargerNode.left;
            }

            node.score = minLargerNode.score;
            node.name = minLargerNode.name;
            node.right = deleteNode(node.right, minLargerNode.score);
        }

        return node;
    }

    public StudentNode getRoot() {
        return root;
    }

    public void setRoot(StudentNode root) {
        this.root = root;
    }
}

