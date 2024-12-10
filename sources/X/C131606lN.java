package X;

import java.util.Map;

/* renamed from: X.6lN  reason: invalid class name and case insensitive filesystem */
public final class C131606lN {
    public final Map A00;

    public C131606lN(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public final AnonymousClass8Ak A00(C122716Rq r3, boolean z) {
        C18070vi.A0d(r3, 0);
        AnonymousClass8Ak r1 = (AnonymousClass8Ak) this.A00.get(r3.toString());
        if (r1 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported feature: ");
            A10.append(r3);
            throw AnonymousClass001.A12(": Provide the MLProvider", A10);
        } else if (z) {
            return new AnonymousClass7K2(r1);
        } else {
            return r1;
        }
    }
}
