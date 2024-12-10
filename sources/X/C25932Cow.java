package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.Cow  reason: case insensitive filesystem */
public final class C25932Cow {
    public final C123496Ur A00;

    @Deprecated
    public static C25932Cow A00(WindowInsetsController windowInsetsController) {
        return new C25932Cow(windowInsetsController);
    }

    public C25932Cow(View view, Window window) {
        C123496Ur bJr;
        C25474CgT cgT = new C25474CgT(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            bJr = new BJs(window, cgT, this);
        } else if (i >= 26) {
            bJr = new C22674BJp(window, cgT);
        } else if (i >= 23) {
            bJr = new BJq(window, cgT);
        } else {
            bJr = new BJr(window, cgT);
        }
        this.A00 = bJr;
    }

    @Deprecated
    public C25932Cow(WindowInsetsController windowInsetsController) {
        this.A00 = new BJs(windowInsetsController, new C25474CgT(windowInsetsController), this);
    }
}
