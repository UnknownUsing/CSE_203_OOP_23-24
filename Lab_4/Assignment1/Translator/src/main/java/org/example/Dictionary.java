package org.example;

import java.util.HashMap;


public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
    }

    public Dictionary (HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void addWord(){
        this.dictionary = new HashMap<>();
        this.dictionary.put("Hello", "Chao");
        this.dictionary.put("Bye", "Tam Biet");
        this.dictionary.put("Morning", "Sang");
        this.dictionary.put("Afternoon", "Chieu");
        this.dictionary.put("Night", "Toi");
        this.dictionary.put("School", "Truong hoc");
        this.dictionary.put("Name", "Ten");
        this.dictionary.put("House", "Nha");
        this.dictionary.put("Screen", "Man hinh");
        this.dictionary.put("Computer", "May tinh");
    }

    public boolean checkDictionary(String check){
        boolean flag = false;
        for (String word: dictionary.keySet()) {
            if (check.equals(word)){
                flag = true;
            }
        }
        if (!flag){
            System.out.println("This word does not exist in the dictionary");
        }
        return flag;
    }

    public void findMeaning(String check){
        for (String word: dictionary.keySet()) {
            if (check.equals(word)){
                System.out.println("This word in Vietnamese is: "+dictionary.get(word));
                break;
            }
        }
    }




}
