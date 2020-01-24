/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit6;

/**
 *
 * @author zacharylineman
 */
public class SpellChecker {

    private String[] dictionary = {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "part"};

    public static void main(String[] args){
        SpellChecker checker = new SpellChecker();
        checker.print10();
        checker.printStartsWith("th");
        
        String word = "catz";
        if (checker.spellcheck(word) == true) {
            System.out.println(word + " is spelled correctly!");
        } else {
            System.out.println(word + " is misspelled!");
  
        }
    }
    
    public void print10() {
        for (int i = 0; i < 10; i++) {
            System.out.println(dictionary[i]);
        }
    }
    
    public void printStartsWith(String s) {
        for (String word : dictionary) {
            if (word.length() >= s.length()) {
                if (word.substring(0, s.length()).equals(s)) {
                    System.out.println(word);
                }
            }
        }
    }
    
    public boolean spellcheck(String w) {
        for (String word : dictionary) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    } 
}
