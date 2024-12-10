package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.whatsapp.calling.views.CallResponseLayout;

/* renamed from: X.5ha  reason: invalid class name and case insensitive filesystem */
public class C110975ha extends C24495C6n {
    public int A00;
    public int A01;
    public final /* synthetic */ CallResponseLayout A02;

    public C110975ha(CallResponseLayout callResponseLayout) {
        this.A02 = callResponseLayout;
    }

    public int A03(View view, int i) {
        CallResponseLayout callResponseLayout = this.A02;
        int paddingTop = callResponseLayout.getPaddingTop();
        return Math.min(Math.max(i, paddingTop), callResponseLayout.getHeight() - view.getHeight());
    }

    public void A04(View view, float f, float f2) {
        C1598986h r0;
        CallResponseLayout callResponseLayout = this.A02;
        AccessibilityManager A0M = callResponseLayout.A03.A0M();
        if (A0M == null || !A0M.isTouchExplorationEnabled()) {
            if (this.A01 - view.getTop() > callResponseLayout.getHeight() / 3 && (r0 = callResponseLayout.A02) != null) {
                r0.BnI();
                if (!callResponseLayout.A07) {
                    return;
                }
            }
            callResponseLayout.A09.A0G(this.A00, this.A01);
            if (callResponseLayout.A06) {
                callResponseLayout.A01.startAnimation(AnonymousClass4aR.A04(callResponseLayout.A01));
                callResponseLayout.A00.setVisibility(0);
            }
            callResponseLayout.invalidate();
            return;
        }
        callResponseLayout.A02.BnI();
    }

    public void A06(View view, int i, int i2) {
        CallResponseLayout callResponseLayout = this.A02;
        if (!callResponseLayout.A06 && this.A01 - view.getTop() > callResponseLayout.A08.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
            callResponseLayout.A00.clearAnimation();
            callResponseLayout.A00.setVisibility(4);
        }
    }

    public boolean A07(View view, int i) {
        return AnonymousClass000.A1Z(view, this.A02.A01);
    }

    public int A02(View view, int i) {
        return view.getLeft();
    }

    public void A05(View view, int i) {
        this.A00 = view.getLeft();
        this.A01 = view.getTop();
        CallResponseLayout callResponseLayout = this.A02;
        if (callResponseLayout.A06) {
            callResponseLayout.A01.setAnimation((Animation) null);
            callResponseLayout.A00.setVisibility(8);
        }
    }
}
