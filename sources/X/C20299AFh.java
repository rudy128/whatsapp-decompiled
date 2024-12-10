package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AFh  reason: case insensitive filesystem */
public class C20299AFh implements ViewTreeObserver.OnGlobalLayoutListener {
    public View A00;
    public DOZ A01;
    public DFL A02;
    public E8A A03;
    public E8A A04;
    public String A05;
    public boolean A06;

    public static void A00(C20299AFh aFh) {
        if (aFh.A01 != null) {
            aFh.A06 = false;
            E8A e8a = aFh.A04;
            if (e8a != null) {
                DFL dfl = aFh.A02;
                C20046A4p a4p = new C20046A4p();
                a4p.A03(aFh.A05, 0);
                C26209Cul.A01(aFh.A01, dfl, C20046A4p.A00(a4p, aFh.A01, 1), e8a);
            }
        }
    }

    public void onGlobalLayout() {
        int visibility;
        int visibility2;
        View view = this.A00;
        if (view != null && this.A01 != null) {
            if (this.A06 && ((visibility2 = view.getVisibility()) == 4 || visibility2 == 8)) {
                A00(this);
            } else if (!this.A06 && (visibility = this.A00.getVisibility()) != 4 && visibility != 8 && this.A01 != null) {
                this.A06 = true;
                E8A e8a = this.A03;
                if (e8a != null) {
                    DFL dfl = this.A02;
                    C20046A4p a4p = new C20046A4p();
                    a4p.A03(this.A05, 0);
                    C26209Cul.A01(this.A01, dfl, C20046A4p.A00(a4p, this.A01, 1), e8a);
                }
            }
        }
    }
}
