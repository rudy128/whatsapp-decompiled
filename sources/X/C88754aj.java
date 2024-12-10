package X;

import android.animation.ValueAnimator;

/* renamed from: X.4aj  reason: invalid class name and case insensitive filesystem */
public class C88754aj implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C88754aj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C88754aj(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.whatsapp.qrcode.QrEducationView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.3O5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: com.whatsapp.components.RoundCornerProgressBar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.3O5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.3O5} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r1 = r6.getAnimatedValue();
        X.C18070vi.A0z(r1, "null cannot be cast to non-null type kotlin.Float");
        r2.setAlpha(X.AnonymousClass000.A04(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r2.postInvalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        r2.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cd, code lost:
        X.C42491yG.A07(r1, X.C72473Md.A02(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01d5;
                case 1: goto L_0x01c9;
                case 2: goto L_0x002f;
                case 3: goto L_0x01b0;
                case 4: goto L_0x019e;
                case 5: goto L_0x0190;
                case 6: goto L_0x0187;
                case 7: goto L_0x0173;
                case 8: goto L_0x0161;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0143;
                case 12: goto L_0x012d;
                case 13: goto L_0x0115;
                case 14: goto L_0x0100;
                case 15: goto L_0x00d2;
                case 16: goto L_0x00f3;
                case 17: goto L_0x0014;
                case 18: goto L_0x00eb;
                case 19: goto L_0x00c5;
                case 20: goto L_0x00a5;
                case 21: goto L_0x0091;
                case 22: goto L_0x007f;
                case 23: goto L_0x005c;
                case 24: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            com.whatsapp.components.RoundCornerProgressBar r2 = (com.whatsapp.components.RoundCornerProgressBar) r2
            r0 = 1
            float r0 = X.C72483Me.A00(r6, r0)
            r2.A00 = r0
        L_0x0010:
            r2.postInvalidate()
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r5.A01
            X.3O5 r2 = (X.AnonymousClass3O5) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r1 = r6.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0013
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0013
            float r0 = r1.floatValue()
            r2.A00 = r0
            goto L_0x0010
        L_0x002f:
            java.lang.Object r2 = r5.A01
            X.4Pz r2 = (X.C86054Pz) r2
            r0 = 1
            float r1 = X.C72483Me.A00(r6, r0)
            java.lang.ref.WeakReference r0 = r2.A00
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0013
            r0.setAlpha(r1)
            return
        L_0x0046:
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C72473Md.A02(r6)
            r1.height = r0
            r2.requestLayout()
            return
        L_0x005c:
            java.lang.Object r1 = r5.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = (com.whatsapp.webpagepreview.WebPagePreviewView) r1
            java.lang.Object r0 = r6.getAnimatedValue()
            float r4 = X.AnonymousClass000.A04(r0)
            com.facebook.shimmer.ShimmerFrameLayout r3 = r1.A0B
            X.BVM r2 = new X.BVM
            r2.<init>()
            r1 = 0
            X.CUR r0 = r2.A00
            r0.A0G = r1
            r2.A01(r4)
            X.CUR r0 = r2.A00()
            r3.A05(r0)
            return
        L_0x007f:
            java.lang.Object r1 = r5.A01
            com.whatsapp.storage.SizeTickerView r1 = (com.whatsapp.storage.SizeTickerView) r1
            java.lang.Object r0 = r6.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A02 = r0
            r1.setTextColor(r0)
            return
        L_0x0091:
            java.lang.Object r1 = r5.A01
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            java.lang.Object r0 = r6.getAnimatedValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setChipBackgroundColor(r0)
            return
        L_0x00a5:
            java.lang.Object r2 = r5.A01
            com.whatsapp.qrcode.QrEducationView r2 = (com.whatsapp.qrcode.QrEducationView) r2
            java.lang.Object r0 = r6.getAnimatedValue()
            float r1 = X.AnonymousClass000.A04(r0)
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            r0 = 1
            r2.A0A = r0
        L_0x00ba:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x00c1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
        L_0x00c1:
            r2.A00 = r1
            goto L_0x016f
        L_0x00c5:
            java.lang.Object r1 = r5.A01
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r1
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            android.view.View r2 = r1.A00
            if (r2 != 0) goto L_0x00da
            return
        L_0x00d2:
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
        L_0x00da:
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r1, r0)
            float r0 = X.AnonymousClass000.A04(r1)
            r2.setAlpha(r0)
            return
        L_0x00eb:
            java.lang.Object r0 = r5.A01
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = (com.whatsapp.payments.ui.widget.PaymentAmountInputField) r0
            r0.A0L(r6)
            return
        L_0x00f3:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            float r0 = X.C72483Me.A00(r6, r0)
            r1.setTranslationX(r0)
            return
        L_0x0100:
            java.lang.Object r2 = r5.A01
            X.3uH r2 = (X.C79053uH) r2
            java.lang.Object r0 = r6.getAnimatedValue()
            float r1 = X.AnonymousClass000.A04(r0)
            android.view.ViewGroup r0 = r2.A0M
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0115:
            java.lang.Object r1 = r5.A01
            X.4MN r1 = (X.AnonymousClass4MN) r1
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            int r2 = X.C72473Md.A02(r6)
            X.3tq r1 = r1.A00
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
        L_0x012d:
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r6.getAnimatedValue()
            int r1 = X.AnonymousClass000.A0M(r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            r2.setLayoutParams(r0)
            return
        L_0x0143:
            java.lang.Object r0 = r5.A01
            X.4Ov r0 = (X.C85814Ov) r0
            android.view.View r2 = r0.A02
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x015f
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.getMarginStart()
        L_0x0157:
            int r0 = X.C72473Md.A02(r6)
            X.C27641Ww.A03(r2, r1, r0)
            return
        L_0x015f:
            r1 = 0
            goto L_0x0157
        L_0x0161:
            java.lang.Object r2 = r5.A01
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r2 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            int r0 = X.C72473Md.A02(r6)
            r2.A01 = r0
        L_0x016f:
            r2.invalidate()
            return
        L_0x0173:
            java.lang.Object r2 = r5.A01
            X.1Di r2 = (X.C22821Di) r2
            X.C18070vi.A0h(r2, r6)
            java.lang.Object r1 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r1, r0)
            r2.invoke(r1)
            return
        L_0x0187:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            goto L_0x01cd
        L_0x0190:
            java.lang.Object r2 = r5.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 0
            r0 = 1
            float r0 = X.C72483Me.A00(r6, r0)
            r2.setTextSize(r1, r0)
            return
        L_0x019e:
            java.lang.Object r1 = r5.A01
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r1
            java.lang.Object r0 = r6.getAnimatedValue()
            float r0 = X.AnonymousClass000.A04(r0)
            r1.A00 = r0
            r1.invalidate()
            return
        L_0x01b0:
            java.lang.Object r3 = r5.A01
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r3 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r3
            android.graphics.Paint r2 = r3.A04
            java.lang.Object r0 = r6.getAnimatedValue()
            float r1 = X.AnonymousClass000.A04(r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.setAlpha(r0)
            r3.invalidate()
            return
        L_0x01c9:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
        L_0x01cd:
            int r0 = X.C72473Md.A02(r6)
            X.C42491yG.A07(r1, r0)
            return
        L_0x01d5:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r6.getAnimatedValue()
            float r0 = X.AnonymousClass000.A04(r0)
            r1.setX(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88754aj.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
