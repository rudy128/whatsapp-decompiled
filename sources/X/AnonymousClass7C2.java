package X;

/* renamed from: X.7C2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7C2 implements C1604788q {
    public final /* synthetic */ C1604788q A00;
    public final /* synthetic */ AnonymousClass721 A01;
    public final /* synthetic */ C135566sP A02;

    public /* synthetic */ void BJC(Exception exc, boolean z) {
        BJB(false);
    }

    public final void BJB(boolean z) {
        String str;
        AnonymousClass721 r0 = this.A01;
        C135566sP r1 = this.A02;
        C1604788q r5 = this.A00;
        C129426hm r6 = (C129426hm) C18070vi.A0E(r0.A09);
        boolean z2 = r1.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlLoadLatencyLogger/logFetchCompleted for ");
        A10.append(r6.A00);
        C18070vi.A0d(C17900vP.A0D(", result: ", A10, z), 0);
        AnonymousClass19T r4 = r6.A03;
        int i = r6.A00;
        int i2 = r6.A01;
        if (z2) {
            str = "RETRIEVE_SCREEN_QUERY";
        } else {
            str = "RETRIEVE_ASYNC_ACTION";
        }
        r4.markerPoint(i, i2, str);
        if (!z) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("AlLoadLatencyLogger/logLoadError for ");
            A102.append(r6.A00);
            C18070vi.A0d(AnonymousClass001.A1H(", errorType: ", (String) null, A102), 0);
            r4.Biv(r6.A00, r6.A01, 87, "LOAD_ERROR");
        }
        r5.BJB(z);
    }

    public /* synthetic */ AnonymousClass7C2(C1604788q r1, AnonymousClass721 r2, C135566sP r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
