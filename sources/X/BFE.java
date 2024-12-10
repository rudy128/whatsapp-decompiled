package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.List;

public abstract class BFE extends Drawable implements Animatable {
    public static final Property A0A = new C22637BGx(6);
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public CBO A04;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final Paint A08 = AnonymousClass3MW.A06();
    public final C24468C5i A09;

    public int getOpacity() {
        return -3;
    }

    public boolean setVisible(boolean z, boolean z2) {
        return A01(z, z2, true);
    }

    public void start() {
        A02(true, true, false);
    }

    public void stop() {
        A02(false, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 <= 0.0f) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(boolean r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            android.content.Context r0 = r3.A07
            android.content.ContentResolver r2 = r0.getContentResolver()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = "animator_duration_scale"
            float r1 = android.provider.Settings.Global.getFloat(r2, r0, r1)
            if (r6 == 0) goto L_0x0016
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r0 = r3.A02(r4, r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFE.A01(boolean, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r6 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        if (super.setVisible(r6, false) != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.animation.ValueAnimator r2 = r5.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r4 = 2
            if (r2 != 0) goto L_0x0036
            android.util.Property r3 = A0A
            float[] r2 = new float[r4]
            r2 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A03 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A03
            android.animation.TimeInterpolator r2 = X.AnonymousClass1YW.A02
            r3.setInterpolator(r2)
            android.animation.ValueAnimator r3 = r5.A03
            if (r3 == 0) goto L_0x002f
            boolean r2 = r3.isRunning()
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = "Cannot set showAnimator while the current showAnimator is running."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x002f:
            r5.A03 = r3
            r2 = 11
            X.BEQ.A00(r3, r5, r2)
        L_0x0036:
            android.animation.ValueAnimator r2 = r5.A02
            if (r2 != 0) goto L_0x0069
            android.util.Property r3 = A0A
            float[] r2 = new float[r4]
            r2 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r3, r2)
            r5.A02 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r5.A02
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A02
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A02
            if (r1 == 0) goto L_0x0062
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "Cannot set hideAnimator while the current hideAnimator is running."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0062:
            r5.A02 = r1
            r0 = 12
            X.BEQ.A00(r1, r5, r0)
        L_0x0069:
            boolean r0 = r5.isVisible()
            r3 = 0
            if (r0 != 0) goto L_0x0073
            if (r6 != 0) goto L_0x00af
        L_0x0072:
            return r3
        L_0x0073:
            if (r6 != 0) goto L_0x00af
            android.animation.ValueAnimator r1 = r5.A02
            android.animation.ValueAnimator r2 = r5.A03
        L_0x0079:
            r4 = 1
            if (r8 != 0) goto L_0x00b4
            boolean r0 = r2.isRunning()
            if (r0 == 0) goto L_0x0091
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[r4]
            r0[r3] = r2
            boolean r2 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.cancel()
            r5.A06 = r2
        L_0x0091:
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x009f
            r1.end()
        L_0x009a:
            boolean r0 = super.setVisible(r6, r3)
            return r0
        L_0x009f:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[r4]
            r0[r3] = r1
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            goto L_0x009a
        L_0x00af:
            android.animation.ValueAnimator r1 = r5.A03
            android.animation.ValueAnimator r2 = r5.A02
            goto L_0x0079
        L_0x00b4:
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L_0x0072
            if (r6 == 0) goto L_0x00c3
            boolean r0 = super.setVisible(r6, r3)
            r2 = 0
            if (r0 == 0) goto L_0x00d8
        L_0x00c3:
            r2 = 1
            if (r6 != 0) goto L_0x00d8
            X.C5i r0 = r5.A09
            int r0 = r0.A00
        L_0x00ca:
            if (r0 == 0) goto L_0x00e1
            if (r7 != 0) goto L_0x00dd
            boolean r0 = r1.isPaused()
            if (r0 == 0) goto L_0x00dd
            r1.resume()
            return r2
        L_0x00d8:
            X.C5i r0 = r5.A09
            int r0 = r0.A01
            goto L_0x00ca
        L_0x00dd:
            r1.start()
            return r2
        L_0x00e1:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[r4]
            r0[r3] = r1
            boolean r1 = r5.A06
            r5.A06 = r4
            r0 = r0[r3]
            r0.end()
            r5.A06 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFE.A02(boolean, boolean, boolean):boolean");
    }

    public int getAlpha() {
        return this.A01;
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.A02;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return false;
        }
        return true;
    }

    public void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.CBO, java.lang.Object] */
    public BFE(Context context, C24468C5i c5i) {
        this.A07 = context;
        this.A09 = c5i;
        this.A04 = new Object();
        setAlpha(255);
    }
}
