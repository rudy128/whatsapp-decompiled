package X;

/* renamed from: X.3AX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AX implements AnonymousClass1TI {
    public final /* synthetic */ C32431hB A00;
    public final /* synthetic */ C139666zF A01;
    public final /* synthetic */ AnonymousClass21V A02;
    public final /* synthetic */ boolean A03;

    public final void accept(Object obj) {
        C32431hB r4 = this.A00;
        AnonymousClass21V r6 = this.A02;
        C139666zF r7 = this.A01;
        boolean z = this.A03;
        C136996uk r5 = (C136996uk) obj;
        r4.A0F.A0J(r6, AnonymousClass00R.A00);
        C32431hB.A00(r5, r4, r7, r6, false);
        C32441hC r1 = r4.A0C;
        synchronized (r1) {
            r1.remove(r6.A0v);
        }
        C32431hB.A02(r4);
        if (C32431hB.A07(r4)) {
            C32431hB.A01(r5, r4, r6, false);
        }
        r4.A0P.execute(new C21437Ak4(r4, r5, r6, r7, 15, z));
        if ((r6 instanceof C441822l) && ((C88534a3) r4.A0L.get()).A0B(r6)) {
            ((C25749ClJ) r4.A0K.get()).A02(new C24027BuE((C441822l) r6, false, false));
        }
    }

    public /* synthetic */ AnonymousClass3AX(C32431hB r1, C139666zF r2, AnonymousClass21V r3, boolean z) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z;
    }
}
