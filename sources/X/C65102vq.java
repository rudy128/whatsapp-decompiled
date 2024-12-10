package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2vq  reason: invalid class name and case insensitive filesystem */
public class C65102vq implements C38281r2 {
    public final int A00;
    public final Object A01;

    public C65102vq(C38251qy r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public int BOb(View view) {
        int right;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i2 != 0) {
            right = view.getBottom() + ((C38491rN) view.getLayoutParams()).A03.bottom;
            i = marginLayoutParams.bottomMargin;
        } else {
            right = view.getRight() + ((C38491rN) view.getLayoutParams()).A03.right;
            i = marginLayoutParams.rightMargin;
        }
        return right + i;
    }

    public int BOh(View view) {
        int left;
        int i;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i2 != 0) {
            left = view.getTop() - ((C38491rN) view.getLayoutParams()).A03.top;
            i = marginLayoutParams.topMargin;
        } else {
            left = view.getLeft() - ((C38491rN) view.getLayoutParams()).A03.left;
            i = marginLayoutParams.leftMargin;
        }
        return left - i;
    }
}
