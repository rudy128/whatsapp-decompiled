package X;

/* renamed from: X.7DE  reason: invalid class name */
public final class AnonymousClass7DE implements C72083Ko {
    public final /* synthetic */ AnonymousClass02n A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ C122646Re A02;
    public final /* synthetic */ AnonymousClass77S A03;
    public final /* synthetic */ C1405571y A04;
    public final /* synthetic */ C1605989c A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass7DE(AnonymousClass02n r1, AnonymousClass1FU r2, C122646Re r3, AnonymousClass77S r4, C1405571y r5, C1605989c r6, boolean z) {
        this.A06 = z;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
    }

    public void Bs4(boolean z) {
        if (this.A06 && z) {
            int ordinal = this.A02.ordinal();
            C59472mM r0 = (C59472mM) this.A04.A05.getValue();
            if (ordinal != 0) {
                r0.A02(true);
            } else {
                r0.A01(true);
            }
        }
        C1405571y r3 = this.A04;
        AnonymousClass1KB r02 = r3.A00;
        AnonymousClass1FU r5 = this.A01;
        r02.A0J(new C21468AkZ(this.A03, r3, this.A00, r5, this.A05, 29));
    }
}
