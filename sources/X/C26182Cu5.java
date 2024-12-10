package X;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: X.Cu5  reason: case insensitive filesystem */
public class C26182Cu5 {
    public final C25853CnF A00;
    public final LinkedList A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r2 == '@') goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.CYQ A00() {
        /*
            r5 = this;
        L_0x0000:
            X.CnF r3 = r5.A00
            int r1 = r3.A01
            boolean r0 = r3.A0A(r1)
            if (r0 == 0) goto L_0x0025
            char r1 = X.C25853CnF.A00(r3, r1)
            r0 = 32
            if (r1 == r0) goto L_0x001e
            r0 = 9
            if (r1 == r0) goto L_0x001e
            r0 = 10
            if (r1 == r0) goto L_0x001e
            r0 = 13
            if (r1 != r0) goto L_0x0025
        L_0x001e:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            goto L_0x0000
        L_0x0025:
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r0 = 36
            if (r2 == r0) goto L_0x0036
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0097
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            X.BpG r2 = new X.BpG
            r2.<init>(r0)
            int r1 = r3.A01
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x0089
            int r0 = r1 + 1
            r3.A01 = r0
            char r1 = r4.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x0081
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 91
            if (r1 == r0) goto L_0x0081
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Illegal character at position "
            r1.append(r0)
            int r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = " expected '.' or '['"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x0081:
            X.CVP r0 = new X.CVP
            r0.<init>(r2)
            r5.A02(r0)
        L_0x0089:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "$"
            boolean r1 = r1.equals(r0)
            X.CYQ r0 = new X.CYQ
            r0.<init>(r2, r1)
            return r0
        L_0x0097:
            java.lang.String r0 = "Path must start with '$' or '@'"
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26182Cu5.A00():X.CYQ");
    }

    public static CYQ A01(String str, E6J... e6jArr) {
        try {
            C25853CnF cnF = new C25853CnF(str);
            cnF.A06();
            CharSequence charSequence = cnF.A02;
            if (!(charSequence.charAt(0) == '$' || charSequence.charAt(0) == '@')) {
                cnF = new C25853CnF(AnonymousClass001.A1H("$.", str, AnonymousClass000.A10()));
                cnF.A06();
            }
            if (cnF.A02.charAt(cnF.A00) != '.') {
                return new C26182Cu5(cnF, new LinkedList(Arrays.asList(e6jArr))).A00();
            }
            throw C23741Bom.A00("Path must not end with a '.' or '..'");
        } catch (Exception e) {
            if (!(e instanceof C23741Bom)) {
                throw new C23741Bom((Throwable) e);
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CsN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v14, types: [java.lang.Object, X.CiO] */
    /* JADX WARNING: type inference failed for: r14v19, types: [java.lang.Object, X.CiO] */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05d6, code lost:
        if (r15 != false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05d8, code lost:
        r0 = X.AnonymousClass001.A1I("Found empty property at index ", X.AnonymousClass000.A10(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05fa, code lost:
        r8.A01 = r8.A03(']', r14) + 1;
        r10.A00(new X.C23769BpE(r5, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x063e, code lost:
        if (r0 == false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0678, code lost:
        if (r1 < r8.A00) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dc, code lost:
        if (r1 == '@') goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x06a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A02(X.CVP r27) {
        /*
            r26 = this;
            r9 = r26
            X.CnF r8 = r9.A00
            java.lang.CharSequence r7 = r8.A02
            int r0 = r8.A01
            char r2 = r7.charAt(r0)
            r0 = 42
            java.lang.String r14 = "Could not parse token starting at position "
            r6 = 1
            r10 = r27
            if (r2 == r0) goto L_0x060b
            r1 = 46
            if (r2 == r1) goto L_0x0610
            r11 = 91
            boolean r0 = r8.A08(r11)
            if (r2 == r11) goto L_0x022a
            if (r0 != 0) goto L_0x0640
            r0 = 42
            boolean r0 = r8.A08(r0)
            if (r0 != 0) goto L_0x0640
            boolean r0 = r8.A08(r1)
            if (r0 != 0) goto L_0x0640
            r3 = 32
            boolean r0 = r8.A08(r3)
            if (r0 != 0) goto L_0x0640
            int r0 = r8.A01
            r25 = r0
            r2 = r0
        L_0x003e:
            boolean r0 = r8.A0A(r2)
            r12 = 40
            if (r0 == 0) goto L_0x01be
            char r0 = r7.charAt(r2)
            if (r0 == r3) goto L_0x0216
            if (r0 == r1) goto L_0x01c0
            if (r0 == r11) goto L_0x01c0
            if (r0 != r12) goto L_0x01ba
            r5 = r2
            r24 = 1
        L_0x0055:
            if (r5 != 0) goto L_0x005b
            int r0 = r8.A00
            int r5 = r0 + 1
        L_0x005b:
            r4 = 0
            if (r24 == 0) goto L_0x0212
            int r13 = r2 + 1
            r1 = r13
            r14 = 1
        L_0x0062:
            int r0 = r8.A00
            int r0 = r0 + 1
            r3 = 41
            if (r13 >= r0) goto L_0x01f5
            char r0 = r7.charAt(r13)
            if (r0 != r3) goto L_0x01ac
            int r14 = r14 + -1
        L_0x0072:
            if (r14 != 0) goto L_0x01b6
            boolean r0 = r8.A0A(r1)
            if (r0 == 0) goto L_0x01f1
            char r0 = r7.charAt(r1)
            if (r0 == r3) goto L_0x01ed
            int r0 = r5 + 1
            r8.A01 = r0
            r0 = r25
            java.lang.String r23 = X.BE7.A0k(r7, r0, r5)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            r22 = 0
            r21 = 0
            r2 = 1
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
        L_0x00a1:
            int r1 = r8.A01
            boolean r0 = r8.A0A(r1)
            if (r0 == 0) goto L_0x065e
            if (r21 != 0) goto L_0x065e
            char r1 = r7.charAt(r1)
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            r14 = 34
            if (r19 != 0) goto L_0x00eb
            r0 = 32
            if (r1 == r0) goto L_0x00a1
            r0 = 9
            if (r1 == r0) goto L_0x00a1
            r0 = 10
            if (r1 == r0) goto L_0x00a1
            r0 = 13
            if (r1 == r0) goto L_0x00a1
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x01a8
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x01a8
            if (r14 == r1) goto L_0x01a8
            r0 = 36
            if (r1 == r0) goto L_0x00de
            r15 = 0
            r0 = 64
            if (r1 != r0) goto L_0x00df
        L_0x00de:
            r15 = 1
        L_0x00df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00eb
            java.lang.Integer r19 = X.AnonymousClass00R.A01
        L_0x00eb:
            if (r1 == r14) goto L_0x0186
            r0 = 44
            if (r1 == r0) goto L_0x010e
            if (r1 == r11) goto L_0x0183
            r0 = 93
            if (r1 == r0) goto L_0x017e
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x017b
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x0194
            if (r1 == r12) goto L_0x0178
            if (r1 != r3) goto L_0x0198
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x010b
            r0 = r16
            if (r0 != r12) goto L_0x010e
        L_0x010b:
            r13.append(r1)
        L_0x010e:
            if (r17 != 0) goto L_0x0198
            if (r20 != 0) goto L_0x0198
            if (r18 != 0) goto L_0x0198
            if (r2 != 0) goto L_0x0173
            if (r3 != r1) goto L_0x0198
            r21 = 1
        L_0x011a:
            if (r19 == 0) goto L_0x015b
            int r14 = r19.intValue()
            r0 = r22
            if (r14 == r0) goto L_0x015f
            if (r14 != r6) goto L_0x0150
            java.util.LinkedList r15 = X.AnonymousClass8BR.A14()
            java.lang.String r14 = r13.toString()
            X.CnF r0 = new X.CnF
            r0.<init>(r14)
            X.Cu5 r14 = new X.Cu5
            r14.<init>(r0, r15)
            X.CYQ r15 = r14.A00()
            X.CiO r14 = new X.CiO
            r14.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r14.A02 = r0
            r14.A01 = r15
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x014b:
            r14.A03 = r0
            r4.add(r14)
        L_0x0150:
            int r14 = r13.length()
            r0 = r22
            r13.delete(r0, r14)
            r19 = 0
        L_0x015b:
            r16 = r1
            goto L_0x00a1
        L_0x015f:
            java.lang.String r15 = r13.toString()
            X.CiO r14 = new X.CiO
            r14.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r14.A02 = r0
            r14.A04 = r15
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x014b
        L_0x0173:
            if (r6 != r2) goto L_0x0198
            r21 = 0
            goto L_0x011a
        L_0x0178:
            int r2 = r2 + 1
            goto L_0x0198
        L_0x017b:
            int r20 = r20 + 1
            goto L_0x0198
        L_0x017e:
            if (r18 == 0) goto L_0x01c5
            int r18 = r18 + -1
            goto L_0x0198
        L_0x0183:
            int r18 = r18 + 1
            goto L_0x0198
        L_0x0186:
            r14 = 92
            r0 = r16
            if (r0 == r14) goto L_0x0191
            if (r17 <= 0) goto L_0x0191
            int r17 = r17 + -1
            goto L_0x0198
        L_0x0191:
            int r17 = r17 + 1
            goto L_0x0198
        L_0x0194:
            if (r20 == 0) goto L_0x01d9
            int r20 = r20 + -1
        L_0x0198:
            if (r19 == 0) goto L_0x015b
            r0 = 44
            if (r1 != r0) goto L_0x01a4
            if (r20 != 0) goto L_0x01a4
            if (r18 != 0) goto L_0x01a4
            if (r6 == r2) goto L_0x015b
        L_0x01a4:
            r13.append(r1)
            goto L_0x015b
        L_0x01a8:
            java.lang.Integer r19 = X.AnonymousClass00R.A00
            goto L_0x00eb
        L_0x01ac:
            char r0 = r7.charAt(r13)
            if (r0 != r12) goto L_0x01b6
            int r14 = r14 + 1
            goto L_0x0072
        L_0x01b6:
            int r13 = r13 + 1
            goto L_0x0062
        L_0x01ba:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x01be:
            r5 = 0
            goto L_0x01c1
        L_0x01c0:
            r5 = r2
        L_0x01c1:
            r24 = 0
            goto L_0x0055
        L_0x01c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected close bracket ']' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x01d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected close brace '}' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x01ed:
            r8.A01 = r1
            goto L_0x0664
        L_0x01f1:
            r8.A01 = r2
            goto L_0x0664
        L_0x01f5:
            r0 = r25
            java.lang.String r2 = X.BE7.A0k(r7, r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x0212:
            r8.A01 = r5
            goto L_0x0664
        L_0x0216:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Use bracket notion ['my prop'] if your property contains blank characters. position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x022a:
            if (r0 == 0) goto L_0x023a
            int r0 = r8.A01
            char r2 = r8.A01(r0)
            r0 = 39
            if (r2 == r0) goto L_0x0571
            r0 = 34
            if (r2 == r0) goto L_0x0571
        L_0x023a:
            boolean r0 = r8.A08(r11)
            r3 = 0
            if (r0 == 0) goto L_0x0255
            int r0 = r8.A01
            char r1 = r8.A01(r0)
            boolean r0 = java.lang.Character.isDigit(r1)
            r13 = 58
            r12 = 45
            if (r0 != 0) goto L_0x037e
            if (r1 == r12) goto L_0x037e
            if (r1 == r13) goto L_0x037e
        L_0x0255:
            boolean r0 = r9.A03(r10)
            if (r0 != 0) goto L_0x067a
            r0 = 91
            boolean r0 = r8.A08(r0)
            r11 = 0
            if (r0 != 0) goto L_0x02f0
            r1 = 63
            int r0 = r8.A01
            boolean r0 = r8.A09(r1, r0)
            if (r0 != 0) goto L_0x02f0
        L_0x026e:
            r0 = 91
            boolean r0 = r8.A08(r0)
            if (r0 == 0) goto L_0x028d
            r1 = 63
            int r0 = r8.A01
            int r0 = r8.A03(r1, r0)
            r3 = -1
            if (r0 == r3) goto L_0x028d
            char r1 = r8.A01(r0)
            r2 = 93
            if (r1 == r2) goto L_0x029d
            r0 = 44
            if (r1 == r0) goto L_0x029d
        L_0x028d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = ". Expected ?, ', 0-9, * "
            r1.append(r0)
            goto L_0x0649
        L_0x029d:
            int r0 = r8.A01
            int r1 = r0 + 1
            r5 = r1
        L_0x02a2:
            boolean r0 = r8.A0A(r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x028d
            char r0 = r7.charAt(r5)
            if (r0 != r2) goto L_0x02ed
            if (r5 == r3) goto L_0x028d
            java.lang.String r2 = X.BE7.A0k(r7, r1, r5)
            java.lang.String r0 = ","
            java.lang.String[] r12 = r2.split(r0)
            java.util.LinkedList r11 = r9.A01
            int r0 = r11.size()
            int r7 = r12.length
            if (r0 < r7) goto L_0x03da
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r3 = 0
        L_0x02ca:
            if (r3 >= r7) goto L_0x055a
            r0 = r12[r3]
            if (r0 == 0) goto L_0x02e9
            java.lang.String r2 = r0.trim()
            if (r2 == 0) goto L_0x02ea
            r1 = r2
        L_0x02d7:
            java.lang.String r0 = "?"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r0 = r11.pop()
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x02ca
        L_0x02e9:
            r2 = 0
        L_0x02ea:
            java.lang.String r1 = ""
            goto L_0x02d7
        L_0x02ed:
            int r5 = r5 + 1
            goto L_0x02a2
        L_0x02f0:
            int r2 = r8.A01
            r0 = 63
            int r0 = r8.A03(r0, r2)
            r3 = -1
            if (r0 == r3) goto L_0x026e
            r1 = 40
            int r0 = r8.A03(r1, r0)
            if (r0 == r3) goto L_0x026e
            r12 = 40
            r5 = 41
            int r1 = r8.A02(r1, r5, r0, r6)
            if (r1 == r3) goto L_0x026e
            r13 = 93
            boolean r0 = r8.A09(r13, r1)
            if (r0 == 0) goto L_0x026e
            int r0 = r8.A03(r13, r1)
            int r3 = r0 + 1
            java.lang.String r2 = X.BE7.A0k(r7, r2, r3)
            X.CsN r4 = new X.CsN
            r4.<init>()
            X.CnF r0 = new X.CnF
            r0.<init>(r2)
            r4.A00 = r0
            r0.A06()
            X.CnF r1 = r4.A00
            r0 = 91
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x047c
            X.CnF r0 = r4.A00
            java.lang.CharSequence r1 = r0.A02
            int r0 = r0.A00
            char r0 = r1.charAt(r0)
            if (r0 != r13) goto L_0x047c
            X.CnF r1 = r4.A00
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            int r0 = r1.A00
            int r0 = r0 - r6
            r1.A00 = r0
            r1.A06()
            X.CnF r1 = r4.A00
            r0 = 63
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x046d
            X.CnF r1 = r4.A00
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            r1.A06()
            X.CnF r0 = r4.A00
            boolean r0 = r0.A08(r12)
            if (r0 == 0) goto L_0x045e
            X.CnF r0 = r4.A00
            java.lang.CharSequence r1 = r0.A02
            int r0 = r0.A00
            char r0 = r1.charAt(r0)
            if (r0 != r5) goto L_0x045e
            goto L_0x03f6
        L_0x037e:
            int r0 = r8.A01
            int r2 = r0 + 1
            r5 = r2
            r1 = 93
        L_0x0385:
            boolean r0 = r8.A0A(r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0255
            char r0 = r7.charAt(r5)
            if (r0 != r1) goto L_0x03c8
            r0 = -1
            if (r5 == r0) goto L_0x0255
            java.lang.String r0 = X.BE7.A0k(r7, r2, r5)
            java.lang.String r2 = r0.trim()
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0255
            r11 = 0
        L_0x03a7:
            int r4 = r2.length()
            if (r11 >= r4) goto L_0x048b
            char r1 = r2.charAt(r11)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x03c5
            r0 = 44
            if (r1 == r0) goto L_0x03c5
            if (r1 == r12) goto L_0x03c5
            if (r1 == r13) goto L_0x03c5
            r0 = 32
            if (r1 == r0) goto L_0x03c5
            goto L_0x0255
        L_0x03c5:
            int r11 = r11 + 1
            goto L_0x03a7
        L_0x03c8:
            int r5 = r5 + 1
            goto L_0x0385
        L_0x03cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected '?' but found "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x03da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Not enough predicates supplied for filter ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] at position "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x03f6:
            X.DNv r2 = X.C26103CsN.A01(r4)     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            X.CnF r7 = r4.A00     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            r7.A05()     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            int r5 = r7.A01     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            boolean r0 = r7.A0A(r5)     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            if (r0 != 0) goto L_0x041b
            X.DNw r1 = new X.DNw
            r1.<init>(r2)
            X.BpH r0 = new X.BpH
            r0.<init>((X.E6J) r1)
            r10.A00(r0)
            r8.A01 = r3
            int r0 = r8.A00
            if (r3 < r0) goto L_0x0687
            return r6
        L_0x041b:
            java.lang.String r3 = "Expected end of filter expression instead of: %s"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            int r0 = r7.A00     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            int r1 = r0 + 1
            java.lang.CharSequence r0 = r7.A02     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            java.lang.CharSequence r0 = r0.subSequence(r5, r1)     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r0, r3, r2, r11)     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            X.Bom r0 = X.C23741Bom.A00(r0)     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
            throw r0     // Catch:{ Bom -> 0x045c, Exception -> 0x0432 }
        L_0x0432:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to parse filter: "
            r3.append(r0)
            X.CnF r2 = r4.A00
            r3.append(r2)
            java.lang.String r0 = ", error on position: "
            r3.append(r0)
            int r1 = r2.A01
            r3.append(r1)
            java.lang.String r0 = ", char: "
            r3.append(r0)
            char r0 = X.C25853CnF.A00(r2, r1)
            java.lang.String r0 = X.C17890vO.A0c(r3, r0)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x045c:
            r0 = move-exception
            throw r0
        L_0x045e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Filter must start with '[?(' and end with ')]'. "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x046d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Filter must start with '[?' and end with ']'. "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x047c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Filter must start with '[' and end with ']'. "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x048b:
            java.lang.String r14 = ":"
            boolean r0 = r2.contains(r14)
            r7 = 0
            if (r0 == 0) goto L_0x04b2
        L_0x0494:
            java.lang.String r11 = "Failed to parse SliceOperation: "
            if (r7 >= r4) goto L_0x0510
            char r1 = r2.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x04af
            if (r1 == r12) goto L_0x04af
            if (r1 == r13) goto L_0x04af
            java.lang.String r0 = X.C17900vP.A0A(r11, r2)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x04af:
            int r7 = r7 + 1
            goto L_0x0494
        L_0x04b2:
            if (r3 >= r4) goto L_0x04da
            char r1 = r2.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x04d7
            r0 = 44
            if (r1 == r0) goto L_0x04d7
            r0 = 32
            if (r1 == r0) goto L_0x04d7
            if (r1 == r12) goto L_0x04d7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to parse ArrayIndexOperation: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x04d7:
            int r3 = r3 + 1
            goto L_0x04b2
        L_0x04da:
            java.util.regex.Pattern r1 = X.C25641CjU.A01
            r0 = -1
            java.lang.String[] r4 = r1.split(r2, r0)
            int r2 = r4.length
            java.util.ArrayList r1 = X.C17880vN.A0z(r2)
        L_0x04e6:
            if (r7 >= r2) goto L_0x0505
            r3 = r4[r7]
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x04f4 }
            X.C17890vO.A1D(r1, r0)     // Catch:{ Exception -> 0x04f4 }
            int r7 = r7 + 1
            goto L_0x04e6
        L_0x04f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to parse token in ArrayIndexOperation: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.Bom r0 = new X.Bom
            r0.<init>(r1, r2)
            throw r0
        L_0x0505:
            X.CjU r0 = new X.CjU
            r0.<init>(r1)
            X.BpA r1 = new X.BpA
            r1.<init>(r0)
            goto L_0x0545
        L_0x0510:
            java.lang.String[] r13 = r2.split(r14)
            int r12 = r13.length
            r7 = 0
            if (r12 <= r3) goto L_0x0568
            r1 = r13[r3]
            java.lang.String r4 = ""
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x0551
            r3 = r7
        L_0x0523:
            if (r12 <= r6) goto L_0x0535
            r1 = r13[r6]
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x0535
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0535:
            if (r3 == 0) goto L_0x054c
            if (r7 != 0) goto L_0x0549
            java.lang.Integer r1 = X.AnonymousClass00R.A00
        L_0x053b:
            X.CWJ r0 = new X.CWJ
            r0.<init>(r3, r7, r1)
            X.BpB r1 = new X.BpB
            r1.<init>(r0)
        L_0x0545:
            r10.A00(r1)
            goto L_0x0562
        L_0x0549:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x053b
        L_0x054c:
            if (r7 == 0) goto L_0x0568
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x053b
        L_0x0551:
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0523
        L_0x055a:
            X.BpH r0 = new X.BpH
            r0.<init>((java.util.Collection) r4)
            r10.A00(r0)
        L_0x0562:
            int r1 = r5 + 1
            r8.A01 = r1
            goto L_0x0676
        L_0x0568:
            java.lang.String r0 = X.C17900vP.A0A(r11, r2)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x0571:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            int r0 = r8.A01
            int r4 = r0 + 1
            r12 = r4
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
        L_0x0580:
            boolean r0 = r8.A0A(r4)
            r13 = 93
            if (r0 == 0) goto L_0x059a
            char r11 = r7.charAt(r4)
            if (r17 == 0) goto L_0x0593
            r17 = 0
        L_0x0590:
            int r4 = r4 + 1
            goto L_0x0580
        L_0x0593:
            r0 = 92
            if (r0 != r11) goto L_0x05d0
            r17 = 1
            goto L_0x0590
        L_0x059a:
            if (r16 == 0) goto L_0x05fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Property has not been closed - missing closing "
            r1.append(r0)
            r1.append(r2)
            goto L_0x05c3
        L_0x05a9:
            r1 = 44
            if (r11 != r2) goto L_0x05c8
            if (r16 == 0) goto L_0x05f4
            char r0 = r8.A01(r4)
            if (r0 == r13) goto L_0x05e5
            if (r0 == r1) goto L_0x05e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Property must be separated by comma or Property must be terminated close square bracket at index "
            r1.append(r0)
            r1.append(r4)
        L_0x05c3:
            java.lang.String r0 = r1.toString()
            goto L_0x05e0
        L_0x05c8:
            if (r11 != r1) goto L_0x0590
            if (r16 != 0) goto L_0x0590
            if (r15 != 0) goto L_0x05d8
            r15 = 1
            goto L_0x0590
        L_0x05d0:
            java.lang.String r3 = "Found empty property at index "
            if (r11 != r13) goto L_0x05a9
            if (r16 != 0) goto L_0x0590
            if (r15 == 0) goto L_0x05fa
        L_0x05d8:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1I(r3, r0, r4)
        L_0x05e0:
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x05e5:
            java.lang.String r0 = X.BE7.A0k(r7, r12, r4)
            java.lang.String r0 = X.C25888Cnz.A01(r0)
            r5.add(r0)
            r14 = r4
            r16 = 0
            goto L_0x0590
        L_0x05f4:
            int r12 = r4 + 1
            r16 = 1
            r15 = 0
            goto L_0x0590
        L_0x05fa:
            int r0 = r8.A03(r13, r14)
            int r0 = r0 + 1
            r8.A01 = r0
            X.BpE r0 = new X.BpE
            r0.<init>(r5, r2)
            r10.A00(r0)
            goto L_0x0674
        L_0x060b:
            boolean r0 = r9.A03(r10)
            goto L_0x063e
        L_0x0610:
            boolean r0 = r8.A08(r1)
            if (r0 == 0) goto L_0x0652
            int r0 = r8.A01
            int r2 = r0 + 1
            boolean r0 = r8.A0A(r2)
            if (r0 == 0) goto L_0x0652
            char r0 = r7.charAt(r2)
            if (r0 != r1) goto L_0x0652
            X.BpI r0 = new X.BpI
            r0.<init>()
            r10.A00(r0)
            r2 = 2
        L_0x062f:
            int r0 = r8.A01
            int r0 = r0 + r2
            r8.A01 = r0
            boolean r0 = r8.A08(r1)
            if (r0 != 0) goto L_0x06a4
            boolean r0 = r9.A02(r10)
        L_0x063e:
            if (r0 != 0) goto L_0x067a
        L_0x0640:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)
            int r0 = r8.A01
            r1.append(r0)
        L_0x0649:
            java.lang.String r0 = r1.toString()
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x0652:
            int r0 = r8.A01
            int r0 = r0 + 1
            boolean r0 = r8.A0A(r0)
            if (r0 == 0) goto L_0x06bd
            r2 = 1
            goto L_0x062f
        L_0x065e:
            if (r20 != 0) goto L_0x068b
            if (r2 != 0) goto L_0x068b
            if (r18 != 0) goto L_0x068b
        L_0x0664:
            r0 = r25
            java.lang.String r0 = X.BE7.A0k(r7, r0, r5)
            if (r24 == 0) goto L_0x067b
            X.BpF r2 = new X.BpF
            r2.<init>(r0, r4)
        L_0x0671:
            r10.A00(r2)
        L_0x0674:
            int r1 = r8.A01
        L_0x0676:
            int r0 = r8.A00
            if (r1 < r0) goto L_0x0687
        L_0x067a:
            return r6
        L_0x067b:
            r1 = 39
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.BpE r2 = new X.BpE
            r2.<init>(r0, r1)
            goto L_0x0671
        L_0x0687:
            r9.A02(r10)
            return r6
        L_0x068b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x06a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Character '.' on position "
            r1.append(r0)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = " is not valid."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        L_0x06bd:
            java.lang.String r0 = "Path must not end with a '."
            X.Bom r0 = X.C23741Bom.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26182Cu5.A02(X.CVP):boolean");
    }

    private boolean A03(CVP cvp) {
        C25853CnF cnF = this.A00;
        boolean A08 = cnF.A08('[');
        if (A08 && !cnF.A09('*', cnF.A01)) {
            return false;
        }
        if (!cnF.A08('*') && (!cnF.A0A(cnF.A01 + 1))) {
            return false;
        }
        int i = cnF.A01;
        if (A08) {
            int A03 = cnF.A03('*', i);
            if (cnF.A09(']', A03)) {
                i = cnF.A03(']', A03);
            } else {
                throw C23741Bom.A00(AnonymousClass001.A1I("Expected wildcard token to end with ']' on position ", AnonymousClass000.A10(), A03 + 1));
            }
        }
        int i2 = i + 1;
        cnF.A01 = i2;
        cvp.A00(new C25278Cca());
        if (i2 >= cnF.A00) {
            return true;
        }
        A02(cvp);
        return true;
    }

    public C26182Cu5(C25853CnF cnF, LinkedList linkedList) {
        this.A01 = linkedList;
        this.A00 = cnF;
    }
}
