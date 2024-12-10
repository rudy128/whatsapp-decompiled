package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.6mY  reason: invalid class name and case insensitive filesystem */
public final class C132296mY {
    public final Activity A00;
    public final NestedScrollView A01;
    public final C133496or A02;

    public final void A00() {
        NestedScrollView nestedScrollView = this.A01;
        if (nestedScrollView.getLayoutParams().height != -1) {
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            layoutParams.height = -1;
            nestedScrollView.setLayoutParams(layoutParams);
            nestedScrollView.post(new C146437Pc(this, 46));
        }
    }

    public C132296mY(Activity activity, View view, C133496or r4) {
        this.A00 = activity;
        this.A02 = r4;
        this.A01 = (NestedScrollView) C18070vi.A05(view, 2131434837);
    }
}
