package X;

/* renamed from: X.AlQ  reason: case insensitive filesystem */
public class C21517AlQ implements C18140vp {
    public final int A00;

    public C21517AlQ(int i) {
        this.A00 = i;
    }

    public static C21517AlQ A00(int i) {
        return new C21517AlQ(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x03b9, code lost:
        return java.util.regex.Pattern.compile(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x03c9, code lost:
        return X.AnonymousClass12Q.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return X.AnonymousClass12Q.A01(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0011;
                case 2: goto L_0x0015;
                case 3: goto L_0x0019;
                case 4: goto L_0x001d;
                case 5: goto L_0x0021;
                case 6: goto L_0x0025;
                case 7: goto L_0x0021;
                case 8: goto L_0x0029;
                case 9: goto L_0x0019;
                case 10: goto L_0x00b1;
                case 11: goto L_0x002d;
                case 12: goto L_0x0031;
                case 13: goto L_0x0035;
                case 14: goto L_0x0005;
                case 15: goto L_0x0039;
                case 16: goto L_0x0005;
                case 17: goto L_0x003d;
                case 18: goto L_0x0041;
                case 19: goto L_0x0045;
                case 20: goto L_0x0049;
                case 21: goto L_0x00d3;
                case 22: goto L_0x004d;
                case 23: goto L_0x0051;
                case 24: goto L_0x0055;
                case 25: goto L_0x0059;
                case 26: goto L_0x03a7;
                case 27: goto L_0x03ac;
                case 28: goto L_0x03b1;
                case 29: goto L_0x005d;
                case 30: goto L_0x0061;
                case 31: goto L_0x0065;
                case 32: goto L_0x0085;
                case 33: goto L_0x0089;
                case 34: goto L_0x03ba;
                case 35: goto L_0x03bd;
                case 36: goto L_0x008e;
                case 37: goto L_0x0093;
                case 38: goto L_0x03c0;
                case 39: goto L_0x03c3;
                case 40: goto L_0x03ca;
                case 41: goto L_0x0098;
                case 42: goto L_0x009d;
                case 43: goto L_0x00a2;
                case 44: goto L_0x00a7;
                case 45: goto L_0x00ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 49520(0xc170, float:6.9392E-41)
        L_0x0008:
            java.lang.Object r4 = X.AnonymousClass12Q.A01(r0)
        L_0x000c:
            return r4
        L_0x000d:
            r0 = 32824(0x8038, float:4.5996E-41)
            goto L_0x0008
        L_0x0011:
            r0 = 32825(0x8039, float:4.5998E-41)
            goto L_0x0008
        L_0x0015:
            r0 = 32826(0x803a, float:4.5999E-41)
            goto L_0x0008
        L_0x0019:
            r0 = 32835(0x8043, float:4.6012E-41)
            goto L_0x0008
        L_0x001d:
            r0 = 49534(0xc17e, float:6.9412E-41)
            goto L_0x0008
        L_0x0021:
            r0 = 49533(0xc17d, float:6.941E-41)
            goto L_0x0008
        L_0x0025:
            r0 = 49535(0xc17f, float:6.9413E-41)
            goto L_0x0008
        L_0x0029:
            r0 = 32834(0x8042, float:4.601E-41)
            goto L_0x0008
        L_0x002d:
            r0 = 49464(0xc138, float:6.9314E-41)
            goto L_0x0008
        L_0x0031:
            r0 = 49540(0xc184, float:6.942E-41)
            goto L_0x0008
        L_0x0035:
            r0 = 49519(0xc16f, float:6.9391E-41)
            goto L_0x0008
        L_0x0039:
            r0 = 49521(0xc171, float:6.9394E-41)
            goto L_0x0008
        L_0x003d:
            r0 = 32790(0x8016, float:4.5949E-41)
            goto L_0x0008
        L_0x0041:
            r0 = 32791(0x8017, float:4.595E-41)
            goto L_0x0008
        L_0x0045:
            r0 = 32794(0x801a, float:4.5954E-41)
            goto L_0x0008
        L_0x0049:
            r0 = 32795(0x801b, float:4.5956E-41)
            goto L_0x0008
        L_0x004d:
            r0 = 32779(0x800b, float:4.5933E-41)
            goto L_0x0008
        L_0x0051:
            r0 = 32780(0x800c, float:4.5935E-41)
            goto L_0x0008
        L_0x0055:
            r0 = 32827(0x803b, float:4.6E-41)
            goto L_0x0008
        L_0x0059:
            r0 = 32828(0x803c, float:4.6002E-41)
            goto L_0x0008
        L_0x005d:
            r0 = 32796(0x801c, float:4.5957E-41)
            goto L_0x0008
        L_0x0061:
            r0 = 32797(0x801d, float:4.5958E-41)
            goto L_0x0008
        L_0x0065:
            r4 = 0
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0072 }
            r3.load(r4)     // Catch:{ Exception -> 0x0070 }
            goto L_0x007f
        L_0x0070:
            r2 = move-exception
            goto L_0x0074
        L_0x0072:
            r2 = move-exception
            r3 = r4
        L_0x0074:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore keystore load threw: "
            X.C17900vP.A0Z(r2, r0, r1)
            if (r3 == 0) goto L_0x000c
        L_0x007f:
            X.9kW r4 = new X.9kW
            r4.<init>(r3)
            return r4
        L_0x0085:
            r0 = 49495(0xc157, float:6.9357E-41)
            goto L_0x0008
        L_0x0089:
            r0 = 49541(0xc185, float:6.9422E-41)
            goto L_0x0008
        L_0x008e:
            r0 = 32838(0x8046, float:4.6016E-41)
            goto L_0x0008
        L_0x0093:
            r0 = 32839(0x8047, float:4.6017E-41)
            goto L_0x0008
        L_0x0098:
            r0 = 49225(0xc049, float:6.8979E-41)
            goto L_0x0008
        L_0x009d:
            r0 = 32830(0x803e, float:4.6005E-41)
            goto L_0x0008
        L_0x00a2:
            r0 = 32831(0x803f, float:4.6006E-41)
            goto L_0x0008
        L_0x00a7:
            r0 = 32832(0x8040, float:4.6007E-41)
            goto L_0x0008
        L_0x00ac:
            r0 = 32833(0x8041, float:4.6009E-41)
            goto L_0x0008
        L_0x00b1:
            X.00H r0 = X.C20134A8u.A00
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = "Google Drive Write Worker #"
            r6 = 2
            r5 = 0
            X.3Ev r10 = new X.3Ev
            r10.<init>()
            r7 = 1
            X.AlI r11 = new X.AlI
            r11.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            r4.<init>(r5, r6, r7, r9, r10, r11)
            X.AlE r0 = new X.AlE
            r0.<init>(r5)
            r4.setRejectedExecutionHandler(r0)
            return r4
        L_0x00d3:
            X.00H r0 = X.AnonymousClass2WQ.A00
            r0 = 85
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            r10 = 28
            X.AnonymousClass000.A1L(r2, r10)
            r0 = 4
            X.AnonymousClass000.A1M(r2, r0)
            r1 = 7
            X.AnonymousClass3Ma.A1S(r2, r1)
            r11 = 10
            X.C17890vO.A1G(r2, r11)
            r5 = 12
            X.C17880vN.A1T(r2, r5, r0)
            r9 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r6 = 5
            r2[r6] = r0
            r7 = 18
            X.C17890vO.A1H(r2, r7)
            r4 = 67
            X.C17880vN.A1T(r2, r4, r1)
            r0 = 129(0x81, float:1.81E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 8
            r2[r0] = r1
            r8 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0 = 9
            r2[r0] = r1
            r3 = 79
            X.C17880vN.A1T(r2, r3, r11)
            r0 = 11
            X.C17880vN.A1T(r2, r6, r0)
            r6 = 51
            X.C17880vN.A1T(r2, r6, r5)
            r5 = 52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 13
            r2[r0] = r1
            X.C17880vN.A1T(r2, r0, r9)
            r14 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0 = 15
            r2[r0] = r1
            r13 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 16
            r2[r0] = r1
            r12 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0 = 17
            r2[r0] = r1
            r11 = 25
            X.C17880vN.A1T(r2, r11, r7)
            r1 = 26
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r0 = 19
            r2[r0] = r7
            r9 = 34
            X.C17880vN.A1T(r2, r9, r8)
            r8 = 35
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0 = 21
            r2[r0] = r7
            r7 = 36
            X.C17880vN.A1T(r2, r7, r14)
            r0 = 46
            X.C17880vN.A1T(r2, r0, r13)
            r0 = 47
            X.C17880vN.A1T(r2, r0, r12)
            r0 = 48
            X.C17880vN.A1T(r2, r0, r11)
            r0 = 49
            X.C17880vN.A1T(r2, r0, r1)
            r0 = 50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 27
            r2[r0] = r1
            r0 = 55
            X.C17880vN.A1T(r2, r0, r10)
            r0 = 37
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 29
            r2[r0] = r1
            r0 = 39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 30
            r2[r0] = r1
            r0 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 31
            r2[r0] = r1
            r0 = 41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 32
            r2[r0] = r1
            r0 = 42
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 33
            r2[r0] = r1
            r0 = 43
            X.C17880vN.A1T(r2, r0, r9)
            r0 = 44
            X.C17880vN.A1T(r2, r0, r8)
            r0 = 45
            X.C17880vN.A1T(r2, r0, r7)
            r0 = 56
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 37
            r2[r0] = r1
            r0 = 57
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 38
            r2[r0] = r1
            r0 = 59
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 39
            r2[r0] = r1
            r0 = 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 40
            r2[r0] = r1
            r0 = 61
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 41
            r2[r0] = r1
            r0 = 69
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 42
            r2[r0] = r1
            r0 = 62
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 43
            r2[r0] = r1
            r0 = 63
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 44
            r2[r0] = r1
            r0 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 45
            r2[r0] = r1
            r0 = 65
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 46
            r2[r0] = r1
            r0 = 66
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 47
            r2[r0] = r1
            r0 = 68
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 48
            r2[r0] = r1
            r0 = 71
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 49
            r2[r0] = r1
            r0 = 75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 50
            r2[r0] = r1
            r0 = 113(0x71, float:1.58E-43)
            X.C17880vN.A1T(r2, r0, r6)
            r0 = 112(0x70, float:1.57E-43)
            X.C17880vN.A1T(r2, r0, r5)
            r0 = 114(0x72, float:1.6E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 53
            r2[r0] = r1
            r0 = 116(0x74, float:1.63E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 54
            r2[r0] = r1
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 55
            r2[r0] = r1
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 56
            r2[r0] = r1
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 57
            r2[r0] = r1
            r0 = 144(0x90, float:2.02E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 58
            r2[r0] = r1
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 59
            r2[r0] = r1
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 60
            r2[r0] = r1
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 61
            r2[r0] = r1
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 62
            r2[r0] = r1
            r0 = 76
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 63
            r2[r0] = r1
            r0 = 77
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 64
            r2[r0] = r1
            r0 = 78
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 65
            r2[r0] = r1
            r0 = 86
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 66
            r2[r0] = r1
            r0 = 87
            X.C17880vN.A1T(r2, r0, r4)
            r0 = 90
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 68
            r2[r0] = r1
            r0 = 93
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 69
            r2[r0] = r1
            r0 = 94
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 70
            r2[r0] = r1
            r0 = 97
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 71
            r2[r0] = r1
            r0 = 98
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 72
            r2[r0] = r1
            r0 = 105(0x69, float:1.47E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 73
            r2[r0] = r1
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 74
            r2[r0] = r1
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 75
            r2[r0] = r1
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 76
            r2[r0] = r1
            r0 = 171(0xab, float:2.4E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 77
            r2[r0] = r1
            r0 = 143(0x8f, float:2.0E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 78
            r2[r0] = r1
            r0 = 148(0x94, float:2.07E-43)
            X.C17880vN.A1T(r2, r0, r3)
            r0 = 149(0x95, float:2.09E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 80
            r2[r0] = r1
            r0 = 147(0x93, float:2.06E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 81
            r2[r0] = r1
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 82
            r2[r0] = r1
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 83
            r2[r0] = r1
            r0 = 166(0xa6, float:2.33E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 84
            java.util.HashSet r4 = X.C17900vP.A0I(r1, r2, r0)
            return r4
        L_0x03a7:
            X.00H r0 = X.C62012qe.A04
            java.lang.String r0 = "\\+12225551[0-9]{3}"
            goto L_0x03b5
        L_0x03ac:
            X.00H r0 = X.C62012qe.A04
            java.lang.String r0 = "\\+1[0-9]{3}555[0-9]{4}"
            goto L_0x03b5
        L_0x03b1:
            X.00H r0 = X.C62012qe.A04
            java.lang.String r0 = "\\+1[0-9]{10}"
        L_0x03b5:
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r0)
            return r4
        L_0x03ba:
            java.lang.Class<X.17H> r0 = X.AnonymousClass17H.class
            goto L_0x03c5
        L_0x03bd:
            java.lang.Class<X.17J> r0 = X.AnonymousClass17J.class
            goto L_0x03c5
        L_0x03c0:
            java.lang.Class<X.162> r0 = X.AnonymousClass162.class
            goto L_0x03c5
        L_0x03c3:
            java.lang.Class<X.164> r0 = X.AnonymousClass164.class
        L_0x03c5:
            java.lang.Object r4 = X.AnonymousClass12Q.A03(r0)
            return r4
        L_0x03ca:
            X.Adu r4 = new X.Adu
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21517AlQ.get():java.lang.Object");
    }
}
