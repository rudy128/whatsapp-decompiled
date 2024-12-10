package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.7Ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142667Ai implements E3e {
    public final /* synthetic */ WaInAppBrowsingActivity A00;

    public final void C2k() {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        SwipeRefreshLayout swipeRefreshLayout = waInAppBrowsingActivity.A02;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setActivated(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = waInAppBrowsingActivity.A02;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        waInAppBrowsingActivity.CRT(C18070vi.A0F(waInAppBrowsingActivity, 2131898511));
        waInAppBrowsingActivity.CRU("");
        C110125ey r0 = waInAppBrowsingActivity.A03;
        if (r0 != null) {
            r0.reload();
        }
        waInAppBrowsingActivity.A4e(25);
    }

    public /* synthetic */ C142667Ai(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        this.A00 = waInAppBrowsingActivity;
    }
}
