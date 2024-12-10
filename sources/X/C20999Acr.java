package X;

import android.util.Pair;

/* renamed from: X.Acr  reason: case insensitive filesystem */
public class C20999Acr implements B9L {
    public final int A00;
    public final Object A01;

    public C20999Acr(C198799yv r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void Bso(Pair pair) {
        AnonymousClass1DT r0;
        if (this.A00 != 0) {
            AnonymousClass1DT r02 = ((C198799yv) this.A01).A07;
            if (r02 != null) {
                C72463Mc.A1B(r02);
                return;
            }
            return;
        }
        Number number = (Number) pair.first;
        Boolean A0i = AnonymousClass000.A0i();
        if (number == null || 405 != number.intValue()) {
            r0 = ((C198799yv) this.A01).A08;
        } else {
            r0 = ((C198799yv) this.A01).A04;
        }
        if (r0 != null) {
            r0.A0E(A0i);
        }
    }
}
