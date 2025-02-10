package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise32 {

    public static void main(String[] args) {
        printToFile(generateStringToSave(null));
    }

    public static String generateStringToSave(String string) {
        if (string == null) {
            return generateUserInputToSave();
        } else {
            return string;
        }
    }

    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {

        try (PrintWriter pw = new PrintWriter(new File("src/main/resources/data.txt"))) {
            pw.println(string);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
