package X;

/* renamed from: X.DDt  reason: case insensitive filesystem */
public class C26786DDt implements E98, EDG {
    public C26045Cr9 A00;
    public final C25639CjS A01;
    public final C26780DDk A02;

    public void BCi(EAJ eaj) {
    }

    public void BIY() {
    }

    public boolean Bcs() {
        return true;
    }

    public /* synthetic */ EA3 CFA(EA3 ea3, C25841Cmv cmv) {
        return ea3;
    }

    public void CRE(int i, int i2, int i3, int i4, int i5, boolean z) {
    }

    public void release() {
    }

    public void Bd8(C26045Cr9 cr9) {
        this.A00 = cr9;
        cr9.A03(this.A02);
    }

    public C26786DDt(C25639CjS cjS) {
        cjS = cjS == null ? C25639CjS.A01 : cjS;
        this.A01 = cjS;
        this.A02 = new C26780DDk(cjS);
    }

    public /* synthetic */ void CF9(C25841Cmv cmv, Long l) {
        try {
            cmv.A07.A01(cmv.A00(), (EAK) null);
        } catch (Throwable th) {
            C27222Da1.A00(cmv.A05, "MediaGraph.render() failed.", th);
        }
    }

    public C26786DDt() {
        C25639CjS cjS = C25639CjS.A01;
        this.A01 = cjS;
        this.A02 = new C26780DDk(cjS);
    }
}
