package X;

import android.animation.ValueAnimator;

/* renamed from: X.Cxg  reason: case insensitive filesystem */
public class C26323Cxg implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C26323Cxg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C26323Cxg(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.BFB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.BFD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.BFB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.BFB} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d8, code lost:
        r5.invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0114, code lost:
        r1.setTranslationY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0122, code lost:
        r0.setScaleX(r1);
        r0.setScaleY(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1.setColorFilter(X.C72473Md.A02(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationUpdate(android.animation.ValueAnimator r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0228;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01b5;
                case 3: goto L_0x01aa;
                case 4: goto L_0x019a;
                case 5: goto L_0x0192;
                case 6: goto L_0x0182;
                case 7: goto L_0x002a;
                case 8: goto L_0x016e;
                case 9: goto L_0x0137;
                case 10: goto L_0x0129;
                case 11: goto L_0x0118;
                case 12: goto L_0x0103;
                case 13: goto L_0x0103;
                case 14: goto L_0x00ea;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00ea;
                case 17: goto L_0x00dc;
                case 18: goto L_0x00c3;
                case 19: goto L_0x005f;
                case 20: goto L_0x0050;
                case 21: goto L_0x0020;
                case 22: goto L_0x0020;
                case 23: goto L_0x0016;
                case 24: goto L_0x0016;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.CkQ r0 = (X.C25695CkQ) r0
            X.C18070vi.A0h(r0, r12)
            android.widget.ImageView r1 = r0.A05
        L_0x000e:
            int r0 = X.C72473Md.A02(r12)
            r1.setColorFilter(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r0 = r11.A01
            X.CkQ r0 = (X.C25695CkQ) r0
            X.C18070vi.A0h(r0, r12)
            android.widget.ImageView r1 = r0.A04
            goto L_0x000e
        L_0x0020:
            java.lang.Object r0 = r11.A01
            X.CkQ r0 = (X.C25695CkQ) r0
            X.C18070vi.A0h(r0, r12)
            android.widget.ImageView r1 = r0.A03
            goto L_0x000e
        L_0x002a:
            float r1 = X.C108985cd.A00(r12)
            java.lang.Object r0 = r11.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            X.1Xq r0 = r0.A0O
            if (r0 == 0) goto L_0x0015
            r0.A0D(r1)
            return
        L_0x003a:
            java.lang.Object r0 = r11.A01
            X.BwF r0 = (X.C24149BwF) r0
            X.70X r0 = r0.A0H
            android.view.View r1 = r0.A09()
            java.lang.Object r0 = r12.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setBackgroundColor(r0)
            return
        L_0x0050:
            java.lang.Object r1 = r11.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r12.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            float r0 = (float) r0
            goto L_0x0114
        L_0x005f:
            r0 = 0
            float r1 = X.C72483Me.A00(r12, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            float r7 = java.lang.Math.max(r0, r1)
            r0 = 1082130432(0x40800000, float:4.0)
            float r7 = r7 * r0
            int r8 = (int) r7
            float r0 = (float) r8
            float r7 = r7 - r0
            float[] r2 = X.BFD.A0C
            android.view.animation.Interpolator r1 = X.BFD.A0A
            r3 = r2[r8]
            int r9 = r8 + 1
            r0 = 5
            int r9 = r9 % r0
            r2 = r2[r9]
            float r1 = r1.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r6 = X.AnonymousClass000.A00(r3, r0, r2, r1)
            float[] r0 = X.BFD.A0D
            android.view.animation.Interpolator r5 = X.BFD.A09
            r3 = r0[r8]
            r2 = r0[r9]
            float r1 = r5.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r4 = X.AnonymousClass000.A00(r3, r0, r2, r1)
            float[] r0 = X.BFD.A0B
            r3 = r0[r8]
            r2 = r0[r9]
            float r1 = r5.getInterpolation(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = X.AnonymousClass000.A00(r3, r0, r2, r1)
            java.lang.Object r5 = r11.A01
            X.BFD r5 = (X.BFD) r5
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r4 * r2
            float r1 = r1 + r6
            r0 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r0
            r5.A01 = r1
            float r3 = r3 - r4
            float r3 = r3 * r2
            r5.A00 = r3
            goto L_0x00d8
        L_0x00c3:
            java.lang.Object r5 = r11.A01
            X.BFB r5 = (X.BFB) r5
            android.animation.TimeInterpolator r0 = X.BFB.A09
            android.graphics.Paint r2 = r5.A05
            int r1 = r5.A02
            float r0 = X.C108985cd.A00(r12)
            int r0 = X.C25346Ce5.A00(r1, r0)
            r2.setColor(r0)
        L_0x00d8:
            r5.invalidateSelf()
            return
        L_0x00dc:
            java.lang.Object r0 = r11.A01
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.Cvn r1 = r0.A14
            float r0 = X.C108985cd.A00(r12)
            r1.A07(r0)
            return
        L_0x00ea:
            java.lang.Object r0 = r11.A01
            X.CcZ r0 = (X.C25277CcZ) r0
            float r1 = X.C108985cd.A00(r12)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            r0.setAlpha(r1)
            return
        L_0x00f8:
            java.lang.Object r0 = r11.A01
            X.CcZ r0 = (X.C25277CcZ) r0
            float r1 = X.C108985cd.A00(r12)
            com.google.android.material.internal.CheckableImageButton r0 = r0.A01
            goto L_0x0122
        L_0x0103:
            java.lang.Object r0 = r12.getAnimatedValue()
            int r2 = X.AnonymousClass000.A0M(r0)
            android.os.Handler r0 = X.C26155CtN.A0M
            java.lang.Object r0 = r11.A01
            X.CtN r0 = (X.C26155CtN) r0
            X.BIE r1 = r0.A0J
            float r0 = (float) r2
        L_0x0114:
            r1.setTranslationY(r0)
            return
        L_0x0118:
            float r1 = X.C108985cd.A00(r12)
            java.lang.Object r0 = r11.A01
            X.CtN r0 = (X.C26155CtN) r0
            X.BIE r0 = r0.A0J
        L_0x0122:
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0129:
            java.lang.Object r0 = r11.A01
            X.CtN r0 = (X.C26155CtN) r0
            X.BIE r1 = r0.A0J
            float r0 = X.C108985cd.A00(r12)
            r1.setAlpha(r0)
            return
        L_0x0137:
            float r6 = X.C108985cd.A00(r12)
            java.lang.Object r5 = r11.A01
            com.google.android.material.slider.Slider r5 = (com.google.android.material.slider.Slider) r5
            java.util.List r0 = r5.A0p
            java.util.Iterator r4 = r0.iterator()
        L_0x0145:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r3 = r4.next()
            X.Bii r3 = (X.C23519Bii) r3
            r0 = 1067030938(0x3f99999a, float:1.2)
            r3.A01 = r0
            r3.A02 = r6
            r3.A03 = r6
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 1044549468(0x3e428f5c, float:0.19)
            r0 = 0
            float r0 = X.AnonymousClass1YW.A00(r0, r2, r1, r2, r6)
            r3.A00 = r0
            r3.invalidateSelf()
            goto L_0x0145
        L_0x016a:
            r5.postInvalidateOnAnimation()
            return
        L_0x016e:
            java.lang.Object r3 = r11.A01
            X.Cvm r3 = (X.C26248Cvm) r3
            float r2 = X.C108985cd.A00(r12)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r2
            int r1 = (int) r0
            android.graphics.drawable.Drawable r0 = r3.A09
            r0.setAlpha(r1)
            r3.A00 = r2
            return
        L_0x0182:
            java.lang.Object r1 = r11.A01
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            java.lang.Object r0 = r12.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setScrimAlpha(r0)
            return
        L_0x0192:
            java.lang.Object r0 = r11.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            return
        L_0x019a:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r1 = r11.A01
            X.CmM r1 = (X.C25809CmM) r1
            int r0 = X.C72473Md.A02(r12)
            r1.A00(r0)
            return
        L_0x01aa:
            java.lang.Object r2 = r11.A01
            X.BER r2 = (X.BER) r2
            long r0 = X.C26323Cxg.super.getCurrentPlayTime()
            r2.A01 = r0
            return
        L_0x01b5:
            r0 = 0
            float r1 = X.C72483Me.A00(r12, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r2 = (int) r1
            java.lang.Object r1 = r11.A01
            X.BF6 r1 = (X.BF6) r1
            android.graphics.Paint r0 = r1.A01
            r0.setAlpha(r2)
            X.CSA r0 = r1.A06
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r2)
            X.CX9 r0 = r1.A05
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r2)
            X.CX9 r0 = r1.A03
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r2)
            X.CX9 r0 = r1.A04
            android.graphics.Paint r0 = r0.A00
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.A02
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
        L_0x01ec:
            float r3 = r12.getAnimatedFraction()
            long r1 = r12.getDuration()
            float r0 = (float) r1
            float r3 = r3 * r0
            long r2 = (long) r3
            java.lang.Object r6 = r11.A01
            X.BF8 r6 = (X.BF8) r6
            X.CIl[] r10 = r6.A07
            int r0 = r10.length
            int r9 = r0 + -1
            r7 = 3000(0xbb8, double:1.482E-320)
            long r4 = r2 / r7
            int r0 = (int) r4
            int r0 = java.lang.Math.min(r0, r9)
            r4 = 0
            int r1 = java.lang.Math.max(r0, r4)
            if (r1 == r9) goto L_0x0212
            int r4 = r1 + 1
        L_0x0212:
            r0 = r10[r1]
            r6.A01 = r0
            r0 = r10[r4]
            r6.A02 = r0
            long r0 = (long) r1
            long r0 = r0 * r7
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1161527296(0x453b8000, float:3000.0)
            float r1 = r1 / r0
            r6.A00 = r1
            r6.invalidateSelf()
            return
        L_0x0228:
            java.lang.Object r1 = r11.A01
            X.CxS r1 = (X.C26309CxS) r1
            float r0 = r12.getAnimatedFraction()
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26323Cxg.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
