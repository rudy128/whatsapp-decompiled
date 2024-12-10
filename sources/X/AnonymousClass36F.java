package X;

/* renamed from: X.36F  reason: invalid class name */
public final class AnonymousClass36F implements C437420t {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;

    public AnonymousClass3KT BXT(AnonymousClass206 r2) {
        String A18;
        C18070vi.A0d(r2, 0);
        if (C20097A7a.A05(r2)) {
            A18 = ((AnonymousClass36T) this.A01.get()).BS2(r2);
        } else {
            A18 = ((AnonymousClass21V) r2).A18();
        }
        if (A18 == null) {
            A18 = "";
        }
        return C690335q.A01(A18);
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r5) {
        String A18;
        C18070vi.A0d(r5, 0);
        String A0F = C18070vi.A0F(this.A00.A00, 2131889027);
        if (C20097A7a.A05(r5)) {
            A18 = ((AnonymousClass36T) this.A01.get()).BVQ(r5);
        } else {
            String A0S = r5.A0S();
            if (A0S == null || A0S.length() == 0) {
                A18 = ((AnonymousClass21V) r5).A18();
            } else {
                A18 = r5.A0S();
            }
        }
        return C690335q.A00(C61522pp.A03, A18, "📷", A0F);
    }

    public AnonymousClass36F(AnonymousClass118 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
