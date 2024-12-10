package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public final class C06170Xf implements C16500sM {
    public final float[] A00;
    public final int[] A01 = new int[2];

    public C06170Xf(float[] fArr) {
        this.A00 = fArr;
    }

    private final void A00(View view, float[] fArr) {
        float[] fArr2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            A00((View) parent, fArr);
            fArr2 = this.A00;
            C05040Qd.A04(fArr2);
            C05040Qd.A05(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            C04990Pv.A04(fArr, fArr2);
            C05040Qd.A04(fArr2);
            C05040Qd.A05(fArr2, (float) view.getLeft(), (float) view.getTop());
            C04990Pv.A04(fArr, fArr2);
        } else {
            int[] iArr = this.A01;
            view.getLocationInWindow(iArr);
            fArr2 = this.A00;
            C05040Qd.A04(fArr2);
            C05040Qd.A05(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            C04990Pv.A04(fArr, fArr2);
            C05040Qd.A04(fArr2);
            C05040Qd.A05(fArr2, (float) iArr[0], (float) iArr[1]);
            C04990Pv.A04(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            AnonymousClass0LJ.A01(matrix, fArr2);
            C04990Pv.A04(fArr, fArr2);
        }
    }

    public void BDr(View view, float[] fArr) {
        C05040Qd.A04(fArr);
        A00(view, fArr);
    }
}
