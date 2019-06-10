package com.taleofthecave;

//import org.json.simple.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;

public class NameGeneratorRu
{
    public static void main(String[] args) {




        List<String> list = new ArrayList<String>();
        System.out.println(System.getProperty("user.dir"));
        File file = new File("src/main/Resources/word_rus.txt");
        System.out.println(file.exists());
        if(file.exists()) {

            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(
                        file.getAbsolutePath()));
                String line = reader.readLine();
                while (line != null) {
                    list.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Iterator it = list.iterator();

            while(it.hasNext()){

            }


        }




    }

    public String getRandomName(int tryN){
        return null;
    }

    private String [] getLeftNames () {
        return null;
    }

    private String [] getRightNames (){
        return null;
    }
}


