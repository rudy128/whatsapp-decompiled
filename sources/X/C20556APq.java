package X;

/* renamed from: X.APq  reason: case insensitive filesystem */
public class C20556APq implements C22497BAe {
    public final C192409oL A00;
    public final C59822mw A01;
    public final AnonymousClass1E7 A02;

    public int BTW() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20556APq)) {
            return false;
        }
        C20556APq aPq = (C20556APq) obj;
        if (!this.A02.equals(aPq.A02) || !this.A01.equals(aPq.A01) || !this.A00.equals(aPq.A00)) {
            return false;
        }
        return true;
    }

    public C20556APq(C192409oL r1, C59822mw r2, AnonymousClass1E7 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A02;
        A1a[1] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1a, 2);
    }
}
