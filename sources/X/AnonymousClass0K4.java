package X;

import java.util.Arrays;

/* renamed from: X.0K4  reason: invalid class name */
public final class AnonymousClass0K4 {
    public long A00 = AnonymousClass0QY.A03;
    public long A01;
    public final AnonymousClass0N5 A02;
    public final AnonymousClass0N5 A03;

    public final long A00(long j) {
        long j2 = C26199CuU.A01;
        float A022 = AnonymousClass001.A02(j);
        if (A022 > 0.0f) {
            float A012 = AnonymousClass001.A01(j);
            if (A012 > 0.0f) {
                return C7D.A00(this.A02.A00(A022), this.A03.A00(A012));
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("maximumVelocity should be a positive value. You specified=");
        A10.append(C26199CuU.A02(j));
        throw AnonymousClass000.A0m(A10);
    }

    public final void A01() {
        AnonymousClass0N5 r1 = this.A02;
        Arrays.fill(r1.A04, 0, 20, (Object) null);
        r1.A00 = 0;
        AnonymousClass0N5 r12 = this.A03;
        Arrays.fill(r12.A04, 0, 20, (Object) null);
        r12.A00 = 0;
        this.A01 = 0;
    }

    public final void A02(long j, long j2) {
        this.A02.A01(AnonymousClass0QY.A01(j2), j);
        this.A03.A01(AnonymousClass0QY.A02(j2), j);
    }

    public AnonymousClass0K4() {
        Integer num = AnonymousClass00R.A00;
        this.A02 = new AnonymousClass0N5(num, false);
        this.A03 = new AnonymousClass0N5(num, false);
    }
}
