package X;

/* renamed from: X.3AZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AZ implements AnonymousClass1TI {
    public final /* synthetic */ BC9 A00;
    public final /* synthetic */ C32431hB A01;
    public final /* synthetic */ C139666zF A02;
    public final /* synthetic */ AnonymousClass21V A03;
    public final /* synthetic */ boolean A04;

    public final void accept(Object obj) {
        C32431hB r2 = this.A01;
        AnonymousClass21V r3 = this.A03;
        C139666zF r4 = this.A02;
        BC9 bc9 = this.A00;
        boolean z = this.A04;
        C136996uk r6 = (C136996uk) obj;
        r2.A0F.A0J(r3, AnonymousClass00R.A00);
        C32431hB.A00(r6, r2, r4, r3, true);
        C32441hC r1 = r2.A0C;
        synchronized (r1) {
            r1.remove(r3.A0v);
        }
        C32431hB.A02(r2);
        if (C32431hB.A07(r2)) {
            C32431hB.A01(r6, r2, r3, true);
        }
        r2.A0P.execute(new AnonymousClass7QF(r2, r3, r4, bc9, r6, 5, z));
    }

    public /* synthetic */ AnonymousClass3AZ(BC9 bc9, C32431hB r2, C139666zF r3, AnonymousClass21V r4, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = bc9;
        this.A04 = z;
    }
}
