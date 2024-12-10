package X;

import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: X.Cwy  reason: case insensitive filesystem */
public final class C26291Cwy {
    public static final C25245Cbi A00;
    public static final Class A01;
    public static final boolean A02;
    public static final boolean A03;
    public static final Unsafe A04;

    public static int A00(Object obj, long j) {
        return A00.A00.getInt(obj, j);
    }

    public static long A01(Object obj, long j) {
        return A00.A00.getLong(obj, j);
    }

    public static Object A02(Object obj, long j) {
        return A00.A00.getObject(obj, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Class cls) {
        try {
            A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void A05(Class cls) {
        if (A03) {
            A00.A00.arrayBaseOffset(cls);
        }
    }

    public static void A06(Class cls) {
        if (A03) {
            A00.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, int i) {
        A00.A00.putInt(obj, j, i);
    }

    public static void A08(Object obj, long j, long j2) {
        A00.A00.putLong(obj, j, j2);
    }

    public static void A09(Object obj, long j, Object obj2) {
        A00.A00.putObject(obj, j, obj2);
    }

    public static /* synthetic */ void A0A(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        int i2 = (z ? 1 : 0) << i;
        unsafe.putInt(obj, j2, i2 | (((255 << i) ^ -1) & unsafe.getInt(obj, j2)));
    }

    public static /* synthetic */ void A0B(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (z ? 1 : 0) << i;
        unsafe.putInt(obj, j2, i2 | (((255 << i) ^ -1) & unsafe.getInt(obj, j2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r1.getDeclaredField("effectiveDirectAddress") == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r2 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r2.getType() == java.lang.Long.TYPE) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fc, code lost:
        r0 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r0 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        r0.A00.objectFieldOffset(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    static {
        /*
            sun.misc.Unsafe r3 = A03()
            A04 = r3
            java.lang.Class<libcore.io.Memory> r1 = libcore.io.Memory.class
            A01 = r1
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r8 = byte[].class
            r7 = 0
            boolean r2 = X.BEB.A1Z(r1, r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = X.BEB.A1Z(r1, r0)     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r0 = 0
            if (r3 == 0) goto L_0x0027
            if (r2 == 0) goto L_0x0034
            X.BeR r0 = new X.BeR
            r0.<init>(r3)
        L_0x0027:
            A00 = r0
            java.lang.String r6 = "getLong"
            java.lang.String r4 = "objectFieldOffset"
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0080
            sun.misc.Unsafe r0 = r0.A00
            goto L_0x003c
        L_0x0034:
            if (r1 == 0) goto L_0x0027
            X.BeQ r0 = new X.BeQ
            r0.<init>(r3)
            goto L_0x0027
        L_0x003c:
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x0066 }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0066 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r7] = r0     // Catch:{ all -> 0x0066 }
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x0066 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0066 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1[r7] = r0     // Catch:{ all -> 0x0066 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0066 }
            r1[r5] = r0     // Catch:{ all -> 0x0066 }
            r2.getMethod(r6, r1)     // Catch:{ all -> 0x0066 }
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0080
        L_0x0060:
            java.lang.String r0 = "address"
            r1.getDeclaredField(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0080
        L_0x0066:
            r1 = move-exception
            java.lang.Class<X.Cwy> r0 = X.C26291Cwy.class
            java.util.logging.Logger r4 = X.BE7.A0w(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x0080:
            X.Cbi r0 = A00
            if (r0 == 0) goto L_0x00ac
            sun.misc.Unsafe r0 = r0.A00
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0092 }
            X.BEB.A14(r0)     // Catch:{ all -> 0x0092 }
            X.BEB.A16(r0)     // Catch:{ all -> 0x0092 }
            r0 = 1
            goto L_0x00ad
        L_0x0092:
            r1 = move-exception
            java.lang.Class<X.Cwy> r0 = X.C26291Cwy.class
            java.util.logging.Logger r4 = X.BE7.A0w(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            A03 = r0
            A05(r8)
            java.lang.Class<boolean[]> r0 = boolean[].class
            A05(r0)
            A06(r0)
            java.lang.Class<int[]> r0 = int[].class
            A05(r0)
            A06(r0)
            java.lang.Class<long[]> r0 = long[].class
            A05(r0)
            A06(r0)
            java.lang.Class<float[]> r0 = float[].class
            A05(r0)
            A06(r0)
            java.lang.Class<double[]> r0 = double[].class
            A05(r0)
            A06(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A05(r0)
            A06(r0)
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x00ec }
            if (r2 != 0) goto L_0x00fc
        L_0x00ec:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0105 }
            if (r2 == 0) goto L_0x0105
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0105
        L_0x00fc:
            X.Cbi r0 = A00
            if (r0 == 0) goto L_0x0105
            sun.misc.Unsafe r0 = r0.A00
            r0.objectFieldOffset(r2)
        L_0x0105:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x010e
            r5 = 0
        L_0x010e:
            A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26291Cwy.<clinit>():void");
    }
}
