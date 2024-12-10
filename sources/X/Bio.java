package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

public class Bio extends C25277CcZ {
    public long A00 = Long.MAX_VALUE;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public AccessibilityManager A03;
    public AutoCompleteTextView A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final TimeInterpolator A0A;
    public final View.OnClickListener A0B = new AFE(this, 16);
    public final View.OnFocusChangeListener A0C = new C26575D4p(this, 4);
    public final E0F A0D = new D6X(this);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4 > 300) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.Bio r6) {
        /*
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r0 == 0) goto L_0x0037
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0018
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r6.A05 = r1
        L_0x001e:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.A07
            r0 = r0 ^ 1
            A01(r6, r0)
            boolean r1 = r6.A07
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r1 == 0) goto L_0x0038
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r6.A04
            r0.showDropDown()
        L_0x0037:
            return
        L_0x0038:
            r0.dismissDropDown()
            return
        L_0x003c:
            r6.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bio.A00(X.Bio):void");
    }

    public static void A01(Bio bio, boolean z) {
        if (bio.A07 != z) {
            bio.A07 = z;
            bio.A01.cancel();
            bio.A02.start();
        }
    }

    public Bio(BIm bIm) {
        super(bIm);
        this.A08 = AnonymousClass1Z9.A00(bIm.getContext(), 2130970541, 67);
        this.A09 = AnonymousClass1Z9.A00(bIm.getContext(), 2130970541, 50);
        this.A0A = C29101bc.A01(AnonymousClass1YW.A03, bIm.getContext(), 2130970550);
    }
}
