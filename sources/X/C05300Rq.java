package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.0Rq  reason: invalid class name and case insensitive filesystem */
public class C05300Rq implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass0SF A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            AnonymousClass0SF r3 = this.A00;
            PopupWindow popupWindow = r3.A0A;
            if (popupWindow.getInputMethodMode() != 2 && popupWindow.getContentView() != null) {
                Handler handler = r3.A0K;
                C06520Yq r0 = r3.A0M;
                handler.removeCallbacks(r0);
                r0.run();
            }
        }
    }

    public C05300Rq(AnonymousClass0SF r1) {
        this.A00 = r1;
    }
}
