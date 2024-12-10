package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.5qW  reason: invalid class name and case insensitive filesystem */
public class C114325qW extends C6X {
    public Window A00;
    public boolean A01;
    public final AnonymousClass1HO A02;
    public final Boolean A03;

    public void A04(Window window) {
        if (this.A00 != window) {
            this.A00 = window;
            if (window != null) {
                this.A01 = new C25932Cow(window.getDecorView(), window).A00.A05();
            }
        }
    }

    public C114325qW(View view, AnonymousClass1HO r3) {
        ColorStateList A012;
        Boolean bool;
        int color;
        this.A02 = r3;
        C27801Xq r0 = BottomSheetBehavior.A02(view).A0O;
        if (r0 != null) {
            A012 = r0.A01.A0B;
        } else {
            A012 = AnonymousClass1Xr.A01(view);
        }
        if (A012 != null) {
            color = A012.getDefaultColor();
        } else if (view.getBackground() instanceof ColorDrawable) {
            color = ((ColorDrawable) view.getBackground()).getColor();
        } else {
            bool = null;
            this.A03 = bool;
        }
        bool = Boolean.valueOf(AnonymousClass1ZA.A04(color));
        this.A03 = bool;
    }

    private void A00(View view) {
        boolean booleanValue;
        int top = view.getTop();
        AnonymousClass1HO r3 = this.A02;
        if (top < r3.A05()) {
            Window window = this.A00;
            if (window != null) {
                Boolean bool = this.A03;
                if (bool == null) {
                    booleanValue = this.A01;
                } else {
                    booleanValue = bool.booleanValue();
                }
                C123586Va.A00(window, booleanValue);
            }
            C72463Mc.A14(view, view.getPaddingLeft(), r3.A05() - view.getTop());
        } else if (view.getTop() != 0) {
            Window window2 = this.A00;
            if (window2 != null) {
                C123586Va.A00(window2, this.A01);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public void A01(View view) {
        A00(view);
    }

    public void A02(View view, float f) {
        A00(view);
    }

    public void A03(View view, int i) {
        A00(view);
    }
}
