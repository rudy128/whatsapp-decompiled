package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0XJ  reason: invalid class name */
public abstract class AnonymousClass0XJ implements C16420sE {
    public int A00;
    public int A01;
    public long A02 = C79.A00();
    public long A03 = AnonymousClass001.A0r(0);
    public long A04 = AnonymousClass0O5.A00;

    public abstract void A0Z(C22821Di r1, float f, long j);

    public static int A0S(AnonymousClass0XJ r2, int i) {
        return AnonymousClass0MX.A03.BBy(r2.A00, i);
    }

    private final void A0T() {
        long j = this.A03;
        int A0G = AnonymousClass000.A0G(j);
        long j2 = this.A04;
        int A032 = C28851b7.A03(A0G, Constraints.A03(j2), Constraints.A01(j2));
        this.A01 = A032;
        int A0H = AnonymousClass000.A0H(j);
        int A033 = C28851b7.A03(A0H, Constraints.A02(j2), Constraints.A00(j2));
        this.A00 = A033;
        this.A02 = C7A.A00((A032 - A0G) / 2, (A033 - A0H) / 2);
    }

    public int A0V() {
        return AnonymousClass000.A0H(this.A03);
    }

    public int A0W() {
        return AnonymousClass000.A0G(this.A03);
    }

    public final void A0X(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A0T();
        }
    }

    public final void A0Y(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            A0T();
        }
    }

    public /* synthetic */ Object BWC() {
        return null;
    }
}
