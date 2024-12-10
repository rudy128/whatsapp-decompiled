package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.1L4  reason: invalid class name */
public final class AnonymousClass1L4 {
    public final AnonymousClass11C A00;

    public AnonymousClass1L4(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final boolean A00(View view) {
        C18070vi.A0d(view, 0);
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        WindowManager A01 = AnonymousClass11C.A01(view.getContext());
        C17960vV.A07(A01);
        C18070vi.A0X(A01);
        if (A01.getDefaultDisplay().getHeight() - rect.bottom >= view.getRootView().getResources().getDimensionPixelSize(2131167053)) {
            return true;
        }
        return false;
    }

    public final void A01(View view) {
        C18070vi.A0d(view, 0);
        InputMethodManager A0N = this.A00.A0N();
        C17960vV.A07(A0N);
        C18070vi.A0X(A0N);
        A0N.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void A02(View view) {
        C18070vi.A0d(view, 0);
        InputMethodManager A0N = this.A00.A0N();
        C17960vV.A07(A0N);
        C18070vi.A0X(A0N);
        A0N.showSoftInput(view, 0);
    }
}
