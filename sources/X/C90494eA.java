package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.4eA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90494eA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FrameLayout.LayoutParams A01;
    public final /* synthetic */ HomePlaceholderActivity.HomePlaceholderView A02;
    public final /* synthetic */ HomePlaceholderActivity A03;

    public final void onGlobalLayout() {
        HomePlaceholderActivity homePlaceholderActivity = this.A03;
        int i = this.A00;
        FrameLayout.LayoutParams layoutParams = this.A01;
        HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = this.A02;
        C18070vi.A0d(layoutParams, 2);
        Rect A07 = AnonymousClass3MW.A07();
        homePlaceholderActivity.getWindow().findViewById(16908290).getWindowVisibleDisplayFrame(A07);
        int height = A07.height() + i;
        if (height != homePlaceholderActivity.A00) {
            layoutParams.height = height;
            homePlaceholderView.requestLayout();
            homePlaceholderActivity.A00 = height;
        }
    }

    public /* synthetic */ C90494eA(FrameLayout.LayoutParams layoutParams, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, HomePlaceholderActivity homePlaceholderActivity, int i) {
        this.A03 = homePlaceholderActivity;
        this.A00 = i;
        this.A01 = layoutParams;
        this.A02 = homePlaceholderView;
    }
}
