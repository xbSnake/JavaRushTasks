package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

   static {
       try {
           firstFileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
           secondFileName= new BufferedReader(new InputStreamReader(System.in)).readLine();
       } catch (IOException e) {


       }
   }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String  fileName;
        private String s="";
        public void run() {

            try {
                InputStream inputStream = new FileInputStream(fileName);
                while (inputStream.available()>0){
                    char ch= (char)inputStream.read();
                    if (ch !='\r')
                        if(ch!='\n')
                            s+=ch;
                        else{s+=" ";}

                }
            } catch (FileNotFoundException e) {
                System.out.println("file not find");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }


        public String getFileContent() {


            return s;

        }



    }
}
