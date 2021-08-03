package com.example.myexperimentalapplication;

import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubComponent {
    //    テキストを渡すと、セリフが追加されて、メッセージになる
    static String javaModified(String anyTextHere, String mode) {
        String givenText = anyTextHere;
        return "java says " + givenText + catcher(mode);
    }
//    catcherの説明
    static String catcher(String modeName) {
        String mode = modeName;
        return mode + " (appended!)";
    }

    static ArrayList makeArray(TextView textView) {
        TextView element = textView;
        ArrayList<TextView> list = new ArrayList<>();
        list.add(textView);
        return list;
    }
}
