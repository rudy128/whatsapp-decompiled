package X;

/* renamed from: X.CkK  reason: case insensitive filesystem */
public final class C25689CkK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CR5 A04;
    public CU2 A05;
    public final C28586E8z A06;
    public final CUJ A07 = new CUJ();
    public final C26207Cui A08 = new C26207Cui();
    public final C26207Cui A09 = new C26207Cui(1);

    public static CSG A00(C25689CkK ckK) {
        CUJ cuj = ckK.A07;
        int i = cuj.A05.A02;
        CSG csg = cuj.A06;
        if ((csg != null || (csg = ckK.A05.A0A[i]) != null) && csg.A03) {
            return csg;
        }
        return null;
    }

    public void A01() {
        CUJ cuj = this.A07;
        cuj.A01 = 0;
        cuj.A04 = 0;
        cuj.A07 = false;
        cuj.A08 = false;
        cuj.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public C25689CkK(C28586E8z e8z) {
        this.A06 = e8z;
    }
}
