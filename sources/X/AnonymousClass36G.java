package X;

import java.math.BigDecimal;

/* renamed from: X.36G  reason: invalid class name */
public class AnonymousClass36G implements C437420t {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public AnonymousClass3KT BXT(AnonymousClass206 r9) {
        String obj;
        String str;
        AnonymousClass1KN r0;
        C18070vi.A0d(r9, 0);
        if (r9 instanceof AnonymousClass210) {
            String str2 = "";
            if (C20097A7a.A05(r9)) {
                obj = ((AnonymousClass36T) this.A01.get()).BS2(r9);
            } else {
                String A0P = r9.A0P();
                if (A0P == null) {
                    A0P = str2;
                }
                StringBuilder sb = new StringBuilder(A0P);
                AnonymousClass210 r2 = (AnonymousClass210) r9;
                String str3 = r2.A06;
                if (!(str3 == null || str3.length() == 0)) {
                    C17900vP.A0p(sb, str3);
                }
                String str4 = r2.A05;
                if (!(str4 == null || str4.length() == 0)) {
                    C17900vP.A0p(sb, str4);
                }
                String str5 = r2.A07;
                if (!(str5 == null || str5.length() == 0)) {
                    C17900vP.A0p(sb, str5);
                }
                AW0 A002 = AnonymousClass25B.A00(r9);
                BigDecimal bigDecimal = null;
                if (!(A002 == null || (r0 = A002.A09) == null)) {
                    bigDecimal = r0.A00;
                }
                AW0 A003 = AnonymousClass25B.A00(r9);
                if (!(A003 == null || (str = A003.A0I) == null || str.length() == 0 || bigDecimal == null)) {
                    String plainString = bigDecimal.toPlainString();
                    C18070vi.A0X(plainString);
                    if (plainString.length() != 0) {
                        String plainString2 = bigDecimal.toPlainString();
                        try {
                            String A03 = new A6S(str).A03((C18000vb) this.A00.get(), bigDecimal, true);
                            C18070vi.A0X(A03);
                            StringBuilder A11 = AnonymousClass000.A11(plainString2);
                            A11.append(' ');
                            A11.append(A03);
                            plainString2 = A11.toString();
                        } catch (IllegalArgumentException unused) {
                        }
                        if (!(plainString2 == null || plainString2.length() == 0)) {
                            C17900vP.A0p(sb, plainString2);
                        }
                    }
                }
                obj = sb.toString();
            }
            if (obj != null) {
                str2 = obj;
            }
            return C690335q.A01(str2);
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r5) {
        String A0P;
        C18070vi.A0d(r5, 0);
        String str = "";
        if (C20097A7a.A05(r5)) {
            String BVQ = ((AnonymousClass36T) this.A01.get()).BVQ(r5);
            StringBuilder A10 = AnonymousClass000.A10();
            String A0P2 = r5.A0P();
            if (A0P2 == null) {
                A0P2 = str;
            }
            A10.append(A0P2);
            A10.append(10);
            if (BVQ != null) {
                str = BVQ;
            }
            str = AnonymousClass1YF.A0I(AnonymousClass000.A0y(str, A10));
        } else {
            String A0S = r5.A0S();
            if (A0S == null || A0S.length() == 0) {
                A0P = r5.A0P();
            } else {
                A0P = r5.A0S();
            }
            if (A0P != null) {
                str = A0P;
            }
        }
        return C690335q.A01(str);
    }

    public AnonymousClass36G(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
