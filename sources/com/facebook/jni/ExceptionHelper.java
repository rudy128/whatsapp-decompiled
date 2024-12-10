package com.facebook.jni;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionHelper {
    public static String getErrorDescription(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
