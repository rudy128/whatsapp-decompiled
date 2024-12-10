package X;

import androidx.compose.animation.core.InfiniteTransition$run$1;

/* renamed from: X.0IQ  reason: invalid class name */
public final class AnonymousClass0IQ {
    public long A00 = Long.MIN_VALUE;
    public final C17330uU A01 = AnonymousClass0Q9.A04(true);
    public final C17330uU A02 = AnonymousClass0Q9.A03(false);
    public final C06970a9 A03 = C06970a9.A02(new C05770Vq[16]);

    public final void A00(C17130tn r4, int i) {
        r4.COC(-318043801);
        Object A1A = AnonymousClass001.A1A(r4);
        if (A1A == AnonymousClass0MH.A00) {
            A1A = AnonymousClass0Q9.A02((Object) null);
            AnonymousClass0VR.A0V(r4, A1A);
        }
        AnonymousClass0VR.A0T(r4);
        C17330uU r2 = (C17330uU) A1A;
        if (AnonymousClass001.A1b(this.A01) || AnonymousClass001.A1b(this.A02)) {
            AnonymousClass0QC.A04(r4, this, new InfiniteTransition$run$1(this, r2, (C30391dr) null));
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C12740mF(this, i));
        }
    }
}
