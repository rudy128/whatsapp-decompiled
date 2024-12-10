package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.03N  reason: invalid class name */
public abstract class AnonymousClass03N {
    public static void A00(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass03W.A00(view, charSequence);
            return;
        }
        AnonymousClass0Rh r0 = AnonymousClass0Rh.A0B;
        if (r0 != null && r0.A06 == view) {
            AnonymousClass0Rh.A00((AnonymousClass0Rh) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            AnonymousClass0Rh r1 = AnonymousClass0Rh.A0A;
            if (r1 != null && r1.A06 == view) {
                r1.A01();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new AnonymousClass0Rh(view, charSequence);
    }
}
