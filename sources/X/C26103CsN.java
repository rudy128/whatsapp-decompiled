package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.CsN  reason: case insensitive filesystem */
public class C26103CsN {
    public C25853CnF A00;

    public static boolean A03(char c) {
        return c == '<' || c == '>' || c == '=' || c == '~' || c == '!';
    }

    private C26973DNv A00() {
        C23751Bow bow;
        C25853CnF cnF = this.A00;
        cnF.A05();
        int i = cnF.A01;
        cnF.A05();
        if (cnF.A08('!')) {
            cnF.A07('!');
            cnF.A05();
            char charAt = cnF.A02.charAt(cnF.A01);
            if (charAt != '$' && charAt != '@') {
                return new C23748Bot(A00(), AnonymousClass00R.A01);
            }
            cnF.A01 = i;
        }
        cnF.A05();
        if (cnF.A08('(')) {
            cnF.A07('(');
            C26973DNv A01 = A01(this);
            cnF.A07(')');
            return A01;
        }
        C25836Cmq A02 = A02();
        C25853CnF cnF2 = this.A00;
        try {
            cnF2.A05();
            int i2 = cnF2.A01;
            CharSequence charSequence = cnF2.A02;
            if (!A03(charSequence.charAt(i2))) {
                while (true) {
                    int i3 = cnF2.A01;
                    if (!cnF2.A0A(i3) || charSequence.charAt(i3) == ' ') {
                        break;
                    }
                    cnF2.A01++;
                }
            } else {
                while (true) {
                    int i4 = cnF2.A01;
                    if (!cnF2.A0A(i4) || !A03(charSequence.charAt(i4))) {
                        break;
                    }
                    cnF2.A01++;
                }
            }
            String A0k = BE7.A0k(charSequence, i2, cnF2.A01);
            String upperCase = A0k.toUpperCase(Locale.ROOT);
            for (C09 c09 : C09.values()) {
                if (c09.operatorString.equals(upperCase)) {
                    return new C23747Bos(c09, A02, A02());
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Filter operator ");
            A10.append(A0k);
            throw C23741Bom.A00(AnonymousClass000.A0y(" is not supported!", A10));
        } catch (C23741Bom unused) {
            cnF2.A01 = cnF2.A01;
            if (A02 instanceof C23753Boy) {
                C23753Boy boy = (C23753Boy) A02;
                C23753Boy boy2 = new C23753Boy(boy.A00, true, boy.A02);
                C09 c092 = C09.EXISTS;
                if (boy2.A02) {
                    bow = EB4.A01;
                } else {
                    bow = EB4.A00;
                }
                return new C23747Bos(c092, boy2, bow);
            }
            throw C23741Bom.A00("Expected path node");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b4, code lost:
        if (r1 != false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r3 != '{') goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018c, code lost:
        if ((0 | X.C25345Ce4.A01(r1)) <= 0) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C25836Cmq A02() {
        /*
            r13 = this;
            X.CnF r5 = r13.A00
            r5.A05()
            java.lang.CharSequence r4 = r5.A02
            int r0 = r5.A01
            char r0 = r4.charAt(r0)
            r3 = 64
            r2 = 36
            r10 = 33
            if (r0 == r10) goto L_0x01f3
            if (r0 == r2) goto L_0x021b
            if (r0 == r3) goto L_0x021b
            X.CnF r0 = r13.A00
            r0.A05()
            java.lang.CharSequence r1 = r0.A02
            int r0 = r0.A01
            char r3 = r1.charAt(r0)
            r2 = 34
            if (r3 == r2) goto L_0x01c0
            r2 = 39
            if (r3 == r2) goto L_0x01c0
            r0 = 45
            if (r3 == r0) goto L_0x004a
            r0 = 47
            if (r3 == r0) goto L_0x0150
            r0 = 91
            if (r3 == r0) goto L_0x0117
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L_0x00c2
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 == r1) goto L_0x0087
            r0 = 116(0x74, float:1.63E-43)
            if (r3 == r0) goto L_0x00c2
            r0 = 123(0x7b, float:1.72E-43)
            if (r3 == r0) goto L_0x0117
        L_0x004a:
            X.CnF r3 = r13.A00
            int r2 = r3.A01
        L_0x004e:
            int r0 = r3.A01
            boolean r0 = r3.A0A(r0)
            if (r0 == 0) goto L_0x0079
            int r0 = r3.A01
            char r1 = X.C25853CnF.A00(r3, r0)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0072
            r0 = 45
            if (r1 == r0) goto L_0x0072
            r0 = 46
            if (r1 == r0) goto L_0x0072
            r0 = 69
            if (r1 == r0) goto L_0x0072
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x0079
        L_0x0072:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            goto L_0x004e
        L_0x0079:
            int r1 = r3.A01
            java.lang.CharSequence r0 = r3.A02
            java.lang.CharSequence r0 = r0.subSequence(r2, r1)
            X.Bp2 r1 = new X.Bp2
            r1.<init>((java.lang.CharSequence) r0)
            return r1
        L_0x0087:
            X.CnF r3 = r13.A00
            int r0 = r3.A01
            char r0 = X.C25853CnF.A00(r3, r0)
            if (r0 != r1) goto L_0x00bb
            int r2 = r3.A01
            int r0 = r2 + 3
            boolean r0 = r3.A0A(r0)
            if (r0 == 0) goto L_0x00bb
            int r1 = r2 + 4
            java.lang.CharSequence r0 = r3.A02
            java.lang.CharSequence r2 = r0.subSequence(r2, r1)
            java.lang.String r1 = "null"
            java.lang.String r0 = r2.toString()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bb
            int r1 = r2.length()
            int r0 = r3.A01
            int r0 = r0 + r1
            r3.A01 = r0
            X.Bov r1 = X.EB4.A02
            return r1
        L_0x00bb:
            java.lang.String r0 = "Expected <null> value"
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x00c2:
            X.CnF r4 = r13.A00
            int r5 = r4.A01
            char r3 = X.C25853CnF.A00(r4, r5)
            int r2 = r4.A01
            r0 = 116(0x74, float:1.63E-43)
            int r1 = r2 + 4
            if (r3 != r0) goto L_0x00d4
            int r1 = r2 + 3
        L_0x00d4:
            boolean r0 = r4.A0A(r1)
            java.lang.String r3 = "Expected boolean literal"
            if (r0 == 0) goto L_0x0112
            int r1 = r1 + 1
            java.lang.CharSequence r0 = r4.A02
            java.lang.CharSequence r2 = r0.subSequence(r5, r1)
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00f9
            X.Bom r0 = X.C23741Bom.A00(r3)
            throw r0
        L_0x00f9:
            int r1 = r2.length()
            int r0 = r4.A01
            int r0 = r0 + r1
            r4.A01 = r0
            java.lang.String r0 = r2.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x010f
            X.Bow r1 = X.EB4.A01
            return r1
        L_0x010f:
            X.Bow r1 = X.EB4.A00
            return r1
        L_0x0112:
            X.Bom r0 = X.C23741Bom.A00(r3)
            throw r0
        L_0x0117:
            X.CnF r5 = r13.A00
            int r4 = r5.A01
            char r3 = X.C25853CnF.A00(r5, r4)
            r0 = 91
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 != r0) goto L_0x0127
            r2 = 93
        L_0x0127:
            int r1 = r5.A01
            r0 = 0
            int r1 = r5.A02(r3, r2, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0141
            int r1 = r1 + 1
            r5.A01 = r1
            java.lang.CharSequence r0 = r5.A02
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            X.Bp3 r1 = new X.Bp3
            r1.<init>((java.lang.CharSequence) r0)
            return r1
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "String not closed. Expected ' in "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x0150:
            X.CnF r6 = r13.A00
            int r7 = r6.A01
            int r9 = r6.A04(r0, r7)
            r0 = -1
            if (r9 == r0) goto L_0x01b1
            int r11 = r9 + 1
            boolean r0 = r6.A0A(r11)
            if (r0 == 0) goto L_0x01a1
            r10 = r11
            r0 = 1
            char[] r12 = new char[r0]
        L_0x0167:
            X.CnF r1 = r13.A00
            boolean r0 = r1.A0A(r10)
            if (r0 == 0) goto L_0x0194
            char r8 = X.C25853CnF.A00(r1, r10)
            r5 = 0
            r12[r5] = r8
            r0 = 7
            java.lang.Integer[] r4 = X.AnonymousClass00R.A00(r0)
            int r3 = r4.length
            r2 = 0
        L_0x017d:
            if (r2 >= r3) goto L_0x0194
            r1 = r4[r2]
            char r0 = X.C25345Ce4.A00(r1)
            if (r0 != r8) goto L_0x0191
            int r0 = X.C25345Ce4.A01(r1)
            r5 = r5 | r0
            if (r5 <= 0) goto L_0x0194
            int r10 = r10 + 1
            goto L_0x0167
        L_0x0191:
            int r2 = r2 + 1
            goto L_0x017d
        L_0x0194:
            if (r10 <= r9) goto L_0x01a1
            java.lang.CharSequence r0 = r6.A02
            java.lang.CharSequence r0 = r0.subSequence(r11, r10)
            int r0 = r0.length()
            int r9 = r9 + r0
        L_0x01a1:
            int r1 = r9 + 1
            r6.A01 = r1
            java.lang.CharSequence r0 = r6.A02
            java.lang.CharSequence r0 = r0.subSequence(r7, r1)
            X.Bp1 r1 = new X.Bp1
            r1.<init>((java.lang.CharSequence) r0)
            return r1
        L_0x01b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Pattern not closed. Expected / in "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x01c0:
            X.CnF r4 = r13.A00
            int r3 = r4.A01
            int r1 = r4.A04(r2, r3)
            r0 = -1
            if (r1 == r0) goto L_0x01dc
            r2 = 1
            int r1 = r1 + 1
            r4.A01 = r1
            java.lang.CharSequence r0 = r4.A02
            java.lang.CharSequence r0 = r0.subSequence(r3, r1)
            X.Bp0 r1 = new X.Bp0
            r1.<init>(r0, r2)
            return r1
        L_0x01dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "String literal does not have matching quotes. Expected "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " in "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x01f3:
            r1 = 1
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            r5.A05()
            int r0 = r5.A01
            char r0 = r4.charAt(r0)
            if (r0 == r2) goto L_0x021b
            if (r0 == r3) goto L_0x021b
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r10)
            r2[r1] = r0
            java.lang.String r0 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x021b:
            X.CnF r9 = r13.A00
            int r2 = r9.A01
        L_0x021f:
            int r2 = r2 + -1
            boolean r0 = r9.A0A(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0232
            char r1 = X.C25853CnF.A00(r9, r2)
            r0 = 32
            if (r1 != r0) goto L_0x0232
            goto L_0x021f
        L_0x0232:
            boolean r0 = r9.A0A(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0300
            r0 = -1
            if (r2 == r0) goto L_0x0300
            char r12 = X.C25853CnF.A00(r9, r2)
        L_0x0241:
            int r11 = r9.A01
            r8 = 1
        L_0x0244:
            int r0 = r9.A01
            int r1 = r0 + 1
            r9.A01 = r1
            boolean r0 = r9.A0A(r1)
            r7 = 0
            if (r0 == 0) goto L_0x02d5
            java.lang.CharSequence r6 = r9.A02
            char r0 = r6.charAt(r1)
            r2 = 91
            if (r0 != r2) goto L_0x026a
            int r1 = r9.A01
            r0 = 93
            int r1 = r9.A02(r2, r0, r1, r7)
            r0 = -1
            if (r1 == r0) goto L_0x0304
            int r0 = r1 + 1
            r9.A01 = r0
        L_0x026a:
            int r0 = r9.A01
            char r0 = r6.charAt(r0)
            r5 = 41
            if (r0 != r5) goto L_0x02aa
            X.CnF r4 = r13.A00
            java.lang.CharSequence r1 = r4.A02
            int r0 = r4.A01
            char r0 = r1.charAt(r0)
            if (r0 != r5) goto L_0x02aa
            int r3 = r4.A01
        L_0x0282:
            int r3 = r3 + -1
            boolean r0 = r4.A0A(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0295
            char r1 = X.C25853CnF.A00(r4, r3)
            r0 = 32
            if (r1 != r0) goto L_0x0295
            goto L_0x0282
        L_0x0295:
            boolean r0 = r4.A0A(r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02aa
            r0 = -1
            if (r3 == r0) goto L_0x02aa
            java.lang.CharSequence r2 = r4.A02
            char r1 = r2.charAt(r3)
            r0 = 40
            if (r1 == r0) goto L_0x02ec
        L_0x02aa:
            r1 = 0
        L_0x02ab:
            int r0 = r9.A01
            char r0 = r6.charAt(r0)
            if (r0 != r5) goto L_0x02b6
            r2 = 1
            if (r1 == 0) goto L_0x02b7
        L_0x02b6:
            r2 = 0
        L_0x02b7:
            int r1 = r9.A01
            boolean r0 = r9.A0A(r1)
            if (r0 == 0) goto L_0x02d5
            char r0 = r6.charAt(r1)
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x02d5
            int r0 = r9.A01
            char r1 = r6.charAt(r0)
            r0 = 32
            if (r1 == r0) goto L_0x02d5
            if (r2 == 0) goto L_0x0244
        L_0x02d5:
            if (r12 != r10) goto L_0x02d8
            r8 = 0
        L_0x02d8:
            int r1 = r9.A01
            java.lang.CharSequence r0 = r9.A02
            java.lang.String r1 = X.BE7.A0k(r0, r11, r1)
            X.E6J[] r0 = new X.E6J[r7]
            X.CYQ r0 = X.C26182Cu5.A01(r1, r0)
            X.Boy r1 = new X.Boy
            r1.<init>(r0, r7, r8)
            return r1
        L_0x02ec:
            int r3 = r3 + -1
            boolean r0 = r4.A0A(r3)
            if (r0 == 0) goto L_0x02aa
            if (r3 <= r11) goto L_0x02aa
            char r1 = r2.charAt(r3)
            r0 = 46
            if (r1 != r0) goto L_0x02ec
            r1 = 1
            goto L_0x02ab
        L_0x0300:
            r12 = 32
            goto L_0x0241
        L_0x0304:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Square brackets does not match in filter "
            java.lang.String r0 = X.AnonymousClass001.A1E(r9, r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26103CsN.A02():X.Cmq");
    }

    public static C26973DNv A01(C26103CsN csN) {
        C25853CnF cnF;
        int i;
        Integer num;
        Object bot;
        C25853CnF cnF2;
        int i2;
        Integer num2;
        ArrayList A13 = AnonymousClass000.A13();
        do {
            ArrayList A132 = AnonymousClass000.A13();
            do {
                A132.add(csN.A00());
                cnF = csN.A00;
                i = cnF.A01;
                num = AnonymousClass00R.A00;
            } while (cnF.A0B("&&"));
            cnF.A01 = i;
            if (1 == A132.size()) {
                bot = AnonymousClass8BS.A0Y(A132);
            } else {
                bot = new C23748Bot(num, (Collection) A132);
            }
            A13.add(bot);
            cnF2 = csN.A00;
            i2 = cnF2.A01;
            num2 = AnonymousClass00R.A0C;
        } while (cnF2.A0B("||"));
        cnF2.A01 = i2;
        if (1 == A13.size()) {
            return (C26973DNv) AnonymousClass8BS.A0Y(A13);
        }
        return new C23748Bot(num2, (Collection) A13);
    }
}
