package X;

import java.util.Map;

/* renamed from: X.9tA  reason: invalid class name and case insensitive filesystem */
public final class C195329tA {
    public final C20000A2o A00;
    public final C190349kn A01;
    public final AnonymousClass00H A02;
    public final C19943A0a A03;
    public final AnonymousClass9Z6 A04;

    public final C187029f9 A00(String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        ADL A002 = this.A01.A00(str2);
        if (A002 == null) {
            return null;
        }
        return (C187029f9) this.A00.A01(new C178139By((C197789xG) this.A02.get(), str, str3), A002.A02, 0);
    }

    public final void A01(C191549mm r13, Boolean bool, String str, String str2, String str3, String str4) {
        ADL A002 = this.A01.A00(str3);
        AnonymousClass9Z6 r0 = this.A04;
        String str5 = str4;
        C187519fw r6 = new C187519fw(r13, this, A002, str, str5);
        r0.A00.A03(A002, new C21152AfN(r6), bool, str, str5, str2);
    }

    public final void A02(C191549mm r11, String str, String str2, Map map, int i) {
        String str3 = str;
        C18070vi.A0d(str, 0);
        String A0m = AnonymousClass8BW.A0m(map);
        String str4 = str2;
        C187029f9 A002 = A00(str, str2, A0m);
        C191549mm r4 = r11;
        if (A002 == null || A002.A00 != 5) {
            String A003 = C19943A0a.A00(Integer.valueOf(i));
            if (A003 == null) {
                A003 = "";
            }
            A01(r4, false, str3, A003, str4, A0m);
            return;
        }
        r11.A00();
    }

    public C195329tA(C19943A0a a0a, C20000A2o a2o, C190349kn r5, AnonymousClass9Z6 r6, AnonymousClass00H r7) {
        C18070vi.A0o(a2o, r7, a0a);
        C18070vi.A0d(r5, 5);
        this.A00 = a2o;
        this.A02 = r7;
        this.A03 = a0a;
        this.A04 = r6;
        this.A01 = r5;
        ((C197789xG) r7.get()).A00 = AnonymousClass00R.A01;
    }
}
