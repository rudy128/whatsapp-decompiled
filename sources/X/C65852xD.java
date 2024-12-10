package X;

/* renamed from: X.2xD  reason: invalid class name and case insensitive filesystem */
public class C65852xD implements C26181Rd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65852xD(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BvR() {
        switch (this.A00) {
            case 0:
                C21004Acw acw = (C21004Acw) this.A02;
                C195319t9 r1 = (C195319t9) this.A01;
                synchronized (acw) {
                    C1774998v r0 = acw.A00;
                    if (r0 != null) {
                        C21004Acw.A00(acw, r0, r1);
                    }
                    acw.A00 = null;
                    acw.A02.unregisterObserver(this);
                }
                return;
            case 1:
                C97594pj r12 = (C97594pj) this.A01;
                r12.A05.unregisterObserver(this);
                r12.A01((C85834Ox) this.A02);
                return;
            default:
                ((AnonymousClass18L) this.A02).CAg(0);
                return;
        }
    }

    public /* synthetic */ void BvS() {
        if (2 - this.A00 == 0) {
            ((AnonymousClass18L) this.A02).CAg(1);
        }
    }

    public /* synthetic */ void BvT() {
        if (2 - this.A00 == 0) {
            ((AnonymousClass18L) this.A02).CAg(1);
        }
    }

    public /* synthetic */ void BvU() {
        if (2 - this.A00 == 0) {
            ((AnonymousClass18L) this.A02).BvU();
        }
    }

    public /* synthetic */ void BvV() {
    }
}
