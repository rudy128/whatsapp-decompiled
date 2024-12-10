package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.9yG  reason: invalid class name and case insensitive filesystem */
public final class C198389yG {
    public static final C198389yG A04;
    public final Field A00;
    public final Field A01;
    public final Method A02;
    public final Method A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|5|6|7|(4:9|10|11|12)|15|16|(2:17|18)|(1:29)(1:26)|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002c */
    static {
        /*
            java.lang.Class<android.os.MessageQueue> r2 = android.os.MessageQueue.class
            java.lang.String r6 = "next"
            r0 = 0
            r5 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x0010 }
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r6, r0)     // Catch:{ all -> 0x0010 }
            r0 = 1
            r5.setAccessible(r0)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            java.lang.Class<android.os.Message> r4 = android.os.Message.class
            java.lang.String r1 = "recycleUnchecked"
            r0 = 0
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x0020 }
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x0020 }
            r0 = 1
            r3.setAccessible(r0)     // Catch:{ all -> 0x0020 }
        L_0x0020:
            java.lang.String r0 = "mMessages"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch:{ all -> 0x002b }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            java.lang.reflect.Field r1 = r4.getDeclaredField(r6)     // Catch:{ all -> 0x0035 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r5 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            if (r1 == 0) goto L_0x0046
            X.9yG r0 = new X.9yG
            r0.<init>(r2, r1, r5, r3)
        L_0x0043:
            A04 = r0
            return
        L_0x0046:
            r0 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198389yG.<clinit>():void");
    }

    public C198389yG(Field field, Field field2, Method method, Method method2) {
        this.A02 = method;
        this.A03 = method2;
        this.A00 = field;
        this.A01 = field2;
    }
}
