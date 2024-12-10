package X;

import java.util.Map;

/* renamed from: X.9lW  reason: invalid class name and case insensitive filesystem */
public final class C190789lW {
    public final AnonymousClass1HA A00;
    public final C18030ve A01;
    public final Map A02 = C17880vN.A11();

    public final void A00(int i, String str, String str2) {
        C18070vi.A0d(str2, 2);
        Map map = this.A02;
        C222119a r2 = (C222119a) map.get(str);
        if (r2 == null) {
            C222219b r1 = new C222219b(this.A01, i);
            r1.A04 = true;
            r2 = this.A00.A01(r1, str);
            map.put(str, r2);
        }
        C18070vi.A0b(r2);
        r2.A0D(str2, -1);
    }

    public C190789lW(AnonymousClass1HA r2, C18030ve r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
