package X;

import android.view.View;

/* renamed from: X.BLv  reason: case insensitive filesystem */
public class C22710BLv extends C37911qO {
    public final int A00;
    public final Object A01;

    public C22710BLv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01() {
        switch (this.A00) {
            case 0:
                ((CX4) this.A01).A00(true);
                return;
            case 2:
                ((View) this.A01).requestLayout();
                return;
            case 3:
                AnonymousClass6KR.A01((AnonymousClass6KR) this.A01);
                return;
            default:
                super.A01();
                return;
        }
    }

    public final void A02(int i, int i2) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
                BM2.A00((BM2) this.A01, i, i2);
                return;
            case 3:
                AnonymousClass6KR.A01((AnonymousClass6KR) this.A01);
                return;
            default:
                super.A02(i, i2);
                return;
        }
    }

    public final void A03(int i, int i2) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
                BM2.A00((BM2) this.A01, i, i2);
                return;
            case 3:
                AnonymousClass6KR.A01((AnonymousClass6KR) this.A01);
                return;
            default:
                super.A03(i, i2);
                return;
        }
    }

    public final void A04(int i, int i2) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
                BM2.A00((BM2) this.A01, i, i2);
                return;
            case 3:
                AnonymousClass6KR.A01((AnonymousClass6KR) this.A01);
                return;
            default:
                super.A04(i, i2);
                return;
        }
    }

    public final void A05(int i, int i2, int i3) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 1:
                BM2 bm2 = (BM2) this.A01;
                BM2.A00(bm2, i, i3);
                BM2.A00(bm2, i2, i3);
                return;
            case 3:
                AnonymousClass6KR.A01((AnonymousClass6KR) this.A01);
                return;
            default:
                super.A05(i, i2, i3);
                return;
        }
    }

    public final void A06(Object obj, int i, int i2) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 3:
                AnonymousClass6KR r0 = (AnonymousClass6KR) this.A01;
                AnonymousClass6KR.A01(r0);
                AnonymousClass6KR.A01(r0);
                return;
            default:
                super.A06(obj, i, i2);
                return;
        }
    }
}
