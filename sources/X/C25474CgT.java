package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: X.CgT  reason: case insensitive filesystem */
public final class C25474CgT {
    public final C69 A00;

    public C25474CgT(View view) {
        C69 bJl;
        if (Build.VERSION.SDK_INT >= 30) {
            bJl = new C22669BJk(view);
        } else {
            bJl = new C22670BJl(view);
        }
        this.A00 = bJl;
    }

    @Deprecated
    public C25474CgT(WindowInsetsController windowInsetsController) {
        this.A00 = new C22669BJk(windowInsetsController);
    }
}
