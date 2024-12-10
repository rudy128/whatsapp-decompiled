package X;

/* renamed from: X.DWs  reason: case insensitive filesystem */
public final /* synthetic */ class C27157DWs implements C22821Di {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CWH A02;

    public static final void A00(C17770vC r18, float f, float f2, float f3, long j, long j2, long j3) {
        float f4 = f;
        float f5 = 7.0f * f;
        long A0p = AnonymousClass001.A0p(f5, f5);
        long j4 = AnonymousClass0QG.A01;
        C016909m r4 = C016909m.A00;
        C17770vC r3 = r18;
        long j5 = j;
        long j6 = j3;
        r3.BJi(r4, 1.0f, 3, j6, j5, A0p);
        float f6 = f2;
        long j7 = j2;
        C17770vC r11 = r3;
        C016909m r12 = r4;
        r11.BJi(r12, 1.0f, 3, j7, AnonymousClass0QY.A05(j5, AnonymousClass001.A0p(f4, f4)), AnonymousClass001.A0p(f6, f6));
        float f7 = 2.0f * f4;
        long A05 = AnonymousClass0QY.A05(j5, AnonymousClass001.A0p(f7, f7));
        float f8 = f3;
        r3.BJi(r4, 1.0f, 3, j6, A05, AnonymousClass001.A0p(f8, f8));
    }

    public final Object invoke(Object obj) {
        CWH cwh = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        C17770vC r11 = (C17770vC) obj;
        C18070vi.A0d(cwh, 0);
        C18070vi.A0d(r11, 3);
        float A022 = AnonymousClass0QG.A02(r11.BZL());
        int i = cwh.A01;
        float f = A022 / ((float) i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = cwh.A00;
            for (int i4 = 0; i4 < i3; i4++) {
                if (cwh.A02[i4][i2] == 1 && ((i2 >= 7 || (i4 >= 7 && i4 <= (i - 1) - 7)) && (i2 <= (i - 1) - 7 || i4 >= 7))) {
                    long A0p = AnonymousClass001.A0p(((float) i2) * f, ((float) i4) * f);
                    long j3 = AnonymousClass0QY.A03;
                    r11.BJi(C016909m.A00, 1.0f, 3, j, A0p, AnonymousClass001.A0p(f, f));
                }
            }
        }
        long A0p2 = AnonymousClass001.A0p(0.0f, 0.0f);
        long j4 = AnonymousClass0QY.A03;
        long BZL = r11.BZL();
        float f2 = 7.0f * f;
        long A0p3 = AnonymousClass001.A0p(AnonymousClass0QG.A02(BZL) - f2, 0.0f);
        long A0p4 = AnonymousClass001.A0p(0.0f, AnonymousClass0QG.A02(BZL) - f2);
        float f3 = f * 5.0f;
        float f4 = f * 3.0f;
        A00(r11, f, f3, f4, A0p2, j2, j);
        A00(r11, f, f3, f4, A0p3, j2, j);
        A00(r11, f, f3, f4, A0p4, j2, j);
        return C27621Wu.A00;
    }

    public /* synthetic */ C27157DWs(CWH cwh, long j, long j2) {
        this.A02 = cwh;
        this.A00 = j;
        this.A01 = j2;
    }
}
