package X;

/* renamed from: X.BhY  reason: case insensitive filesystem */
public abstract class C23469BhY extends DKA {
    public C23484Bho A00;
    public boolean A01 = false;
    public final C23484Bho A02;

    public static void A00(C23469BhY bhY) {
        if (bhY.A01) {
            C23484Bho bho = (C23484Bho) bhY.A00.A06(4);
            C25660Cjq.A02.A00(bho.getClass()).CTK(bho, bhY.A00);
            bhY.A00 = bho;
            bhY.A01 = false;
        }
    }

    public /* synthetic */ C23484Bho A02() {
        if (!this.A01) {
            C23484Bho bho = this.A00;
            C25660Cjq.A02.A00(bho.getClass()).CTR(bho);
            this.A01 = true;
        }
        return this.A00;
    }

    public final /* synthetic */ C23484Bho CTl() {
        return this.A02;
    }

    public /* synthetic */ Object clone() {
        C23469BhY bhY = (C23469BhY) this.A02.A06(5);
        bhY.A03(A02());
        return bhY;
    }

    public C23469BhY(C23484Bho bho) {
        this.A02 = bho;
        this.A00 = (C23484Bho) bho.A06(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C23484Bho A01() {
        /*
            r3 = this;
            X.Bho r2 = r3.A02()
            r0 = 1
            java.lang.Object r0 = r2.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L_0x0028
            if (r1 == 0) goto L_0x0029
            X.Cjq r1 = X.C25660Cjq.A02
            java.lang.Class r0 = r2.getClass()
            X.EAD r0 = r1.A00(r0)
            boolean r1 = r0.CTY(r2)
            r0 = 2
            r2.A06(r0)
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            return r2
        L_0x0029:
            X.DZw r0 = new X.DZw
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23469BhY.A01():X.Bho");
    }

    public final void A03(C23484Bho bho) {
        A00(this);
        C23484Bho bho2 = this.A00;
        C25660Cjq.A02.A00(bho2.getClass()).CTK(bho2, bho);
    }
}
