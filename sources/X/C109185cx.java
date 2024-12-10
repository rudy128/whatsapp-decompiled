package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.5cx  reason: invalid class name and case insensitive filesystem */
public class C109185cx extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C109185cx(View view, ViewPropertyAnimator viewPropertyAnimator, C42011xT r3, C113685nY r4, int i) {
        this.A00 = i;
        this.A01 = r4;
        this.A03 = r3;
        if (4 - i != 0) {
            this.A04 = view;
            this.A02 = viewPropertyAnimator;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 1:
                ((View) this.A04).setAlpha(1.0f);
                return;
            case 5:
                C108975cc.A0s((View) this.A04);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bd, code lost:
        r0.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00c4, code lost:
        if (r2.A0F() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c6, code lost:
        r2.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f6, code lost:
        r0.remove(r1);
        r2.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        r2.remove(r0);
        r3.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0082, code lost:
        r2.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0089, code lost:
        if (r3.A0F() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008b, code lost:
        r3.A07();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x008f;
                case 2: goto L_0x0065;
                case 3: goto L_0x0047;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00ca;
                case 6: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A04
            X.C108965cb.A1M(r0)
            java.lang.Object r0 = r4.A03
            android.view.View r0 = (android.view.View) r0
            X.C108995ce.A0t(r0)
            java.lang.Object r3 = r4.A01
            X.5nY r3 = (X.C113685nY) r3
            java.lang.Object r1 = r4.A02
            X.6Ua r1 = (X.C123336Ua) r1
            X.1xT r0 = r1.A04
            r3.A08(r0)
            java.util.ArrayList r2 = r3.A03
            X.1xT r0 = r1.A04
        L_0x0022:
            r2.remove(r0)
            r3.A0N()
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r0 = r4.A03
            X.C108965cb.A1M(r0)
            java.lang.Object r0 = r4.A04
            android.view.View r0 = (android.view.View) r0
            X.C108995ce.A0t(r0)
            java.lang.Object r3 = r4.A01
            X.5nY r3 = (X.C113685nY) r3
            java.lang.Object r1 = r4.A02
            X.6Ua r1 = (X.C123336Ua) r1
            X.1xT r0 = r1.A05
            r3.A08(r0)
            java.util.ArrayList r2 = r3.A03
            X.1xT r0 = r1.A05
            goto L_0x0022
        L_0x0047:
            java.lang.Object r0 = r4.A04
            X.C108965cb.A1M(r0)
            java.lang.Object r0 = r4.A03
            android.view.View r0 = (android.view.View) r0
            X.C108995ce.A0t(r0)
            java.lang.Object r3 = r4.A01
            X.1qV r3 = (X.C37981qV) r3
            java.lang.Object r1 = r4.A02
            X.6UZ r1 = (X.AnonymousClass6UZ) r1
            X.1xT r0 = r1.A04
            r3.A08(r0)
            java.util.ArrayList r2 = r3.A02
            X.1xT r0 = r1.A04
            goto L_0x0082
        L_0x0065:
            java.lang.Object r0 = r4.A03
            X.C108965cb.A1M(r0)
            java.lang.Object r0 = r4.A04
            android.view.View r0 = (android.view.View) r0
            X.C108995ce.A0t(r0)
            java.lang.Object r3 = r4.A01
            X.1qV r3 = (X.C37981qV) r3
            java.lang.Object r1 = r4.A02
            X.6UZ r1 = (X.AnonymousClass6UZ) r1
            X.1xT r0 = r1.A05
            r3.A08(r0)
            java.util.ArrayList r2 = r3.A02
            X.1xT r0 = r1.A05
        L_0x0082:
            r2.remove(r0)
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0028
            r3.A07()
            return
        L_0x008f:
            java.lang.Object r0 = r4.A02
            X.C108965cb.A1M(r0)
            java.lang.Object r2 = r4.A01
            X.1qV r2 = (X.C37981qV) r2
            java.lang.Object r1 = r4.A03
            X.1xT r1 = (X.C42011xT) r1
            r2.A08(r1)
            java.util.ArrayList r0 = r2.A00
            goto L_0x00bd
        L_0x00a2:
            java.lang.Object r0 = r4.A02
            X.C108965cb.A1M(r0)
            java.lang.Object r1 = r4.A04
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Object r2 = r4.A01
            X.1qV r2 = (X.C37981qV) r2
            java.lang.Object r1 = r4.A03
            X.1xT r1 = (X.C42011xT) r1
            r2.A08(r1)
            java.util.ArrayList r0 = r2.A0A
        L_0x00bd:
            r0.remove(r1)
            boolean r0 = r2.A0F()
            if (r0 != 0) goto L_0x0028
            r2.A07()
            return
        L_0x00ca:
            java.lang.Object r0 = r4.A02
            X.C108965cb.A1M(r0)
            java.lang.Object r2 = r4.A01
            X.5nY r2 = (X.C113685nY) r2
            java.lang.Object r1 = r4.A03
            X.1xT r1 = (X.C42011xT) r1
            r2.A08(r1)
            java.util.ArrayList r0 = r2.A01
            goto L_0x00f6
        L_0x00dd:
            java.lang.Object r0 = r4.A02
            X.C108965cb.A1M(r0)
            java.lang.Object r0 = r4.A04
            android.view.View r0 = (android.view.View) r0
            X.C108975cc.A0s(r0)
            java.lang.Object r2 = r4.A01
            X.5nY r2 = (X.C113685nY) r2
            java.lang.Object r1 = r4.A03
            X.1xT r1 = (X.C42011xT) r1
            r2.A08(r1)
            java.util.ArrayList r0 = r2.A07
        L_0x00f6:
            r0.remove(r1)
            r2.A0N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109185cx.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((C113685nY) this.A01).A08 = true;
                return;
        }
    }

    public C109185cx(View view, ViewPropertyAnimator viewPropertyAnimator, C37981qV r3, C42011xT r4, int i) {
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r4;
        if (i != 0) {
            this.A04 = view;
            this.A02 = viewPropertyAnimator;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    public C109185cx(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass6UZ r3, C37981qV r4, int i) {
        this.A00 = i;
        this.A01 = r4;
        this.A02 = r3;
        if (2 - i != 0) {
            this.A04 = viewPropertyAnimator;
            this.A03 = view;
        } else {
            this.A03 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    public C109185cx(View view, ViewPropertyAnimator viewPropertyAnimator, C123336Ua r3, C113685nY r4, int i) {
        this.A00 = i;
        this.A01 = r4;
        this.A02 = r3;
        if (6 - i != 0) {
            this.A04 = viewPropertyAnimator;
            this.A03 = view;
        } else {
            this.A03 = viewPropertyAnimator;
            this.A04 = view;
        }
    }
}
