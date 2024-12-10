package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2jo  reason: invalid class name and case insensitive filesystem */
public final class C57892jo {
    public int A00;
    public final C26241Rj A01;
    public final int A02;
    public final AnonymousClass1KB A03;
    public final C18030ve A04;
    public final Set A05 = C17880vN.A14();

    public C57892jo(AnonymousClass1KB r3, C18030ve r4, C26241Rj r5) {
        C18070vi.A0o(r4, r5, r3);
        this.A04 = r4;
        this.A01 = r5;
        this.A03 = r3;
        this.A02 = C18020vd.A00(C18040vf.A02, r4, 4371);
    }

    public final void A00(List list) {
        int i;
        if (!list.isEmpty() && this.A00 < (i = this.A02)) {
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (!this.A05.contains(next)) {
                    A13.add(next);
                }
            }
            int min = Math.min(A13.size(), i - this.A00);
            List A0t = C29431cG.A0t(C29431cG.A0v(A13, min));
            this.A05.addAll(A0t);
            this.A00 += min;
            this.A03.A0J(new C70713Cf(this, A0t, 46));
        }
    }
}
