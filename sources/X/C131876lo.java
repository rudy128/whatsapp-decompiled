package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6lo  reason: invalid class name and case insensitive filesystem */
public final class C131876lo {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public final void A00(C1598786f r14, long... jArr) {
        AnonymousClass00H r8 = this.A01;
        String A0T = C17890vO.A0T(r8);
        ArrayList A0z = C17880vN.A0z(r7);
        for (long r2 : jArr) {
            A0z.add(new C178719Ee(r2, AnonymousClass11P.A00(this.A00)));
        }
        AnonymousClass9F7 r1 = new AnonymousClass9F7((List) A0z, 26, A0T);
        C17880vN.A0U(r8).A0I(new C122366Oz(new C125646bQ(r14), r1), (C29621ca) r1.A00, A0T, 430, 32000);
    }

    public C131876lo(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
