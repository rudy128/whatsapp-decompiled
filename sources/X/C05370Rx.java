package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public class C05370Rx implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ AnonymousClass06Q A01;

    public C05370Rx(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, AnonymousClass06Q r2) {
        this.A01 = r2;
        this.A00 = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}
