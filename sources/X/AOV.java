package X;

public class AOV implements BAT {
    public final /* synthetic */ C19995A2i A00;
    public final /* synthetic */ C187029f9 A01;
    public final /* synthetic */ BCH A02;

    public AOV(C19995A2i a2i, C187029f9 r2, BCH bch) {
        this.A00 = a2i;
        this.A01 = r2;
        this.A02 = bch;
    }

    public void BpU(C26235CvV cvV) {
        C187029f9 r1 = new C187029f9();
        r1.A01 = cvV;
        r1.A00 = 5;
        r1.A03 = this.A01.A03;
        this.A02.C3j(r1);
    }

    public void Bt0(String str) {
        this.A00.A02(this.A01, this.A02, str);
    }
}
