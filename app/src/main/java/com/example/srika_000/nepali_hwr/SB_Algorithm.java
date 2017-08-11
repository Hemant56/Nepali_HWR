package com.example.srika_000.nepali_hwr;

import android.util.Log;

import java.math.BigInteger;
import java.security.Signature;
import java.util.Scanner;

/**
 * Created by shivr on 8/10/2017.
 */

public class SB_Algorithm {

    public int i = 0;
    public int j = 0;
    public int xi, yi;
    public int Xi,Yi;
    public String signature = "";

    public int degree;

    Scanner scanner = new Scanner(System.in);

    public String getScanner() {

        Log.i("Vaue of A=", String.valueOf(xi));
        Log.i("Vaue of A=", String.valueOf(yi));
        Log.i("Value of B=",String.valueOf(Xi));
        Log.i("Value of B=",String.valueOf(Yi));

        degree=xi;
        degree=Xi;

        if ((degree >= 0) && (degree <= 45) && (degree >= 315) && (degree <= 360)) {

            Log.i("Append String", "R");


        } else if ((degree >= 45) && (degree < 135)) {

            Log.i("Append String", "U");
            //scanner.nextLine();
        } else if ((degree >= 135) && (degree < 125)) {

            Log.i("Append String", "L");
            //scanner.nextLine();
        } else if ((degree >= 225) && (degree < 315)) {
            Log.i("Append String", "D");
            //scanner.nextLine();
        }else {

            Log.i("Append String","U");
        }

        scanner.nextLine();
        signature.indexOf(i);
        i++;
        return signature;
    }
}
