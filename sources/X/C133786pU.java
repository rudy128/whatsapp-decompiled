package X;

/* renamed from: X.6pU  reason: invalid class name and case insensitive filesystem */
public class C133786pU {
    public final /* synthetic */ C19995A2i A00;
    public final /* synthetic */ C187029f9 A01;
    public final /* synthetic */ ADL A02;
    public final /* synthetic */ BCH A03;
    public final /* synthetic */ boolean A04;

    public C133786pU(C19995A2i a2i, C187029f9 r2, ADL adl, BCH bch, boolean z) {
        this.A00 = a2i;
        this.A04 = z;
        this.A02 = adl;
        this.A01 = r2;
        this.A03 = bch;
    }

    public void A00(Exception exc) {
        C187029f9 r3 = this.A01;
        r3.A02 = exc;
        r3.A00 = 7;
        this.A00.A02(r3, this.A03, exc.getLocalizedMessage());
    }

    public void A01(Exception exc) {
        C187029f9 r3 = this.A01;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A00.A02(r3, this.A03, exc.getLocalizedMessage());
    }
}
