package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.Du5  reason: case insensitive filesystem */
public final class C28244Du5 extends C35951n6 {
    public final C27178DXn A00;
    public final /* synthetic */ AtomicReferenceArray A01 = new AtomicReferenceArray(CIR.A01 * 2);

    public int A04() {
        return CIR.A01;
    }

    public void A06(int i) {
        AnonymousClass1I8 r0;
        int i2 = CIR.A01;
        boolean z = false;
        if (i >= i2) {
            z = true;
            i -= i2;
        }
        AtomicReferenceArray atomicReferenceArray = this.A01;
        int i3 = i * 2;
        atomicReferenceArray.get(i3);
        while (true) {
            Object obj = atomicReferenceArray.get(i3 + 1);
            if ((obj instanceof C31771g6) || (obj instanceof CVX)) {
                if (z) {
                    r0 = CIR.A0A;
                } else {
                    r0 = CIR.A09;
                }
                if (A0A(i, obj, r0)) {
                    atomicReferenceArray.set(i3, (Object) null);
                    A09(i, !z);
                    break;
                }
            } else if (obj == CIR.A0A || obj == CIR.A09) {
                atomicReferenceArray.set(i3, (Object) null);
            } else if (!(obj == CIR.A0F || obj == CIR.A0G)) {
                if (obj != CIR.A07 && obj != CIR.A03 && obj != CIR.A04) {
                    throw BEA.A0c(obj, "unexpected state: ", AnonymousClass000.A10());
                }
                return;
            }
        }
        atomicReferenceArray.set(i3, (Object) null);
        if (z) {
            C18070vi.A0b(this.A00);
        }
    }

    public final void A09(int i, boolean z) {
        if (z) {
            C27178DXn dXn = this.A00;
            C18070vi.A0b(dXn);
            dXn.A0M((this.A00 * ((long) CIR.A01)) + ((long) i));
        }
        A05();
    }

    public final boolean A0A(int i, Object obj, Object obj2) {
        return C24565C9m.A00(obj, obj2, this.A01, (i * 2) + 1);
    }

    public C28244Du5(C27178DXn dXn, C28244Du5 du5, int i, long j) {
        super(du5, i, j);
        this.A00 = dXn;
    }
}
