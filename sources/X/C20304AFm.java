package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

/* renamed from: X.AFm  reason: case insensitive filesystem */
public final /* synthetic */ class C20304AFm implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ LinearLayout A01;
    public final /* synthetic */ RelativeLayout A02;
    public final /* synthetic */ ScrollView A03;

    public final void onScrollChanged() {
        RelativeLayout relativeLayout = this.A02;
        ScrollView scrollView = this.A03;
        float f = this.A00;
        LinearLayout linearLayout = this.A01;
        C18070vi.A0d(relativeLayout, 0);
        boolean A1K = C108975cc.A1K(linearLayout);
        float f2 = 0.0f;
        if (scrollView.canScrollVertically(-1)) {
            f2 = f;
        }
        AnonymousClass1HF.A0W(relativeLayout, f2);
        if (!scrollView.canScrollVertically(A1K ? 1 : 0)) {
            f = 0.0f;
        }
        AnonymousClass1HF.A0W(linearLayout, f);
    }

    public /* synthetic */ C20304AFm(LinearLayout linearLayout, RelativeLayout relativeLayout, ScrollView scrollView, float f) {
        this.A02 = relativeLayout;
        this.A03 = scrollView;
        this.A00 = f;
        this.A01 = linearLayout;
    }
}
