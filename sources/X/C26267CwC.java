package X;

import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.CwC  reason: case insensitive filesystem */
public final class C26267CwC {
    public static final long A00;
    public static final long A01;
    public static final C25855CnI A02;
    public static final Class A03;
    public static final Logger A04 = BE7.A0w(C26267CwC.class);
    public static final Unsafe A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08 = AnonymousClass000.A1Z(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    public static int A00(Class cls) {
        if (A06) {
            return A02.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A01(Object obj, long j) {
        return A02.A00.getObject(obj, j);
    }

    public static void A04(Class cls) {
        if (A06) {
            A02.A00.arrayIndexScale(cls);
        }
    }

    public static void A05(Object obj, long j, Object obj2) {
        A02.A00.putObject(obj, j, obj2);
    }

    public static void A06(byte[] bArr, long j, byte b) {
        A02.A08(bArr, A00 + j, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014d A[SYNTHETIC, Splitter:B:52:0x014d] */
    static {
        /*
            java.lang.Class<X.CwC> r0 = X.C26267CwC.class
            java.util.logging.Logger r0 = X.BE7.A0w(r0)
            A04 = r0
            sun.misc.Unsafe r4 = A03()
            A05 = r4
            java.lang.Class r6 = X.CH6.A00
            A03 = r6
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            if (r6 == 0) goto L_0x0023
            boolean r0 = X.CH6.A01
            if (r0 != 0) goto L_0x0023
            boolean r3 = X.BEB.A1Z(r6, r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r6 == 0) goto L_0x0035
            boolean r0 = X.CH6.A01
            if (r0 != 0) goto L_0x0035
            java.lang.Class r0 = A03     // Catch:{ all -> 0x0033 }
            boolean r2 = X.BEB.A1Z(r0, r5)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r2 = 0
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r1 = 0
            if (r4 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x005a
            boolean r0 = X.CH6.A01
            if (r0 != 0) goto L_0x005a
            if (r3 == 0) goto L_0x0052
            X.Bf5 r1 = new X.Bf5
            r1.<init>(r4)
        L_0x0046:
            A02 = r1
            java.lang.String r9 = "copyMemory"
            java.lang.String r8 = "getLong"
            sun.misc.Unsafe r0 = A05
            r7 = 0
            if (r0 == 0) goto L_0x00d1
            goto L_0x0060
        L_0x0052:
            if (r2 == 0) goto L_0x0046
            X.Bf4 r1 = new X.Bf4
            r1.<init>(r4)
            goto L_0x0046
        L_0x005a:
            X.Bf6 r1 = new X.Bf6
            r1.<init>(r4)
            goto L_0x0046
        L_0x0060:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "objectFieldOffset"
            r11 = 1
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r7] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00d3 }
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r1[r7] = r12     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d3 }
            r1[r11] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.reflect.Field r0 = A02()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00d1
            if (r6 == 0) goto L_0x008b
            boolean r0 = X.CH6.A01     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x008b
            goto L_0x00cf
        L_0x008b:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = X.BE7.A0U(r4, r1, r0, r7)     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            r1[r7] = r0     // Catch:{ all -> 0x00d3 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00d3 }
            r1[r11] = r0     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00d3 }
            X.BEB.A15(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x00d3 }
            java.lang.Class r3 = X.BE7.A0U(r4, r8, r0, r7)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            r0[r7] = r3     // Catch:{ all -> 0x00d3 }
            r0[r11] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00d3 }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00d3 }
            r0[r7] = r3     // Catch:{ all -> 0x00d3 }
            r0[r11] = r3     // Catch:{ all -> 0x00d3 }
            r0[r10] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r9, r0)     // Catch:{ all -> 0x00d3 }
            r0 = 5
            java.lang.Class[] r1 = X.BE6.A1Y(r3, r0)     // Catch:{ all -> 0x00d3 }
            r1[r10] = r12     // Catch:{ all -> 0x00d3 }
            r1[r2] = r3     // Catch:{ all -> 0x00d3 }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00d3 }
            r4.getMethod(r9, r1)     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            r0 = 1
            goto L_0x00f4
        L_0x00d1:
            r0 = 0
            goto L_0x00f4
        L_0x00d3:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
        L_0x00f4:
            A07 = r0
            sun.misc.Unsafe r0 = A05
            if (r0 != 0) goto L_0x014d
            r0 = 0
        L_0x00fb:
            A06 = r0
            int r0 = A00(r13)
            long r0 = (long) r0
            A00 = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            A00(r0)
            A04(r0)
            java.lang.Class<int[]> r0 = int[].class
            A00(r0)
            A04(r0)
            java.lang.Class<long[]> r0 = long[].class
            A00(r0)
            A04(r0)
            java.lang.Class<float[]> r0 = float[].class
            A00(r0)
            A04(r0)
            java.lang.Class<double[]> r0 = double[].class
            A00(r0)
            A04(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A00(r0)
            A04(r0)
            java.lang.reflect.Field r1 = A02()
            if (r1 == 0) goto L_0x014a
            X.CnI r0 = A02
            if (r0 == 0) goto L_0x014a
            long r0 = r0.A06(r1)
        L_0x0142:
            A01 = r0
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "value"
            goto L_0x021a
        L_0x014a:
            r0 = -1
            goto L_0x0142
        L_0x014d:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x01f7 }
            r10 = 1
            X.BEB.A14(r4)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f7 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r0[r7] = r2     // Catch:{ all -> 0x01f7 }
            java.lang.Class r0 = X.BE7.A0U(r4, r1, r0, r10)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "putInt"
            r9 = 3
            java.lang.Class[] r0 = X.BE6.A1Y(r0, r9)     // Catch:{ all -> 0x01f7 }
            r0[r3] = r5     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01f7 }
            r0[r7] = r2     // Catch:{ all -> 0x01f7 }
            java.lang.Class r5 = X.BE7.A0U(r4, r8, r0, r10)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            r0[r3] = r5     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            r0[r3] = r2     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            if (r6 == 0) goto L_0x019c
            boolean r0 = X.CH6.A01     // Catch:{ all -> 0x01f7 }
            if (r0 != 0) goto L_0x019c
            goto L_0x01f4
        L_0x019c:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01f7 }
            r1[r3] = r0     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01f7 }
            r1[r3] = r0     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01f7 }
            r1[r3] = r0     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f7 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.BE6.A1Y(r5, r3)     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.BE6.A1Y(r5, r9)     // Catch:{ all -> 0x01f7 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01f7 }
            r1[r3] = r0     // Catch:{ all -> 0x01f7 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x01f7 }
        L_0x01f4:
            r0 = 1
            goto L_0x00fb
        L_0x01f7:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00fb
        L_0x021a:
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0231 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0231 }
            java.lang.Class r1 = r2.getType()
            java.lang.Class<char[]> r0 = char[].class
            if (r1 != r0) goto L_0x0231
            X.CnI r0 = A02
            if (r0 == 0) goto L_0x0231
            r0.A06(r2)
        L_0x0231:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26267CwC.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.CH6.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.CH6.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.CH6.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x001d
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0019 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            return r2
        L_0x001d:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0036
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0036
            return r2
        L_0x0036:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26267CwC.A02():java.lang.reflect.Field");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }
}
