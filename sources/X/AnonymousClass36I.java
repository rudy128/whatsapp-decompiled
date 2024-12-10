package X;

/* renamed from: X.36I  reason: invalid class name */
public final class AnonymousClass36I implements C437420t {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public AnonymousClass3KT BXT(AnonymousClass206 r2) {
        String A18;
        C18070vi.A0d(r2, 0);
        if (C20097A7a.A05(r2)) {
            A18 = ((AnonymousClass36T) this.A00.get()).BS2(r2);
        } else {
            A18 = ((AnonymousClass21V) r2).A18();
        }
        if (A18 == null) {
            A18 = "";
        }
        return C690335q.A01(A18);
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r3) {
        String A18;
        C18070vi.A0d(r3, 0);
        if (C20097A7a.A05(r3)) {
            A18 = ((AnonymousClass36T) this.A00.get()).BVQ(r3);
        } else {
            String A0S = r3.A0S();
            if (A0S == null || A0S.length() == 0) {
                A18 = ((AnonymousClass21V) r3).A18();
            } else {
                A18 = r3.A0S();
            }
        }
        return ((C57232ik) this.A01.get()).A00(r3, A18);
    }

    public AnonymousClass36I(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
