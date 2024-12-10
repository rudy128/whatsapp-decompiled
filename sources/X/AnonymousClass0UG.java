package X;

/* renamed from: X.0UG  reason: invalid class name */
public final class AnonymousClass0UG implements C16050rd {
    public final C16300s2 A00;
    public final C16300s2 A01;
    public final C16300s2 A02;

    public void BJY(C17480uj r12) {
        long j;
        float f;
        C17480uj r3 = r12;
        r12.BJR();
        if (AnonymousClass000.A1Y(this.A02.getValue())) {
            j = C05100Qk.A01;
            f = 0.3f;
        } else if (AnonymousClass000.A1Y(this.A01.getValue()) || AnonymousClass000.A1Y(this.A00.getValue())) {
            j = C05100Qk.A01;
            f = 0.1f;
        } else {
            return;
        }
        C04820Pb.A03(r3, 122, AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), f), 0, r12.BZL());
    }

    public AnonymousClass0UG(C16300s2 r1, C16300s2 r2, C16300s2 r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
