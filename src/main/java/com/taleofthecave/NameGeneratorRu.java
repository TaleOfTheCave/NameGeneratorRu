package com.taleofthecave;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.List;
import java.io.IOException;
import java.lang.String;
import java.util.Iterator;
import java.util.Random;

public class NameGeneratorRu {

    private Result previousName;
    private String [] nouns;

    public static void main(String[] args) {
        NameGeneratorRu a = new NameGeneratorRu();
    }


    public NameGeneratorRu(){
        this.nouns = getRightNames();
    }

    public String getRandomName() {
        Random r = new Random();

        int nounKey1 = r.nextInt(nouns.length);
        int nounKey2 = r.nextInt(nouns.length);
        int number = r.nextInt(nouns.length);

        Result res = new Result();
        res.setNoun1(nouns[nounKey1]);
        res.setNoun2(nouns[nounKey2]);
        res.number = number;

        this.previousName = res;

        return res.toString();
    }

    public String repeat(){
        if(this.previousName != null) {
            Result prev = this.previousName;
            String newName = this.getRandomName();

            while(prev.toString().equals(newName)) {
                prev = this.previousName;
                newName = this.getRandomName();
            }

            return newName;
        }

        return null;
    }

    private String [] getRightNames() {
        try {
            JSONTokener tokener = new JSONTokener(new FileReader("src/main/Resources/nouns.json"));
            JSONArray arr = (JSONArray) new JSONObject(tokener).get("nouns");

            List list = arr.toList();
            String [] stringArr = new String[list.size()];

            for(int i =0; i < stringArr.length;i++) {
                stringArr[i] = (String) list.get(i);
            }

            return stringArr;
        } catch (IOException ex) {
            return null;
        }
    }
}


