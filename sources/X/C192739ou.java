package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9ou  reason: invalid class name and case insensitive filesystem */
public final class C192739ou {
    public final AnonymousClass1HA A00;
    public final C18030ve A01;
    public final AnonymousClass1QJ A02;
    public final Map A03 = C17880vN.A13();
    public final Map A04 = C17880vN.A13();
    public final AtomicInteger A05 = new AtomicInteger();

    public final void A01(Integer num, String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        B1R b1r = new B1R(num, str2, str3);
        Object obj = this.A04.get(str);
        if (obj != null) {
            b1r.invoke(obj);
        }
    }

    public final int A00(int i, String str, String str2) {
        int andIncrement = this.A05.getAndIncrement();
        Integer valueOf = Integer.valueOf(andIncrement);
        String str3 = str;
        if (valueOf != null) {
            str3 = AnonymousClass001.A1E(valueOf, str, AnonymousClass000.A10());
        }
        Map map = this.A04;
        C222119a r4 = (C222119a) map.get(str3);
        if (r4 == null) {
            C222219b r1 = new C222219b(this.A01, i);
            r4 = this.A00.A01(r1, str3);
            r1.A04 = true;
            C18070vi.A0b(r4);
            map.put(str3, r4);
        }
        r4.A0E(str2, false, andIncrement);
        C63572tK A022 = this.A02.A02();
        if (A022 != null) {
            if (valueOf != null) {
                str = AnonymousClass001.A1E(valueOf, str, AnonymousClass000.A10());
            }
            A01(valueOf, str, "country", A022.A03);
        }
        return andIncrement;
    }

    public C192739ou(AnonymousClass1HA r2, C18030ve r3, AnonymousClass1QJ r4) {
        C18070vi.A0o(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
