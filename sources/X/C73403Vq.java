package X;

import java.util.List;

/* renamed from: X.3Vq  reason: invalid class name and case insensitive filesystem */
public final class C73403Vq extends C24490C6i {
    public final List A00;
    public final List A01;

    public C73403Vq(List list, List list2) {
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        C445823z r0;
        Object obj2;
        C84914Li r4 = (C84914Li) this.A01.get(i);
        C84914Li r3 = (C84914Li) this.A00.get(i2);
        if ((r4 instanceof C80893yG) && (r3 instanceof C80893yG)) {
            obj = ((C80893yG) r4).A01;
            obj2 = ((C80893yG) r3).A01;
        } else if (!(r4 instanceof C80883yF) || !(r3 instanceof C80883yF)) {
            if ((r4 instanceof C80863yD) && (r3 instanceof C80863yD)) {
                obj = ((C80863yD) r4).A00.A0v.A01;
                r0 = ((C80863yD) r3).A00;
            } else if (!(r4 instanceof C80873yE) || !(r3 instanceof C80873yE)) {
                return false;
            } else {
                obj = ((C80873yE) r4).A00.A0v.A01;
                r0 = ((C80873yE) r3).A00;
            }
            obj2 = r0.A0v.A01;
        } else {
            C80883yF r42 = (C80883yF) r4;
            C80883yF r32 = (C80883yF) r3;
            if (!C18070vi.A18(r42.A01, r32.A01) || r42.A00 != r32.A00) {
                return false;
            }
            return true;
        }
        return C18070vi.A18(obj, obj2);
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass3Ma.A1a(this.A01.get(i), this.A00, i2);
    }
}
