package X;

import java.util.Comparator;

/* renamed from: X.AiY  reason: case insensitive filesystem */
public final class C21345AiY implements Comparable {
    public double A00;
    public double A01;
    public C20269AEc A02;
    public final C22405B6i A03;
    public final Comparator A04;

    public void A00(double[] dArr) {
        int i;
        C20269AEc BXJ = this.A03.BXJ();
        if (!BXJ.equals(this.A02)) {
            this.A02 = BXJ;
            double A012 = C26152CtJ.A01(BXJ.A01);
            if (A012 < 0.0d) {
                i = 1;
            } else {
                i = 0;
                if (A012 > 1.0d) {
                    i = -1;
                }
            }
            this.A00 = A012 + ((double) i);
            this.A01 = C26152CtJ.A00(BXJ.A00);
        }
        dArr[0] = this.A00;
        dArr[1] = this.A01;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A04.compare(this.A03, ((C21345AiY) obj).A03);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21345AiY)) {
            return false;
        }
        return this.A03.equals(((C21345AiY) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public C21345AiY(C22405B6i b6i, Comparator comparator) {
        this.A03 = b6i;
        this.A04 = comparator;
    }
}
