package X;

/* renamed from: X.2r5  reason: invalid class name and case insensitive filesystem */
public final class C62242r5 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final int A01(AnonymousClass206 r7) {
        AnonymousClass3M5 A002;
        C20083A6j A012;
        AnonymousClass206 A0K;
        C18070vi.A0d(r7, 0);
        if (r7 instanceof AnonymousClass247) {
            return 63;
        }
        if (r7 instanceof AnonymousClass227) {
            return 34;
        }
        if (r7 instanceof AnonymousClass22H) {
            return 37;
        }
        if (r7 instanceof AnonymousClass24P) {
            return 65;
        }
        if (r7 instanceof AnonymousClass22E) {
            return 38;
        }
        if (r7 instanceof AnonymousClass22C) {
            return 54;
        }
        if (r7 instanceof AnonymousClass22A) {
            if (((AnonymousClass22A) r7).A01 == 1) {
                return 40;
            }
            return 41;
        } else if (r7 instanceof C444323k) {
            return 51;
        } else {
            if ((r7 instanceof C444723o) || (r7 instanceof C444923q)) {
                return 52;
            }
            if (r7 instanceof C445823z) {
                return 58;
            }
            if (r7 instanceof AnonymousClass24H) {
                return 59;
            }
            if (C50112Te.A00(r7)) {
                return 30;
            }
            if (r7.A0z(8)) {
                return 27;
            }
            if ((r7 instanceof AnonymousClass210) && (A0K = r7.A0K()) != null && A0K.A0u == 54) {
                return 1;
            }
            if ((r7 instanceof AnonymousClass21K) && (A012 = ((C42341y1) this.A01.get()).A01((AnonymousClass21K) r7)) != null) {
                return A012.A04();
            }
            if ((r7 instanceof C438721g) && (A002 = ((C190809lY) this.A02.get()).A00((C438721g) r7)) != null) {
                return A002.BUD();
            }
            if (AnonymousClass206.A08(r7)) {
                return 56;
            }
            int A013 = C1409973w.A01(r7.A0u, r7.A09, AnonymousClass25A.A0t(r7));
            String A0P = r7.A0P();
            if (A013 == 9 && r7.A0r() && A0P != null) {
                AnonymousClass00H r3 = this.A00;
                C32981i4 r1 = (C32981i4) C18070vi.A0E(r3);
                C18070vi.A0d(r1, 1);
                if (r1.A0J(r1.A02.A02(A0P))) {
                    return 22;
                }
                C32981i4 r12 = (C32981i4) C18070vi.A0E(r3);
                C18070vi.A0d(r12, 1);
                if (r12.A0K(r12.A02.A02(A0P))) {
                    return 23;
                }
            }
            return A013;
        }
    }

    public final int A02(C63362sw r2) {
        AnonymousClass206 r0 = r2.A0A;
        if (r0 != null) {
            return A01(r0);
        }
        return A8F.A03(r2.A0R);
    }

    public C62242r5(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static int A00(AnonymousClass206 r1, AnonymousClass00H r2) {
        return ((C62242r5) r2.get()).A01(r1);
    }
}
