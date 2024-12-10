package X;

/* renamed from: X.1Po  reason: invalid class name and case insensitive filesystem */
public abstract class C25771Po {
    public AnonymousClass1D6 A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass11S A02;
    public final C25741Pl A03;
    public final AnonymousClass11P A04;
    public final C200710s A05;

    public final void A04(AnonymousClass1BI r10, int i, int i2, boolean z) {
        AnonymousClass1BI r2 = r10;
        this.A05.execute(new AnonymousClass3CK(r2, this, i, i2, AnonymousClass11P.A01(this.A04), z));
    }

    public final synchronized void A05(Long l) {
        Long l2;
        AnonymousClass1D6 r5 = this.A00;
        if (r5 != null) {
            if (l != null) {
                l2 = Long.valueOf(l.longValue() - ((Number) r5.second).longValue());
            } else {
                l2 = null;
            }
            C1185463w r1 = (C1185463w) r5.first;
            r1.A06 = l2;
            this.A01.CC7(r1);
            this.A00 = null;
        }
    }

    public int A02() {
        if (this instanceof AnonymousClass2K6) {
            return 0;
        }
        if (this instanceof AnonymousClass2JU) {
            return 2;
        }
        if (this instanceof AnonymousClass2JT) {
            return 3;
        }
        if (this instanceof C25801Pr) {
            return 4;
        }
        if (!(this instanceof AnonymousClass2JS)) {
            return ((C25781Pp) this).A00;
        }
        return 0;
    }

    public C25771Po(AnonymousClass11S r3, C25741Pl r4, AnonymousClass11P r5, AnonymousClass18K r6, AnonymousClass10I r7) {
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r6;
        this.A03 = r4;
        this.A05 = new C200710s(r7, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r0.A0I != true) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A03(X.AnonymousClass1BI r4) {
        /*
            r3 = this;
            boolean r0 = X.C22971Dz.A0e(r4)
            r2 = 1
            if (r0 == 0) goto L_0x000c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x000c:
            boolean r0 = X.C22971Dz.A0d(r4)
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            X.11S r0 = r3.A02
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0022
            r1 = 3
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0022:
            boolean r0 = X.C42701yb.A01(r4)
            if (r0 != 0) goto L_0x002a
            r1 = 2
            goto L_0x001d
        L_0x002a:
            X.1Pl r0 = r3.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.24e r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0I
            r1 = 4
            if (r0 == r2) goto L_0x001d
        L_0x0039:
            r1 = 5
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25771Po.A03(X.1BI):java.lang.Integer");
    }
}
