package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.CtO  reason: case insensitive filesystem */
public abstract class C26156CtO {
    public static boolean[] A0J;
    public static boolean[] A0K;
    public static boolean[] A0L;
    public static boolean[] A0M;
    public static boolean[] A0N;
    public char A00;
    public int A01;
    public Object A02;
    public String A03;
    public CWO A04;
    public String A05;
    public final C6O A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static C2P A00(C26156CtO ctO, char c) {
        return new C2P(Character.valueOf(c), ctO.A01, 0);
    }

    public abstract Object A05(boolean[] zArr);

    public void A07() {
        char charAt;
        C28245Du6 du6 = (C28245Du6) this;
        int i = du6.A01 + 1;
        du6.A01 = i;
        if (i >= du6.A00) {
            charAt = 26;
        } else {
            charAt = du6.A01.charAt(i);
        }
        du6.A00 = charAt;
    }

    public void A08() {
        char charAt;
        C28245Du6 du6 = (C28245Du6) this;
        int i = du6.A01 + 1;
        du6.A01 = i;
        if (i >= du6.A00) {
            charAt = 26;
        } else {
            charAt = du6.A01.charAt(i);
        }
        du6.A00 = charAt;
    }

    public void A09() {
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        C28245Du6 du6 = (C28245Du6) this;
        if (du6.A0A || (c2 = du6.A00) != '\'') {
            char c3 = du6.A00;
            int i4 = du6.A01 + 1;
            String str = du6.A01;
            int indexOf = str.indexOf(c3, i4);
            if (indexOf != -1) {
                String substring = str.substring(i4, indexOf);
                du6.A03 = substring;
                if (substring.indexOf(92) == -1) {
                    if (!du6.A0D) {
                        int length = substring.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            char charAt = du6.A03.charAt(i5);
                            if (charAt >= 0) {
                                if (charAt <= 31) {
                                    throw new C2P(Character.valueOf(charAt), du6.A01 + i5, 0);
                                } else if (charAt == 127 && du6.A0E) {
                                    throw new C2P(Character.valueOf(charAt), du6.A01 + i5, 0);
                                }
                            }
                        }
                    }
                    du6.A01 = indexOf;
                    du6.A07();
                    return;
                }
                C6O c6o = du6.A06;
                c6o.A00 = -1;
                char c4 = du6.A00;
                while (true) {
                    du6.A07();
                    char c5 = du6.A00;
                    char c6 = '\"';
                    if (c5 == '\"' || c5 == '\'') {
                        if (c4 == c5) {
                            du6.A07();
                            du6.A03 = c6o.toString();
                            return;
                        }
                    } else if (c5 == '\\') {
                        du6.A07();
                        char c7 = du6.A00;
                        if (c7 != '\"') {
                            if (c7 != '\'') {
                                c6 = '/';
                                if (c7 != '/') {
                                    if (c7 == '\\') {
                                        c6o.A00('\\');
                                    } else if (c7 == 'b') {
                                        c6 = 8;
                                    } else if (c7 == 'f') {
                                        c6 = 12;
                                    } else if (c7 == 'n') {
                                        c6 = 10;
                                    } else if (c7 != 'r') {
                                        if (c7 == 'x') {
                                            i = 2;
                                        } else if (c7 == 't') {
                                            c6 = 9;
                                        } else if (c7 == 'u') {
                                            i = 4;
                                        } else {
                                            continue;
                                        }
                                        int i6 = 0;
                                        int i7 = 0;
                                        do {
                                            int i8 = i7 * 16;
                                            du6.A07();
                                            c = du6.A00;
                                            if (c <= '9') {
                                                i2 = c - '0';
                                                if (c < '0') {
                                                    if (c == 26) {
                                                        throw new C2P("EOF", du6.A01, 3);
                                                    }
                                                }
                                            } else {
                                                if (c <= 'F') {
                                                    if (c >= 'A') {
                                                        i3 = c - 'A';
                                                    }
                                                } else if (c >= 'a' && c <= 'f') {
                                                    i3 = c - 'a';
                                                }
                                                i2 = i3 + 10;
                                            }
                                            i7 = i8 + i2;
                                            i6++;
                                        } while (i6 < i);
                                        c6 = (char) i7;
                                    } else {
                                        c6 = 13;
                                    }
                                }
                            } else {
                                c6o.A00('\'');
                            }
                        }
                        c6o.A00(c6);
                    } else if (c5 != 127) {
                        switch (c5) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (!du6.A0D) {
                                    throw A00(du6, c5);
                                }
                                continue;
                            case 26:
                                throw new C2P((Object) null, du6.A01 - 1, 3);
                        }
                    } else if (du6.A0D) {
                        continue;
                    } else if (du6.A0E) {
                        throw A00(du6, c5);
                    }
                    c6o.A00(c5);
                }
                throw new C2P(Character.valueOf(c), du6.A01, 4);
            }
            throw new C2P((Object) null, du6.A00, 3);
        } else if (du6.A09) {
            du6.A0B(A0J);
        } else {
            throw new C2P(Character.valueOf(c2), du6.A01, 0);
        }
    }

    public void A0B(boolean[] zArr) {
        C28245Du6 du6 = (C28245Du6) this;
        int i = du6.A01;
        du6.A0C(zArr);
        du6.A0E(i, du6.A01);
    }

    static {
        boolean[] zArr = new boolean[126];
        A0J = zArr;
        boolean[] zArr2 = new boolean[126];
        A0L = zArr2;
        boolean[] zArr3 = new boolean[126];
        A0M = zArr3;
        boolean[] zArr4 = new boolean[126];
        A0N = zArr4;
        boolean[] zArr5 = new boolean[126];
        A0K = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public static C2P A01(C26156CtO ctO, int i) {
        return new C2P(ctO.A03, ctO.A01, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0112, code lost:
        throw A00(r13, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.C25769Clg r14) {
        /*
            r13 = this;
            char r0 = r13.A00
            r9 = 123(0x7b, float:1.72E-43)
            if (r0 != r9) goto L_0x0113
            java.lang.Object r8 = r14.A02()
            r7 = 0
            r2 = 0
        L_0x000c:
            r13.A07()
            char r1 = r13.A00
            r0 = 9
            if (r1 == r0) goto L_0x000c
            r0 = 10
            if (r1 == r0) goto L_0x000c
            r0 = 13
            if (r1 == r0) goto L_0x000c
            r0 = 32
            if (r1 == r0) goto L_0x000c
            r10 = 44
            r6 = 1
            if (r1 == r10) goto L_0x00b9
            r11 = 58
            if (r1 == r11) goto L_0x010e
            r0 = 91
            if (r1 == r0) goto L_0x010e
            r0 = 93
            if (r1 == r0) goto L_0x010e
            if (r1 == r9) goto L_0x010e
            r5 = 125(0x7d, float:1.75E-43)
            if (r1 == r5) goto L_0x00fb
            r0 = 34
            if (r1 == r0) goto L_0x004e
            r0 = 39
            if (r1 == r0) goto L_0x004e
            boolean[] r0 = A0M
            r13.A0B(r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0051
            X.C2P r2 = A01(r13, r6)
            throw r2
        L_0x004e:
            r13.A09()
        L_0x0051:
            java.lang.String r4 = r13.A03
            r13.A0A()
            char r0 = r13.A00
            r3 = 3
            r2 = 26
            r1 = 0
            if (r0 == r11) goto L_0x0069
            int r4 = r13.A01
            int r4 = r4 - r6
            if (r0 != r2) goto L_0x00c7
            X.C2P r2 = new X.C2P
            r2.<init>(r1, r4, r3)
            throw r2
        L_0x0069:
            r11 = r13
            X.Du6 r11 = (X.C28245Du6) r11
            int r0 = r11.A01
            int r12 = r0 + 1
            r11.A01 = r12
            int r0 = r11.A00
            if (r12 >= r0) goto L_0x00ef
            java.lang.String r0 = r11.A01
            char r0 = r0.charAt(r12)
            r11.A00 = r0
            r13.A05 = r4
            boolean[] r0 = A0N
            java.lang.Object r11 = r13.A04(r14, r0)
            boolean r0 = r14 instanceof X.C28249DuA
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r14 instanceof X.C28250DuB
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r14 instanceof X.C28248Du9
            if (r0 == 0) goto L_0x00da
            r0 = r8
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r4, r11)
        L_0x0098:
            r13.A05 = r1
            r13.A0A()
            char r0 = r13.A00
            if (r0 == r5) goto L_0x0106
            if (r0 == r2) goto L_0x00d1
            if (r0 == r10) goto L_0x00c4
            int r1 = r13.A01
            int r1 = r1 - r6
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            X.C2P r2 = new X.C2P
            r2.<init>(r0, r1, r6)
            throw r2
        L_0x00b2:
            r0 = r8
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r4, r11)
            goto L_0x0098
        L_0x00b9:
            if (r2 == 0) goto L_0x00c4
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x00c4
            X.C2P r2 = A00(r13, r1)
            throw r2
        L_0x00c4:
            r2 = 1
            goto L_0x000c
        L_0x00c7:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            X.C2P r2 = new X.C2P
            r2.<init>(r0, r4, r7)
            throw r2
        L_0x00d1:
            int r0 = r13.A01
            int r0 = r0 - r6
            X.C2P r2 = new X.C2P
            r2.<init>(r1, r0, r3)
            throw r2
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " setValue in "
            X.BE9.A1G(r14, r0, r1)
            java.lang.String r0 = " key="
            java.lang.RuntimeException r2 = X.BEA.A0g(r0, r4, r1)
            throw r2
        L_0x00ef:
            r11.A00 = r2
            int r1 = r12 + -1
            java.lang.String r0 = "EOF"
            X.C2P r2 = new X.C2P
            r2.<init>(r0, r1, r3)
            throw r2
        L_0x00fb:
            if (r2 == 0) goto L_0x0106
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x0106
            X.C2P r2 = A00(r13, r1)
            throw r2
        L_0x0106:
            r13.A07()
            java.lang.Object r0 = r14.A03(r8)
            return r0
        L_0x010e:
            X.C2P r2 = A00(r13, r1)
            throw r2
        L_0x0113:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r2 = X.AnonymousClass8BR.A0w(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26156CtO.A03(X.Clg):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return A05(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        throw new X.C2P(java.lang.Character.valueOf(r1), r4.A01, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C25769Clg r5, boolean[] r6) {
        /*
            r4 = this;
        L_0x0000:
            char r1 = r4.A00
            r0 = 9
            if (r1 == r0) goto L_0x001b
            r0 = 10
            if (r1 == r0) goto L_0x001b
            r2 = 1
            switch(r1) {
                case 13: goto L_0x001b;
                case 32: goto L_0x001b;
                case 34: goto L_0x0024;
                case 39: goto L_0x0024;
                case 45: goto L_0x002a;
                case 78: goto L_0x002f;
                case 91: goto L_0x0058;
                case 93: goto L_0x009f;
                case 102: goto L_0x00ac;
                case 110: goto L_0x00c8;
                case 116: goto L_0x00e3;
                case 123: goto L_0x0100;
                case 125: goto L_0x009f;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r1) {
                case 48: goto L_0x002a;
                case 49: goto L_0x002a;
                case 50: goto L_0x002a;
                case 51: goto L_0x002a;
                case 52: goto L_0x002a;
                case 53: goto L_0x002a;
                case 54: goto L_0x002a;
                case 55: goto L_0x002a;
                case 56: goto L_0x002a;
                case 57: goto L_0x002a;
                case 58: goto L_0x009f;
                default: goto L_0x0011;
            }
        L_0x0011:
            r4.A0B(r6)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r4.A03
            return r0
        L_0x001b:
            r4.A07()
            goto L_0x0000
        L_0x001f:
            X.C2P r0 = A01(r4, r2)
            throw r0
        L_0x0024:
            r4.A09()
            java.lang.String r0 = r4.A03
            return r0
        L_0x002a:
            java.lang.Object r0 = r4.A05(r6)
            return r0
        L_0x002f:
            r4.A0B(r6)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "NaN"
            java.lang.String r3 = r4.A03
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0047
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0047:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x00ff
            int r1 = r4.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0053:
            X.C2P r0 = A01(r4, r2)
            throw r0
        L_0x0058:
            java.lang.String r2 = r4.A05
            boolean r0 = r5 instanceof X.C28249DuA
            if (r0 == 0) goto L_0x0067
            X.CWO r0 = r5.A00
            X.Clg r5 = r0.A01
        L_0x0062:
            java.lang.Object r0 = r4.A02(r5)
            return r0
        L_0x0067:
            boolean r0 = r5 instanceof X.C28250DuB
            if (r0 != 0) goto L_0x0062
            boolean r0 = r5 instanceof X.C28248Du9
            if (r0 == 0) goto L_0x0074
            X.CWO r0 = r5.A00
            X.Clg r5 = r0.A00
            goto L_0x0062
        L_0x0074:
            boolean r0 = r5 instanceof X.C28246Du7
            if (r0 == 0) goto L_0x008a
            r2 = r5
            X.Du7 r2 = (X.C28246Du7) r2
            X.Clg r5 = r2.A00
            if (r5 != 0) goto L_0x0062
            X.CWO r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.Clg r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x0062
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startArray in "
            X.BE9.A1G(r5, r0, r1)
            java.lang.String r0 = " key="
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r2, r1)
            throw r0
        L_0x009f:
            int r3 = r4.A01
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            r1 = 0
            X.C2P r0 = new X.C2P
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x00ac:
            r4.A0B(r6)
            java.lang.String r0 = "false"
            java.lang.String r3 = r4.A03
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00bc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00bc:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x00ff
            int r1 = r4.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00c8:
            r4.A0B(r6)
            java.lang.String r0 = "null"
            java.lang.String r3 = r4.A03
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d7
            r0 = 0
            return r0
        L_0x00d7:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x00ff
            int r1 = r4.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00e3:
            r4.A0B(r6)
            java.lang.String r0 = "true"
            java.lang.String r3 = r4.A03
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00f3:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x00ff
            int r1 = r4.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00ff:
            return r3
        L_0x0100:
            java.lang.String r2 = r4.A05
            boolean r0 = r5 instanceof X.C28249DuA
            if (r0 == 0) goto L_0x010f
            X.CWO r0 = r5.A00
            X.Clg r5 = r0.A01
        L_0x010a:
            java.lang.Object r0 = r4.A03(r5)
            return r0
        L_0x010f:
            boolean r0 = r5 instanceof X.C28250DuB
            if (r0 != 0) goto L_0x010a
            boolean r0 = r5 instanceof X.C28248Du9
            if (r0 == 0) goto L_0x011c
            X.CWO r0 = r5.A00
            X.Clg r5 = r0.A00
            goto L_0x010a
        L_0x011c:
            boolean r0 = r5 instanceof X.C28246Du7
            if (r0 == 0) goto L_0x0132
            r2 = r5
            X.Du7 r2 = (X.C28246Du7) r2
            X.Clg r5 = r2.A00
            if (r5 != 0) goto L_0x010a
            X.CWO r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.Clg r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x010a
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startObject(String key) in "
            X.BE9.A1G(r5, r0, r1)
            java.lang.String r0 = " key="
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26156CtO.A04(X.Clg, boolean[]):java.lang.Object");
    }

    public void A06() {
        String str = this.A03;
        int length = str.length();
        if (length == 1) {
            return;
        }
        if (length != 2) {
            char A002 = BE7.A00(str);
            char charAt = this.A03.charAt(1);
            if (A002 == '-') {
                char charAt2 = this.A03.charAt(2);
                if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw A01(this, 6);
                }
            } else if (A002 == '0' && charAt >= '0' && charAt <= '9') {
                throw A01(this, 6);
            }
        } else if (str.equals("00")) {
            throw new C2P(str, this.A01, 6);
        }
    }

    public void A0A() {
        while (true) {
            char c = this.A00;
            if (c <= ' ' && c != 26) {
                A08();
            } else {
                return;
            }
        }
    }

    public void A0C(boolean[] zArr) {
        while (true) {
            char c = this.A00;
            if (c == 26) {
                return;
            }
            if (c < 0 || c >= '~' || !zArr[c]) {
                A08();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.C6O] */
    public C26156CtO(int i) {
        ? obj = new Object();
        obj.A01 = new char[15];
        obj.A00 = -1;
        this.A06 = obj;
        boolean z = false;
        this.A08 = AnonymousClass000.A1R(i & 4);
        this.A09 = AnonymousClass000.A1R(i & 2);
        this.A0A = AnonymousClass000.A1R(i & 1);
        this.A0D = AnonymousClass000.A1R(i & 8);
        this.A0H = AnonymousClass000.A1R(i & 16);
        this.A07 = AnonymousClass000.A1R(i & 32);
        this.A0I = AnonymousClass000.A1R(i & 64);
        this.A0G = AnonymousClass000.A1R(i & 128);
        this.A0B = AnonymousClass000.A1S(i & 768, 768);
        this.A0C = AnonymousClass000.A1P(i & 512);
        this.A0E = AnonymousClass000.A1R(i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A0F = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0 ? true : z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r4 == ':') goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r4 == ']') goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == '}') goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r1 = A04(r7, A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if ((r7 instanceof X.C28249DuA) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if ((r7 instanceof X.C28250DuB) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if ((r7 instanceof X.C28248Du9) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        if ((r7 instanceof X.C28260DuL) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Invalid or non Implemented status");
        X.BE9.A1G(r7, " addValue(Object current, Object value) in ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        throw X.BE8.A0f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        ((java.util.List) r2).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        ((java.util.AbstractCollection) r2).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r5 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        if (r6.A0I != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        throw A00(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        return r7.A03(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.C25769Clg r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r7.A01()
            char r1 = r6.A00
            r0 = 91
            if (r1 != r0) goto L_0x00b1
            r6.A07()
            char r1 = r6.A00
            r3 = 44
            if (r1 != r3) goto L_0x001c
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x001c
            X.C2P r3 = A00(r6, r1)
            throw r3
        L_0x001c:
            r5 = 0
        L_0x001d:
            char r4 = r6.A00
            r0 = 9
            if (r4 == r0) goto L_0x0089
            r0 = 10
            if (r4 == r0) goto L_0x0089
            r0 = 13
            if (r4 == r0) goto L_0x0089
            r1 = 26
            r0 = 1
            if (r4 == r1) goto L_0x00a5
            r0 = 32
            if (r4 == r0) goto L_0x0089
            if (r4 == r3) goto L_0x0079
            r0 = 58
            if (r4 == r0) goto L_0x00a0
            r0 = 93
            if (r4 == r0) goto L_0x008d
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x00a0
            boolean[] r0 = A0L
            java.lang.Object r1 = r6.A04(r7, r0)
            boolean r0 = r7 instanceof X.C28249DuA
            if (r0 != 0) goto L_0x0072
            boolean r0 = r7 instanceof X.C28250DuB
            if (r0 != 0) goto L_0x006b
            boolean r0 = r7 instanceof X.C28248Du9
            if (r0 != 0) goto L_0x0072
            boolean r0 = r7 instanceof X.C28260DuL
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " addValue(Object current, Object value) in "
            X.BE9.A1G(r7, r0, r1)
            java.lang.RuntimeException r3 = X.BE8.A0f(r1)
            throw r3
        L_0x006b:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x001c
        L_0x0072:
            r0 = r2
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x001c
        L_0x0079:
            if (r5 == 0) goto L_0x0084
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x0084
            X.C2P r3 = A00(r6, r4)
            throw r3
        L_0x0084:
            r6.A07()
            r5 = 1
            goto L_0x001d
        L_0x0089:
            r6.A07()
            goto L_0x001d
        L_0x008d:
            if (r5 == 0) goto L_0x0098
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x0098
            X.C2P r3 = A00(r6, r4)
            throw r3
        L_0x0098:
            r6.A07()
            java.lang.Object r0 = r7.A03(r2)
            return r0
        L_0x00a0:
            X.C2P r3 = A00(r6, r4)
            throw r3
        L_0x00a5:
            int r2 = r6.A01
            int r2 = r2 - r0
            r1 = 3
            java.lang.String r0 = "EOF"
            X.C2P r3 = new X.C2P
            r3.<init>(r0, r2, r1)
            throw r3
        L_0x00b1:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r3 = X.AnonymousClass8BR.A0w(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26156CtO.A02(X.Clg):java.lang.Object");
    }
}
