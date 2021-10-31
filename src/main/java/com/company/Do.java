package com.company;


import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;


public class Do {
    public static String encryptMD5(String str){

        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptGOST3411(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("GOST3411");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptRIPEMD320(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("RIPEMD320");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptRIPEMD128(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("RIPEMD128");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptRIPEMD160(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("RIPEMD160");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptSHA512(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("SHA512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptSHA384(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("SHA-384");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptRIPEMD256(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("RIPEMD256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptSHA256(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }
    public static String encryptSHA224(String str){
        String sInput = str;
        Security.addProvider(new BouncyCastleProvider());

        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("SHA224");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = {};
        try {
            byte[] b = Files.readAllBytes(Paths.get(str));
            digest = hash.digest(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigInteger biHash3411Out = new BigInteger(digest);
        return biHash3411Out.toString(16);
    }

}
