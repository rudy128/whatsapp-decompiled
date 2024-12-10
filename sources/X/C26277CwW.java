package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: X.CwW  reason: case insensitive filesystem */
public final class C26277CwW {
    public static final C25851CnD A00;
    public static final Class A01 = C25440Cfn.A00;
    public static final Unsafe A02;
    public static final boolean A03 = AnonymousClass000.A1Z(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final boolean A04;
    public static final boolean A05;
    public static final long A06;

    public static byte A00(byte[] bArr, long j) {
        return A00.A01(bArr, A06 + j);
    }

    public static int A01(Class cls) {
        if (A05) {
            return A00.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object A03(Object obj, long j) {
        return A00.A00.getObject(obj, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe A05() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A06(Class cls) {
        if (A05) {
            A00.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, Object obj2) {
        A00.A00.putObject(obj, j, obj2);
    }

    public static void A08(byte[] bArr, long j, byte b) {
        A00.A06(bArr, A06 + j, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014b A[SYNTHETIC, Splitter:B:44:0x014b] */
    static {
        /*
            sun.misc.Unsafe r3 = A05()
            A02 = r3
            java.lang.Class r0 = X.C25440Cfn.A00
            A01 = r0
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            boolean r0 = X.C25440Cfn.A00()
            r5 = 0
            if (r0 != 0) goto L_0x0051
            r2 = 0
        L_0x0016:
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r0 = X.C25440Cfn.A00()
            if (r0 != 0) goto L_0x0048
            r1 = 0
        L_0x001f:
            r7 = 0
            if (r3 == 0) goto L_0x002f
            boolean r0 = X.C25440Cfn.A00()
            if (r0 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x003a
            X.Bht r7 = new X.Bht
            r7.<init>(r3)
        L_0x002f:
            A00 = r7
            java.lang.String r9 = "copyMemory"
            java.lang.String r8 = "getLong"
            sun.misc.Unsafe r0 = A02
            if (r0 == 0) goto L_0x00ca
            goto L_0x005a
        L_0x003a:
            if (r1 == 0) goto L_0x002f
            X.Bhs r7 = new X.Bhs
            r7.<init>(r3)
            goto L_0x002f
        L_0x0042:
            X.Bhu r7 = new X.Bhu
            r7.<init>(r3)
            goto L_0x002f
        L_0x0048:
            java.lang.Class r0 = A01     // Catch:{ all -> 0x004f }
            boolean r1 = X.BEB.A1Z(r0, r6)     // Catch:{ all -> 0x004f }
            goto L_0x001f
        L_0x004f:
            r1 = 0
            goto L_0x001f
        L_0x0051:
            java.lang.Class r0 = A01     // Catch:{ all -> 0x0058 }
            boolean r2 = X.BEB.A1Z(r0, r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0016
        L_0x0058:
            r2 = 0
            goto L_0x0016
        L_0x005a:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "objectFieldOffset"
            r11 = 1
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ all -> 0x00cc }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r5] = r0     // Catch:{ all -> 0x00cc }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00cc }
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00cc }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r1[r5] = r12     // Catch:{ all -> 0x00cc }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00cc }
            r1[r11] = r0     // Catch:{ all -> 0x00cc }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00cc }
            java.lang.reflect.Field r0 = A04()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00ca
            boolean r0 = X.C25440Cfn.A00()     // Catch:{ all -> 0x00cc }
            if (r0 != 0) goto L_0x00c8
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00cc }
            java.lang.Class r0 = X.BE7.A0U(r4, r1, r0, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00cc }
            r1[r5] = r0     // Catch:{ all -> 0x00cc }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00cc }
            r1[r11] = r0     // Catch:{ all -> 0x00cc }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00cc }
            X.BEB.A15(r4)     // Catch:{ all -> 0x00cc }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00cc }
            java.lang.Class r3 = X.BE7.A0U(r4, r8, r0, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ all -> 0x00cc }
            r0[r5] = r3     // Catch:{ all -> 0x00cc }
            r0[r11] = r3     // Catch:{ all -> 0x00cc }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00cc }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00cc }
            r0[r5] = r3     // Catch:{ all -> 0x00cc }
            r0[r11] = r3     // Catch:{ all -> 0x00cc }
            r0[r10] = r3     // Catch:{ all -> 0x00cc }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00cc }
            r0 = 5
            java.lang.Class[] r1 = X.BE6.A1Y(r3, r0)     // Catch:{ all -> 0x00cc }
            r1[r10] = r12     // Catch:{ all -> 0x00cc }
            r1[r2] = r3     // Catch:{ all -> 0x00cc }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00cc }
            r4.getMethod(r9, r1)     // Catch:{ all -> 0x00cc }
        L_0x00c8:
            r0 = 1
            goto L_0x00f1
        L_0x00ca:
            r0 = 0
            goto L_0x00f1
        L_0x00cc:
            r1 = move-exception
            java.lang.Class<X.CwW> r0 = X.C26277CwW.class
            java.util.logging.Logger r4 = X.BE7.A0w(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
        L_0x00f1:
            A04 = r0
            sun.misc.Unsafe r0 = A02
            if (r0 != 0) goto L_0x014b
            r0 = 0
        L_0x00f8:
            A05 = r0
            int r0 = A01(r13)
            long r0 = (long) r0
            A06 = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            A01(r0)
            A06(r0)
            java.lang.Class<int[]> r0 = int[].class
            A01(r0)
            A06(r0)
            java.lang.Class<long[]> r0 = long[].class
            A01(r0)
            A06(r0)
            java.lang.Class<float[]> r0 = float[].class
            A01(r0)
            A06(r0)
            java.lang.Class<double[]> r0 = double[].class
            A01(r0)
            A06(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A01(r0)
            A06(r0)
            java.lang.reflect.Field r1 = A04()
            if (r1 == 0) goto L_0x013e
            if (r7 == 0) goto L_0x013e
            sun.misc.Unsafe r0 = r7.A00
            r0.objectFieldOffset(r1)
        L_0x013e:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            A03 = r0
            return
        L_0x014b:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x01f4 }
            r10 = 1
            X.BEB.A14(r4)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f4 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r0[r5] = r2     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = X.BE7.A0U(r4, r1, r0, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putInt"
            r9 = 3
            java.lang.Class[] r0 = X.BE6.A1Y(r0, r9)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r6     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f4 }
            r0[r5] = r2     // Catch:{ all -> 0x01f4 }
            java.lang.Class r5 = X.BE7.A0U(r4, r8, r0, r10)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r5     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            r0[r3] = r2     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            boolean r0 = X.C25440Cfn.A00()     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x01f1
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f4 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01f4 }
            r1[r3] = r0     // Catch:{ all -> 0x01f4 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f4 }
        L_0x01f1:
            r0 = 1
            goto L_0x00f8
        L_0x01f4:
            r1 = move-exception
            java.lang.Class<X.CwW> r0 = X.C26277CwW.class
            java.util.logging.Logger r4 = X.BE7.A0w(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26277CwW.<clinit>():void");
    }

    public static Field A04() {
        Field field;
        Field field2;
        if (C25440Cfn.A00()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }
}
