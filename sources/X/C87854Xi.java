package X;

import java.util.List;

/* renamed from: X.4Xi  reason: invalid class name and case insensitive filesystem */
public class C87854Xi {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C18140vp A04;

    public int A00() {
        if (this instanceof C74723cN) {
            return ((C74723cN) this).A00.A03();
        }
        C18140vp r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return ((List) r0.get()).size();
    }

    public int[] A01(C18010vc r3, int i) {
        if (this instanceof C74723cN) {
            return (int[]) ((C74723cN) this).A00.A04(i);
        }
        C18140vp r0 = this.A04;
        if (r0 == null) {
            return new int[0];
        }
        int[] iArr = ((AnonymousClass737) ((List) r0.get()).get(i)).A00;
        if (AnonymousClass74I.A02(iArr)) {
            return C1409873v.A05(r3, iArr);
        }
        if (AnonymousClass74I.A03(iArr)) {
            return C1409873v.A06(r3, iArr);
        }
        return iArr;
    }

    public C87854Xi(C128996h5 r2, int i) {
        this.A02 = i;
        this.A04 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A03 = r2.A02;
    }

    public C87854Xi() {
        this.A02 = 0;
        this.A04 = null;
        this.A00 = 2131430333;
        this.A01 = 2131430334;
        this.A03 = 2131889728;
    }
}
