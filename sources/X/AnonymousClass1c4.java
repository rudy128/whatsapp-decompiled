package X;

/* renamed from: X.1c4  reason: invalid class name */
public final class AnonymousClass1c4 {
    public boolean A00;
    public final AnonymousClass11S A01;
    public final C18030ve A02;

    public AnonymousClass1c4(AnonymousClass11S r2, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final boolean A00(AnonymousClass1c4 r2, int i) {
        if (C18020vd.A00(C18040vf.A02, r2.A02, 3778) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A02, 3956) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass1c4 r3, int r4) {
        /*
            X.11S r0 = r3.A01
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r3.A02
            r1 = 3956(0xf74, float:5.544E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 0
            if (r0 != 0) goto L_0x0025
            X.0ve r1 = r3.A02
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r1, r4)
            r0 = 2
            if (r1 != r0) goto L_0x0025
            r2 = 1
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1c4.A01(X.1c4, int):boolean");
    }

    public static final boolean A02(AnonymousClass1c4 r2, int i) {
        if (C18020vd.A00(C18040vf.A02, r2.A02, 7239) == i) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (!A01(this, 3877) || !A01(this, 3878)) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        if (!A01(this, 3877) || !A01(this, 3879)) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        if (!this.A00) {
            this.A00 = true;
            C22971Dz.A00 = C18020vd.A05(C18040vf.A02, this.A02, 10396);
        }
        return A01(this, 3877);
    }

    public final boolean A09() {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 9833) || !C18020vd.A05(r1, r2, 9834)) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 7588) || !C18020vd.A05(r1, r2, 12313)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        if (A07()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 7685)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if (A04()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 9448)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (A04()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 10188)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0A() {
        if (A07()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 8108)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
