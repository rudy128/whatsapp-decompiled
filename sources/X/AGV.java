package X;

public final class AGV implements AnonymousClass1GV {
    public boolean A00;
    public boolean A01;
    public final C19830z4 A02;

    public AGV(C19830z4 r5) {
        C18070vi.A0d(r5, 1);
        this.A02 = r5;
        AnonymousClass00H r3 = r5.A00;
        this.A00 = C17880vN.A0B(r3).getBoolean("detect_device_foldable", false);
        this.A01 = C17880vN.A0B(r3).getBoolean("detect_device_foldable_bookmode", false);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        C199049zL r1;
        C192929pG r6 = (C192929pG) obj;
        C18070vi.A0d(r6, 0);
        BDd A002 = AnonymousClass9QW.A00(r6);
        if (!this.A00 && A002 != null) {
            this.A00 = true;
            C17880vN.A1F(C19830z4.A00(this.A02), "detect_device_foldable", true);
        }
        if (!this.A01) {
            if (A002 != null) {
                AnonymousClass1Zh r3 = ((C20344AHa) A002).A00;
                if (r3.A02 - r3.A01 > r3.A00 - r3.A03) {
                    r1 = C199049zL.A01;
                } else {
                    r1 = C199049zL.A02;
                }
            } else {
                r1 = null;
            }
            if (C18070vi.A18(r1, C199049zL.A02)) {
                this.A01 = true;
                C17880vN.A1F(C19830z4.A00(this.A02), "detect_device_foldable_bookmode", true);
            }
        }
    }
}
