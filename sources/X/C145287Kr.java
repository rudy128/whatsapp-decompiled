package X;

/* renamed from: X.7Kr  reason: invalid class name and case insensitive filesystem */
public final class C145287Kr implements C437420t {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C153047ot(this));

    public C145287Kr(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass3KT BXT(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        AnonymousClass22G r62 = (AnonymousClass22G) r6;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r62.BXE());
        if (C72453Mb.A1a(this.A01) && AnonymousClass000.A1a(r62.BXF())) {
            A10.append(C29431cG.A0g(" ", " ", "", r62.BXF(), C1592183r.A00));
        }
        return new C690335q(C18070vi.A0H(A10));
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        return new C690335q(AnonymousClass001.A1H("📊 ", ((AnonymousClass22G) r4).BXE(), AnonymousClass000.A10()));
    }
}
