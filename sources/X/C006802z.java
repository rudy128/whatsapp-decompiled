package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.02z  reason: invalid class name and case insensitive filesystem */
public final class C006802z {
    public final C23381Fv A00;
    public final List A01 = new ArrayList();

    public final void A00() {
        List<C218317o> list = this.A01;
        for (C218317o A06 : list) {
            this.A00.A06(A06);
        }
        list.clear();
    }

    public final void A01(AnonymousClass1GC r2) {
        this.A00.A05(r2);
        this.A01.add(r2);
    }

    public C006802z(C23381Fv r2) {
        this.A00 = r2;
    }
}
