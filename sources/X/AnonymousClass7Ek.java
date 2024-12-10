package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.7Ek  reason: invalid class name */
public class AnonymousClass7Ek implements C23501Gn {
    public final Activity A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11Z A02;

    public /* synthetic */ void A00() {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C17960vV.A07(activity);
            int i = Build.VERSION.SDK_INT;
            int i2 = 2131894446;
            if (i >= 30) {
                i2 = 2131894449;
                if (i < 33) {
                    i2 = 2131894448;
                }
            }
            AnonymousClass74O.A08(activity, 2131894447, i2);
        }
    }

    public /* synthetic */ void A01() {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            C17960vV.A07(activity);
            int i = Build.VERSION.SDK_INT;
            int i2 = 2131894446;
            if (i >= 30) {
                i2 = 2131894449;
                if (i < 33) {
                    i2 = 2131894448;
                }
            }
            AnonymousClass74O.A08(activity, 2131894447, i2);
        }
    }

    public void C2V() {
        this.A01.CGP(new AnonymousClass7RA((Object) this, 26));
    }

    public void C2W() {
        this.A01.CGP(new AnonymousClass7RA((Object) this, 29));
    }

    public void C9R() {
        this.A01.CGP(new AnonymousClass7RA((Object) this, 28));
    }

    public void C9S() {
        this.A01.CGP(new AnonymousClass7RA((Object) this, 27));
    }

    public AnonymousClass7Ek(Activity activity, AnonymousClass1KB r2, AnonymousClass11Z r3) {
        this.A00 = activity;
        this.A01 = r2;
        this.A02 = r3;
    }
}
