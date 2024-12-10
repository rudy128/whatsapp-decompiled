package X;

/* renamed from: X.0YL  reason: invalid class name */
public class AnonymousClass0YL implements AnonymousClass0sV {
    public AnonymousClass0QP A00;
    public C04240Mk A01;
    public boolean A02;
    public final AnonymousClass05E A03;
    public final C05140Qp A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r0 = X.C02750Ff.A00((int) r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(int[] r6, long r7) {
        /*
            r5 = this;
            r4 = 1
            X.C18070vi.A0d(r6, r4)
            r0 = 32
            long r1 = r7 >>> r0
            int r0 = (int) r1
            X.0Og r0 = X.C02750Ff.A00(r0)
            int r3 = r0.A02(r7)
            int r0 = r0.A04(r7)
            boolean r0 = X.AnonymousClass000.A1T(r3, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0032
            int r0 = (int) r7
            X.0Og r0 = X.C02750Ff.A00(r0)
            int r1 = r0.A01(r7)
            int r0 = r0.A03(r7)
            if (r1 != r0) goto L_0x0032
            r5.A02 = r4
            r6[r2] = r3
            r6[r4] = r1
            return r4
        L_0x0032:
            X.0QP r0 = r5.A00
            if (r0 == 0) goto L_0x003c
            r0.A06(r6, r7)
            r5.A02 = r2
            return r4
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YL.A04(int[], long):boolean");
    }

    public final void A01(int i, int i2, int i3, int i4) {
        AnonymousClass0QP r4 = this.A00;
        int i5 = 0;
        if (this.A02 && r4 != null) {
            int i6 = i3 - i;
            int i7 = i4 - i2;
            r4.A06((int[]) null, AnonymousClass0OH.A00.A01(i6, i6, i7, i7));
            this.A02 = false;
        }
        C04240Mk r2 = this.A01;
        if (r2 != null) {
            C05140Qp A002 = A00();
            A002.A0J(r2);
            while (!C18070vi.A18(r2, this.A01)) {
                if (i5 > 4) {
                    AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, "RootHostDelegate", "More than 4 recursive mount attempts. Skipping mounting the latest version.", (Throwable) null);
                    return;
                }
                r2 = this.A01;
                A002.A0J(r2);
                i5++;
            }
        }
    }

    public void A02(AnonymousClass0QP r3) {
        C04240Mk r0;
        if (!C18070vi.A18(this.A00, r3)) {
            AnonymousClass0QP r1 = this.A00;
            if (r1 != null) {
                r1.A02 = null;
            }
            this.A00 = r3;
            if (r3 != null) {
                AnonymousClass0YL r02 = r3.A02;
                if (r02 == null || r02.equals(this)) {
                    r3.A02 = this;
                    r0 = r3.A01;
                } else {
                    throw new RuntimeException("Must detach from previous host listener first");
                }
            } else {
                r0 = null;
            }
            A03(r0);
        }
    }

    public void A03(C04240Mk r2) {
        if (!C18070vi.A18(this.A01, r2)) {
            if (r2 == null) {
                A00().A0G();
            }
            this.A01 = r2;
            this.A03.requestLayout();
        }
    }

    public AnonymousClass0YL(AnonymousClass05E r3) {
        this.A03 = r3;
        this.A04 = new C05140Qp(r3, AnonymousClass0O7.A01);
    }

    public C05140Qp A00() {
        return this.A04;
    }

    public void BkX() {
        C02770Fh.A00(this.A03, A00());
    }
}
