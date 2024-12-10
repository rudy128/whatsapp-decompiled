package com.google.protobuf;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.BE7;
import X.BEB;
import X.C23663BnW;
import X.C23664BnX;
import X.C23665BnY;
import X.C25856CnK;
import X.CHO;
import X.DU4;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class UnsafeUtil {
    public static final long A00;
    public static final long A01;
    public static final C25856CnK A02;
    public static final Class A03;
    public static final Unsafe A04 = A02();
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final boolean A09 = AnonymousClass000.A1Z(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    public static Object A00(Class cls) {
        try {
            return A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.CHO.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A01() {
        /*
            java.lang.Class r0 = X.CHO.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.CHO.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0019
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x002e
            return r2
        L_0x002e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A01():java.lang.reflect.Field");
    }

    public static Unsafe A02() {
        try {
            return (Unsafe) AccessController.doPrivileged(new DU4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A03(Class cls) {
        boolean z = A05;
        if (z) {
            A02.A05(cls);
        }
        if (z) {
            A02.A0A(cls);
        }
    }

    public static void A04(Object obj, long j, int i) {
        A02.A0E(obj, j, i);
    }

    public static void A05(Object obj, long j, Object obj2) {
        A02.A0G(obj, j, obj2);
    }

    public static void A06(Throwable th) {
        BE7.A0w(UnsafeUtil.class).log(Level.WARNING, AnonymousClass001.A1E(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass000.A10()));
    }

    public static void A07(byte[] bArr, long j, byte b) {
        A02.A0B(bArr, A01 + j, b);
    }

    static {
        boolean z;
        boolean z2;
        boolean A0K;
        boolean A0J;
        int i;
        long j;
        C25856CnK cnK;
        Class cls = CHO.A00;
        A03 = cls;
        Class cls2 = Long.TYPE;
        Class<byte[]> cls3 = byte[].class;
        if (cls == null || CHO.A01) {
            z = false;
        } else {
            try {
                z = BEB.A1Z(cls, cls2);
            } catch (Throwable unused) {
                z = false;
            }
        }
        A08 = z;
        Class cls4 = Integer.TYPE;
        if (cls == null || CHO.A01) {
            z2 = false;
        } else {
            try {
                z2 = BEB.A1Z(A03, cls4);
            } catch (Throwable unused2) {
                z2 = false;
            }
        }
        A07 = z2;
        Unsafe unsafe = A04;
        C25856CnK cnK2 = null;
        if (unsafe != null) {
            if (cls == null || CHO.A01) {
                cnK2 = new C23665BnY(unsafe);
            } else if (A08) {
                cnK2 = new C23664BnX(unsafe);
            } else if (z2) {
                cnK2 = new C23663BnW(unsafe);
            }
        }
        A02 = cnK2;
        if (cnK2 == null) {
            A0K = false;
        } else {
            A0K = cnK2.A0K();
        }
        A06 = A0K;
        C25856CnK cnK3 = A02;
        if (cnK3 == null) {
            A0J = false;
        } else {
            A0J = cnK3.A0J();
        }
        A05 = A0J;
        if (A0J) {
            i = A02.A05(cls3);
        } else {
            i = -1;
        }
        A01 = (long) i;
        A03(boolean[].class);
        A03(int[].class);
        A03(long[].class);
        A03(float[].class);
        A03(double[].class);
        A03(Object[].class);
        Field A012 = A01();
        if (A012 == null || (cnK = A02) == null) {
            j = -1;
        } else {
            j = cnK.A08(A012);
        }
        A00 = j;
    }
}
