package com.taleofthecave;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.HashSet;
import java.util.List;
import java.io.IOException;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;


public class NameGeneratorRu {

    private String previousName;
    private Set<String> nounsSet;

    public static void main(String[] args) {

        NameGeneratorRu a = new NameGeneratorRu();

    }


    public NameGeneratorRu(){
        this.nounsSet = getRightNames();
    }
    public String getRandomName() {

        return null;
    }

    private Set<String> getRightNames() {
        try {
            JSONTokener tokener = new JSONTokener(new FileReader("src/main/Resources/nouns.json"));
            JSONArray arr = (JSONArray) new JSONObject(tokener).get("nouns");

            List <String> l = (List <String>) (List<?>) arr.toList();

            return new HashSet<String>(l);

        } catch (IOException ex) {
            return null;
        }
    }
}


