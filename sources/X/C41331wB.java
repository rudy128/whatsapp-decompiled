package X;

import android.view.View;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public abstract class C41331wB {
    public final C39481t9 A00;

    public final boolean A01() {
        Integer num;
        C39481t9 r3 = this.A00;
        View view = r3.A07.A0B;
        if (view != null) {
            num = C41321wA.A00.A01(view);
        } else {
            num = null;
        }
        Integer num2 = r3.A00;
        if (num == num2) {
            return true;
        }
        Integer num3 = AnonymousClass00R.A01;
        if (num == num3 || num2 == num3) {
            return false;
        }
        return true;
    }

    public C41331wB(C39481t9 r1) {
        this.A00 = r1;
    }
}
