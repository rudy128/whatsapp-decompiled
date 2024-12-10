package X;

/* renamed from: X.DDl  reason: case insensitive filesystem */
public class C26781DDl implements E98 {
    public EAJ A00;
    public C26045Cr9 A01;
    public DE4 A02;
    public C26780DDk A03;
    public final C25639CjS A04 = C25639CjS.A01;
    public final C25639CjS A05;

    public final void release() {
        this.A01 = null;
    }

    public final void BCi(EAJ eaj) {
        EAJ eaj2 = this.A00;
        if (!(eaj2 == null || eaj2 == eaj)) {
            this.A04.A00(C0H.A02);
        }
        this.A00 = eaj;
    }

    public final void BIY() {
        DE4 de4 = this.A02;
        if (de4 != null) {
            de4.BIY();
            this.A02 = null;
        }
        this.A00 = null;
        C26780DDk dDk = this.A03;
        if (dDk != null) {
            dDk.BIY();
            this.A03 = null;
        }
    }

    public final void Bd8(C26045Cr9 cr9) {
        C26045Cr9 cr92 = this.A01;
        if (!(cr92 == null || cr92 == cr9)) {
            this.A04.A00(C0H.A04);
        }
        this.A01 = cr9;
    }

    public C26781DDl(C25639CjS cjS) {
        this.A05 = cjS;
    }

    public C26781DDl() {
    }
}
