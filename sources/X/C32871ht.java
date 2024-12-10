package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ht  reason: invalid class name and case insensitive filesystem */
public final class C32871ht {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C18100vl A02 = new C18110vm(new C32881hu(this));
    public final C18100vl A03 = new C18110vm(new C32891hv(this));
    public final Map A04 = new LinkedHashMap();

    public C32871ht(AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final AnonymousClass20Z A00(AnonymousClass20E r5) {
        AnonymousClass20Z r2;
        synchronized (this) {
            Map map = this.A04;
            Object obj = map.get(r5);
            if (obj == null) {
                AnonymousClass20X r1 = (AnonymousClass20X) this.A02.getValue();
                C18070vi.A0X(r1);
                AnonymousClass20Y r0 = (AnonymousClass20Y) this.A03.getValue();
                C18070vi.A0X(r0);
                obj = new AnonymousClass20Z(r1, r0, r5);
                map.put(r5, obj);
            }
            r2 = (AnonymousClass20Z) obj;
        }
        return r2;
    }
}
