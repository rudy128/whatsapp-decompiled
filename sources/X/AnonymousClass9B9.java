package X;

import java.lang.ref.WeakReference;

/* renamed from: X.9B9  reason: invalid class name */
public class AnonymousClass9B9 extends A34 {
    public final AnonymousClass1QS A00;
    public final AnonymousClass1QE A01;
    public final AnonymousClass9YM A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Number number = (Number) obj;
        C183379Ya r0 = (C183379Ya) this.A03.get();
        if (r0 != null) {
            AnonymousClass4Yv.A01(r0.A00, number.intValue());
        }
    }

    public AnonymousClass9B9(AnonymousClass1QS r2, AnonymousClass1QE r3, AnonymousClass9YM r4, C183379Ya r5) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = AnonymousClass3MW.A0z(r5);
    }
}
