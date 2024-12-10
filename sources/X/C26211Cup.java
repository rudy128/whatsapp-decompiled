package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.Cup  reason: case insensitive filesystem */
public final class C26211Cup {
    public static final C26211Cup A00 = new Object();

    public static final D3N A01(DFL dfl) {
        int A04;
        int A042;
        if (dfl == null) {
            return null;
        }
        String A0e = BE7.A0e(dfl);
        if (A0e == null) {
            A04 = 16777215;
        } else {
            A04 = A90.A04(A0e);
        }
        String A0d = BE7.A0d(dfl);
        if (A0d == null) {
            A042 = 16777215;
        } else {
            A042 = A90.A04(A0d);
        }
        return new D3N(A04, A042);
    }

    public static final D3N A02(DFL dfl) {
        int A04;
        int A042;
        if (dfl == null) {
            return null;
        }
        String A0e = BE7.A0e(dfl);
        if (A0e == null) {
            A04 = -1728053248;
        } else {
            A04 = A90.A04(A0e);
        }
        String A0d = BE7.A0d(dfl);
        if (A0d == null) {
            A042 = -1728053248;
        } else {
            A042 = A90.A04(A0d);
        }
        return new D3N(A04, A042);
    }

    public static final D8F A03(DOZ doz, C23736Boh boh, DFL dfl) {
        D3P d3p;
        D3P d3p2;
        Integer num;
        Integer num2;
        C07 c07;
        C0B c0b;
        C08 c08;
        DFL dfl2 = dfl;
        if (dfl != null) {
            int i = dfl2.A05;
            DOZ doz2 = doz;
            C23736Boh boh2 = boh;
            if (i == 14059) {
                boolean A0I = dfl2.A0I(36, false);
                String str = "FULL_SHEET";
                String A0D = dfl2.A0D(40);
                if (A0D != null) {
                    str = A0D;
                }
                try {
                    if (str.equals("FULL_SHEET")) {
                        num = AnonymousClass00R.A00;
                    } else if (str.equals("HALF_SHEET")) {
                        num = AnonymousClass00R.A01;
                    } else {
                        throw AnonymousClass000.A0k(str);
                    }
                } catch (IllegalArgumentException e) {
                    C25913CoX.A02(D8F.A0T, e);
                    num = AnonymousClass00R.A00;
                }
                String str2 = "NEVER_ANIMATED";
                String A0D2 = dfl2.A0D(46);
                if (A0D2 != null) {
                    str2 = A0D2;
                }
                try {
                    if (str2.equals("ALWAYS_ANIMATED")) {
                        num2 = AnonymousClass00R.A00;
                    } else if (str2.equals("DISABLED")) {
                        num2 = AnonymousClass00R.A01;
                    } else if (str2.equals("NEVER_ANIMATED")) {
                        num2 = AnonymousClass00R.A0C;
                    } else if (str2.equals("ONLY_ANIMATED_WHILE_LOADING")) {
                        num2 = AnonymousClass00R.A0N;
                    } else {
                        throw AnonymousClass000.A0k(str2);
                    }
                } catch (IllegalArgumentException e2) {
                    C25913CoX.A02(D8F.A0T, e2);
                    num2 = AnonymousClass00R.A0C;
                }
                E8A A0A = dfl2.A0A(42);
                if (A0I) {
                    c07 = C07.DISABLED;
                } else {
                    c07 = C07.ENABLED;
                }
                Integer num3 = AnonymousClass00R.A00;
                if (num == num3) {
                    c0b = C0B.FULL_SHEET;
                } else {
                    c0b = C0B.HALF_SHEET;
                }
                int intValue = num2.intValue();
                if (intValue == 0) {
                    c08 = C08.ANIMATED;
                } else if (intValue == 1) {
                    c08 = C08.DISABLED;
                } else if (intValue != 3) {
                    c08 = C08.STATIC;
                } else {
                    c08 = C08.ANIMATED_WHILE_LOADING;
                }
                D3L d3l = new D3L(new DOX(doz2, boh2, dfl2, A0A));
                CjD cjD = D8F.A0O;
                Integer num4 = AnonymousClass00R.A0C;
                C06 c06 = C06.AUTO;
                return new D8F((D3N) null, (D3N) null, C23774BpJ.A00, (D3E) null, d3l, c08, (D3P) null, C05.SAME_SIZE, c06, c07, c0b, (C123686Vl) null, num4, (Integer) null, (Integer) null, num3, (String) null, 16542, false, false, false, false, false);
            }
            String str3 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
            String str4 = "full_sheet";
            String str5 = "auto";
            if (i == 16085) {
                String str6 = str5;
                String A0D3 = dfl2.A0D(36);
                if (A0D3 != null) {
                    str6 = A0D3;
                }
                C19810z2 r1 = C07.A01;
                C07 A002 = CCN.A00(str6);
                String A0f = BE7.A0f(dfl2);
                if (A0f != null) {
                    str4 = A0f;
                }
                C19810z2 r12 = C0B.A01;
                C0B A003 = CCO.A00(str4);
                String str7 = "static";
                String A0d = BE7.A0d(dfl2);
                if (A0d != null) {
                    str7 = A0d;
                }
                C19810z2 r13 = C08.A01;
                C08 A004 = CCL.A00(str7);
                String A0D4 = dfl2.A0D(43);
                if (A0D4 != null) {
                    str5 = A0D4;
                }
                C19810z2 r14 = C06.A01;
                C06 A005 = CCM.A00(str5);
                D3N A02 = A02(dfl2.A09(55));
                String A0D5 = dfl2.A0D(45);
                if (A0D5 != null) {
                    str3 = A0D5;
                }
                Integer A006 = C25301Cd5.A00(str3);
                C18070vi.A0X(A006);
                D3N A01 = A01(dfl2.A09(57));
                DFL A09 = dfl2.A09(58);
                if (A09 == null) {
                    d3p2 = null;
                } else {
                    d3p2 = new D3P(A00(A09, 36), A00(A09, 40), A00(A09, 38), A00(A09, 35));
                }
                E8A A0A2 = dfl2.A0A(40);
                boolean A0I2 = dfl2.A0I(48, false);
                D3L d3l2 = new D3L(new DOX(doz2, boh2, dfl2, A0A2));
                CjD cjD2 = D8F.A0O;
                Integer num5 = AnonymousClass00R.A0C;
                return new D8F(A02, A01, C23774BpJ.A00, (D3E) null, d3l2, A004, d3p2, C05.SAME_SIZE, A005, A002, A003, (C123686Vl) null, num5, (Integer) null, A006, AnonymousClass00R.A00, (String) null, 16542, A0I2, false, false, false, false);
            } else if (i == 16542) {
                String A0d2 = BE7.A0d(dfl2);
                if (A0d2 != null) {
                    str4 = A0d2;
                }
                C19810z2 r15 = C0B.A01;
                C0B A007 = CCO.A00(str4);
                String A0f2 = BE7.A0f(dfl2);
                if (A0f2 != null) {
                    str5 = A0f2;
                }
                C19810z2 r16 = C07.A01;
                C07 A008 = CCN.A00(str5);
                String str8 = "adjust_pan";
                String A0D6 = dfl2.A0D(40);
                if (A0D6 != null) {
                    str8 = A0D6;
                }
                int hashCode = str8.hashCode();
                int i2 = 32;
                if (hashCode != -1009740956) {
                    if (hashCode == -205076707 && str8.equals("adjust_nothing")) {
                        i2 = 48;
                    }
                } else if (str8.equals("adjust_resize")) {
                    i2 = 16;
                }
                String A0h = BE7.A0h(dfl2);
                if (A0h != null) {
                    str3 = A0h;
                }
                Integer A009 = C25301Cd5.A00(str3);
                C18070vi.A0X(A009);
                D3N A022 = A02(dfl2.A09(52));
                D3N A012 = A01(dfl2.A09(54));
                DFL A092 = dfl2.A09(55);
                if (A092 == null) {
                    d3p = null;
                } else {
                    d3p = new D3P(A00(A092, 36), A00(A092, 40), A00(A092, 38), A00(A092, 35));
                }
                CjD cjD3 = D8F.A0O;
                Integer num6 = AnonymousClass00R.A0C;
                C08 c082 = C08.STATIC;
                C06 c062 = C06.AUTO;
                Integer valueOf = Integer.valueOf(i2);
                return new D8F(A022, A012, C23774BpJ.A00, (D3E) null, (D3L) null, c082, d3p, C05.SAME_SIZE, c062, A008, A007, (C123686Vl) null, num6, valueOf, A009, AnonymousClass00R.A00, (String) null, 16542, false, false, false, false, false);
            } else {
                String str9 = D8F.A0T;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Error matching OpenCDSSCreenConfig from options styleId: ");
                C25913CoX.A01(str9, C17890vO.A0V(BE7.A0P(dfl2), A10));
            }
        }
        C0B c0b2 = D8F.A0S;
        C18070vi.A0d(c0b2, 1);
        Integer num7 = AnonymousClass00R.A0C;
        C07 c072 = D8F.A0R;
        C08 c083 = D8F.A0N;
        C06 c063 = D8F.A0Q;
        C05 c05 = D8F.A0P;
        if (CCK.A00()) {
            c05 = C05.TOP_ROUNDED;
        }
        return new D8F((D3N) null, (D3N) null, C23774BpJ.A00, (D3E) null, (D3L) null, c083, (D3P) null, c05, c063, c072, c0b2, (C123686Vl) null, num7, (Integer) null, (Integer) null, (Integer) null, (String) null, 16542, false, false, false, false, false);
    }

    public static final int A00(DFL dfl, int i) {
        String str;
        StringBuilder A10;
        float A01;
        String A0D = dfl.A0D(i);
        if (A0D == null) {
            A01 = 4.0f;
        } else {
            try {
                A01 = A90.A01(A0D);
            } catch (AnonymousClass9HX unused) {
                if (i != 35) {
                    if (i == 36) {
                        str = "left";
                    } else if (i == 38) {
                        str = "right";
                    } else if (i != 40) {
                        A10 = AnonymousClass000.A10();
                        A10.append("Invalid BottomSheetMargin prop constant: ");
                        A10.append(i);
                    } else {
                        str = "top";
                    }
                    A10 = AnonymousClass000.A10();
                    A10.append("Invalid format for bottom-sheet-margin prop ");
                    A10.append(str);
                    A10.append(" : ");
                    A10.append(A0D);
                } else {
                    str = "bottom";
                    A10 = AnonymousClass000.A10();
                    A10.append("Invalid format for bottom-sheet-margin prop ");
                    A10.append(str);
                    A10.append(" : ");
                    A10.append(A0D);
                }
                C25913CoX.A01("BloksCdsOpenScreenConfig", A10.toString());
                return 0;
            }
        }
        return (int) A01;
    }
}
