package X;

/* renamed from: X.1dq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C30381dq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ C30361do A03;
    public final /* synthetic */ Integer A04;

    public final void run() {
        C30361do r5 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        Integer num = this.A04;
        AnonymousClass1BI r4 = this.A02;
        C18100vl r0 = C30361do.A0C;
        C30531e6 r3 = new C30531e6();
        r3.A07 = Integer.valueOf(i);
        r3.A06 = Integer.valueOf(i2);
        r3.A08 = num;
        C27491Wh r6 = r5.A03;
        r3.A0D = Long.valueOf((long) r6.A00());
        AnonymousClass11P r2 = r5.A00;
        r3.A0C = Long.valueOf(r6.A01(AnonymousClass11P.A01(r2)));
        r3.A0I = r5.A04.A03();
        r3.A0E = Long.valueOf(AnonymousClass11P.A01(r2));
        Object obj = r5.A05.get();
        C18070vi.A0X(obj);
        for (C30721eP r1 : (Iterable) obj) {
            if (r1.CM3(r4)) {
                r1.BBP(r3, r4);
            }
        }
        r5.A02.CC4(r3);
    }

    public /* synthetic */ C30381dq(AnonymousClass1BI r1, C30361do r2, Integer num, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = num;
        this.A02 = r1;
    }
}
