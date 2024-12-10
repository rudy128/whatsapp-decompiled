package X;

import android.util.Log;
import java.nio.ByteOrder;

/* renamed from: X.CqM  reason: case insensitive filesystem */
public class C26005CqM {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x012e, code lost:
        A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0131, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0081, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0082, code lost:
        android.util.Log.e("ExifReader", "IOException occurred while closing InputStream", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0089, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012c, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x020d A[SYNTHETIC, Splitter:B:143:0x020d] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x021f A[SYNTHETIC, Splitter:B:153:0x021f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C26005CqM r23, java.nio.ByteOrder r24) {
        /*
            java.lang.String r22 = "IOException occurred while closing InputStream"
            r21 = 0
            r1 = r23
            byte[] r6 = r1.A02     // Catch:{ IOException -> 0x01ff, all -> 0x021c }
            java.io.ByteArrayInputStream r0 = X.BE6.A0h(r6)     // Catch:{ IOException -> 0x01ff, all -> 0x021c }
            X.DRH r5 = new X.DRH     // Catch:{ IOException -> 0x01ff, all -> 0x021c }
            r5.<init>(r0)     // Catch:{ IOException -> 0x01ff, all -> 0x021c }
            r0 = r24
            r5.A02 = r0     // Catch:{ IOException -> 0x01fd }
            int r0 = r1.A00     // Catch:{ IOException -> 0x01fd }
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0024;
                case 2: goto L_0x004a;
                case 3: goto L_0x008a;
                case 4: goto L_0x00a2;
                case 5: goto L_0x00be;
                case 6: goto L_0x0024;
                case 7: goto L_0x004a;
                case 8: goto L_0x00df;
                case 9: goto L_0x00f7;
                case 10: goto L_0x010f;
                case 11: goto L_0x0132;
                case 12: goto L_0x014f;
                default: goto L_0x001b;
            }     // Catch:{ IOException -> 0x01fd }
        L_0x001b:
            r5.close()     // Catch:{ IOException -> 0x001f }
            return r21
        L_0x001f:
            r0 = move-exception
            A01(r0)
            return r21
        L_0x0024:
            int r0 = r6.length     // Catch:{ IOException -> 0x01fd }
            r1 = 1
            if (r0 != r1) goto L_0x0043
            byte r0 = r6[r4]     // Catch:{ IOException -> 0x01fd }
            if (r0 < 0) goto L_0x0043
            if (r0 > r1) goto L_0x0043
            char[] r1 = new char[r1]     // Catch:{ IOException -> 0x01fd }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x01fd }
            r1[r4] = r0     // Catch:{ IOException -> 0x01fd }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x01fd }
            r3.<init>(r1)     // Catch:{ IOException -> 0x01fd }
            r5.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r2 = move-exception
            boolean r0 = X.C26120Csi.A05
            goto L_0x0082
        L_0x0042:
            return r3
        L_0x0043:
            java.nio.charset.Charset r0 = X.C26120Csi.A04     // Catch:{ IOException -> 0x01fd }
            java.lang.String r3 = X.BE6.A0q(r0, r6)     // Catch:{ IOException -> 0x01fd }
            goto L_0x007d
        L_0x004a:
            int r8 = r1.A01     // Catch:{ IOException -> 0x01fd }
            byte[] r7 = X.C26120Csi.A06     // Catch:{ IOException -> 0x01fd }
            r0 = 8
            r3 = 8
            if (r8 < r0) goto L_0x0062
            r2 = 0
        L_0x0055:
            if (r2 >= r3) goto L_0x0060
            byte r1 = r6[r2]     // Catch:{ IOException -> 0x01fd }
            byte r0 = r7[r2]     // Catch:{ IOException -> 0x01fd }
            if (r1 != r0) goto L_0x0062
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0060:
            r4 = 8
        L_0x0062:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01fd }
        L_0x0066:
            if (r4 >= r8) goto L_0x0079
            byte r2 = r6[r4]     // Catch:{ IOException -> 0x01fd }
            if (r2 == 0) goto L_0x0079
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0073
            char r0 = (char) r2     // Catch:{ IOException -> 0x01fd }
        L_0x0073:
            r3.append(r0)     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x0066
        L_0x0079:
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x01fd }
        L_0x007d:
            r5.close()     // Catch:{ IOException -> 0x0081 }
            return r3
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            java.lang.String r1 = "ExifReader"
            r0 = r22
            android.util.Log.e(r1, r0, r2)
            return r3
        L_0x008a:
            int r1 = r1.A01     // Catch:{ IOException -> 0x01fd }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x01fd }
        L_0x008e:
            if (r4 >= r1) goto L_0x0099
            int r0 = r5.A02()     // Catch:{ IOException -> 0x01fd }
            r2[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x008e
        L_0x0099:
            r5.close()     // Catch:{ IOException -> 0x009d }
            return r2
        L_0x009d:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x00a2:
            int r3 = r1.A01     // Catch:{ IOException -> 0x01fd }
            long[] r2 = new long[r3]     // Catch:{ IOException -> 0x01fd }
        L_0x00a6:
            if (r4 >= r3) goto L_0x00b5
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            long r0 = X.BE7.A0C(r0)     // Catch:{ IOException -> 0x01fd }
            r2[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00b5:
            r5.close()     // Catch:{ IOException -> 0x00b9 }
            return r2
        L_0x00b9:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x00be:
            int r3 = r1.A01     // Catch:{ IOException -> 0x01fd }
            X.CVj[] r10 = new X.C25055CVj[r3]     // Catch:{ IOException -> 0x01fd }
        L_0x00c2:
            if (r4 >= r3) goto L_0x0129
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            long r6 = (long) r0     // Catch:{ IOException -> 0x01fd }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            long r1 = (long) r0     // Catch:{ IOException -> 0x01fd }
            long r1 = r1 & r8
            X.CVj r0 = new X.CVj     // Catch:{ IOException -> 0x01fd }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x01fd }
            r10[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x00c2
        L_0x00df:
            int r1 = r1.A01     // Catch:{ IOException -> 0x01fd }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x01fd }
        L_0x00e3:
            if (r4 >= r1) goto L_0x00ee
            short r0 = r5.A04()     // Catch:{ IOException -> 0x01fd }
            r2[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x00e3
        L_0x00ee:
            r5.close()     // Catch:{ IOException -> 0x00f2 }
            return r2
        L_0x00f2:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x00f7:
            int r1 = r1.A01     // Catch:{ IOException -> 0x01fd }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x01fd }
        L_0x00fb:
            if (r4 >= r1) goto L_0x0106
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            r2[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x00fb
        L_0x0106:
            r5.close()     // Catch:{ IOException -> 0x010a }
            return r2
        L_0x010a:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x010f:
            int r7 = r1.A01     // Catch:{ IOException -> 0x01fd }
            X.CVj[] r10 = new X.C25055CVj[r7]     // Catch:{ IOException -> 0x01fd }
        L_0x0113:
            if (r4 >= r7) goto L_0x0129
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            long r2 = (long) r0     // Catch:{ IOException -> 0x01fd }
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            long r0 = (long) r0     // Catch:{ IOException -> 0x01fd }
            X.CVj r6 = new X.CVj     // Catch:{ IOException -> 0x01fd }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x01fd }
            r10[r4] = r6     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x0113
        L_0x0129:
            r5.close()     // Catch:{ IOException -> 0x012d }
            return r10
        L_0x012d:
            r0 = move-exception
            A01(r0)
            return r10
        L_0x0132:
            int r3 = r1.A01     // Catch:{ IOException -> 0x01fd }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x01fd }
        L_0x0136:
            if (r4 >= r3) goto L_0x0146
            int r0 = r5.A01()     // Catch:{ IOException -> 0x01fd }
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch:{ IOException -> 0x01fd }
            double r0 = (double) r0     // Catch:{ IOException -> 0x01fd }
            r2[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x0136
        L_0x0146:
            r5.close()     // Catch:{ IOException -> 0x014a }
            return r2
        L_0x014a:
            r0 = move-exception
            A01(r0)
            return r2
        L_0x014f:
            int r15 = r1.A01     // Catch:{ IOException -> 0x01fd }
            double[] r14 = new double[r15]     // Catch:{ IOException -> 0x01fd }
        L_0x0153:
            if (r4 >= r15) goto L_0x01f4
            int r0 = r5.A00     // Catch:{ IOException -> 0x01fd }
            int r1 = r0 + 8
            r5.A00 = r1     // Catch:{ IOException -> 0x01fd }
            int r0 = r5.A03     // Catch:{ IOException -> 0x01fd }
            if (r1 > r0) goto L_0x01ea
            java.io.DataInputStream r0 = r5.A01     // Catch:{ IOException -> 0x01fd }
            int r11 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r10 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r13 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r12 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r7 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r6 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r9 = r0.read()     // Catch:{ IOException -> 0x01fd }
            int r8 = r0.read()     // Catch:{ IOException -> 0x01fd }
            r0 = r11 | r10
            r0 = r0 | r13
            r0 = r0 | r12
            r0 = r0 | r7
            r0 = r0 | r6
            r0 = r0 | r9
            r0 = r0 | r8
            if (r0 < 0) goto L_0x01ef
            java.nio.ByteOrder r2 = r5.A02     // Catch:{ IOException -> 0x01fd }
            java.nio.ByteOrder r0 = X.DRH.A05     // Catch:{ IOException -> 0x01fd }
            r20 = 16
            r19 = 24
            r18 = 32
            r17 = 40
            r16 = 48
            r1 = 56
            if (r2 != r0) goto L_0x01ba
            long r2 = (long) r8     // Catch:{ IOException -> 0x01fd }
            long r2 = r2 << r1
            long r0 = (long) r9     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x01fd }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x01fd }
            goto L_0x01da
        L_0x01ba:
            java.nio.ByteOrder r0 = X.DRH.A04     // Catch:{ IOException -> 0x01fd }
            if (r2 != r0) goto L_0x01e5
            long r2 = (long) r11     // Catch:{ IOException -> 0x01fd }
            long r2 = r2 << r1
            long r0 = (long) r10     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x01fd }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x01fd }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r8     // Catch:{ IOException -> 0x01fd }
        L_0x01da:
            long r2 = r2 + r0
            double r0 = java.lang.Double.longBitsToDouble(r2)     // Catch:{ IOException -> 0x01fd }
            r14[r4] = r0     // Catch:{ IOException -> 0x01fd }
            int r4 = r4 + 1
            goto L_0x0153
        L_0x01e5:
            java.io.IOException r0 = X.BEB.A0R(r2)     // Catch:{ IOException -> 0x01fd }
            goto L_0x01f3
        L_0x01ea:
            java.io.EOFException r0 = X.BE6.A0i()     // Catch:{ IOException -> 0x01fd }
            goto L_0x01f3
        L_0x01ef:
            java.io.EOFException r0 = X.BE6.A0i()     // Catch:{ IOException -> 0x01fd }
        L_0x01f3:
            throw r0     // Catch:{ IOException -> 0x01fd }
        L_0x01f4:
            r5.close()     // Catch:{ IOException -> 0x01f8 }
            return r14
        L_0x01f8:
            r0 = move-exception
            A01(r0)
            return r14
        L_0x01fd:
            r1 = move-exception
            goto L_0x0202
        L_0x01ff:
            r1 = move-exception
            r5 = r21
        L_0x0202:
            boolean r0 = X.C26120Csi.A05     // Catch:{ all -> 0x0218 }
            java.lang.String r2 = "ExifReader"
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r2, r0, r1)     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x0217
            r5.close()     // Catch:{ IOException -> 0x0211 }
            return r21
        L_0x0211:
            r1 = move-exception
            r0 = r22
            android.util.Log.e(r2, r0, r1)
        L_0x0217:
            return r21
        L_0x0218:
            r1 = move-exception
            r21 = r5
            goto L_0x021d
        L_0x021c:
            r1 = move-exception
        L_0x021d:
            if (r21 == 0) goto L_0x0227
            r21.close()     // Catch:{ IOException -> 0x0223 }
            throw r1
        L_0x0223:
            r0 = move-exception
            A01(r0)
        L_0x0227:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26005CqM.A00(X.CqM, java.nio.ByteOrder):java.lang.Object");
    }

    public static void A01(Throwable th) {
        boolean z = C26120Csi.A05;
        Log.e("ExifReader", "IOException occurred while closing InputStream", th);
    }

    public C26005CqM(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public String A02(ByteOrder byteOrder) {
        Object A002 = A00(this, byteOrder);
        if (A002 != null) {
            if (A002 instanceof String) {
                return (String) A002;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            int i = 0;
            if (!(A002 instanceof long[])) {
                if (!(A002 instanceof int[])) {
                    if (!(A002 instanceof double[])) {
                        if (A002 instanceof C25055CVj[]) {
                            C25055CVj[] cVjArr = (C25055CVj[]) A002;
                            while (true) {
                                int length = cVjArr.length;
                                if (i >= length) {
                                    break;
                                }
                                C25055CVj cVj = cVjArr[i];
                                A10.append(cVj.A01);
                                A10.append('/');
                                A10.append(cVj.A00);
                                if (i + 1 != length) {
                                    A10.append(",");
                                }
                                i++;
                            }
                        }
                    } else {
                        double[] dArr = (double[]) A002;
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
                    int[] iArr = (int[]) A002;
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
                long[] jArr = (long[]) A002;
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
        A10.append(C26120Csi.A0A[this.A00]);
        A10.append(", data length:");
        A10.append(this.A02.length);
        return AnonymousClass8BU.A0q(A10);
    }
}
