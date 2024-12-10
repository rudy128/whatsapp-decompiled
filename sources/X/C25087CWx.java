package X;

/* renamed from: X.CWx  reason: case insensitive filesystem */
public class C25087CWx {
    public int A00;
    public CWD A01;
    public E5D A02;
    public E5D A03;
    public Runnable A04 = DTT.A00;

    public C24925CPy A00() {
        boolean z = true;
        C18210vx.A07(AnonymousClass000.A1W(this.A02), "Must set register function");
        C18210vx.A07(AnonymousClass000.A1W(this.A03), "Must set unregister function");
        if (this.A01 == null) {
            z = false;
        }
        C18210vx.A07(z, "Must set holder");
        CYG cyg = this.A01.A01;
        C18210vx.A02(cyg, "Key must not be null");
        return new C24925CPy(new CQ1(this.A01, this, this.A00), new C24872CNq(cyg, this), this.A04);
    }
}
