package X;

import java.util.List;

/* renamed from: X.39b  reason: invalid class name and case insensitive filesystem */
public final class C699239b implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void CCZ(AnonymousClass206 r6, C49702Rn r7) {
        C18070vi.A0d(r6, 0);
        List<C70503Bi> list = r6.A0h;
        if (list != null && !list.isEmpty()) {
            for (C70503Bi r2 : list) {
                ((AnonymousClass1DL) this.A00.get()).A09(r2.A00);
            }
        }
        ((C25891Qa) this.A01.get()).A00(r6);
        if (list != null && !list.isEmpty() && r7 != null) {
            throw C17900vP.A07(C699239b.class);
        }
    }

    public C699239b(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
