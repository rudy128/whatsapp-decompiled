package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.9kE  reason: invalid class name and case insensitive filesystem */
public final class C190009kE {
    public Integer A00;
    public final C218317o A01 = new C20326AGi(this);

    public final void A00(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && (activity instanceof AnonymousClass01C)) {
            ((AnonymousClass1FB) activity).getLifecycle().A05(this.A01);
            this.A00 = Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(1);
        }
    }
}
