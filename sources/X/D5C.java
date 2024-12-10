package X;

import android.view.View;
import android.view.ViewTreeObserver;

public class D5C implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ C22655BIe A01;
    public final /* synthetic */ boolean A02;

    public D5C(ViewTreeObserver viewTreeObserver, C22655BIe bIe, boolean z) {
        this.A01 = bIe;
        this.A00 = viewTreeObserver;
        this.A02 = z;
    }

    public void onGlobalLayout() {
        int A03;
        int A04;
        this.A00.removeOnGlobalLayoutListener(this);
        C22655BIe bIe = this.A01;
        boolean z = this.A02;
        View view = bIe.A0D;
        if (view == null) {
            return;
        }
        if (bIe.A0N) {
            view.setPivotX((float) (view.getMeasuredWidth() / 2));
            View view2 = bIe.A0D;
            view2.setPivotY((float) (view2.getMeasuredHeight() / 2));
            if (z) {
                A03 = bIe.A0B;
                A04 = bIe.A0C;
            } else {
                A03 = bIe.A03(bIe.A0D.getWidth());
                A04 = bIe.A04(bIe.A0D.getHeight());
            }
            if (!(bIe.A06 == A03 && bIe.A07 == A04)) {
                bIe.A05();
                bIe.A0Y.A0J(bIe.A0D, A03, A04);
                bIe.A06 = A03;
                bIe.A07 = A04;
            }
            bIe.A0N = false;
        } else if (!bIe.A0O) {
            int A032 = bIe.A03(view.getWidth());
            int A042 = bIe.A04(bIe.A0D.getHeight());
            if (bIe.A06 != A032 || bIe.A07 != A042) {
                bIe.A05();
                bIe.A0Y.A0J(bIe.A0D, A032, A042);
                bIe.A06 = A032;
                bIe.A07 = A042;
            }
        }
    }
}
