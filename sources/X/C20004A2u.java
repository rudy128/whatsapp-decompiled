package X;

import java.util.Map;

/* renamed from: X.A2u  reason: case insensitive filesystem */
public class C20004A2u {
    public final AnonymousClass1HA A00;
    public final C18030ve A01;
    public final Map A02 = C17880vN.A11();

    public static C222119a A00(C20004A2u a2u, Object obj) {
        return (C222119a) a2u.A02.get(obj);
    }

    public void A01(int i, String str, String str2) {
        Map map = this.A02;
        C222119a r2 = (C222119a) map.get(str);
        if (r2 == null) {
            AnonymousClass1HA r4 = this.A00;
            C18030ve r3 = this.A01;
            C222219b r22 = new C222219b(r3, i);
            if (C18020vd.A05(C18040vf.A02, r3, 1272)) {
                r22.A04 = true;
            }
            r2 = r4.A01(r22, str);
            map.put(str, r2);
        }
        r2.A0D(str2, -1);
    }

    public void A06(String str, boolean z) {
        Map map = this.A02;
        C222119a r1 = (C222119a) map.get(str);
        if (r1 != null) {
            short s = 3;
            if (z) {
                s = 2;
            }
            r1.A0C(s);
            map.remove(str);
        }
    }

    public C20004A2u(AnonymousClass1HA r2, C18030ve r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public void A02(String str) {
        C222119a A002 = A00(this, str);
        if (A002 != null) {
            A002.A06("datasource");
        }
    }

    public void A03(String str) {
        C222119a A002 = A00(this, str);
        if (A002 != null) {
            A002.A07("datasource");
        }
    }

    public void A04(String str, String str2, String str3) {
        C222119a A002 = A00(this, str);
        if (A002 != null) {
            A002.A0A(str2, str3, true);
        }
    }

    public void A05(String str, String str2, boolean z) {
        C222119a A002 = A00(this, str);
        if (A002 != null) {
            A002.A0B(str2, z, true);
        }
    }
}
