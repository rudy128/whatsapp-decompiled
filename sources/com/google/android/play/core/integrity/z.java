package com.google.android.play.core.integrity;

import android.content.Context;

public abstract class z {
    public static s a;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.play.core.integrity.q, java.lang.Object] */
    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            sVar = a;
            if (sVar == null) {
                ? obj = new Object();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                obj.a = context;
                sVar = obj.b();
                a = sVar;
            }
        }
        return sVar;
    }
}
