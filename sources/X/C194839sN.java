package X;

import java.util.Map;

/* renamed from: X.9sN  reason: invalid class name and case insensitive filesystem */
public class C194839sN {
    public boolean A00 = true;
    public final C23736Boh A01;
    public final E8A A02;
    public final C189939k6 A03;

    @Deprecated
    public void A01(String str, Map map) {
        if (this.A00) {
            this.A03.A00(new C21459AkQ(this, map, str, 41));
        }
    }

    public void A02(String str, Map map) {
        if (this.A00) {
            this.A03.A00(new C21459AkQ(this, map, str, 42));
        }
    }

    public C194839sN(C23736Boh boh, E8A e8a, C189939k6 r4) {
        this.A01 = boh;
        this.A03 = r4;
        this.A02 = e8a;
    }

    public void A00(String str) {
        A01(str, C17880vN.A11());
    }
}
