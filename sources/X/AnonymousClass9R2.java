package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.9R2  reason: invalid class name */
public abstract class AnonymousClass9R2 {
    public static void A00(AnonymousClass1FP r5, int i) {
        Toolbar A0G = AnonymousClass3Ma.A0G(r5);
        C003401n A0K = AnonymousClass3MY.A0K(r5, A0G);
        if (A0K != null) {
            AnonymousClass8BW.A0y(r5);
            r5.getWindow().setStatusBarColor(C19740yt.A00(r5, 2131102008));
            AnonymousClass8BX.A0y(r5, A0G);
            A0K.A0O(C24261Jm.A00(r5, i));
            A0K.A0Y(false);
            A0K.A0W(true);
            A0G.setOverflowIcon(AnonymousClass4aX.A08(C24261Jm.A00(r5, 2131233368), C19740yt.A00(r5, 2131102007)));
            View findViewById = r5.findViewById(2131434837);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new C20303AFl(findViewById, A0K, r5, 0));
            }
        }
    }
}
