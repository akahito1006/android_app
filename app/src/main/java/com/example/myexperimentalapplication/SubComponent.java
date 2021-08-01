package com.example.myexperimentalapplication;

public class SubComponent {
//    テキストを渡すと、セリフが追加されて、メッセージになる
    public static String javaModified(String anyTextHere) {
        String givenText = anyTextHere;
        return "text processed on java says... " + givenText;
    }
}
