package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {
    void run() {
        String s = "";
        String temp = "";

        String mess = "text";

        while (!s.equals("4")){
            System.out.println("Введите номер:\n1. Зашифровать сообщение\n2. Показать сообщение\n3. Изменить сообщение\n4. Выход");
            s = read();
            switch (s){
                case "1":
                    tasks();
                    break;
                case "2":
                    System.out.println("Сообщение: " + mess);
                    break;
                case "3":
                    System.out.println("Введите сообщение:");
                    mess = read();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }

    }
    String read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = br.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
        return s;
    }
    void tasks(){
        //Task1*
        System.out.println("**  3 одинковых сообщения:");
        System.out.println("1 раз:\n");
        text("textTask1");
        //
        System.out.println("2 раз:\n");
        text("textTask1");
        //
        System.out.println("3 раз:\n");
        text("textTask1");
        //
        //Task2*
        System.out.println("**  3 сообщения, отличающихся одним символом:");
        System.out.println("1 сообщение(Hello):\n");
        text("textTask2_mes1");
        //

        System.out.println("2 сообщение(Hallo):\n");
        text("textTask2_mes2");
        //

        System.out.println("3 сообщение(HelLo):\n");
        text("textTask2_mes3");
        //Task3*
        System.out.println("**  Cообщение, размер которого не превышает 1 Мб(HelloWorld////):");
        System.out.println("\n");
        text("textTask3");

        //Task4*
        System.out.println("**  Сообщение, размер которого больше 1Мб, но меньше 3 МБ:");
        System.out.println("\n");
        text("textTask4");

        //Task5*
        System.out.println("**  Сообщение, размер которого больше 10Мб:");
        System.out.println("\n");
        text("textTask5");
    }
    void text(String str){
        System.out.println("Encrypted(GOST3411): "+  Do.encryptGOST3411(str));
        System.out.println("Encrypted(RIPEMD320): "+  Do.encryptRIPEMD320(str));
        System.out.println("Encrypted(MD5): "+  Do.encryptMD5(str));
        System.out.println("Encrypted(SHA256): "+  Do.encryptSHA256(str));
        System.out.println("Encrypted(RIPEMD128): "+  Do.encryptRIPEMD128(str));
        System.out.println("Encrypted(RIPEMD160): "+  Do.encryptRIPEMD160(str));
        System.out.println("Encrypted(SHA512): "+  Do.encryptSHA512(str));
        System.out.println("Encrypted(SHA384): "+  Do.encryptSHA384(str));
        System.out.println("Encrypted(RIPEMD256): "+  Do.encryptRIPEMD256(str));
        System.out.println("Encrypted(SHA224): "+  Do.encryptSHA224(str));
    }
}
