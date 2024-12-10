package X;

import android.view.View;

/* renamed from: X.0Mh  reason: invalid class name and case insensitive filesystem */
public class C04210Mh {
    public final AnonymousClass0sR A00;
    public final AnonymousClass0IV A01;
    public final AnonymousClass0sU A02;
    public final boolean A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = 1073741824;
        } else if (Float.isNaN(f2)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f2);
            i = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public C04210Mh(AnonymousClass0sR r1, AnonymousClass0IV r2, AnonymousClass0sU r3, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z;
    }
}
