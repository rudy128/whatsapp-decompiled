package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1C0  reason: invalid class name */
public class AnonymousClass1C0 extends AnonymousClass1Bz {
    public static final ConcurrentMap A02 = new ConcurrentHashMap();
    public byte[] A00;
    public final String A01;

    public static AnonymousClass1C0 A02(Object obj) {
        if (obj == null || (obj instanceof AnonymousClass1C0)) {
            return (AnonymousClass1C0) obj;
        }
        if (obj instanceof AnonymousClass1Bx) {
            AnonymousClass1Bz CP9 = ((AnonymousClass1Bx) obj).CP9();
            if (CP9 instanceof AnonymousClass1C0) {
                return (AnonymousClass1C0) CP9;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (AnonymousClass1C0) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct object identifier from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r4 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r6 + 1) != '0') goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r7, int r8) {
        /*
            int r6 = r7.length()
            r5 = 0
        L_0x0005:
            r4 = 0
        L_0x0006:
            int r6 = r6 + -1
            r3 = 48
            r2 = 1
            if (r6 < r8) goto L_0x002b
            char r1 = r7.charAt(r6)
            r0 = 46
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0005
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0005
        L_0x0021:
            return r5
        L_0x0022:
            if (r3 > r1) goto L_0x0021
            r0 = 57
            if (r1 > r0) goto L_0x0021
            int r4 = r4 + 1
            goto L_0x0006
        L_0x002b:
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0038
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0038
            return r5
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C0.A03(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] A04(X.AnonymousClass1C0 r13) {
        /*
            monitor-enter(r13)
            byte[] r0 = r13.A00     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x00df
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00e1 }
            r6.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = r13.A01     // Catch:{ all -> 0x00e1 }
            r1 = 0
            r2 = 0
            r0 = -1
            r4 = 46
            int r1 = r5.indexOf(r4, r1)     // Catch:{ all -> 0x00e1 }
            if (r1 != r0) goto L_0x0026
            java.lang.String r0 = r5.substring(r2)     // Catch:{ all -> 0x00e1 }
            r3 = -1
        L_0x001c:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00e1 }
            int r9 = r0 * 40
            r1 = -1
            if (r3 != r1) goto L_0x002f
            goto L_0x002d
        L_0x0026:
            java.lang.String r0 = r5.substring(r2, r1)     // Catch:{ all -> 0x00e1 }
            int r3 = r1 + 1
            goto L_0x001c
        L_0x002d:
            r8 = 0
            goto L_0x003a
        L_0x002f:
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e1 }
            if (r0 != r1) goto L_0x00d1
            java.lang.String r8 = r5.substring(r3)     // Catch:{ all -> 0x00e1 }
            r3 = -1
        L_0x003a:
            int r0 = r8.length()     // Catch:{ all -> 0x00e1 }
            r2 = 18
            if (r0 > r2) goto L_0x006b
            long r0 = (long) r9     // Catch:{ all -> 0x00e1 }
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x00e1 }
            long r0 = r0 + r7
        L_0x0048:
            r7 = 9
            byte[] r9 = new byte[r7]     // Catch:{ all -> 0x00e1 }
            int r7 = (int) r0     // Catch:{ all -> 0x00e1 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e1 }
            r8 = 8
        L_0x0052:
            r9[r8] = r7     // Catch:{ all -> 0x00e1 }
            r10 = 128(0x80, double:6.32E-322)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x0065
            r7 = 7
            long r0 = r0 >> r7
            int r8 = r8 + -1
            int r7 = (int) r0     // Catch:{ all -> 0x00e1 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e1 }
            goto L_0x0052
        L_0x0065:
            int r0 = 9 - r8
            r6.write(r9, r8, r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ab
        L_0x006b:
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ all -> 0x00e1 }
            r7.<init>(r8)     // Catch:{ all -> 0x00e1 }
            long r0 = (long) r9     // Catch:{ all -> 0x00e1 }
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)     // Catch:{ all -> 0x00e1 }
            java.math.BigInteger r10 = r7.add(r0)     // Catch:{ all -> 0x00e1 }
        L_0x0079:
            int r0 = r10.bitLength()     // Catch:{ all -> 0x00e1 }
            int r8 = r0 + 6
            r11 = 7
            int r8 = r8 / r11
            r7 = 0
            if (r8 != 0) goto L_0x0088
            r6.write(r7)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ab
        L_0x0088:
            byte[] r1 = new byte[r8]     // Catch:{ all -> 0x00e1 }
            int r12 = r8 + -1
            r9 = r12
        L_0x008d:
            if (r12 < 0) goto L_0x00a1
            int r0 = r10.intValue()     // Catch:{ all -> 0x00e1 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x00e1 }
            r1[r12] = r0     // Catch:{ all -> 0x00e1 }
            java.math.BigInteger r10 = r10.shiftRight(r11)     // Catch:{ all -> 0x00e1 }
            int r12 = r12 + -1
            goto L_0x008d
        L_0x00a1:
            byte r0 = r1[r9]     // Catch:{ all -> 0x00e1 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x00e1 }
            r1[r9] = r0     // Catch:{ all -> 0x00e1 }
            r6.write(r1, r7, r8)     // Catch:{ all -> 0x00e1 }
        L_0x00ab:
            r1 = -1
            if (r3 == r1) goto L_0x00d9
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e1 }
            if (r0 != r1) goto L_0x00c4
            java.lang.String r1 = r5.substring(r3)     // Catch:{ all -> 0x00e1 }
            r3 = -1
        L_0x00b9:
            int r0 = r1.length()     // Catch:{ all -> 0x00e1 }
            if (r0 > r2) goto L_0x00cb
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x0048
        L_0x00c4:
            java.lang.String r1 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e1 }
            int r3 = r0 + 1
            goto L_0x00b9
        L_0x00cb:
            java.math.BigInteger r10 = new java.math.BigInteger     // Catch:{ all -> 0x00e1 }
            r10.<init>(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x0079
        L_0x00d1:
            java.lang.String r8 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e1 }
            int r3 = r0 + 1
            goto L_0x003a
        L_0x00d9:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x00e1 }
            r13.A00 = r0     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r13)
            return r0
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C0.A04(X.1C0):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = (X.AnonymousClass1C0) r1.putIfAbsent(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1C0 A0K() {
        /*
            r3 = this;
            byte[] r0 = A04(r3)
            X.1C1 r2 = new X.1C1
            r2.<init>(r0)
            java.util.concurrent.ConcurrentMap r1 = A02
            java.lang.Object r0 = r1.get(r2)
            X.1C0 r0 = (X.AnonymousClass1C0) r0
            if (r0 != 0) goto L_0x001c
            java.lang.Object r0 = r1.putIfAbsent(r2, r3)
            X.1C0 r0 = (X.AnonymousClass1C0) r0
            if (r0 != 0) goto L_0x001c
            return r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C0.A0K():X.1C0");
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass1C0(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        int i = 0;
        long j = 0;
        while (true) {
            byte[] bArr2 = bArr;
            if (i != bArr2.length) {
                byte b = bArr[i] & 255;
                if (j <= 72057594037927808L) {
                    long j2 = j + ((long) (b & Byte.MAX_VALUE));
                    if ((b & 128) == 0) {
                        if (z) {
                            if (j2 < 40) {
                                stringBuffer.append('0');
                            } else if (j2 < 80) {
                                stringBuffer.append('1');
                                j2 -= 40;
                            } else {
                                stringBuffer.append('2');
                                j2 -= 80;
                            }
                            z = false;
                        }
                        stringBuffer.append('.');
                        stringBuffer.append(j2);
                    } else {
                        j = j2 << 7;
                        i++;
                    }
                } else {
                    BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                    if ((b & 128) == 0) {
                        if (z) {
                            stringBuffer.append('2');
                            or = or.subtract(BigInteger.valueOf(80));
                            z = false;
                        }
                        stringBuffer.append('.');
                        stringBuffer.append(or);
                        bigInteger = null;
                    } else {
                        bigInteger = or.shiftLeft(7);
                        i++;
                    }
                }
                j = 0;
                i++;
            } else {
                this.A01 = stringBuffer.toString();
                this.A00 = AnonymousClass1C2.A02(bArr2);
                return;
            }
        }
    }

    public String toString() {
        return this.A01;
    }

    public AnonymousClass1C0(String str, AnonymousClass1C0 r4) {
        StringBuilder sb;
        if (A03(str, 0)) {
            sb.append(r4.A01);
            sb.append(".");
            sb.append(str);
            this.A01 = sb.toString();
            return;
        }
        sb = new StringBuilder();
        sb.append("string ");
        sb.append(str);
        sb.append(" not a valid OID branch");
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass1C0(String str) {
        char charAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        } else if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !A03(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("string ");
            sb.append(str);
            sb.append(" not an OID");
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.A01 = str;
        }
    }
}
