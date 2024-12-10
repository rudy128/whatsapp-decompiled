package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* renamed from: X.0Rk  reason: invalid class name and case insensitive filesystem */
public class C05250Rk implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public C05250Rk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A00) {
            case 0:
                AnonymousClass06A r2 = (AnonymousClass06A) this.A01;
                if (r2.BgV()) {
                    List<AnonymousClass0HZ> list = r2.A0L;
                    if (list.size() > 0 && !((AnonymousClass0HZ) list.get(0)).A02.A0F) {
                        View view = r2.A03;
                        if (view == null || !view.isShown()) {
                            r2.dismiss();
                            return;
                        }
                        for (AnonymousClass0HZ r0 : list) {
                            r0.A02.CMX();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass06B r22 = (AnonymousClass06B) this.A01;
                if (r22.BgV()) {
                    AnonymousClass06R r1 = r22.A0G;
                    if (!r1.A0F) {
                        View view2 = r22.A03;
                        if (view2 == null || !view2.isShown()) {
                            r22.dismiss();
                            return;
                        } else {
                            r1.CMX();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A01;
                C16940tT r23 = appCompatSpinner.A01;
                if (!r23.BgV()) {
                    r23.CMY(AppCompatSpinner.A01(appCompatSpinner), AppCompatSpinner.A00(appCompatSpinner));
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    A00(this, viewTreeObserver);
                    return;
                }
                return;
            case 3:
                AnonymousClass06Q r24 = (AnonymousClass06Q) this.A01;
                AppCompatSpinner appCompatSpinner2 = r24.A04;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(r24.A03)) {
                    r24.dismiss();
                    return;
                }
                r24.A04();
                C05250Rk.super.CMX();
                return;
            default:
                ((AndroidComposeView) this.A01).A0C();
                return;
        }
    }

    public static void A00(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
