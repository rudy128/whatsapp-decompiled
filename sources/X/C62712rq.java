package X;

import android.view.View;

/* renamed from: X.2rq  reason: invalid class name and case insensitive filesystem */
public abstract class C62712rq {
    public static int A00(View view, View view2, C38331r7 r4, C38251qy r5, C38021qZ r6, boolean z) {
        if (r5.A0J() == 0 || r6.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C38251qy.A02(view) - C38251qy.A02(view2)) + 1;
        }
        return Math.min(r4.A05(), r4.A06(view2) - r4.A09(view));
    }

    public static int A01(View view, View view2, C38331r7 r5, C38251qy r6, C38021qZ r7, boolean z) {
        int A00;
        if (r6.A0J() == 0 || (A00 = r7.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A00;
        }
        return (int) ((((float) (r5.A06(view2) - r5.A09(view))) / ((float) (Math.abs(C38251qy.A02(view) - C38251qy.A02(view2)) + 1))) * ((float) r7.A00()));
    }

    public static int A02(View view, View view2, C38331r7 r6, C38251qy r7, C38021qZ r8, boolean z, boolean z2) {
        int max;
        if (r7.A0J() == 0 || r8.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C38251qy.A02(view), C38251qy.A02(view2));
        int max2 = Math.max(C38251qy.A02(view), C38251qy.A02(view2));
        if (z2) {
            max = Math.max(0, (r8.A00() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(r6.A06(view2) - r6.A09(view))) / ((float) (Math.abs(C38251qy.A02(view) - C38251qy.A02(view2)) + 1)))) + ((float) (r6.A04() - r6.A09(view))));
    }
}
