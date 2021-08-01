package com.example.myexperimentalapplication;

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
}
