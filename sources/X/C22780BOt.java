package X;

/* renamed from: X.BOt  reason: case insensitive filesystem */
public final class C22780BOt extends C22783BOw {
    public int A00;
    public final int A01;
    public final E9e A02;

    public C28649ECi BHj(C25199Caq caq, C25215CbB cbB, long j) {
        int i = this.A01;
        E9e e9e = this.A02;
        if (i != Integer.MAX_VALUE) {
            caq = caq.A00(caq.A02 % this.A00);
        }
        return e9e.BHj(caq, cbB, j);
    }

    public void CEL(C28649ECi eCi) {
        this.A02.CEL(eCi);
    }

    public C22780BOt(E9e e9e, int i) {
        C26056CrS.A02(AnonymousClass000.A1R(i));
        this.A02 = e9e;
        this.A01 = i;
    }

    public void A05() {
        super.A05();
        this.A00 = 0;
    }

    public void A06(C26206Cue cue, boolean z) {
        super.A06(cue, z);
        A07(this.A02, (Object) null);
    }
}
