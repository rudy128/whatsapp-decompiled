package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.059  reason: invalid class name */
public final class AnonymousClass059 extends View {
    public static final int[] A05 = {16842919, 16842910};
    public static final int[] A06 = new int[0];
    public AnonymousClass04W A00;
    public Boolean A01;
    public Long A02;
    public Runnable A03;
    public C18090vk A04;

    public final void A00() {
        this.A04 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.A03;
            C18070vi.A0b(runnable2);
            runnable2.run();
        } else {
            AnonymousClass04W r1 = this.A00;
            if (r1 != null) {
                r1.setState(A06);
            }
        }
        AnonymousClass04W r12 = this.A00;
        if (r12 != null) {
            r12.setVisible(false, false);
            unscheduleDrawable(r12);
        }
    }

    public final void A01() {
        setRippleState(false);
    }

    public final void A03(AnonymousClass0Uk r13, C18090vk r14, float f, int i, long j, long j2, boolean z) {
        float centerX;
        float centerY;
        boolean z2 = z;
        if (this.A00 == null || !C18070vi.A18(Boolean.valueOf(z2), this.A01)) {
            AnonymousClass04W r0 = new AnonymousClass04W(z2);
            setBackground(r0);
            this.A00 = r0;
            this.A01 = Boolean.valueOf(z2);
        }
        AnonymousClass04W r4 = this.A00;
        C18070vi.A0b(r4);
        this.A04 = r14;
        A02(f, i, j, j2);
        if (z) {
            long j3 = r13.A00;
            centerX = AnonymousClass0QY.A01(j3);
            centerY = AnonymousClass0QY.A02(j3);
        } else {
            centerX = (float) r4.getBounds().centerX();
            centerY = (float) r4.getBounds().centerY();
        }
        r4.setHotspot(centerX, centerY);
        setRippleState(true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }

    public static final void setRippleState$lambda$2(AnonymousClass059 r2) {
        AnonymousClass04W r1 = r2.A00;
        if (r1 != null) {
            r1.setState(A06);
        }
        r2.A03 = null;
    }

    public final void A02(float f, int i, long j, long j2) {
        AnonymousClass04W r4 = this.A00;
        if (r4 != null) {
            r4.A01(i);
            r4.A00(f, j2);
            Rect rect = new Rect(0, 0, C22339B3q.A01(AnonymousClass0QG.A02(j)), C22339B3q.A01(AnonymousClass0QG.A00(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            r4.setBounds(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C18090vk r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setRippleState(boolean r8) {
        /*
            r7 = this;
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.lang.Runnable r0 = r7.A03
            if (r0 == 0) goto L_0x000e
            r7.removeCallbacks(r0)
            r0.run()
        L_0x000e:
            java.lang.Long r0 = r7.A02
            if (r0 == 0) goto L_0x0040
            long r0 = r0.longValue()
        L_0x0016:
            long r3 = r5 - r0
            if (r8 != 0) goto L_0x0036
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            X.0Z2 r2 = new X.0Z2
            r2.<init>(r7)
            r7.A03 = r2
            r0 = 50
            r7.postDelayed(r2, r0)
        L_0x002c:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.A02 = r0
            return
        L_0x0033:
            int[] r1 = A06
            goto L_0x0038
        L_0x0036:
            int[] r1 = A05
        L_0x0038:
            X.04W r0 = r7.A00
            if (r0 == 0) goto L_0x002c
            r0.setState(r1)
            goto L_0x002c
        L_0x0040:
            r0 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass059.setRippleState(boolean):void");
    }
}
