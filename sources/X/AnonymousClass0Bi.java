package X;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0Bi  reason: invalid class name */
public class AnonymousClass0Bi extends AnonymousClass1HN {
    public final int A00;
    public final Object A01;

    public AnonymousClass0Bi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BlP(View view) {
        View view2;
        View view3;
        switch (this.A00) {
            case 0:
                AnonymousClass01V r2 = ((AnonymousClass02K) this.A01).A00;
                r2.A0E.setAlpha(1.0f);
                r2.A0G.A0B((AnonymousClass1HM) null);
                r2.A0G = null;
                return;
            case 1:
                AnonymousClass01V r22 = ((AnonymousClass02I) this.A01).A01;
                r22.A0E.setVisibility(8);
                PopupWindow popupWindow = r22.A07;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (r22.A0E.getParent() instanceof View) {
                    AnonymousClass1HF.A0T((View) r22.A0E.getParent());
                }
                r22.A0E.A05();
                r22.A0G.A0B((AnonymousClass1HM) null);
                r22.A0G = null;
                view2 = r22.A05;
                break;
            case 2:
                C003901s r3 = (C003901s) this.A01;
                if (r3.A0B && (view3 = r3.A02) != null) {
                    view3.setTranslationY(0.0f);
                    r3.A07.setTranslationY(0.0f);
                }
                r3.A07.setVisibility(8);
                r3.A07.setTransitioning(false);
                r3.A06 = null;
                AnonymousClass02H r1 = r3.A04;
                if (r1 != null) {
                    r1.BrJ(r3.A05);
                    r3.A05 = null;
                    r3.A04 = null;
                }
                view2 = r3.A09;
                if (view2 == null) {
                    return;
                }
                break;
            default:
                C003901s r12 = (C003901s) this.A01;
                r12.A06 = null;
                r12.A07.requestLayout();
                return;
        }
        AnonymousClass1HF.A0T(view2);
    }

    public void BlQ() {
        if (this.A00 != 0) {
            super.BlQ();
        } else {
            ((AnonymousClass02K) this.A01).A00.A0E.setVisibility(0);
        }
    }
}
