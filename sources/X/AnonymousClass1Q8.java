package X;

import java.util.Map;

/* renamed from: X.1Q8  reason: invalid class name */
public final class AnonymousClass1Q8 {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1Q7 A01;
    public final Map A02;

    public AnonymousClass1Q8(AnonymousClass1CJ r2, AnonymousClass1Q6 r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        AnonymousClass1Q7 r0 = r3.A01;
        C18070vi.A0X(r0);
        this.A01 = r0;
        Map map = r3.A02;
        C18070vi.A0X(map);
        this.A02 = map;
    }

    public static final boolean A00(AnonymousClass206 r5, C22821Di r6) {
        AnonymousClass1BI r0 = r5.A0v.A00;
        C17960vV.A07(r0);
        C18070vi.A0X(r0);
        if (r5.A0y <= ((Number) r6.invoke(r0)).longValue()) {
            return true;
        }
        return false;
    }

    public final void A01(AnonymousClass205 r2) {
        if (r2 != null) {
            this.A01.A02(r2);
            this.A02.remove(r2);
        }
    }
}
