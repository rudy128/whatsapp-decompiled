package X;

import java.util.List;

/* renamed from: X.24z  reason: invalid class name and case insensitive filesystem */
public final class C448424z implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C448424z(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void CCZ(AnonymousClass206 r9, C49702Rn r10) {
        List<AnonymousClass206> A17;
        C18070vi.A0d(r9, 0);
        if (r9.A0z(64) && !r9.A0v.A02) {
            if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A00.get(), 5869)) {
                AnonymousClass00H r7 = this.A01;
                Class<C20956AcA> cls = C20956AcA.class;
                AnonymousClass206.A05(r9, ((C56842i7) r7.get()).A00(r9.A0x), cls);
                long j = r9.A0x;
                if ((r9 instanceof AnonymousClass21L) && (A17 = ((AnonymousClass21L) r9).A17()) != null && !A17.isEmpty()) {
                    for (AnonymousClass206 r4 : A17) {
                        C56842i7 r3 = (C56842i7) r7.get();
                        C18070vi.A0d(r4, 0);
                        if (!r4.A0v.A02) {
                            AnonymousClass206.A05(r4, r3.A00(j), cls);
                        }
                    }
                }
                if (r10 != null) {
                    new AnonymousClass20F(C448424z.class);
                    throw new NullPointerException("onProcessorExecuted");
                }
            }
        }
    }
}
