package X;

import java.util.List;

/* renamed from: X.9Nv  reason: invalid class name and case insensitive filesystem */
public abstract class C180769Nv {
    public C182439Uj A00;

    public void A01() {
        C182439Uj r0 = this.A00;
        if (r0 != null) {
            C188589hf r2 = r0.A00;
            if (!r2.A01) {
                r2.A01 = true;
                r2.A04.post(r2.A0A);
            }
        }
    }

    public void A02() {
        C182439Uj r0 = this.A00;
        if (r0 != null) {
            C188589hf r4 = r0.A00;
            C216816z r02 = r4.A00;
            if (r02 != null) {
                r02.C4M();
            }
            if (r4.A01) {
                r4.A04.removeCallbacks(r4.A0A);
                long now = r4.A05.now();
                if (r4.A0C.isEmpty()) {
                    C191479mf r03 = r4.A06;
                    List list = r4.A0B;
                    r03.A00(list);
                    C140006zn r04 = r4.A09;
                    r04.A03(list, now);
                    r04.A02();
                } else {
                    throw new IllegalStateException();
                }
            }
            r4.A01 = false;
        }
    }
}
