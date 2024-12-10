package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.Crl  reason: case insensitive filesystem */
public abstract class C26071Crl {
    public static WeakReference A00 = BE8.A0m();

    public static void A00(Context context, View view) {
        view.setVisibility(8);
        try {
            ViewManager viewManager = (ViewManager) context.getSystemService("window");
            if (viewManager != null) {
                viewManager.removeView(view);
                WeakReference weakReference = A00;
                if (weakReference.get() == view) {
                    weakReference.clear();
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void A01(Context context, BIJ bij, Integer num, boolean z) {
        int i;
        BIJ bij2 = (BIJ) A00.get();
        if (bij2 != null) {
            bij2.A03(bij2.A01);
        }
        int i2 = -1;
        if (z) {
            i2 = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
        if (z) {
            i = 17;
        } else {
            i = 80;
            if (num.equals(AnonymousClass00R.A00)) {
                i = 48;
            }
        }
        layoutParams.gravity = i;
        try {
            ViewManager viewManager = (ViewManager) context.getSystemService("window");
            if (viewManager != null) {
                viewManager.addView(bij, layoutParams);
                A00 = AnonymousClass3MW.A0z(bij);
                bij.A02();
                return;
            }
            throw AnonymousClass000.A0n("Window manager required but not found.");
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static void A02(BIJ bij, float f) {
        ViewGroup.LayoutParams layoutParams = bij.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.verticalMargin = f;
            ViewManager viewManager = (ViewManager) bij.getContext().getSystemService("window");
            if (viewManager != null) {
                viewManager.updateViewLayout(bij, layoutParams2);
                return;
            }
            throw AnonymousClass000.A0n("Window manager required but not found.");
        }
    }
}
