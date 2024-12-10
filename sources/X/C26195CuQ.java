package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.CuQ  reason: case insensitive filesystem */
public class C26195CuQ {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static C26195CuQ A01(ByteOrder byteOrder, int[] iArr) {
        int i = C26303CxM.A0k[3];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r5)]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C26195CuQ(-1, wrap.array(), 3, r5);
    }

    public static C26195CuQ A02(ByteOrder byteOrder, long[] jArr) {
        int i = C26303CxM.A0k[4];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r6)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C26195CuQ(-1, wrap.array(), 4, r6);
    }

    public static C26195CuQ A03(ByteOrder byteOrder, CVY[] cvyArr) {
        int i = C26303CxM.A0k[5];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r7)]);
        wrap.order(byteOrder);
        for (CVY cvy : cvyArr) {
            wrap.putInt((int) cvy.A01);
            wrap.putInt((int) cvy.A00);
        }
        return new C26195CuQ(-1, wrap.array(), 5, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0129, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x012b, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x012e, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0151, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0152, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0153, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0156, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0162 A[SYNTHETIC, Splitter:B:130:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0171 A[SYNTHETIC, Splitter:B:140:0x0171] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            java.lang.String r5 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r13 = 0
            byte[] r8 = r14.A03     // Catch:{ IOException -> 0x0159, all -> 0x016e }
            X.Bxc r6 = new X.Bxc     // Catch:{ IOException -> 0x0159, all -> 0x016e }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0159, all -> 0x016e }
            r6.A01 = r15     // Catch:{ IOException -> 0x0157 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0157 }
            r7 = 0
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x004b;
                case 3: goto L_0x0087;
                case 4: goto L_0x009f;
                case 5: goto L_0x00bb;
                case 6: goto L_0x001d;
                case 7: goto L_0x004b;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00f4;
                case 10: goto L_0x010c;
                case 11: goto L_0x012f;
                case 12: goto L_0x013f;
                default: goto L_0x0014;
            }     // Catch:{ IOException -> 0x0157 }
        L_0x0014:
            r6.close()     // Catch:{ IOException -> 0x0018 }
            return r13
        L_0x0018:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r13
        L_0x001d:
            int r0 = r8.length     // Catch:{ IOException -> 0x0157 }
            r1 = 1
            if (r0 != r1) goto L_0x003c
            byte r0 = r8[r7]     // Catch:{ IOException -> 0x0157 }
            if (r0 < 0) goto L_0x003c
            if (r0 > r1) goto L_0x003c
            char[] r2 = new char[r1]     // Catch:{ IOException -> 0x0157 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0157 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0157 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0157 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0157 }
            r6.close()     // Catch:{ IOException -> 0x0037 }
            return r1
        L_0x0037:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x003c:
            java.nio.charset.Charset r0 = X.C26303CxM.A0L     // Catch:{ IOException -> 0x0157 }
            java.lang.String r1 = X.BE6.A0q(r0, r8)     // Catch:{ IOException -> 0x0157 }
            r6.close()     // Catch:{ IOException -> 0x0046 }
            return r1
        L_0x0046:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x004b:
            int r9 = r14.A01     // Catch:{ IOException -> 0x0157 }
            byte[] r10 = X.C26303CxM.A0N     // Catch:{ IOException -> 0x0157 }
            r0 = 8
            r3 = 8
            if (r9 < r0) goto L_0x0063
            r2 = 0
        L_0x0056:
            if (r2 >= r3) goto L_0x0061
            byte r1 = r8[r2]     // Catch:{ IOException -> 0x0157 }
            byte r0 = r10[r2]     // Catch:{ IOException -> 0x0157 }
            if (r1 != r0) goto L_0x0063
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0061:
            r7 = 8
        L_0x0063:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0157 }
        L_0x0067:
            if (r7 >= r9) goto L_0x007a
            byte r2 = r8[r7]     // Catch:{ IOException -> 0x0157 }
            if (r2 == 0) goto L_0x007a
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0074
            char r0 = (char) r2     // Catch:{ IOException -> 0x0157 }
        L_0x0074:
            r3.append(r0)     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x0067
        L_0x007a:
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0157 }
            r6.close()     // Catch:{ IOException -> 0x0082 }
            return r1
        L_0x0082:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0087:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0157 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0157 }
        L_0x008b:
            if (r7 >= r2) goto L_0x0096
            int r0 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0157 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x008b
        L_0x0096:
            r6.close()     // Catch:{ IOException -> 0x009a }
            return r1
        L_0x009a:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x009f:
            int r3 = r14.A01     // Catch:{ IOException -> 0x0157 }
            long[] r2 = new long[r3]     // Catch:{ IOException -> 0x0157 }
        L_0x00a3:
            if (r7 >= r3) goto L_0x00b2
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            long r0 = X.BE7.A0C(r0)     // Catch:{ IOException -> 0x0157 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x00a3
        L_0x00b2:
            r6.close()     // Catch:{ IOException -> 0x00b6 }
            return r2
        L_0x00b6:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r2
        L_0x00bb:
            int r12 = r14.A01     // Catch:{ IOException -> 0x0157 }
            X.CVY[] r9 = new X.CVY[r12]     // Catch:{ IOException -> 0x0157 }
        L_0x00bf:
            if (r7 >= r12) goto L_0x0126
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0157 }
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r10
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0157 }
            long r0 = r0 & r10
            X.CVY r8 = new X.CVY     // Catch:{ IOException -> 0x0157 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0157 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x00bf
        L_0x00dc:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0157 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0157 }
        L_0x00e0:
            if (r7 >= r2) goto L_0x00eb
            short r0 = r6.readShort()     // Catch:{ IOException -> 0x0157 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x00e0
        L_0x00eb:
            r6.close()     // Catch:{ IOException -> 0x00ef }
            return r1
        L_0x00ef:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00f4:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0157 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0157 }
        L_0x00f8:
            if (r7 >= r2) goto L_0x0103
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x00f8
        L_0x0103:
            r6.close()     // Catch:{ IOException -> 0x0107 }
            return r1
        L_0x0107:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x010c:
            int r10 = r14.A01     // Catch:{ IOException -> 0x0157 }
            X.CVY[] r9 = new X.CVY[r10]     // Catch:{ IOException -> 0x0157 }
        L_0x0110:
            if (r7 >= r10) goto L_0x0126
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0157 }
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0157 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0157 }
            X.CVY r8 = new X.CVY     // Catch:{ IOException -> 0x0157 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0157 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x0110
        L_0x0126:
            r6.close()     // Catch:{ IOException -> 0x012a }
            return r9
        L_0x012a:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r9
        L_0x012f:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0157 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0157 }
        L_0x0133:
            if (r7 >= r2) goto L_0x014e
            float r0 = r6.readFloat()     // Catch:{ IOException -> 0x0157 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0157 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x0133
        L_0x013f:
            int r2 = r14.A01     // Catch:{ IOException -> 0x0157 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0157 }
        L_0x0143:
            if (r7 >= r2) goto L_0x014e
            double r0 = r6.readDouble()     // Catch:{ IOException -> 0x0157 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0157 }
            int r7 = r7 + 1
            goto L_0x0143
        L_0x014e:
            r6.close()     // Catch:{ IOException -> 0x0152 }
            return r3
        L_0x0152:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r3
        L_0x0157:
            r1 = move-exception
            goto L_0x015b
        L_0x0159:
            r1 = move-exception
            r6 = r13
        L_0x015b:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x016b }
            if (r6 == 0) goto L_0x016a
            r6.close()     // Catch:{ IOException -> 0x0166 }
            return r13
        L_0x0166:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x016a:
            return r13
        L_0x016b:
            r1 = move-exception
            r13 = r6
            goto L_0x016f
        L_0x016e:
            r1 = move-exception
        L_0x016f:
            if (r13 == 0) goto L_0x0179
            r13.close()     // Catch:{ IOException -> 0x0175 }
            throw r1
        L_0x0175:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0179:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26195CuQ.A04(java.nio.ByteOrder):java.lang.Object");
    }

    public C26195CuQ(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public static C26195CuQ A00(String str) {
        byte[] bytes = C17890vO.A0c(AnonymousClass000.A11(str), 0).getBytes(C26303CxM.A0L);
        return new C26195CuQ(-1, bytes, 2, bytes.length);
    }

    public String A05(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 != null) {
            if (A04 instanceof String) {
                return (String) A04;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            int i = 0;
            if (!(A04 instanceof long[])) {
                if (!(A04 instanceof int[])) {
                    if (!(A04 instanceof double[])) {
                        if (A04 instanceof CVY[]) {
                            CVY[] cvyArr = (CVY[]) A04;
                            while (true) {
                                int length = cvyArr.length;
                                if (i >= length) {
                                    break;
                                }
                                CVY cvy = cvyArr[i];
                                A10.append(cvy.A01);
                                A10.append('/');
                                A10.append(cvy.A00);
                                if (i + 1 != length) {
                                    A10.append(",");
                                }
                                i++;
                            }
                        }
                    } else {
                        double[] dArr = (double[]) A04;
                        while (true) {
                            int length2 = dArr.length;
                            if (i >= length2) {
                                break;
                            }
                            A10.append(dArr[i]);
                            if (i + 1 != length2) {
                                A10.append(",");
                            }
                            i++;
                        }
                    }
                } else {
                    int[] iArr = (int[]) A04;
                    while (true) {
                        int length3 = iArr.length;
                        if (i >= length3) {
                            break;
                        }
                        A10.append(iArr[i]);
                        if (i + 1 != length3) {
                            A10.append(",");
                        }
                        i++;
                    }
                }
            } else {
                long[] jArr = (long[]) A04;
                while (true) {
                    int length4 = jArr.length;
                    if (i >= length4) {
                        break;
                    }
                    A10.append(jArr[i]);
                    if (i + 1 != length4) {
                        A10.append(",");
                    }
                    i++;
                }
            }
            return A10.toString();
        }
        return null;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("(");
        A10.append(C26303CxM.A0l[this.A00]);
        A10.append(", data length:");
        A10.append(this.A03.length);
        return AnonymousClass8BU.A0q(A10);
    }
}
