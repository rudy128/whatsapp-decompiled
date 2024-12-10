package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4e5  reason: invalid class name and case insensitive filesystem */
public class C90444e5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C90444e5(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r2 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x00fc;
                case 2: goto L_0x0007;
                case 3: goto L_0x002c;
                case 4: goto L_0x006c;
                case 5: goto L_0x019b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A03
            android.view.View r3 = (android.view.View) r3
            X.AnonymousClass3MY.A1D(r3, r2)
            r5 = 1
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r9 = r5
            r11 = r5
            r12 = r6
            r7 = r5
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 200(0xc8, double:9.9E-322)
            r4.setDuration(r0)
            r3.startAnimation(r4)
            java.lang.Object r0 = r2.A02
            android.view.View r0 = (android.view.View) r0
            r0.startAnimation(r4)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r5 = r2.A01
            com.whatsapp.registration.RegistrationScrollView r5 = (com.whatsapp.registration.RegistrationScrollView) r5
            java.lang.Object r4 = r2.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r2.A03
            android.view.View r3 = (android.view.View) r3
            boolean r0 = r5.A04
            r2 = 1
            if (r0 != 0) goto L_0x0048
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r5.A07
            r1.addOnScrollChangedListener(r0)
            r5.A04 = r2
        L_0x0048:
            boolean r2 = r5.canScrollVertically(r2)
            r0 = -1
            boolean r1 = r5.canScrollVertically(r0)
            if (r1 != 0) goto L_0x005d
            if (r2 != 0) goto L_0x005f
            r0 = 0
            X.AnonymousClass1HF.A0W(r4, r0)
            X.AnonymousClass1HF.A0W(r3, r0)
            return
        L_0x005d:
            if (r2 == 0) goto L_0x0066
        L_0x005f:
            float r0 = r5.A06
            X.AnonymousClass1HF.A0W(r3, r0)
            if (r1 == 0) goto L_0x002b
        L_0x0066:
            float r0 = r5.A06
            X.AnonymousClass1HF.A0W(r4, r0)
            return
        L_0x006c:
            java.lang.Object r1 = r2.A03
            X.4SH r1 = (X.AnonymousClass4SH) r1
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x007d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x007d
            r0.removeOnGlobalLayoutListener(r2)
        L_0x007d:
            android.view.View r8 = r1.A00
            if (r8 == 0) goto L_0x002b
            java.lang.Object r11 = r2.A01
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r5 = r2.A02
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r5 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r5
            r9 = 2
            int[] r12 = new int[r9]
            r8.getLocationOnScreen(r12)
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r8)
            r0 = 2131626698(0x7f0e0aca, float:1.888064E38)
            android.view.View r4 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = -2
            android.widget.PopupWindow r7 = new android.widget.PopupWindow
            r7.<init>(r4, r0, r0)
            r3 = 1
            r7.setOutsideTouchable(r3)
            r7.setFocusable(r3)
            r0 = 2132083607(0x7f150397, float:1.9807361E38)
            r7.setAnimationStyle(r0)
            r6 = 0
            r10 = r12[r6]
            r2 = r12[r3]
            int r1 = r8.getWidth()
            int r1 = r1 + r10
            r0 = r12[r3]
            int r0 = X.AnonymousClass3MW.A02(r8, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r10, r2, r1, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168457(0x7f070cc9, float:1.7951216E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r4.measure(r6, r6)
            int r0 = r4.getMeasuredWidth()
            int r1 = r3.right
            int r1 = r1 - r0
            int r0 = r2 / 2
            int r1 = r1 + r0
            int r0 = r3.bottom
            int r2 = r2 / r9
            int r0 = r0 - r2
            r7.showAtLocation(r8, r6, r1, r0)
            r0 = 45
            X.AkG r2 = new X.AkG
            r2.<init>((java.lang.Object) r7, (int) r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.postDelayed(r2, r0)
            X.4Mq r0 = r5.A0D
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r0)
            java.lang.String r1 = "is_reg_audio_guidance_tooltip_shown"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            return
        L_0x00fc:
            java.lang.Object r4 = r2.A03
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            X.AnonymousClass3MY.A1D(r4, r2)
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            int r8 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            int r6 = r0.getIntrinsicHeight()
            r10 = 2
            int[] r1 = new int[r10]
            java.lang.Object r9 = r2.A02
            android.view.View r9 = (android.view.View) r9
            r9.getLocationOnScreen(r1)
            int[] r11 = new int[r10]
            java.lang.Object r0 = r2.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            com.whatsapp.conversation.ConversationListView r0 = r0.A2B
            r0.getLocationOnScreen(r11)
            r3 = 0
            r7 = r1[r3]
            r0 = r11[r3]
            int r7 = r7 - r0
            r5 = 1
            r1 = r1[r5]
            r0 = r11[r5]
            int r1 = r1 - r0
            int r0 = r9.getWidth()
            int r0 = r8 - r0
            int r0 = r0 / r10
            int r7 = r7 - r0
            int r0 = r9.getHeight()
            int r0 = r6 - r0
            int r0 = r0 / r10
            int r1 = r1 - r0
            r4.setVisibility(r3)
            android.view.animation.AnimationSet r3 = new android.view.animation.AnimationSet
            r3.<init>(r5)
            float r7 = (float) r7
            float r1 = (float) r1
            float r0 = (float) r6
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r0 = r1 - r0
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r6.<init>(r7, r7, r1, r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.graphics.drawable.Drawable r0 = r9.getDrawable()
            int r0 = r0.getIntrinsicWidth()
            float r9 = (float) r0
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r10
            float r0 = (float) r8
            float r9 = r9 / r0
            r13 = 1
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r8 = new android.view.animation.ScaleAnimation
            r11 = r9
            r12 = r10
            r15 = r13
            r16 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 0
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r14, r1)
            r3.addAnimation(r0)
            r3.addAnimation(r8)
            r3.addAnimation(r6)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r5)
            r3.setInterpolator(r0)
            r0 = 8
            X.C74613c2.A00(r3, r2, r0)
            r4.startAnimation(r3)
            return
        L_0x019b:
            java.lang.Object r3 = r2.A02
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            boolean r0 = X.AnonymousClass4W3.A01(r3)
            r1 = 0
            if (r0 == 0) goto L_0x01a9
            r1 = 2131233001(0x7f0808e9, float:1.8082127E38)
        L_0x01a9:
            java.lang.Object r0 = r2.A03
            android.view.View r0 = (android.view.View) r0
            r0.setBackgroundResource(r1)
            X.AnonymousClass3MY.A1D(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90444e5.onGlobalLayout():void");
    }
}
