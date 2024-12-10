package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class D74 implements C72343Lo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C80053wT A01;
    public final /* synthetic */ C22811Dh A02;
    public final /* synthetic */ C27061DRh A03;
    public final /* synthetic */ C27061DRh A04;
    public final /* synthetic */ C98474rD A05;
    public final /* synthetic */ C98474rD A06;
    public final /* synthetic */ C98474rD A07;

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 != 3) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fe, code lost:
        if (r16 != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bw2(android.view.MotionEvent r18, androidx.recyclerview.widget.RecyclerView r19) {
        /*
            r17 = this;
            r5 = 0
            r11 = r18
            r0 = r19
            boolean r6 = X.C18070vi.A17(r0, r11)
            r7 = r17
            X.3wT r3 = r7.A01
            androidx.recyclerview.widget.RecyclerView r9 = r3.A03
            java.lang.String r0 = "emojiRecyclerView"
            if (r9 != 0) goto L_0x0018
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0018:
            int r2 = r9.computeHorizontalScrollOffset()
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x0199
            r4 = 2
            r8 = -1
            if (r1 == r6) goto L_0x0119
            if (r1 == r4) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x0119
        L_0x002b:
            return r5
        L_0x002c:
            android.view.VelocityTracker r0 = r3.A0J
            r0.addMovement(r11)
            float r1 = r11.getX()
            X.DRh r10 = r7.A03
            float r0 = r10.element
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            boolean r0 = r9.canScrollHorizontally(r8)
            if (r0 == 0) goto L_0x0053
        L_0x0043:
            float r1 = r11.getX()
            float r0 = r10.element
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x010e
            boolean r0 = r9.canScrollHorizontally(r6)
            if (r0 != 0) goto L_0x010e
        L_0x0053:
            X.1Dh r0 = r7.A02
            r0.element = r6
            float r1 = r11.getX()
            float r0 = r10.element
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r16 = 0
            r4 = -1
            if (r0 <= 0) goto L_0x0067
            r16 = 1
            r4 = 1
        L_0x0067:
            X.0vb r0 = r3.getWhatsAppLocale()
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x00fe
            r0 = r16
            r16 = 0
            if (r0 != 0) goto L_0x0102
            r16 = 1
        L_0x0079:
            int r0 = r9.getChildCount()
            X.1Oc r1 = X.C28851b7.A08(r5, r0)
        L_0x0081:
            int r13 = r1.A00
            int r12 = r1.A01
            int r8 = r1.A02
            if (r8 <= 0) goto L_0x00c9
            if (r13 <= r12) goto L_0x00cd
        L_0x008b:
            X.4rD r12 = r7.A05
            int r3 = r12.element
            int r1 = X.C108945cZ.A05(r2, r3)
            r0 = 10
            if (r1 <= r0) goto L_0x002b
            X.4rD r13 = r7.A06
            if (r2 <= r3) goto L_0x00bc
            float r3 = (float) r2
            int r0 = r7.A00
            float r1 = (float) r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            r13.element = r0
            X.4rD r3 = r7.A07
            int r1 = r12.element
            r0 = -1
            if (r2 <= r1) goto L_0x00b1
            r0 = 1
        L_0x00b1:
            r3.element = r0
            r12.element = r2
            float r0 = r11.getX()
            r10.element = r0
            return r5
        L_0x00bc:
            double r3 = (double) r2
            int r0 = r7.A00
            double r0 = (double) r0
            r8 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r0 = r0 * r8
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00a6
        L_0x00c7:
            r0 = -1
            goto L_0x00a7
        L_0x00c9:
            if (r8 >= 0) goto L_0x008b
            if (r12 > r13) goto L_0x008b
        L_0x00cd:
            if (r16 == 0) goto L_0x00f7
            r0 = r13
        L_0x00d0:
            android.view.View r3 = r9.getChildAt(r13)
            float r1 = (float) r4
            float r15 = r11.getX()
            X.DRh r14 = r7.A04
            float r14 = r14.element
            float r14 = X.C108945cZ.A00(r15, r14)
            int r0 = r0 + 1
            float r15 = (float) r0
            float r14 = r14 * r15
            r0 = 1101004800(0x41a00000, float:20.0)
            float r14 = r14 / r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r15 = r15 * r0
            float r0 = java.lang.Math.min(r14, r15)
            float r1 = r1 * r0
            r3.setTranslationX(r1)
            if (r13 == r12) goto L_0x008b
            int r13 = r13 + r8
            goto L_0x00cd
        L_0x00f7:
            int r0 = r9.getChildCount()
            int r0 = r0 - r13
            int r0 = r0 - r6
            goto L_0x00d0
        L_0x00fe:
            if (r16 == 0) goto L_0x0102
            goto L_0x0079
        L_0x0102:
            int r0 = r9.getChildCount()
            int r0 = r0 - r6
            X.1Oa r1 = new X.1Oa
            r1.<init>(r0, r5, r8)
            goto L_0x0081
        L_0x010e:
            X.1Dh r1 = r7.A02
            boolean r0 = r1.element
            if (r0 == 0) goto L_0x008b
            X.C80053wT.A00(r3, r1)
            goto L_0x008b
        L_0x0119:
            X.1Dh r1 = r7.A02
            boolean r0 = r1.element
            if (r0 == 0) goto L_0x0123
            X.C80053wT.A00(r3, r1)
            return r5
        L_0x0123:
            X.4rD r10 = r7.A06
            int r0 = r10.element
            if (r0 != 0) goto L_0x013b
            float r1 = r11.getX()
            float r0 = r11.getY()
            android.view.View r0 = r9.A0M(r1, r0)
            if (r0 == 0) goto L_0x002b
            r0.performClick()
            return r5
        L_0x013b:
            android.view.VelocityTracker r1 = r3.A0J
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            float r0 = r1.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            r0 = 1157234688(0x44fa0000, float:2000.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            X.4rD r0 = r7.A07
            int r0 = r0.element
            r10.element = r0
        L_0x0156:
            int r0 = r10.element
            if (r0 != r8) goto L_0x0193
            int r0 = -r2
        L_0x015b:
            int r1 = r0 + -75
            int[] r0 = new int[r4]
            r0[r5] = r5
            r0[r6] = r1
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r0)
            X.4rD r2 = new X.4rD
            r2.<init>()
            r1 = 5
            X.4ae r0 = new X.4ae
            r0.<init>(r2, r3, r1)
            r6.addUpdateListener(r0)
            r4 = 1017370378(0x3ca3d70a, float:0.02)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 1028443341(0x3d4ccccd, float:0.05)
            r1 = 1060320051(0x3f333333, float:0.7)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r2, r1, r4, r3)
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r6.setInterpolator(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.setDuration(r0)
            r6.start()
            return r5
        L_0x0193:
            int r0 = r9.getWidth()
            int r0 = r0 - r2
            goto L_0x015b
        L_0x0199:
            X.DRh r0 = r7.A04
            float r1 = r11.getX()
            r0.element = r1
            X.DRh r0 = r7.A03
            r0.element = r1
            X.4rD r0 = r7.A05
            r0.element = r2
            X.4rD r0 = r7.A06
            r0.element = r5
            X.4rD r0 = r7.A07
            r0.element = r5
            android.view.VelocityTracker r0 = r3.A0J
            r0.clear()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D74.Bw2(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public void C3K(boolean z) {
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public D74(C80053wT r1, C22811Dh r2, C27061DRh dRh, C27061DRh dRh2, C98474rD r5, C98474rD r6, C98474rD r7, int i) {
        this.A01 = r1;
        this.A04 = dRh;
        this.A03 = dRh2;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A02 = r2;
        this.A00 = i;
    }
}
