package X;

/* renamed from: X.1yr  reason: invalid class name and case insensitive filesystem */
public class C42861yr implements C40681v6 {
    public final C40561uu A00;
    public final C40561uu A01;
    public final C40561uu A02;
    public final Integer A03;
    public final boolean A04;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        return new D7c(this, d7p);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trim Path: {start: ");
        sb.append(this.A02);
        sb.append(", end: ");
        sb.append(this.A00);
        sb.append(", offset: ");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C42861yr(C40561uu r1, C40561uu r2, C40561uu r3, Integer num, boolean z) {
        this.A03 = num;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = z;
    }
}
