package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4S2  reason: invalid class name */
public final class AnonymousClass4S2 {
    public final AnonymousClass1MZ A00;
    public final AnonymousClass1PS A01;
    public final AnonymousClass18K A02;
    public final C25241Nl A03;

    public final void A00(int i, int i2) {
        C81213ys r1 = new C81213ys();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        this.A02.CC7(r1);
    }

    public final void A01(List list, int i, int i2, int i3, int i4, int i5) {
        long j;
        C81633zY r3 = new C81633zY();
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 6) {
            i6 = 2;
        }
        r3.A00 = Integer.valueOf(i6);
        r3.A01 = Integer.valueOf(i);
        if (i2 == -1) {
            j = 0;
        } else {
            j = (long) i2;
        }
        r3.A03 = Long.valueOf(j);
        if (list != null) {
            r3.A02 = C17880vN.A0n(list.size());
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (C22971Dz.A0W(C17880vN.A0S(it))) {
                    i7++;
                }
            }
            r3.A04 = C17880vN.A0n(i7);
            r3.A06 = C17880vN.A0n(i4);
            r3.A05 = C17880vN.A0n(i3);
        }
        this.A02.CC7(r3);
    }

    public AnonymousClass4S2(AnonymousClass1MZ r1, AnonymousClass1PS r2, AnonymousClass18K r3, C25241Nl r4) {
        C18070vi.A0s(r3, r4, r1, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
