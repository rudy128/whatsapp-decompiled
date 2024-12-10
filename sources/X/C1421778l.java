package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;

/* renamed from: X.78l  reason: invalid class name and case insensitive filesystem */
public abstract class C1421778l implements View.OnTouchListener {
    public long A00;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A15 = C18070vi.A15(view, motionEvent);
        if (motionEvent.getActionMasked() != 0) {
            return A15;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean A19 = C108975cc.A19(((elapsedRealtime - this.A00) > 500 ? 1 : ((elapsedRealtime - this.A00) == 500 ? 0 : -1)));
        this.A00 = elapsedRealtime;
        if (!A19) {
            return false;
        }
        AnonymousClass6L6 r1 = (AnonymousClass6L6) this;
        int i = r1.A00;
        C121996Mj r3 = (C121996Mj) r1.A01;
        if (i != 0) {
            C135046rZ r0 = r3.A04;
            if (r0 != null && r0.A00.A09() == 0) {
                return false;
            }
            C121996Mj.A00(r3.A0G, r3);
            if (!C108995ce.A1U(r3.A0F)) {
                AlphaAnimation alphaAnimation = r3.A00;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                r3.A05();
            }
            C135046rZ r5 = r3.A04;
            if (r5 == null) {
                return true;
            }
            long A09 = r5.A00.A09() - 10000;
            if (A09 < 0) {
                A09 = 0;
            }
            r5.A01(A09);
            return true;
        }
        long j = 0;
        long A01 = C17900vP.A01(r3.A08);
        C135046rZ r02 = r3.A04;
        if (r02 != null) {
            j = r02.A00.A09();
        }
        if (j >= A01) {
            return false;
        }
        C121996Mj.A00(r3.A0E, r3);
        if (!C108995ce.A1U(r3.A0F)) {
            AlphaAnimation alphaAnimation2 = r3.A00;
            if (alphaAnimation2 != null) {
                alphaAnimation2.cancel();
            }
            r3.A05();
        }
        C121996Mj.A02(r3);
        return true;
    }
}
