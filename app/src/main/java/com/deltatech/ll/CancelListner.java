package com.deltatech.ll;

import android.content.DialogInterface;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CancelListner implements DialogInterface.OnCancelListener {
   int times = new Integer(0);

    public void onCancel(DialogInterface diag){
        times++;
        System.out.println("Hello\nWorld");
    }
    public void onexit(){
        File f = new File("CancelCont");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        }catch(Exception e){

        }
        f.setWritable(true);
        try {
            Scanner scan = new Scanner(f, "ascii");
            if(scan.hasNextLong()){
                long canceltimes=scan.nextLong(16);
                System.out.println(canceltimes);
                canceltimes+=times;
                f.toURI();
                FileOutputStream fstrm = new FileOutputStream(f);
                fstrm.write(String.format("%lld", canceltimes).getBytes(),0,8);

            }
        }catch(Exception e){
            System.out.println(e.getCause());


        }
    }
}
