package X;

/* renamed from: X.CjV  reason: case insensitive filesystem */
public class C25642CjV {
    public static final float[] A01 = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public static final float[] A02 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r13 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r10.A00 != (r6 + 1)) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        return Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r17 != 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (r16 == 0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r13 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        r5 = (r6 - r16) - r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r0 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if (r0 >= r11) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        r3 = r12.charAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        if (r3 == 'E') goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        if (r3 != 'e') goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a8, code lost:
        r0 = r10.A00 + 1;
        r10.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (r0 == r11) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b0, code lost:
        r3 = r12.charAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b6, code lost:
        if (r3 == '+') goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        if (r3 == '-') goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        switch(r3) {
            case 48: goto L_0x00f5;
            case 49: goto L_0x00f5;
            case 50: goto L_0x00f5;
            case 51: goto L_0x00f5;
            case 52: goto L_0x00f5;
            case 53: goto L_0x00f5;
            case 54: goto L_0x00f5;
            case 55: goto L_0x00f5;
            case 56: goto L_0x00f5;
            case 57: goto L_0x00f5;
            default: goto L_0x00bf;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        r10.A00--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c5, code lost:
        r3 = r5 + r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r3 > 39) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        if (r3 < -44) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        r4 = (float) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d2, code lost:
        if (r1 == 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        if (r5 <= 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d6, code lost:
        r0 = A02[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00da, code lost:
        r4 = r4 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00db, code lost:
        if (r20 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        if (r5 >= 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r5 >= -38) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r4 = (float) (((double) r4) * 1.0E-20d);
        r5 = r5 + 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r0 = A01[-r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f5, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f7, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f9, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        r10.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0100, code lost:
        r8 = r10.A00;
        r0 = r8;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0104, code lost:
        if (r0 >= r11) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0106, code lost:
        r4 = r12.charAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010c, code lost:
        if (r4 < '0') goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010e, code lost:
        if (r4 > '9') goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0113, code lost:
        if (((long) r3) > 922337203685477580L) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0115, code lost:
        r3 = (r3 * 10) + (r4 - '0');
        r0 = r10.A00 + 1;
        r10.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0123, code lost:
        if (r10.A00 == r8) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0125, code lost:
        if (r13 == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0127, code lost:
        r5 = r5 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0129, code lost:
        r5 = r5 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00(java.lang.String r24, int r25, int r26) {
        /*
            r23 = this;
            r10 = r23
            r0 = r25
            r10.A00 = r0
            r22 = 2143289344(0x7fc00000, float:NaN)
            r11 = r26
            if (r0 >= r11) goto L_0x012b
            r12 = r24
            char r2 = r12.charAt(r0)
            r1 = 45
            r0 = 43
            r21 = 1
            if (r2 == r0) goto L_0x007a
            r20 = 1
            if (r2 == r1) goto L_0x007c
            r20 = 0
        L_0x0020:
            int r7 = r10.A00
            r3 = r7
            r18 = 0
            r1 = 0
            r17 = 0
            r5 = 0
            r16 = 0
            r13 = 0
            r6 = 0
        L_0x002e:
            r9 = 57
            r0 = 48
            r14 = 922337203685477580(0xccccccccccccccc, double:5.1488004017107686E-247)
            if (r3 >= r11) goto L_0x0083
            char r8 = r12.charAt(r3)
            if (r8 != r0) goto L_0x004d
            if (r17 != 0) goto L_0x004a
            int r16 = r16 + 1
        L_0x0043:
            int r0 = r10.A00
            int r3 = r0 + 1
            r10.A00 = r3
            goto L_0x002e
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x0043
        L_0x004d:
            r0 = 49
            if (r8 < r0) goto L_0x006f
            if (r8 > r9) goto L_0x0083
            int r17 = r17 + r5
        L_0x0055:
            r3 = 10
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0061
            if (r0 > 0) goto L_0x012b
            long r1 = r1 * r3
            int r5 = r5 + -1
            goto L_0x0055
        L_0x0061:
            if (r0 > 0) goto L_0x012b
            long r1 = r1 * r3
            int r0 = r8 + -48
            long r3 = (long) r0
            long r1 = r1 + r3
            int r17 = r17 + 1
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0043
            return r22
        L_0x006f:
            r0 = 46
            if (r8 != r0) goto L_0x0083
            if (r13 != 0) goto L_0x0085
            int r6 = r10.A00
            int r6 = r6 - r7
            r13 = 1
            goto L_0x0043
        L_0x007a:
            r20 = 0
        L_0x007c:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            goto L_0x0020
        L_0x0083:
            if (r13 == 0) goto L_0x008c
        L_0x0085:
            int r3 = r10.A00
            int r0 = r6 + 1
            if (r3 != r0) goto L_0x008c
            return r22
        L_0x008c:
            if (r17 != 0) goto L_0x0092
            if (r16 == 0) goto L_0x012b
            r17 = 1
        L_0x0092:
            if (r13 == 0) goto L_0x0098
            int r6 = r6 - r16
            int r5 = r6 - r17
        L_0x0098:
            int r0 = r10.A00
            if (r0 >= r11) goto L_0x00c5
            char r3 = r12.charAt(r0)
            r0 = 69
            if (r3 == r0) goto L_0x00a8
            r0 = 101(0x65, float:1.42E-43)
            if (r3 != r0) goto L_0x00c5
        L_0x00a8:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            if (r0 == r11) goto L_0x012b
            char r3 = r12.charAt(r0)
            r0 = 43
            if (r3 == r0) goto L_0x00f7
            r0 = 45
            if (r3 == r0) goto L_0x00f9
            switch(r3) {
                case 48: goto L_0x00f5;
                case 49: goto L_0x00f5;
                case 50: goto L_0x00f5;
                case 51: goto L_0x00f5;
                case 52: goto L_0x00f5;
                case 53: goto L_0x00f5;
                case 54: goto L_0x00f5;
                case 55: goto L_0x00f5;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00f5;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            int r0 = r10.A00
            int r0 = r0 - r21
            r10.A00 = r0
        L_0x00c5:
            int r3 = r5 + r17
            r0 = 39
            if (r3 > r0) goto L_0x012b
            r0 = -44
            if (r3 < r0) goto L_0x012b
            float r4 = (float) r1
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            if (r5 <= 0) goto L_0x00df
            float[] r0 = A02
            r0 = r0[r5]
        L_0x00da:
            float r4 = r4 * r0
        L_0x00db:
            if (r20 == 0) goto L_0x00de
            float r4 = -r4
        L_0x00de:
            return r4
        L_0x00df:
            if (r5 >= 0) goto L_0x00db
            r0 = -38
            if (r5 >= r0) goto L_0x00ef
            double r2 = (double) r4
            r0 = 4307583784117748259(0x3bc79ca10c924223, double:1.0E-20)
            double r2 = r2 * r0
            float r4 = (float) r2
            int r5 = r5 + 20
        L_0x00ef:
            float[] r1 = A01
            int r0 = -r5
            r0 = r1[r0]
            goto L_0x00da
        L_0x00f5:
            r13 = 0
            goto L_0x0100
        L_0x00f7:
            r13 = 0
            goto L_0x00fa
        L_0x00f9:
            r13 = 1
        L_0x00fa:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
        L_0x0100:
            int r8 = r10.A00
            r0 = r8
            r3 = 0
        L_0x0104:
            if (r0 >= r11) goto L_0x0121
            char r4 = r12.charAt(r0)
            r0 = 48
            if (r4 < r0) goto L_0x0121
            if (r4 > r9) goto L_0x0121
            long r6 = (long) r3
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x012b
            int r3 = r3 * 10
            int r0 = r4 + -48
            int r3 = r3 + r0
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            goto L_0x0104
        L_0x0121:
            int r0 = r10.A00
            if (r0 == r8) goto L_0x012b
            if (r13 == 0) goto L_0x0129
            int r5 = r5 - r3
            goto L_0x00c5
        L_0x0129:
            int r5 = r5 + r3
            goto L_0x00c5
        L_0x012b:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25642CjV.A00(java.lang.String, int, int):float");
    }
}
