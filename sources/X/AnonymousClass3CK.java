package X;

/* renamed from: X.3CK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass1BI A03;
    public final /* synthetic */ C25771Po A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        int i;
        Integer num;
        C25771Po r3 = this.A04;
        AnonymousClass1BI r8 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        long j = this.A02;
        boolean z = this.A05;
        C1185463w r4 = new C1185463w();
        if (r3 instanceof AnonymousClass2K6) {
            i = 5;
        } else if (r3 instanceof C25791Pq) {
            i = 2;
        } else {
            i = ((C25781Pp) r3).A01;
        }
        r4.A04 = Integer.valueOf(i);
        r4.A03 = Integer.valueOf(r3.A02());
        if (r8 != null) {
            num = r3.A03(r8);
        } else {
            num = null;
        }
        r4.A05 = num;
        r4.A02 = Integer.valueOf(i2);
        r4.A03 = Integer.valueOf(i3);
        synchronized (r3) {
            Long valueOf = Long.valueOf(j);
            r3.A05(valueOf);
            if (z) {
                r3.A01.CC7(r4);
            } else {
                r3.A00 = AnonymousClass1D6.A01(r4, valueOf);
            }
        }
    }

    public /* synthetic */ AnonymousClass3CK(AnonymousClass1BI r1, C25771Po r2, int i, int i2, long j, boolean z) {
        this.A04 = r2;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A05 = z;
    }
}
