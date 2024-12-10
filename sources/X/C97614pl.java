package X;

import android.view.animation.Interpolator;

/* renamed from: X.4pl  reason: invalid class name and case insensitive filesystem */
public class C97614pl implements C1607889x {
    public final int A00;
    public final Object A01;

    public C97614pl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int BUQ() {
        if (this.A00 != 0) {
            return ((C79053uH) this.A01).getVideoDuration();
        }
        return 1000;
    }

    public C41111vp BZB() {
        if (this.A00 == 0) {
            return AnonymousClass3MW.A0n(AnonymousClass000.A0i());
        }
        Interpolator interpolator = C79053uH.A0d;
        return ((C79053uH) this.A01).A0R;
    }

    public int getValue() {
        int i = this.A00;
        Object obj = this.A01;
        if (i == 0) {
            return ((C98474rD) obj).element;
        }
        Interpolator interpolator = C79053uH.A0d;
        return ((C79053uH) obj).A0Q.A09.A07();
    }
}
