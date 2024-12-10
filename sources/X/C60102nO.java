package X;

import java.util.Map;

/* renamed from: X.2nO  reason: invalid class name and case insensitive filesystem */
public final class C60102nO {
    public final AnonymousClass1HA A00;
    public final C18030ve A01;
    public final Map A02 = C17880vN.A11();

    public final void A00(String str) {
        C222119a r0 = (C222119a) this.A02.get("fetch_and_validate_vname");
        if (r0 != null) {
            r0.A06(str);
        }
    }

    public final void A01(String str) {
        C222119a r0 = (C222119a) this.A02.get("fetch_and_validate_vname");
        if (r0 != null) {
            r0.A07(str);
        }
    }

    public final void A02(String str) {
        Map map = this.A02;
        C222119a r2 = (C222119a) map.get("fetch_and_validate_vname");
        if (r2 == null) {
            AnonymousClass1HA r4 = this.A00;
            C18030ve r3 = this.A01;
            C222219b r22 = new C222219b(r3, 596773373);
            if (C18020vd.A05(C18040vf.A02, r3, 8049)) {
                r22.A04 = true;
            }
            r2 = r4.A01(r22, "fetch_and_validate_vname");
            C18070vi.A0b(r2);
            map.put("fetch_and_validate_vname", r2);
        }
        r2.A0D(str, -1);
    }

    public final void A03(String str, String str2) {
        C222119a r0 = (C222119a) this.A02.get("fetch_and_validate_vname");
        if (r0 != null) {
            r0.A0A(str, str2, false);
        }
    }

    public final void A04(boolean z) {
        Map map = this.A02;
        C222119a r1 = (C222119a) map.get("fetch_and_validate_vname");
        if (r1 != null) {
            short s = 3;
            if (z) {
                s = 2;
            }
            r1.A0C(s);
            map.remove("fetch_and_validate_vname");
        }
    }

    public C60102nO(AnonymousClass1HA r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
