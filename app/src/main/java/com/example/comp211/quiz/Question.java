package com.example.comp211.quiz;

import android.app.Activity;

/**
 * Created by delon on 28.12.2016.
 */

public class Question extends Activity {
    
    private int ID;
    private String QUESTION;
    private String ANSA;
    private String ANSB;
    private String ANSC;
    private String ANSD;

    private String ANSWER;

    public Question() {
        ID = 0;
        QUESTION = "";
        ANSWER = "";
        ANSA = "";
        ANSB = "";
        ANSC = "";
        ANSD = "";

    }

    public Question(String qUESTION, String aNSWER, String aNSA, String aNSB, String aNSC, String aNSD) {
        QUESTION = qUESTION;
        ANSA = aNSA;
        ANSB = aNSB;
        ANSC = aNSC;
        ANSD = aNSD;

        ANSWER = aNSWER;

    }

    public int getID() {
        return ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public String getANSA() {
        return ANSA;
    }

    public String getANSB() {
        return ANSB;
    }

    public String getANSC() {
        return ANSC;
    }

    public String getANSD() {
        return ANSD;
    }

    public void setID(int id) {
        ID = id;
    }

    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }

    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }

    public void setANSA(String aNSA) {
        ANSA = aNSA;
    }

    public void setANSB(String aNSB) {
        ANSB = aNSB;
    }

    public void setANSC(String aNSC) {
        ANSC = aNSC;
    }

    public void setANSD(String aNSD) {
        ANSD = aNSD;
    }

}
