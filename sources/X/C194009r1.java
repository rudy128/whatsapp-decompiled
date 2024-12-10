package X;

import java.util.Map;

/* renamed from: X.9r1  reason: invalid class name and case insensitive filesystem */
public final class C194009r1 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public final void A01(A7B a7b, Integer num, String str) {
        int i;
        if (a7b != null) {
            i = a7b.A00;
        } else {
            i = 0;
        }
        String A1E = AnonymousClass001.A1E(num, str, AnonymousClass000.A10());
        C18070vi.A0d(A1E, 0);
        B1S b1s = new B1S(num, "error_code", (long) i);
        Object obj = ((C192739ou) this.A01.get()).A04.get(A1E);
        if (obj != null) {
            b1s.invoke(obj);
        }
        A02(num, str, 3);
    }

    public final Integer A00(String str) {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 1546)) {
            return null;
        }
        AnonymousClass00H r4 = this.A01;
        int A002 = ((C192739ou) r4.get()).A00(185470120, str, "unknown");
        String A1I = AnonymousClass001.A1I(str, AnonymousClass000.A10(), A002);
        Integer valueOf = Integer.valueOf(A002);
        ((C192739ou) r4.get()).A01(valueOf, A1I, "iq_action", str);
        return valueOf;
    }

    public final void A02(Integer num, String str, short s) {
        if (num != null) {
            String A1E = AnonymousClass001.A1E(num, str, AnonymousClass000.A10());
            int intValue = num.intValue();
            C18070vi.A0d(A1E, 0);
            Map map = ((C192739ou) this.A01.get()).A04;
            C222119a r0 = (C222119a) map.get(A1E);
            if (r0 != null) {
                r0.A04(intValue, s);
                map.remove(A1E);
            }
        }
    }

    public C194009r1(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
