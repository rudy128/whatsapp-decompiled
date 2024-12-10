package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.79C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass79C implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ WDSToolbar A03;

    public final void onScrollChanged() {
        View view = this.A02;
        int i = this.A00;
        ColorDrawable colorDrawable = this.A01;
        WDSToolbar wDSToolbar = this.A03;
        C18070vi.A0d(colorDrawable, 2);
        int scrollY = view.getScrollY();
        if (scrollY < 0) {
            scrollY = 0;
        }
        if (scrollY <= i || colorDrawable.getAlpha() != 255) {
            float f = 1.0f;
            if (scrollY < i) {
                f = ((float) scrollY) / ((float) i);
            }
            colorDrawable.setAlpha((int) (f * 255.0f));
            wDSToolbar.invalidate();
        }
    }

    public /* synthetic */ AnonymousClass79C(ColorDrawable colorDrawable, View view, WDSToolbar wDSToolbar, int i) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = colorDrawable;
        this.A03 = wDSToolbar;
    }
}
