package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.67q  reason: invalid class name and case insensitive filesystem */
public final class C1193167q extends AnonymousClass6nE {
    public void A01(int[] iArr) {
        C18070vi.A0d(iArr, 0);
        if (AnonymousClass74I.A01(iArr)) {
            iArr = AnonymousClass74I.A06(iArr);
        }
        synchronized (this) {
            C18100vl r3 = this.A02;
            boolean z = false;
            for (C144627Ib r5 : (List) AnonymousClass3MX.A14(r3)) {
                float f = r5.A00;
                if (!r5.BFJ(iArr)) {
                    r5.A00 = (((float) Math.rint((double) (f * 100.0f))) / 100.0f) * 0.9f;
                    r5.A03++;
                } else {
                    r5.A00 = ((float) Math.rint((double) ((f + 1.0f) * 100.0f))) / 100.0f;
                    r5.A03 = 0;
                    r5.A02 = System.currentTimeMillis();
                    z = true;
                }
            }
            if (!z) {
                ((List) AnonymousClass3MX.A14(r3)).add((C144627Ib) this.A00.BHM(iArr, 1.0f));
            }
            Collections.sort((List) AnonymousClass3MX.A14(r3), this.A01);
            C17960vV.A07((List) AnonymousClass3MX.A14(r3));
            int A01 = AnonymousClass3MX.A01((List) AnonymousClass3MX.A14(r3));
            if (36 <= A01) {
                while (true) {
                    ((List) AnonymousClass3MX.A14(r3)).remove(A01);
                    if (A01 == 36) {
                        break;
                    }
                    A01--;
                }
            }
            this.A00.CBh((List) AnonymousClass3MX.A14(r3));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1193167q(AnonymousClass11P r1, AnonymousClass7IX r2) {
        super(r1, r2);
        C18070vi.A0j(r2, r1);
    }
}
