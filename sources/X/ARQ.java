package X;

public final class ARQ implements C26701Td {
    public final /* synthetic */ C198589ya A00;
    public final /* synthetic */ C179319Hm A01;
    public final /* synthetic */ C20559APt A02;
    public final /* synthetic */ C31761g5 A03;

    public /* synthetic */ void BqZ(C59312m6 r1, boolean z) {
    }

    public /* synthetic */ void BrL(C59312m6 r1) {
    }

    public /* synthetic */ void BrO(C59312m6 r1) {
    }

    public /* synthetic */ void BrS(C59312m6 r1) {
    }

    public /* synthetic */ void BrU() {
    }

    public ARQ(C198589ya r1, C179319Hm r2, C20559APt aPt, C31761g5 r4) {
        this.A02 = aPt;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BrP(C199410f r6, String str, int i) {
        C198589ya r4;
        this.A02.A00.unregisterObserver(this);
        if (this.A01 == C179319Hm.UNPAIRING && (r4 = this.A00) != null) {
            C198589ya.A00(r4, Long.valueOf((long) i), str, 5);
        }
        this.A03.resumeWith(new C184379ar(AnonymousClass9I9.REMOVE_ALL_COMPANION_DEVICES_FAILED, false));
    }

    public void BrT(C199410f r5) {
        C198589ya r3;
        this.A02.A00.unregisterObserver(this);
        if (this.A01 == C179319Hm.UNPAIRING && (r3 = this.A00) != null) {
            C198589ya.A00(r3, C17890vO.A0L(), (String) null, 5);
        }
        this.A03.resumeWith(new C184379ar(AnonymousClass9I9.UNKNOWN, true));
    }
}
