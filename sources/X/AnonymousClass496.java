package X;

import java.lang.ref.WeakReference;

/* renamed from: X.496  reason: invalid class name */
public class AnonymousClass496 extends A34 {
    public final int A00;
    public final AnonymousClass1TD A01;
    public final AnonymousClass1TA A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass2Q4 A04;
        String str = ((String[]) objArr)[0];
        long j = -1;
        if (!(str == null || (A04 = this.A02.A04(C40811vJ.A0A(str))) == null)) {
            j = A04.A01();
        }
        C178119Bw A05 = this.A01.A05(j);
        if (this.A02.isCancelled()) {
            return null;
        }
        return A05;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C178119Bw r3 = (C178119Bw) obj;
        C107155Yp r1 = (C107155Yp) this.A03.get();
        if (r1 != null) {
            r1.BnC(r3, this.A00);
        }
    }

    public AnonymousClass496(C107155Yp r2, AnonymousClass1TD r3, AnonymousClass1TA r4, int i) {
        this.A03 = AnonymousClass3MW.A0z(r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = i;
    }
}
