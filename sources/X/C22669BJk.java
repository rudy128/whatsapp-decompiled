package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BJk  reason: case insensitive filesystem */
public class C22669BJk extends C22670BJl {
    public View A00;
    public WindowInsetsController A01;

    public C22669BJk(WindowInsetsController windowInsetsController) {
        super((View) null);
        this.A01 = windowInsetsController;
    }

    public void A01() {
        View view;
        View view2;
        WindowInsetsController windowInsetsController = this.A01;
        if (windowInsetsController == null && ((view2 = this.A00) == null || (windowInsetsController = view2.getWindowInsetsController()) == null)) {
            super.A01();
            return;
        }
        AtomicBoolean A16 = BE6.A16(false);
        D5K d5k = new D5K(A16);
        windowInsetsController.addOnControllableInsetsChangedListener(d5k);
        if (!A16.get() && (view = this.A00) != null) {
            ((InputMethodManager) BE9.A0j(view)).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(d5k);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    public void A02() {
        View view = this.A00;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) BE9.A0j(view)).isActive();
        }
        WindowInsetsController windowInsetsController = this.A01;
        if (!(windowInsetsController == null && (view == null || (windowInsetsController = view.getWindowInsetsController()) == null))) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.A02();
    }

    public C22669BJk(View view) {
        super(view);
        this.A00 = view;
    }
}
