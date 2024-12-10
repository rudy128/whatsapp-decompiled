package X;

import java.util.Map;

/* renamed from: X.907  reason: invalid class name */
public final class AnonymousClass907 extends C195919u9 {
    public final A8Q A00;
    public final Map A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass118 A04;

    public static final void A00(BBM bbm, AnonymousClass907 r4, Map map, boolean z) {
        AnonymousClass1KB r2;
        int i;
        AnonymousClass118 r1 = r4.A04;
        String A0G = C18070vi.A0G(r1, 2131890448);
        if (!r4.A03.A09()) {
            A0G = C18070vi.A0G(r1, 2131890447);
        }
        if (!z) {
            if (!(map.get("error") instanceof C19976A1m)) {
                map = C108975cc.A0h("error", C19976A1m.A00(A0G));
            }
            r2 = r4.A02;
            i = 21;
        } else {
            r2 = r4.A02;
            i = 22;
        }
        r2.CGP(new AnonymousClass7RN(bbm, map, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass907(AnonymousClass1KB r2, A8Q a8q, AnonymousClass11E r4, AnonymousClass118 r5, C176198zw r6, Map map) {
        super(r6);
        C18070vi.A0w(r2, r5, r4, r6, map);
        C18070vi.A0d(a8q, 6);
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = map;
        this.A00 = a8q;
    }
}
