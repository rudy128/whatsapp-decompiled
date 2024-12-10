package X;

import android.animation.ValueAnimator;

/* renamed from: X.74h  reason: invalid class name and case insensitive filesystem */
public class C1411074h implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C1411074h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C1411074h(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x03ba;
                case 1: goto L_0x0367;
                case 2: goto L_0x0061;
                case 3: goto L_0x0356;
                case 4: goto L_0x0042;
                case 5: goto L_0x0042;
                case 6: goto L_0x034a;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x02fb;
                case 10: goto L_0x02ea;
                case 11: goto L_0x002d;
                case 12: goto L_0x02d8;
                case 13: goto L_0x02cc;
                case 14: goto L_0x001b;
                case 15: goto L_0x02b5;
                case 16: goto L_0x029e;
                case 17: goto L_0x028d;
                case 18: goto L_0x027f;
                case 19: goto L_0x0271;
                case 20: goto L_0x0263;
                case 21: goto L_0x0255;
                case 22: goto L_0x0247;
                case 23: goto L_0x0239;
                case 24: goto L_0x022b;
                case 25: goto L_0x021b;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0209;
                case 29: goto L_0x01ba;
                case 30: goto L_0x01aa;
                case 31: goto L_0x019d;
                case 32: goto L_0x0186;
                case 33: goto L_0x0175;
                case 34: goto L_0x0163;
                case 35: goto L_0x0163;
                case 36: goto L_0x0163;
                case 37: goto L_0x0154;
                case 38: goto L_0x0135;
                case 39: goto L_0x010e;
                case 40: goto L_0x00ed;
                case 41: goto L_0x00b4;
                case 42: goto L_0x00a4;
                case 43: goto L_0x0005;
                case 44: goto L_0x0096;
                case 45: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C72473Md.A02(r10)
            r1.height = r0
            r2.requestLayout()
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            float r0 = X.C72483Me.A00(r10, r0)
            if (r1 == 0) goto L_0x001a
            r1.setAlpha(r0)
            r1.requestLayout()
            return
        L_0x002d:
            java.lang.Object r0 = r9.A01
            X.701 r0 = (X.AnonymousClass701) r0
            android.view.View r1 = r0.A07
            if (r1 == 0) goto L_0x001a
            java.lang.Object r0 = r10.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            float r0 = (float) r0
            r1.setTranslationY(r0)
            return
        L_0x0042:
            java.lang.Object r3 = r9.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            r2 = 0
        L_0x0047:
            X.1bB r1 = r3.A0b
            int r0 = r1.A00
            if (r2 >= r0) goto L_0x001a
            X.1bC r0 = r1.A0J(r2)
            android.widget.TextView r1 = r0.A05
            java.lang.Object r0 = r10.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setTextColor(r0)
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0061:
            java.lang.Object r2 = r9.A01
            com.facebook.smartcapture.components.DottedAlignmentView r2 = (com.facebook.smartcapture.components.DottedAlignmentView) r2
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = "animation_property"
            java.lang.Object r1 = r10.getAnimatedValue(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r1, r0)
            int r1 = X.AnonymousClass000.A0M(r1)
            int r0 = r2.A02
            if (r1 == r0) goto L_0x001a
            r2.A02 = r1
            r2.invalidate()
            return
        L_0x0082:
            java.lang.Object r2 = r10.getAnimatedValue()
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = r9.A01
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r0 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r0
            android.graphics.Paint r1 = r0.A07
            int r0 = r2.intValue()
            r1.setAlpha(r0)
            return
        L_0x0096:
            java.lang.Object r0 = r10.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r2 = r9.A01
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r2 = (org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText) r2
            android.graphics.Paint r1 = r2.A07
            goto L_0x02aa
        L_0x00a4:
            java.lang.Object r0 = r9.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.6o5 r1 = r0.A0f
            float r0 = X.C108985cd.A00(r10)
            r1.A00 = r0
            r1.A00()
            return
        L_0x00b4:
            java.lang.Object r3 = r9.A01
            X.5eR r3 = (X.C109945eR) r3
            float r2 = X.C108985cd.A00(r10)
            float r1 = r3.A06
            float r0 = r3.A0A
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A00 = r1
            float r1 = r3.A08
            float r0 = r3.A0D
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A04 = r1
            float r1 = r3.A07
            float r0 = r3.A0C
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            r3.A02 = r1
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r2)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.A0K = r0
            r3.postInvalidate()
            r3.invalidateOutline()
            return
        L_0x00ed:
            java.lang.Object r3 = r9.A01
            X.5eR r3 = (X.C109945eR) r3
            float r1 = X.C108985cd.A00(r10)
            int r0 = r3.A0E
            float r0 = (float) r0
            float r0 = r0 * r1
            float r2 = r3.A0A
            float r2 = r2 - r0
            float r1 = r3.A0B
            float r0 = r3.A01
            float r0 = X.C108945cZ.A00(r1, r0)
            float r2 = r2 - r0
            r3.A00 = r2
            r3.postInvalidate()
            r3.invalidateOutline()
            return
        L_0x010e:
            java.lang.Object r3 = r9.A01
            X.5eR r3 = (X.C109945eR) r3
            float r2 = X.C108985cd.A00(r10)
            r1 = 1075838976(0x40200000, float:2.5)
            float r1 = r1 * r2
            r0 = -1071644672(0xffffffffc0200000, float:-2.5)
            float r1 = r1 + r0
            r3.A03 = r1
            android.graphics.Bitmap r0 = r3.A0R
            int r0 = r0.getHeight()
            float r1 = (float) r0
            r0 = 1053273620(0x3ec7ae14, float:0.39)
            float r1 = r1 * r0
            float r1 = r1 * r2
            float r0 = r3.A0B
            float r0 = r0 - r1
            r3.A01 = r0
            float r0 = r3.A0C
            float r0 = r0 - r1
            r3.A02 = r0
            return
        L_0x0135:
            java.lang.Object r4 = r9.A01
            X.5eR r4 = (X.C109945eR) r4
            java.lang.Object r0 = r10.getAnimatedValue()
            int r3 = X.AnonymousClass000.A0M(r0)
            android.graphics.Paint r2 = r4.A0W
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r1)
            r2.setColorFilter(r0)
            r4.postInvalidate()
            r4.invalidateOutline()
            return
        L_0x0154:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            float r0 = X.C108985cd.A00(r10)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            return
        L_0x0163:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r10.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            int r0 = r0 << 24
            r1.setBackgroundColor(r0)
            return
        L_0x0175:
            java.lang.Object r0 = r9.A01
            X.6Jr r0 = (X.C121446Jr) r0
            X.AnonymousClass3MX.A1P(r10)
            int r1 = X.C72473Md.A02(r10)
            com.whatsapp.WaTextView r0 = r0.A09
            X.C108975cc.A0v(r0, r1)
            return
        L_0x0186:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2
            X.C18070vi.A0d(r10, r0)
            int r0 = X.C72473Md.A02(r10)
            X.C42491yG.A07(r1, r0)
            float r0 = r10.getAnimatedFraction()
            r1.setAlpha(r0)
            return
        L_0x019d:
            java.lang.Object r1 = r9.A01
            X.72I r1 = (X.AnonymousClass72I) r1
            r0 = 1
            float r0 = X.C72483Me.A00(r10, r0)
            X.AnonymousClass72I.A00(r1, r0)
            return
        L_0x01aa:
            java.lang.Object r1 = r9.A01
            X.72I r1 = (X.AnonymousClass72I) r1
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            int r0 = X.C72473Md.A02(r10)
            X.AnonymousClass72I.A01(r1, r0)
            return
        L_0x01ba:
            java.lang.Object r8 = r9.A01
            com.whatsapp.status.playback.widget.VoiceStatusContentView r8 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r8
            r0 = 1
            float r7 = X.C72483Me.A00(r10, r0)
            java.util.List r6 = r8.A0I
            java.util.List r5 = r8.A0G
            java.util.List r4 = r8.A0H
            r4.clear()
            int r3 = r5.size()
            r2 = 0
        L_0x01d1:
            if (r2 >= r3) goto L_0x01f8
            java.lang.Object r0 = r5.get(r2)
            float r1 = X.AnonymousClass000.A04(r0)
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x01f6
            java.lang.Object r0 = r6.get(r2)
            float r0 = X.AnonymousClass000.A04(r0)
        L_0x01e9:
            float r1 = r1 - r0
            float r1 = r1 * r7
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x01d1
        L_0x01f6:
            r0 = 0
            goto L_0x01e9
        L_0x01f8:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r1 = r8.A01
            if (r1 != 0) goto L_0x0203
            java.lang.String r0 = "voiceVisualizer"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0203:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03(r4, r0)
            return
        L_0x0209:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            android.view.ViewGroup r1 = r0.A07
            java.lang.Object r0 = r10.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setBackgroundColor(r0)
            return
        L_0x021b:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            int r0 = X.C72473Md.A02(r10)
            X.C42491yG.A07(r1, r0)
            return
        L_0x022b:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setCloseButtonAlpha(r0)
            return
        L_0x0239:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setMusicToolX(r0)
            return
        L_0x0247:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setMediaSettingsToolX(r0)
            return
        L_0x0255:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setUndoToolX(r0)
            return
        L_0x0263:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setCropToolX(r0)
            return
        L_0x0271:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setTextToolX(r0)
            return
        L_0x027f:
            java.lang.Object r0 = r9.A01
            X.6uj r0 = (X.C136986uj) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r1 = r0.A0I
            float r0 = X.C108985cd.A00(r10)
            r1.setShapeToolX(r0)
            return
        L_0x028d:
            java.lang.Object r2 = r9.A01
            X.6ov r2 = (X.C133536ov) r2
            r1 = 1
            float r0 = X.C72483Me.A00(r10, r1)
            r10.getCurrentPlayTime()
            r2.A01 = r1
            r2.A00 = r0
            return
        L_0x029e:
            java.lang.Object r2 = r9.A01
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r2 = (com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView) r2
            android.graphics.Paint r1 = r2.A0A
            java.lang.Object r0 = r10.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x02aa:
            int r0 = r0.intValue()
            r1.setAlpha(r0)
            r2.invalidate()
            return
        L_0x02b5:
            java.lang.Object r2 = r9.A01
            X.69G r2 = (X.AnonymousClass69G) r2
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            int r1 = X.C72473Md.A02(r10)
            android.graphics.drawable.Drawable r0 = r2.A05
            if (r0 == 0) goto L_0x02c8
            r0.setAlpha(r1)
        L_0x02c8:
            r2.invalidate()
            return
        L_0x02cc:
            java.lang.Object r1 = r9.A01
            X.1TI r1 = (X.AnonymousClass1TI) r1
            java.lang.Object r0 = r10.getAnimatedValue()
            r1.accept(r0)
            return
        L_0x02d8:
            java.lang.Object r1 = r9.A01
            com.whatsapp.components.SegmentedProgressBar r1 = (com.whatsapp.components.SegmentedProgressBar) r1
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            int r0 = X.C72473Md.A02(r10)
            r1.A03 = r0
            r1.postInvalidate()
            return
        L_0x02ea:
            java.lang.Object r1 = r9.A01
            X.72r r1 = (X.C1407172r) r1
            r0 = 1
            float r0 = X.C72483Me.A00(r10, r0)
            java.lang.String r0 = X.C1407172r.A00(r1, r0)
            X.C1407172r.A02(r1, r0)
            return
        L_0x02fb:
            java.lang.Object r3 = r9.A01
            X.741 r3 = (X.AnonymousClass741) r3
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            android.content.Context r0 = r3.A0E
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168722(0x7f070dd2, float:1.7951754E38)
            float r2 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Object r1 = r10.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r1, r0)
            float r0 = X.AnonymousClass000.A04(r1)
            float r2 = r2 / r0
            int r1 = (int) r2
            com.whatsapp.WaImageView r0 = r3.A0L
            r0.setPadding(r1, r1, r1, r1)
            return
        L_0x0325:
            java.lang.Object r1 = r9.A01
            X.73c r1 = (X.C1407973c) r1
            float r2 = X.C108985cd.A00(r10)
            android.view.View r0 = r1.A0D
            r0.setAlpha(r2)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r1.A0H
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            r0 = 0
            r1.A2E(r0, r2)
            return
        L_0x033c:
            java.lang.Object r0 = r9.A01
            X.73c r0 = (X.C1407973c) r0
            android.view.View r1 = r0.A0D
            float r0 = X.C108985cd.A00(r10)
            r1.setTranslationY(r0)
            return
        L_0x034a:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            float r0 = X.C108985cd.A00(r10)
            r1.setX(r0)
            return
        L_0x0356:
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r10.getAnimatedValue()
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 0
            r2.scrollTo(r1, r0)
            return
        L_0x0367:
            java.lang.Object r4 = r9.A01
            com.facebook.smartcapture.components.DarkenedFrameView r4 = (com.facebook.smartcapture.components.DarkenedFrameView) r4
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            android.graphics.RectF r3 = r4.A03
            java.lang.String r0 = "left"
            java.lang.Object r0 = r10.getAnimatedValue(r0)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r0, r6)
            float r5 = X.AnonymousClass000.A04(r0)
            java.lang.String r0 = "top"
            java.lang.Object r0 = r10.getAnimatedValue(r0)
            X.C18070vi.A0z(r0, r6)
            float r2 = X.AnonymousClass000.A04(r0)
            java.lang.String r0 = "right"
            java.lang.Object r0 = r10.getAnimatedValue(r0)
            X.C18070vi.A0z(r0, r6)
            float r1 = X.AnonymousClass000.A04(r0)
            java.lang.String r0 = "bottom"
            java.lang.Object r0 = r10.getAnimatedValue(r0)
            X.C18070vi.A0z(r0, r6)
            float r0 = X.AnonymousClass000.A04(r0)
            r3.set(r5, r2, r1, r0)
            android.graphics.Path r2 = r4.A02
            r2.reset()
            float r1 = r4.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r3, r1, r1, r0)
            r4.invalidate()
            return
        L_0x03ba:
            java.lang.Object r2 = r9.A01
            com.facebook.smartcapture.components.ContourView r2 = (com.facebook.smartcapture.components.ContourView) r2
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            int r1 = X.C72473Md.A02(r10)
            android.widget.ImageView r0 = r2.A08
            r0.setColorFilter(r1)
            android.widget.ImageView r0 = r2.A09
            r0.setColorFilter(r1)
            android.widget.ImageView r0 = r2.A06
            r0.setColorFilter(r1)
            android.widget.ImageView r0 = r2.A07
            r0.setColorFilter(r1)
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1411074h.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
