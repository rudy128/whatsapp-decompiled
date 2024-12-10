package X;

/* renamed from: X.2nQ  reason: invalid class name and case insensitive filesystem */
public final class C60122nQ {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public int A00(AnonymousClass1BI r3) {
        AnonymousClass1E7 A0E;
        if (r3 == null || (A0E = ((AnonymousClass1M9) this.A04.get()).A0E(r3)) == null) {
            return 0;
        }
        return A0E.A00;
    }

    public boolean A03(AnonymousClass1BI r5) {
        AnonymousClass1E7 A0E;
        if (r5 == null || (A0E = ((AnonymousClass1M9) this.A04.get()).A0E(r5)) == null || !A0E.A0D()) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A01), 4873);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = ((X.AnonymousClass1M9) r2.A04.get()).A0E(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass1BI r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x0026
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r0 = r0.A0E(r3)
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0026
            X.00H r0 = r2.A01
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.0ve r0 = (X.C18030ve) r0
            boolean r0 = X.C84104Hw.A00(r0)
            if (r0 == 0) goto L_0x0026
            r1 = 1
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60122nQ.A04(X.1BI):boolean");
    }

    public void A01(AnonymousClass1BI r5, boolean z) {
        ((C56732hw) this.A02.get()).A00(((AnonymousClass1LW) this.A03.get()).A09(r5), z);
        ((C26811To) this.A06.get()).A0L(new C193759qc(Boolean.valueOf(z), r5.getRawString()), AnonymousClass00R.A0j);
    }

    public boolean A02() {
        if (C17880vN.A0H(this.A05).A0N() || !C138936xw.A00((C138936xw) ((C138616xO) this.A00.get()).A03.get()).getBoolean("key_chat_info_new_icon_shown", true)) {
            return false;
        }
        return true;
    }

    public C60122nQ(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A01 = r1;
        this.A03 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A06 = r6;
        this.A00 = r7;
    }
}
