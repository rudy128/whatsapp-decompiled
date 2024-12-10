package X;

/* renamed from: X.4aA  reason: invalid class name and case insensitive filesystem */
public abstract class C88584aA {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4NL A01(X.C18000vb r14, long r15) {
        /*
            double r1 = (double) r15
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r11 = 0
        L_0x0007:
            r10 = 3
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r11 >= r10) goto L_0x0017
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            double r1 = r1 / r12
            int r11 = r11 + 1
            goto L_0x0007
        L_0x0017:
            java.util.Locale r6 = r14.A0N()
            r8 = 0
            r7 = 282(0x11a, float:3.95E-43)
            r3 = 1
            int r0 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
            java.lang.String r2 = "%d"
        L_0x002a:
            java.lang.String r6 = java.lang.String.format(r6, r2, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2, r0)
        L_0x0038:
            X.1Wz r0 = X.C18000vb.A00(r14)
            X.1XC r0 = r0.A02
            java.lang.String r5 = r0.A02(r1, r7)
            java.lang.String r0 = "%1$s"
            int r1 = r5.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L_0x004c
            r3 = 0
        L_0x004c:
            X.C17960vV.A0D(r3)
            int r0 = r1 + 4
            java.lang.String r2 = r5.substring(r4, r1)
            java.lang.String r1 = r5.substring(r0)
            X.4NL r0 = new X.4NL
            r0.<init>(r2, r6, r1)
            return r0
        L_0x005f:
            java.lang.String r5 = "%1$.1f"
            if (r11 == 0) goto L_0x00ab
            if (r11 == r3) goto L_0x00a0
            r0 = 2
            if (r11 == r0) goto L_0x0087
            if (r11 == r10) goto L_0x006e
            java.lang.String r6 = ""
            r1 = r6
            goto L_0x0038
        L_0x006e:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r4] = r2
            java.lang.String r6 = java.lang.String.format(r6, r5, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            r7 = 278(0x116, float:3.9E-43)
            goto L_0x0038
        L_0x0087:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r4] = r2
            java.lang.String r6 = java.lang.String.format(r6, r5, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            r7 = 283(0x11b, float:3.97E-43)
            goto L_0x0038
        L_0x00a0:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r0[r4] = r5
            java.lang.String r2 = "%1$.0f"
            goto L_0x002a
        L_0x00ab:
            double r1 = r1 / r12
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r0[r4] = r2
            java.lang.String r6 = java.lang.String.format(r6, r5, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
            java.lang.String r1 = java.lang.String.format(r1, r5, r0)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88584aA.A01(X.0vb, long):X.4NL");
    }

    public static String A02(C18000vb r1, long j) {
        return (String) A00(r1, j, false, false).first;
    }

    public static String A03(C18000vb r2, long j) {
        return (String) A00(r2, j, false, true).first;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(X.C18000vb r25, long r26, boolean r28, boolean r29) {
        /*
            r23 = 0
            r12 = r26
            int r0 = (r26 > r23 ? 1 : (r26 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            r22 = 1
            long r6 = -r12
        L_0x000b:
            if (r29 == 0) goto L_0x00c3
            r8 = 1024(0x400, double:5.06E-321)
            r4 = 1048576(0x100000, double:5.180654E-318)
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            r0 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r10 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
        L_0x001c:
            r20 = 900(0x384, double:4.447E-321)
            long r18 = r8 * r20
            java.lang.String r15 = "%.1f"
            java.lang.String r17 = "%.0f"
            r16 = 0
            int r14 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r14 > 0) goto L_0x0081
            float r14 = (float) r6
            float r0 = (float) r8
            float r14 = r14 / r0
            int r0 = (r26 > r23 ? 1 : (r26 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r16 = r17
        L_0x0033:
            r6 = 282(0x11a, float:3.95E-43)
            r1 = 1
            if (r16 == 0) goto L_0x008d
            r15 = r16
        L_0x003a:
            if (r22 == 0) goto L_0x003d
            float r14 = -r14
        L_0x003d:
            r7 = r25
            java.util.Locale r1 = r7.A0N()
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            r5 = 0
            r0[r5] = r2
            java.lang.String r4 = java.lang.String.format(r1, r15, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r2
            java.lang.String r3 = java.lang.String.format(r1, r15, r0)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r5] = r4
            java.util.Locale r1 = r7.A0N()
            X.1Wz r0 = X.C18000vb.A00(r7)
            X.1XC r0 = r0.A02
            java.lang.String r0 = r0.A02(r3, r6)
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.lang.String r0 = r7.A0F(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            return r0
        L_0x007a:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r16 = r15
            goto L_0x0033
        L_0x0081:
            long r12 = r4 * r20
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 > 0) goto L_0x0096
            float r14 = (float) r6
            float r0 = (float) r4
            float r14 = r14 / r0
            r6 = 283(0x11b, float:3.97E-43)
        L_0x008c:
            r1 = 0
        L_0x008d:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b3
            java.lang.String r15 = "%.2f"
            goto L_0x003a
        L_0x0096:
            long r8 = r2 * r20
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x00a2
            float r14 = (float) r6
            float r0 = (float) r2
            float r14 = r14 / r0
            r6 = 278(0x116, float:3.9E-43)
            goto L_0x008c
        L_0x00a2:
            long r20 = r20 * r0
            int r2 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            float r14 = (float) r6
            if (r2 > 0) goto L_0x00ae
            float r2 = (float) r0
            float r14 = r14 / r2
            r6 = 293(0x125, float:4.1E-43)
            goto L_0x008c
        L_0x00ae:
            float r0 = (float) r10
            float r14 = r14 / r0
            r6 = 289(0x121, float:4.05E-43)
            goto L_0x008c
        L_0x00b3:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x003a
            if (r28 == 0) goto L_0x00bf
            if (r1 != 0) goto L_0x00bf
            goto L_0x003a
        L_0x00bf:
            r15 = r17
            goto L_0x003a
        L_0x00c3:
            r8 = 1000(0x3e8, double:4.94E-321)
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r10 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            goto L_0x001c
        L_0x00d7:
            r22 = 0
            r6 = r12
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88584aA.A00(X.0vb, long, boolean, boolean):android.util.Pair");
    }

    public static String A04(C18000vb r0, long j) {
        AnonymousClass4NL A01 = A01(r0, j);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A01.A01);
        A10.append(A01.A02);
        return AnonymousClass000.A0y(A01.A00, A10);
    }
}
