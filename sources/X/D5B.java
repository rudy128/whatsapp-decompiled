package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public final class D5B implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C23687Bnu A01;
    public final /* synthetic */ C24906COz A02;

    public D5B(FrameLayout frameLayout, C23687Bnu bnu, C24906COz cOz) {
        this.A00 = frameLayout;
        this.A02 = cOz;
        this.A01 = bnu;
    }

    public void onGlobalLayout() {
        FrameLayout frameLayout = this.A00;
        ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
        C24906COz cOz = this.A02;
        viewTreeObserver.removeOnGlobalLayoutListener(cOz.A01);
        BJ9 bj9 = this.A01.A01;
        if (bj9 == null) {
            C18070vi.A11("parametricSlider");
            throw null;
        } else {
            bj9.A02(cOz, frameLayout.getHeight());
        }
    }
}
