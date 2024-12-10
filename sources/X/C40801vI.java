package X;

/* renamed from: X.1vI  reason: invalid class name and case insensitive filesystem */
public class C40801vI implements C40681v6 {
    public final C40791vH A00;
    public final String A01;
    public final boolean A02;
    public final int A03;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        return new C26631D7e(r3, this, d7p);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapePath{name=");
        sb.append(this.A01);
        sb.append(", index=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C40801vI(C40791vH r1, String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = i;
        this.A00 = r1;
        this.A02 = z;
    }
}
