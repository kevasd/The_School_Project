package com.deltatech.ll;

import android.app.Dialog;

import androidx.fragment.app.Fragment;

import java.util.Scanner;

public class Fragments extends Fragment{

    final int magic = 0x4B657500;
    int Fragments_Has_Magic(java.io.File f){
        f.setWritable(true);
        try {
            Scanner scan = new Scanner(f, "ascii");
        }catch (Exception e){
            CancelListner canlis = new CancelListner();
            Dialog diag =  new Dialog(this.getActivity());
            diag.setTitle(String.format("%s %s", getString(R.string.File_Open_Error),f.getName()));
            diag.setOnCancelListener(canlis);

        }
    if(true){

        }
        return 0;
    }
}
