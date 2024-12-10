package X;

import sun.misc.Unsafe;

/* renamed from: X.Blw  reason: case insensitive filesystem */
public final class C23568Blw extends C24492C6k {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    public boolean A04(C23570Bly bly, Object obj) {
        Unsafe unsafe = A05;
        long j = A01;
        while (!unsafe.compareAndSwapObject(bly, j, (Object) null, obj)) {
            if (unsafe.getObject(bly, j) != null) {
                return false;
            }
        }
        return true;
    }

    public void A00(C25543Chg chg, C25543Chg chg2) {
        A05.putObject(chg, A03, chg2);
    }

    public void A01(C25543Chg chg, Thread thread) {
        A05.putObject(chg, A04, thread);
    }

    public boolean A02(C25948CpG cpG, C25948CpG cpG2, C23570Bly bly) {
        Unsafe unsafe = A05;
        long j = A00;
        do {
            if (unsafe.compareAndSwapObject(bly, j, cpG, cpG2)) {
                return true;
            }
        } while (unsafe.getObject(bly, j) == cpG);
        return false;
    }

    public boolean A03(C25543Chg chg, C25543Chg chg2, C23570Bly bly) {
        Unsafe unsafe = A05;
        long j = A02;
        do {
            if (unsafe.compareAndSwapObject(bly, j, chg, chg2)) {
                return true;
            }
        } while (unsafe.getObject(bly, j) == chg);
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    static {
        /*
            sun.misc.Unsafe r3 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            goto L_0x0010
        L_0x0005:
            X.DU3 r0 = new X.DU3     // Catch:{ PrivilegedActionException -> 0x0059 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0059 }
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0059 }
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch:{ PrivilegedActionException -> 0x0059 }
        L_0x0010:
            java.lang.Class<X.Bly> r2 = X.C23570Bly.class
            java.lang.String r0 = "waiters"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            A02 = r0     // Catch:{ NoSuchFieldException -> 0x0053 }
            java.lang.String r0 = "listeners"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            A00 = r0     // Catch:{ NoSuchFieldException -> 0x0053 }
            java.lang.String r0 = "value"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            A01 = r0     // Catch:{ NoSuchFieldException -> 0x0053 }
            java.lang.Class<X.Chg> r2 = X.C25543Chg.class
            java.lang.String r0 = "thread"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            A04 = r0     // Catch:{ NoSuchFieldException -> 0x0053 }
            java.lang.String r0 = "next"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0053 }
            A03 = r0     // Catch:{ NoSuchFieldException -> 0x0053 }
            A05 = r3     // Catch:{ NoSuchFieldException -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x0059:
            r0 = move-exception
            java.lang.String r1 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = X.BE6.A0o(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23568Blw.<clinit>():void");
    }
}
