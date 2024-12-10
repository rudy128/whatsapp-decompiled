package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class BJs extends C123496Ur {
    public Window A00;
    public final WindowInsetsController A01;
    public final C25474CgT A02;
    public final C25932Cow A03;
    public final AnonymousClass00O A04;

    public void A00() {
        this.A01.setSystemBarsBehavior(2);
    }

    public void A01() {
        this.A02.A00.A02();
        this.A01.show(0);
    }

    public void A02(int i) {
        if ((i & 8) != 0) {
            this.A02.A00.A01();
        }
        this.A01.hide(i & -9);
    }

    public void A03(boolean z) {
        Window window = this.A00;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.A01.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(-17 & decorView2.getSystemUiVisibility());
        }
        this.A01.setSystemBarsAppearance(0, 16);
    }

    public void A04(boolean z) {
        Window window = this.A00;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            }
            this.A01.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(-8193 & decorView2.getSystemUiVisibility());
        }
        this.A01.setSystemBarsAppearance(0, 8);
    }

    public boolean A05() {
        WindowInsetsController windowInsetsController = this.A01;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        if ((windowInsetsController.getSystemBarsAppearance() & 8) != 0) {
            return true;
        }
        return false;
    }

    public BJs(WindowInsetsController windowInsetsController, C25474CgT cgT, C25932Cow cow) {
        this.A04 = new AnonymousClass00O(0);
        this.A01 = windowInsetsController;
        this.A03 = cow;
        this.A02 = cgT;
    }

    public BJs(Window window, C25474CgT cgT, C25932Cow cow) {
        this(window.getInsetsController(), cgT, cow);
        this.A00 = window;
    }
}
