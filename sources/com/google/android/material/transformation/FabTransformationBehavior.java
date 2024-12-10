package com.google.android.material.transformation;

import X.AnonymousClass000;
import X.AnonymousClass1YQ;
import X.AnonymousClass1YW;
import X.AnonymousClass3MW;
import X.BE6;
import X.BE7;
import X.C108945cZ;
import X.C17880vN;
import X.C27991Yk;
import X.C28001Yl;
import X.C37891qK;
import X.CLQ;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float A00;
    public float A01;
    public final Rect A02 = AnonymousClass3MW.A07();
    public final RectF A03 = AnonymousClass3MW.A08();
    public final RectF A04 = AnonymousClass3MW.A08();
    public final int[] A05 = C108945cZ.A1W();

    public static Pair A01(CLQ clq, float f, float f2, boolean z) {
        C28001Yl A032;
        C27991Yk r1;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            A032 = clq.A00.A03("translationXLinear");
            r1 = clq.A00;
            str = "translationYLinear";
        } else if (!z ? f2 <= 0.0f : f2 >= 0.0f) {
            A032 = clq.A00.A03("translationXCurveDownwards");
            r1 = clq.A00;
            str = "translationYCurveDownwards";
        } else {
            A032 = clq.A00.A03("translationXCurveUpwards");
            r1 = clq.A00;
            str = "translationYCurveUpwards";
        }
        return C108945cZ.A0N(A032, r1.A03(str));
    }

    public static float A00(C28001Yl r8, CLQ clq, float f) {
        long j = r8.A02;
        long j2 = r8.A03;
        C28001Yl A032 = clq.A00.A03("expansion");
        float f2 = ((float) (((A032.A02 + A032.A03) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = r8.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass1YW.A02;
        }
        float interpolation = timeInterpolator.getInterpolation(f2);
        TimeInterpolator timeInterpolator2 = AnonymousClass1YW.A00;
        return C17880vN.A00(0.0f, f, interpolation);
    }

    public void A0J(C37891qK r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.CLQ] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0166, code lost:
        if ((r4 instanceof android.view.ViewGroup) != false) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet A0R(android.view.View r20, android.view.View r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r13 = r21
            android.content.Context r1 = r13.getContext()
            r0 = 2130837535(0x7f02001f, float:1.7280027E38)
            r12 = r22
            if (r22 == 0) goto L_0x0010
            r0 = 2130837536(0x7f020020, float:1.7280029E38)
        L_0x0010:
            X.CLQ r11 = new X.CLQ
            r11.<init>()
            X.1Yk r0 = X.C27991Yk.A00(r1, r0)
            r11.A00 = r0
            r10 = r19
            r14 = r20
            if (r22 == 0) goto L_0x002d
            float r0 = r14.getTranslationX()
            r10.A00 = r0
            float r0 = r14.getTranslationY()
            r10.A01 = r0
        L_0x002d:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            float r3 = X.AnonymousClass1Xr.A00(r13)
            float r0 = X.AnonymousClass1Xr.A00(r14)
            float r3 = r3 - r0
            r8 = 0
            r1 = 1
            if (r22 == 0) goto L_0x01d1
            if (r23 != 0) goto L_0x0048
            float r0 = -r3
            r13.setTranslationZ(r0)
        L_0x0048:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            r0 = 0
        L_0x004d:
            android.animation.ObjectAnimator r2 = X.C108945cZ.A0C(r2, r13, r1, r0, r8)
            X.1Yk r1 = r11.A00
            java.lang.String r0 = "elevation"
            X.1Yl r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
            android.graphics.RectF r7 = r10.A03
            android.graphics.RectF r6 = r10.A04
            r10.A02(r7, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r7.offset(r1, r0)
            r10.A02(r6, r13)
            float r5 = r6.centerX()
            float r0 = r7.centerX()
            float r5 = r5 - r0
            r0 = 0
            float r5 = r5 + r0
            r10.A02(r7, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r7.offset(r1, r0)
            r10.A02(r6, r13)
            float r4 = r6.centerY()
            float r0 = r7.centerY()
            float r4 = r4 - r0
            r3 = 0
            float r4 = r4 + r3
            android.util.Pair r1 = A01(r11, r5, r4, r12)
            java.lang.Object r0 = r1.first
            r17 = r0
            r0 = r17
            X.1Yl r0 = (X.C28001Yl) r0
            r17 = r0
            java.lang.Object r15 = r1.second
            X.1Yl r15 = (X.C28001Yl) r15
            r2 = 1
            if (r22 == 0) goto L_0x01bd
            if (r23 != 0) goto L_0x00b2
            float r0 = -r5
            r13.setTranslationX(r0)
            float r0 = -r4
            r13.setTranslationY(r0)
        L_0x00b2:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            android.animation.ObjectAnimator r16 = X.C108945cZ.A0C(r1, r13, r0, r3, r8)
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            float[] r1 = new float[r2]
            android.animation.ObjectAnimator r1 = X.C108945cZ.A0C(r0, r13, r1, r3, r8)
            float r2 = -r5
            float r4 = -r4
            r0 = r17
            float r5 = A00(r0, r11, r2)
            float r2 = A00(r15, r11, r4)
            android.graphics.Rect r0 = r10.A02
            r13.getWindowVisibleDisplayFrame(r0)
            r7.set(r0)
            r10.A02(r6, r13)
            r6.offset(r5, r2)
            r6.intersect(r7)
            r7.set(r6)
        L_0x00e2:
            r2 = r16
            r0 = r17
            r0.A00(r2)
            r15.A00(r1)
            r9.add(r2)
            r9.add(r1)
            r7.width()
            r7.height()
            r10.A02(r7, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r7.offset(r1, r0)
            r10.A02(r6, r13)
            float r0 = r6.centerX()
            float r1 = r7.centerX()
            float r0 = r0 - r1
            float r0 = r0 + r3
            r10.A02(r7, r14)
            float r2 = r10.A00
            float r1 = r10.A01
            r7.offset(r2, r1)
            r10.A02(r6, r13)
            float r6 = r6.centerY()
            float r1 = r7.centerY()
            float r6 = r6 - r1
            float r6 = r6 + r3
            android.util.Pair r1 = A01(r11, r0, r6, r12)
            java.lang.Object r4 = r1.first
            X.1Yl r4 = (X.C28001Yl) r4
            java.lang.Object r2 = r1.second
            X.1Yl r2 = (X.C28001Yl) r2
            android.util.Property r7 = android.view.View.TRANSLATION_X
            r5 = 1
            float[] r1 = new float[r5]
            if (r22 != 0) goto L_0x013b
            float r0 = r10.A00
        L_0x013b:
            android.animation.ObjectAnimator r1 = X.C108945cZ.A0C(r7, r14, r1, r0, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r0 = new float[r5]
            if (r22 != 0) goto L_0x0147
            float r6 = r10.A01
        L_0x0147:
            android.animation.ObjectAnimator r0 = X.C108945cZ.A0C(r7, r14, r0, r6, r8)
            r4.A00(r1)
            r2.A00(r0)
            r9.add(r1)
            r9.add(r0)
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x018d
            r0 = 2131432822(0x7f0b1576, float:1.8487412E38)
            android.view.View r4 = r13.findViewById(r0)
            if (r4 == 0) goto L_0x01bb
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x018d
        L_0x0168:
            if (r22 == 0) goto L_0x01b2
            if (r23 != 0) goto L_0x0175
            android.util.Property r1 = X.C22636BGw.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r1.set(r4, r0)
        L_0x0175:
            android.util.Property r2 = X.C22636BGw.A00
            float[] r1 = new float[r5]
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r2 = X.C108945cZ.A0C(r2, r4, r1, r0, r8)
        L_0x017f:
            X.1Yk r1 = r11.A00
            java.lang.String r0 = "contentFade"
            X.1Yl r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
        L_0x018d:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            X.AnonymousClass2SX.A00(r3, r9)
            X.BEP r0 = new X.BEP
            r0.<init>(r13, r14, r10, r12)
            r3.addListener(r0)
            int r2 = r18.size()
            r1 = 0
        L_0x01a2:
            if (r1 >= r2) goto L_0x01d8
            r0 = r18
            java.lang.Object r0 = r0.get(r1)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r3.addListener(r0)
            int r1 = r1 + 1
            goto L_0x01a2
        L_0x01b2:
            android.util.Property r1 = X.C22636BGw.A00
            float[] r0 = new float[r5]
            android.animation.ObjectAnimator r2 = X.C108945cZ.A0C(r1, r4, r0, r3, r8)
            goto L_0x017f
        L_0x01bb:
            r4 = r13
            goto L_0x0168
        L_0x01bd:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            float r5 = -r5
            android.animation.ObjectAnimator r16 = X.C108945cZ.A0C(r1, r13, r0, r5, r8)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r2 = new float[r2]
            float r0 = -r4
            android.animation.ObjectAnimator r1 = X.C108945cZ.A0C(r1, r13, r2, r0, r8)
            goto L_0x00e2
        L_0x01d1:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            float r0 = -r3
            goto L_0x004d
        L_0x01d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A0R(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    private void A02(RectF rectF, View view) {
        BE7.A13(rectF, C108945cZ.A03(view), view.getHeight());
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) BE6.A0I(iArr), (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public boolean A0C(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw AnonymousClass000.A0n("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof AnonymousClass1YQ)) {
            return false;
        } else {
            int i = ((AnonymousClass1YQ) view2).A0D.A00;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public FabTransformationBehavior() {
    }
}
