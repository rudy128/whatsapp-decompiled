package X;

import java.util.Map;

/* renamed from: X.AbR  reason: case insensitive filesystem */
public final class C20911AbR implements C22522BBf {
    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        AnonymousClass8pI r6 = (AnonymousClass8pI) obj;
        C179869Kf r5 = (C179869Kf) enumR;
        boolean A17 = C18070vi.A17(r6, r5);
        if (!(r6 instanceof AnonymousClass8pF)) {
            return null;
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            C1418477e r0 = ((AnonymousClass8pF) r6).A01;
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        } else if (ordinal == A17) {
            return ((AnonymousClass8pF) r6).A02;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public Class BL8() {
        return C179869Kf.class;
    }
}
