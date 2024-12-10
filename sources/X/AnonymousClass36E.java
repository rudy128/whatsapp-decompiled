package X;

import java.math.BigDecimal;

/* renamed from: X.36E  reason: invalid class name */
public final class AnonymousClass36E implements C437420t {
    public final AnonymousClass00H A00;
    public final AnonymousClass118 A01;

    public AnonymousClass3KT BXT(AnonymousClass206 r8) {
        C18070vi.A0d(r8, 0);
        AnonymousClass22Q r82 = (AnonymousClass22Q) r8;
        String str = r82.A0A;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = r82.A02;
        if (str2 != null && str2.length() > 0) {
            C17900vP.A0p(sb, str2);
        }
        String str3 = r82.A05;
        if (str3 != null && str3.length() > 0) {
            C17900vP.A0p(sb, str3);
        }
        String str4 = r82.A04;
        if (str4 != null && str4.length() > 0) {
            C17900vP.A0p(sb, str4);
        }
        BigDecimal bigDecimal = r82.A0B;
        String str5 = r82.A03;
        if (!(bigDecimal == null || str5 == null || str5.length() == 0)) {
            A6S a6s = new A6S(str5);
            AnonymousClass00H r4 = this.A00;
            String A03 = a6s.A03((C18000vb) r4.get(), bigDecimal, true);
            C18070vi.A0X(A03);
            sb.append(" ");
            sb.append(A03);
            BigDecimal bigDecimal2 = r82.A0C;
            if (!(bigDecimal2 == null || BigDecimal.ZERO.compareTo(bigDecimal2) == 0)) {
                String A032 = a6s.A03((C18000vb) r4.get(), bigDecimal2, true);
                C18070vi.A0X(A032);
                sb.append(" ");
                sb.append(A032);
            }
        }
        return C690335q.A01(C18070vi.A0H(sb));
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        AnonymousClass22Q r62 = (AnonymousClass22Q) r6;
        StringBuilder A10 = AnonymousClass000.A10();
        String str = r62.A02;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        A10.append(str);
        A10.append(' ');
        String str3 = r62.A05;
        if (str3 == null) {
            str3 = str2;
        }
        String A0I = AnonymousClass1YF.A0I(AnonymousClass000.A0y(str3, A10));
        StringBuilder A102 = AnonymousClass000.A10();
        String str4 = r62.A0A;
        if (str4 != null) {
            str2 = str4;
        }
        A102.append(str2);
        return C690335q.A00(C61522pp.A03, AnonymousClass1YF.A0I(C17890vO.A0Z(A0I, A102, ' ')), "🛒", this.A01.A01(2131889032));
    }

    public AnonymousClass36E(AnonymousClass118 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
