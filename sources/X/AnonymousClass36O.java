package X;

/* renamed from: X.36O  reason: invalid class name */
public final class AnonymousClass36O implements C437420t {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final AnonymousClass00H A02;

    public AnonymousClass3KT BXT(AnonymousClass206 r2) {
        String A18;
        C18070vi.A0d(r2, 0);
        if (C20097A7a.A05(r2)) {
            A18 = ((AnonymousClass36T) this.A02.get()).BS2(r2);
        } else {
            A18 = ((AnonymousClass21V) r2).A18();
        }
        if (A18 == null) {
            A18 = "";
        }
        return C690335q.A01(A18);
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r7) {
        String A0B;
        C18070vi.A0d(r7, 0);
        int i = ((AnonymousClass21V) r7).A0D;
        if (i <= 0) {
            A0B = "";
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(" (");
            A0B = C17900vP.A0B(C64052u8.A0D(this.A01, (String) null, (long) i), A10);
        }
        return C690335q.A00(C61522pp.A03, (String) null, "🎥", C17890vO.A0R(this.A00.A00, A0B, 1, 0, 2131889033));
    }

    public AnonymousClass36O(AnonymousClass118 r1, C18000vb r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
