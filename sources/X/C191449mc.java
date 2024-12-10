package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9mc  reason: invalid class name and case insensitive filesystem */
public final class C191449mc {
    public int A00;
    public C194059r6 A01;
    public C194609s0 A02;
    public Map A03;
    public final C194589ry A04;

    public final C194589ry A00() {
        Map map = this.A03;
        if (map == null) {
            map = AnonymousClass1D7.A0I();
        }
        C194059r6 r3 = this.A01;
        C194609s0 r2 = this.A02;
        if (r2 == null) {
            r2 = new C194609s0((List) null, AnonymousClass1D7.A0I(), (Map) null);
        }
        return new C194589ry(r3, r2, map);
    }

    public C191449mc(C194589ry r1) {
        this.A04 = r1;
    }
}
