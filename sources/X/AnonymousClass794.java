package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.794  reason: invalid class name */
public class AnonymousClass794 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass794(AnonymousClass74J r1, int i, boolean z) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = z;
    }

    public void onGlobalLayout() {
        int i;
        KeyboardPopupLayout keyboardPopupLayout;
        switch (this.A01) {
            case 0:
                AnonymousClass74J r1 = (AnonymousClass74J) this.A02;
                C108995ce.A0x(r1.A0E, this);
                r1.A0I = false;
                if (!r1.A0N) {
                    AnonymousClass74J.A07(r1);
                }
                if (this.A00 && (keyboardPopupLayout = r1.A08) != null) {
                    keyboardPopupLayout.A09 = false;
                    keyboardPopupLayout.requestLayout();
                    return;
                }
                return;
            case 1:
                AnonymousClass74J r4 = (AnonymousClass74J) this.A02;
                C108995ce.A0x(r4.A05, this);
                int A012 = AnonymousClass74J.A01(r4);
                CoordinatorLayout coordinatorLayout = r4.A05;
                if (coordinatorLayout != null) {
                    i = coordinatorLayout.getHeight();
                } else {
                    i = 0;
                }
                if (A012 < 0) {
                    A012 = 0;
                }
                int i2 = i + A012;
                if (i2 > 0) {
                    int i3 = i2 - r4.A00;
                    int A002 = AnonymousClass74J.A00(r4);
                    BottomSheetBehavior bottomSheetBehavior = r4.A06;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.A0C = i3;
                    }
                    if (i3 < A002) {
                        if (bottomSheetBehavior != null) {
                            int i4 = i2 / 2;
                            if (i3 > i4) {
                                i3 = i4;
                            }
                            bottomSheetBehavior.A0V(i3);
                        }
                    } else if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.A0V(A002);
                    }
                    if (this.A00) {
                        AnonymousClass74J.A05(r4);
                        return;
                    }
                    return;
                }
                return;
            default:
                AnonymousClass75M r2 = (AnonymousClass75M) this.A02;
                boolean A003 = AnonymousClass1L4.A00(r2.A0I);
                if (A003 != this.A00) {
                    this.A00 = A003;
                    r2.A0X((Float) null, false);
                    return;
                }
                return;
        }
    }

    public AnonymousClass794(AnonymousClass75M r2) {
        this.A01 = 2;
        this.A02 = r2;
        this.A00 = false;
    }
}
