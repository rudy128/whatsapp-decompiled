package X;

import java.lang.ref.WeakReference;

/* renamed from: X.48y  reason: invalid class name and case insensitive filesystem */
public class C825848y extends A34 {
    public final long A00;
    public final AnonymousClass1TD A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return this.A01.A05(this.A00);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C178119Bw r2 = (C178119Bw) obj;
        C107165Yq r0 = (C107165Yq) this.A02.get();
        if (r0 != null) {
            r0.BnB(r2);
        }
    }

    public C825848y(C107165Yq r2, AnonymousClass1TD r3, long j) {
        this.A01 = r3;
        this.A02 = AnonymousClass3MW.A0z(r2);
        this.A00 = j;
    }
}
