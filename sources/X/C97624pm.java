package X;

import android.view.animation.Interpolator;

/* renamed from: X.4pm  reason: invalid class name and case insensitive filesystem */
public class C97624pm implements AnonymousClass8AG {
    public final /* synthetic */ C79053uH A00;
    public final /* synthetic */ AnonymousClass206 A01;

    public C97624pm(C79053uH r1, AnonymousClass206 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C41111vp BTO() {
        C79053uH r1 = this.A00;
        Interpolator interpolator = C79053uH.A0d;
        return r1.A0R;
    }

    public AnonymousClass1DS BV3() {
        C79053uH r1 = this.A00;
        Interpolator interpolator = C79053uH.A0d;
        return C22791Df.A01(r1.A0O, C99244sV.A00(this.A01, 18));
    }

    public int getCurrentPosition() {
        C79053uH r1 = this.A00;
        Interpolator interpolator = C79053uH.A0d;
        return r1.A0Q.A09.A07();
    }

    public int getDuration() {
        return this.A00.getVideoDuration();
    }
}
