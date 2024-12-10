package X;

import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;

/* renamed from: X.7xy  reason: invalid class name and case insensitive filesystem */
public final class C157727xy extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157727xy(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        if (java.lang.Float.valueOf(r3) != null) goto L_0x0215;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            X.6R4 r15 = (X.AnonymousClass6R4) r15
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r8 = r14.this$0
            X.C18070vi.A0b(r15)
            int r2 = r15.ordinal()
            r0 = 4
            if (r2 == r0) goto L_0x015d
            r6 = 3
            if (r2 == r6) goto L_0x011f
            r7 = 0
            if (r2 == r7) goto L_0x00a8
            r9 = 1
            if (r2 == r9) goto L_0x0058
            r1 = 2
            if (r2 != r1) goto L_0x0055
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            androidx.constraintlayout.widget.ConstraintLayout r4 = r8.A07
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r1]
            float[] r1 = new float[r9]
            X.5jD r0 = r8.A0J
            java.lang.String r2 = "viewModel"
            if (r0 == 0) goto L_0x029d
            r0 = 1063675494(0x3f666666, float:0.9)
            r1[r7] = r0
            java.lang.String r0 = "scaleX"
            X.C108945cZ.A1R(r0, r1, r3, r7)
            float[] r1 = new float[r9]
            X.5jD r0 = r8.A0J
            if (r0 == 0) goto L_0x029d
            r0 = 1063675494(0x3f666666, float:0.9)
            r1[r7] = r0
            java.lang.String r0 = "scaleY"
            X.C108945cZ.A1R(r0, r1, r3, r9)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r3)
        L_0x004a:
            X.C18070vi.A0X(r2)
        L_0x004d:
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r2.start()
        L_0x0055:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0058:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0055
            r0 = 2131167040(0x7f070740, float:1.7948342E38)
            float r3 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            if (r0 == 0) goto L_0x0055
            X.5jD r0 = r8.A0J
            if (r0 != 0) goto L_0x0080
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x0080:
            X.6if r0 = r0.A0Y
            float r2 = r0.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r0
            float r3 = r3 * r0
            r5 = 2
            float[] r1 = new float[r5]
            r1[r7] = r2
            float r3 = r3 + r3
            r1[r9] = r3
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A07
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r6]
            float[] r1 = new float[r9]
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C109005cf.A0r(r1, r2, r0)
            r2[r5] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            goto L_0x004a
        L_0x00a8:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            X.5jD r0 = r8.A0J
            java.lang.String r10 = "viewModel"
            if (r0 == 0) goto L_0x02a2
            X.6if r0 = r0.A0Y
            float r0 = r0.A00
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0055
            r0 = 2131167033(0x7f070739, float:1.7948328E38)
            float r4 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L_0x0055
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r4
            r6 = 2
            float[] r1 = new float[r6]
            r1[r7] = r2
            r5 = 1
            r1[r5] = r0
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A07
            r0 = 3
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r0]
            float[] r1 = new float[r5]
            X.5jD r0 = r8.A0J
            if (r0 == 0) goto L_0x02a2
            r0 = 1063675494(0x3f666666, float:0.9)
            r1[r7] = r0
            java.lang.String r0 = "scaleX"
            X.C108945cZ.A1R(r0, r1, r2, r7)
            float[] r1 = new float[r5]
            X.5jD r0 = r8.A0J
            if (r0 == 0) goto L_0x02a2
            r0 = 1063675494(0x3f666666, float:0.9)
            r1[r7] = r0
            java.lang.String r0 = "scaleY"
            X.C108945cZ.A1R(r0, r1, r2, r5)
            r2[r6] = r9
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            X.C18070vi.A0X(r2)
            X.5jD r0 = r8.A0J
            if (r0 == 0) goto L_0x02a2
            X.6if r0 = r0.A0Y
            r0.A01 = r4
            goto L_0x004d
        L_0x011f:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            X.5jD r1 = r8.A0J
            java.lang.String r0 = "viewModel"
            if (r1 != 0) goto L_0x0130
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0130:
            X.6if r1 = r1.A0Y
            float r0 = r1.A00
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            float r1 = r1.A02
            r5 = 2
            float[] r2 = new float[r5]
            r0 = 0
            r2[r0] = r1
            r1 = 1
            r2[r1] = r3
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r0, r2)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A07
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r6]
            float[] r1 = new float[r1]
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C109005cf.A0r(r1, r2, r0)
            r2[r5] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            goto L_0x004a
        L_0x015d:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0055
            boolean r13 = X.C108995ce.A1V(r8)
            X.5jD r0 = r8.A0J
            java.lang.String r12 = "viewModel"
            r11 = 0
            if (r0 != 0) goto L_0x0172
            X.C18070vi.A11(r12)
            throw r11
        L_0x0172:
            X.6if r7 = r0.A0Y
            float r0 = r7.A00
            r5 = 2
            r10 = 0
            r4 = 1
            r6 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0258
            if (r13 == 0) goto L_0x0237
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x0184:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0234
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0234
            r0 = 2131167031(0x7f070737, float:1.7948324E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x019b:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.A07
            if (r0 == 0) goto L_0x0231
            int r0 = r0.getWidth()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x01a7:
            if (r3 == 0) goto L_0x0055
            if (r9 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            X.11C r0 = r8.A0L
            if (r0 == 0) goto L_0x02a7
            android.view.WindowManager r0 = r0.A0L()
            android.graphics.Point r1 = X.C62762rw.A02(r0)
            int r0 = r1.x
            int r7 = r1.y
            int r2 = java.lang.Math.min(r0, r7)
            int r0 = r3.intValue()
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r7 = r7 / r5
            int r7 = r7 - r2
            if (r13 == 0) goto L_0x022f
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x022d
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x022d
            r0 = 2131167030(0x7f070736, float:1.7948322E38)
            java.lang.Integer r3 = X.AnonymousClass3MY.A0i(r1, r0)
        L_0x01df:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x022b
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x022b
            r0 = 2131167026(0x7f070732, float:1.7948314E38)
            int r1 = r1.getDimensionPixelSize(r0)
        L_0x01f2:
            if (r3 == 0) goto L_0x0229
            int r0 = r3.intValue()
            float r3 = (float) r0
        L_0x01f9:
            int r7 = r7 + r1
        L_0x01fa:
            if (r7 >= 0) goto L_0x0218
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x0227
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0227
            r0 = 2131167034(0x7f07073a, float:1.794833E38)
            float r3 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            if (r0 == 0) goto L_0x0227
        L_0x0215:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
        L_0x0218:
            float r2 = (float) r2
            int r0 = r9.intValue()
            float r1 = (float) r0
            float r2 = r2 / r1
            X.5jD r0 = r8.A0J
            if (r0 != 0) goto L_0x024f
            X.C18070vi.A11(r12)
            throw r11
        L_0x0227:
            r3 = 0
            goto L_0x0215
        L_0x0229:
            r3 = 0
            goto L_0x01f9
        L_0x022b:
            r1 = 0
            goto L_0x01f2
        L_0x022d:
            r3 = r11
            goto L_0x01df
        L_0x022f:
            r3 = 0
            goto L_0x01fa
        L_0x0231:
            r9 = r11
            goto L_0x01a7
        L_0x0234:
            r1 = r11
            goto L_0x019b
        L_0x0237:
            android.content.Context r0 = r8.A1n()
            if (r0 == 0) goto L_0x024c
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x024c
            r0 = 2131167019(0x7f07072b, float:1.79483E38)
            java.lang.Integer r3 = X.AnonymousClass3MY.A0i(r1, r0)
            goto L_0x0184
        L_0x024c:
            r3 = r11
            goto L_0x0184
        L_0x024f:
            X.6if r7 = r0.A0Y
            float r1 = r1 * r2
            r7.A00 = r1
            r7.A02 = r3
            r7.A04 = r2
        L_0x0258:
            float[] r1 = new float[r5]
            r1[r6] = r10
            float r0 = r7.A02
            r1[r4] = r0
            java.lang.String r0 = "translationY"
            android.animation.PropertyValuesHolder r7 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A07
            r0 = 3
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r0]
            float[] r1 = new float[r4]
            X.5jD r0 = r8.A0J
            if (r0 != 0) goto L_0x0275
            X.C18070vi.A11(r12)
            throw r11
        L_0x0275:
            X.6if r0 = r0.A0Y
            float r0 = r0.A04
            r1[r6] = r0
            java.lang.String r0 = "scaleX"
            X.C108945cZ.A1R(r0, r1, r2, r6)
            float[] r1 = new float[r4]
            X.5jD r0 = r8.A0J
            if (r0 != 0) goto L_0x028a
            X.C18070vi.A11(r12)
            throw r11
        L_0x028a:
            X.6if r0 = r0.A0Y
            float r0 = r0.A04
            r1[r6] = r0
            java.lang.String r0 = "scaleY"
            X.C108945cZ.A1R(r0, r1, r2, r4)
            r2[r5] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            goto L_0x004a
        L_0x029d:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x02a2:
            X.C18070vi.A11(r10)
            r0 = 0
            throw r0
        L_0x02a7:
            X.AnonymousClass3MW.A1N()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157727xy.invoke(java.lang.Object):java.lang.Object");
    }
}
