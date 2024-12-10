package X;

import android.os.Build;
import android.view.Window;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.4k6  reason: invalid class name and case insensitive filesystem */
public final class C94134k6 implements C1599286k {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ HomePlaceholderActivity.HomePlaceholderView A01;

    public C94134k6(AnonymousClass01E r1, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView) {
        this.A00 = r1;
        this.A01 = homePlaceholderView;
    }

    public void CAF(int i) {
        int i2;
        if (Build.VERSION.SDK_INT > 21) {
            AnonymousClass01E r4 = this.A00;
            Window window = r4.getWindow();
            if (i == 0) {
                if (window != null) {
                    i2 = this.A01.getVoipReturnToCallBannerBridge().getBackgroundColorRes();
                }
                HomePlaceholderActivity.HomePlaceholderView.A01(this.A01);
            }
            if (window != null) {
                i2 = 2131102739;
                if (!this.A01.A0G) {
                    i2 = AnonymousClass4Z9.A01(r4, false);
                }
            }
            HomePlaceholderActivity.HomePlaceholderView.A01(this.A01);
            window.setStatusBarColor(C19740yt.A00(r4, i2));
            HomePlaceholderActivity.HomePlaceholderView.A01(this.A01);
        }
    }
}
