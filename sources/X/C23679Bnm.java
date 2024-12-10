package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Bnm  reason: case insensitive filesystem */
public final class C23679Bnm extends BV3 {
    public int A00;
    public int A01;
    public C04220Mi A02;
    public DOZ A03;

    public static final boolean A02(C23679Bnm bnm) {
        C04220Mi r4 = bnm.A02;
        DOZ doz = bnm.A03;
        if (!(r4 == null || doz == null)) {
            C04240Mk r2 = r4.A01;
            if (!(bnm.A01 == 0 || bnm.A00 == 0 || (BE8.A0B(r2) == bnm.A01 && BE8.A0A(r2) == bnm.A00))) {
                AnonymousClass0OS r6 = C04220Mi.A04;
                C04220Mi r22 = bnm.A02;
                Context context = doz.A00;
                CBx.A00(bnm.A03);
                C04220Mi A04 = r6.A04(r6.A02(context, r22, doz, -1), r4.A00, (Object) null, C02740Fe.A00(View.MeasureSpec.makeMeasureSpec(bnm.A01, 1073741824), View.MeasureSpec.makeMeasureSpec(bnm.A00, 1073741824)));
                bnm.A02 = A04;
                super.setRenderTree(A04.A01);
                return true;
            }
        }
        return false;
    }

    public final void setRenderResult(C04220Mi r2, DOZ doz) {
        C04240Mk r0;
        this.A03 = doz;
        this.A02 = r2;
        if (!A02(this)) {
            if (r2 != null) {
                r0 = r2.A01;
            } else {
                r0 = null;
            }
            super.setRenderTree(r0);
        }
    }

    public void setRenderTree(C04240Mk r2) {
        throw BE6.A0v("setRenderTree should only be called in conjunction with also setting the BloksModel");
    }
}
