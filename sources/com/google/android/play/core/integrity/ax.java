package com.google.android.play.core.integrity;

import android.content.Context;

public abstract class ax {
    public static aw a;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.google.android.play.core.integrity.u] */
    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            awVar = a;
            if (awVar == null) {
                ? obj = new Object();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                obj.a = context;
                awVar = obj.b();
                a = awVar;
            }
        }
        return awVar;
    }
}
