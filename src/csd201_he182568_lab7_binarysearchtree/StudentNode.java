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
class StudentNode {
    String name;
    int score;
    StudentNode left, right;

    StudentNode(String name, int score) {
        this.name = name;
        this.score = score;
        left = right = null;
    }
}

