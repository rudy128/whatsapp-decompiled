package X;

/* renamed from: X.1yt  reason: invalid class name and case insensitive filesystem */
public class C42881yt implements C40681v6 {
    public final C40561uu A00;
    public final C40521uq A01;
    public final C40521uq A02;
    public final String A03;
    public final boolean A04;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        return new C26634D7h(r3, this, d7p);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RectangleShape{position=");
        sb.append(this.A01);
        sb.append(", size=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C42881yt(C40561uu r1, C40521uq r2, C40521uq r3, String str, boolean z) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
    }
}
