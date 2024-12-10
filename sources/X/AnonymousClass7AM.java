package X;

/* renamed from: X.7AM  reason: invalid class name */
public class AnonymousClass7AM implements C22851Dl {
    public final int A00;
    public final Object A01;

    public AnonymousClass7AM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new AnonymousClass7AM(r1, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0204, code lost:
        if (r2 != 2) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0583, code lost:
        if (r7.A0J.A01() != 8) goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0668, code lost:
        if (X.C72463Mc.A1O(r3.A0t.A0A) != false) goto L_0x066a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0680, code lost:
        r0.invoke();
        r12.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0686, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0703, code lost:
        if (r1 == false) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0134, code lost:
        if (r2.A09 == false) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0645;
                case 1: goto L_0x0011;
                case 2: goto L_0x0633;
                case 3: goto L_0x05fa;
                case 4: goto L_0x05e6;
                case 5: goto L_0x05b4;
                case 6: goto L_0x051c;
                case 7: goto L_0x0759;
                case 8: goto L_0x074d;
                case 9: goto L_0x0728;
                case 10: goto L_0x071f;
                case 11: goto L_0x0710;
                case 12: goto L_0x06f4;
                case 13: goto L_0x02c6;
                case 14: goto L_0x01c9;
                case 15: goto L_0x06db;
                case 16: goto L_0x01a1;
                case 17: goto L_0x00f9;
                case 18: goto L_0x0095;
                case 19: goto L_0x004f;
                case 20: goto L_0x002f;
                case 21: goto L_0x0012;
                case 22: goto L_0x0687;
                case 23: goto L_0x0678;
                case 24: goto L_0x066f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A01
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r2 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r2
            r1 = 0
            android.content.Intent r0 = com.whatsapp.webview.ui.WaInAppBrowsingActivity.A0Q(r2)
            r2.A4f(r1, r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r2 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            boolean r0 = X.AnonymousClass000.A1Y(r12)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0E
            if (r1 == 0) goto L_0x0011
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            X.73c r0 = r2.A0K
            if (r0 == 0) goto L_0x0011
            r0.A04()
            X.73c r0 = r2.A0K
            goto L_0x004b
        L_0x002f:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r3 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r3
            boolean r2 = X.AnonymousClass000.A1Y(r12)
            X.1bI r1 = r3.A0Z
            if (r1 == 0) goto L_0x0011
            int r0 = X.C72453Mb.A07(r2)
            r1.A04(r0)
            X.73c r0 = r3.A0K
            if (r0 == 0) goto L_0x0011
            r0.A07 = r2
            r0.A04()
        L_0x004b:
            r0.A05()
            return
        L_0x004f:
            java.lang.Object r6 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r6 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r6
            boolean r5 = X.AnonymousClass000.A1Y(r12)
            android.widget.Space r0 = r6.A0C
            r4 = 0
            if (r0 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x0093
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131165603(0x7f0701a3, float:1.7945428E38)
            int r3 = r1.getDimensionPixelSize(r0)
        L_0x0069:
            android.widget.Space r2 = r6.A0C
            r1 = -1
            X.1sZ r0 = new X.1sZ
            r0.<init>(r1, r3)
            r2.setLayoutParams(r0)
        L_0x0074:
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r6.A0S
            if (r1 == 0) goto L_0x007f
            int r0 = X.C72453Mb.A07(r5)
            r1.setVisibility(r0)
        L_0x007f:
            X.73c r1 = r6.A0K
            if (r1 == 0) goto L_0x0011
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r6.A0S
            if (r0 == 0) goto L_0x008a
            if (r5 == 0) goto L_0x008a
            r4 = 1
        L_0x008a:
            r1.A08 = r4
            r1.A04()
            r1.A05()
            return
        L_0x0093:
            r3 = 0
            goto L_0x0069
        L_0x0095:
            java.lang.Object r5 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            boolean r2 = X.AnonymousClass000.A1Y(r12)
            android.view.View r0 = r5.A09
            if (r0 == 0) goto L_0x0011
            X.73c r0 = r5.A0K
            if (r0 == 0) goto L_0x0011
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r5.A0S
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 updateUiForAVSwitch "
            X.C17900vP.A0n(r0, r1, r2)
            android.view.View r0 = r5.A09
            int r0 = r0.getVisibility()
            r4 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r2 == r0) goto L_0x0011
            android.view.View r0 = r5.A09
            if (r2 != 0) goto L_0x00c6
            r1 = 8
        L_0x00c6:
            r0.setVisibility(r1)
            X.73c r0 = r5.A0K
            r0.A0B = r2
            r0.A04()
            r0.A05()
            X.11C r0 = r5.A0V
            boolean r0 = X.C108965cb.A1X(r0)
            if (r0 == 0) goto L_0x00f1
            if (r2 == 0) goto L_0x00f1
            X.73c r1 = r5.A0K
            r0 = 4
            X.C1407973c.A01(r1, r0)
            android.view.View r3 = r5.A09
            r0 = 27
            X.7Qp r2 = new X.7Qp
            r2.<init>(r5, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
        L_0x00f1:
            X.6lg r0 = r5.A0b
            if (r0 == 0) goto L_0x0011
            r0.A00(r4)
            return
        L_0x00f9:
            java.lang.Object r5 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            boolean r3 = X.AnonymousClass000.A1Y(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 isInLobbyChanged "
            X.C17900vP.A0n(r0, r1, r3)
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x0129
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0129
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
            if (r3 == 0) goto L_0x0192
            int r0 = r5.A05
        L_0x0122:
            r1.setBackgroundColor(r0)
            r0 = 0
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A04(r5, r0)
        L_0x0129:
            X.73c r2 = r5.A0K
            if (r2 == 0) goto L_0x013a
            r2.A0A = r3
            if (r3 == 0) goto L_0x0136
            boolean r1 = r2.A09
            r0 = 3
            if (r1 != 0) goto L_0x0137
        L_0x0136:
            r0 = 4
        L_0x0137:
            X.C1407973c.A01(r2, r0)
        L_0x013a:
            androidx.core.widget.NestedScrollView r1 = r5.A0D
            if (r1 == 0) goto L_0x0142
            r0 = 0
            r1.scrollTo(r0, r0)
        L_0x0142:
            if (r3 != 0) goto L_0x015a
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r4 = r5.A0S
            if (r4 == 0) goto L_0x015a
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0M
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x015a
            r0 = 25
            X.7Qp r2 = new X.7Qp
            r2.<init>(r5, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r4.postDelayed(r2, r0)
        L_0x015a:
            X.6lg r1 = r5.A0b
            if (r1 == 0) goto L_0x0011
            r0 = 1
            r1.A00(r0)
            X.6lg r4 = r5.A0b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/onIsInLobbyChanged/isInLobby "
            X.C17900vP.A0n(r0, r1, r3)
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r4.A00
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r2)
            if (r1 == 0) goto L_0x0195
            boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x0195
            boolean r0 = r1.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0195
            if (r3 != 0) goto L_0x0195
            android.view.View r3 = r2.A0C
            if (r3 == 0) goto L_0x0195
            r0 = 23
            X.7Qp r2 = new X.7Qp
            r2.<init>(r4, r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0192:
            int r0 = r5.A04
            goto L_0x0122
        L_0x0195:
            android.view.View r0 = r2.A0C
            if (r0 != 0) goto L_0x0011
            boolean r1 = r2.A2D
            java.lang.String r0 = "e2eeContainer cannot be null when call controls m1 is disabled"
            X.C17960vV.A0F(r1, r0)
            return
        L_0x01a1:
            java.lang.Object r2 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            boolean r4 = X.AnonymousClass000.A1Y(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 onBottomSheetHidableChanged "
            X.C17900vP.A0n(r0, r1, r4)
            X.73c r3 = r2.A0K
            if (r3 == 0) goto L_0x0011
            if (r4 != 0) goto L_0x01c3
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A0G
            int r1 = r2.A0J
            r0 = 5
            if (r1 != r0) goto L_0x01c3
            r0 = 4
            r2.A0W(r0)
        L_0x01c3:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            r0.A0d(r4)
            return
        L_0x01c9:
            java.lang.Object r4 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r4
            X.6zf r12 = (X.C139926zf) r12
            X.73c r3 = r4.A0K
            if (r3 == 0) goto L_0x01e1
            int r1 = r12.A00
            r0 = 2
            r5 = 1
            boolean r6 = X.AnonymousClass000.A1T(r1, r0)
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0213
            if (r6 != 0) goto L_0x0213
        L_0x01e1:
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r2 = r4.A0M
            r2.A00 = r12
            X.8yP r0 = r2.A07
            X.4Sa r0 = r0.A07()
            boolean r1 = com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel.A03(r0, r2)
            X.1DT r0 = r2.A03
            X.C108995ce.A12(r0, r1)
            com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r3 = r4.A0N
            android.content.Context r0 = r4.A14()
            int r2 = X.C72453Mb.A08(r0)
            int r1 = r12.A00
            r0 = 2
            if (r1 != r0) goto L_0x0206
            r1 = 1
            if (r2 == r0) goto L_0x0207
        L_0x0206:
            r1 = 0
        L_0x0207:
            int r0 = r3.A00
            if (r0 == r1) goto L_0x0011
            r3.A00 = r1
            X.8yP r0 = r3.A02
            X.AnonymousClass3VX.A00(r0, r3)
            return
        L_0x0213:
            android.animation.ValueAnimator r0 = r3.A03
            r1 = 0
            if (r0 == 0) goto L_0x021d
            r0.cancel()
            r3.A03 = r1
        L_0x021d:
            android.animation.ValueAnimator r0 = r3.A02
            if (r0 == 0) goto L_0x0226
            r0.cancel()
            r3.A02 = r1
        L_0x0226:
            android.view.View r2 = r3.A0D
            r2.clearAnimation()
            boolean r0 = r3.A06
            if (r6 == 0) goto L_0x0285
            if (r0 == 0) goto L_0x0234
            X.C1407973c.A00(r1, r3)
        L_0x0234:
            android.graphics.Rect r0 = r12.A01
            X.C17960vV.A07(r0)
            int r6 = r0.bottom
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165606(0x7f0701a6, float:1.7945434E38)
            int r1 = X.AnonymousClass3MX.A00(r1, r0, r6)
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            int r0 = r0 - r1
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.1qK r1 = (X.C37891qK) r1
            r1.height = r0
            r0 = 80
            r1.A02 = r0
            r2.setLayoutParams(r1)
            r0 = 0
            r2.setTranslationY(r0)
            r2.requestLayout()
            X.C1407973c.A03(r3, r5)
        L_0x026a:
            android.view.View r5 = r3.A0E
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            boolean r1 = r3.A06
            r0 = -2
            if (r1 != 0) goto L_0x0276
            r0 = -1
        L_0x0276:
            r2.height = r0
            r5.setLayoutParams(r2)
            r5.requestLayout()
            r0 = 200(0xc8, double:9.9E-322)
            X.C1407973c.A02(r3, r0)
            goto L_0x01e1
        L_0x0285:
            if (r0 != 0) goto L_0x028c
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            X.C1407973c.A00(r0, r3)
        L_0x028c:
            r3.A04()
            r3.A05()
            r0 = 0
            r2.setVisibility(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r3.A0H
            X.6lg r0 = r1.A0b
            if (r0 == 0) goto L_0x029f
            r0.A00(r5)
        L_0x029f:
            r0 = 1065353216(0x3f800000, float:1.0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A05(r1, r0)
            r2.setAlpha(r0)
            int r2 = r3.A01
            if (r2 == 0) goto L_0x026a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController restorePendingState "
            X.C17900vP.A0j(r0, r1, r2)
            int r1 = r3.A01
            r0 = 5
            if (r1 != r0) goto L_0x02bd
            r0 = 4
            r3.A01 = r0
            r1 = 4
        L_0x02bd:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            r0.A0W(r1)
            r0 = 0
            r3.A01 = r0
            goto L_0x026a
        L_0x02c6:
            java.lang.Object r2 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.6pI r12 = (X.AnonymousClass6pI) r12
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x02d9
            boolean r0 = X.AnonymousClass4Yv.A02(r0)
            if (r0 == 0) goto L_0x02d9
            return
        L_0x02d9:
            android.widget.FrameLayout r0 = r2.A0B
            if (r0 == 0) goto L_0x0011
            X.6lg r0 = r2.A0b
            if (r0 == 0) goto L_0x0011
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 setCallControlButtons "
            r1.append(r0)
            int r7 = r12.A01
            X.C17900vP.A0o(r1, r7)
            android.widget.FrameLayout r0 = r2.A0B
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r2.A0B
            java.lang.Object r0 = r0.getTag()
            int r5 = r12.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.C42171xk.A00(r0, r3)
            r4 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0376
            android.widget.FrameLayout r0 = r2.A0B
            r0.setFocusable(r4)
            android.widget.FrameLayout r1 = r2.A0B
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r2.A0B
            android.view.ViewParent r0 = r0.getParent()
            r0.requestLayout()
            boolean r6 = X.AnonymousClass000.A1T(r5, r9)
            android.view.View r1 = r2.A0A
            r0 = 2131428655(0x7f0b052f, float:1.847896E38)
            if (r6 == 0) goto L_0x032f
            r0 = 2131428656(0x7f0b0530, float:1.8478963E38)
        L_0x032f:
            android.widget.FrameLayout r0 = X.C108945cZ.A0P(r1, r0)
            r2.A0B = r0
            android.view.View r1 = r2.A0A
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r0)
            android.view.View r0 = r2.A08
            X.C17960vV.A05(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.1sZ r1 = (X.C39151sZ) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x034f
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x034f:
            r1.A01 = r0
            android.view.View r0 = r2.A08
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setTag(r3)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setFocusable(r9)
            android.widget.FrameLayout r0 = r2.A0B
            r0.setVisibility(r4)
            X.C17960vV.A05(r5)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.1sZ r3 = (X.C39151sZ) r3
            if (r6 == 0) goto L_0x0382
            r0 = 0
        L_0x0371:
            r3.A0Y = r0
            r5.setLayoutParams(r3)
        L_0x0376:
            r1 = 4
            r10 = 3
            r5 = 2
            if (r7 == r9) goto L_0x0392
            if (r7 == r5) goto L_0x038e
            if (r7 == r10) goto L_0x0396
            if (r7 == r1) goto L_0x0392
            return
        L_0x0382:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r2)
            r0 = 2131169251(0x7f070fe3, float:1.7952827E38)
            int r0 = X.AnonymousClass3MW.A01(r1, r0)
            goto L_0x0371
        L_0x038e:
            r6 = 2131627481(0x7f0e0dd9, float:1.8882228E38)
            goto L_0x0399
        L_0x0392:
            r6 = 2131627482(0x7f0e0dda, float:1.888223E38)
            goto L_0x0399
        L_0x0396:
            r6 = 2131624440(0x7f0e01f8, float:1.887606E38)
        L_0x0399:
            android.view.LayoutInflater r3 = r2.A16()
            android.widget.FrameLayout r0 = r2.A0B
            android.view.View r3 = r3.inflate(r6, r0, r4)
            r3.setTag(r12)
            r8 = 17
            r0 = -1
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r0, r0, r8)
            android.widget.FrameLayout r0 = r2.A0B
            r0.addView(r3, r6)
            if (r7 == r9) goto L_0x0450
            if (r7 == r1) goto L_0x0450
            if (r7 == r10) goto L_0x0450
            r0 = 0
            r2.A0G = r0
            r2.A0F = r0
            X.6oo r6 = r12.A02
            X.C17960vV.A07(r6)
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.calling.views.VoipCallFooter r5 = (com.whatsapp.calling.views.VoipCallFooter) r5
            r2.A0T = r5
            X.1FL r3 = r2.A1B()
            boolean r0 = r3 instanceof X.AnonymousClass8B9
            if (r0 == 0) goto L_0x0447
            X.8B9 r3 = (X.AnonymousClass8B9) r3
            r1 = 22
            X.78M r0 = new X.78M
            r0.<init>(r3, r5, r1)
            r5.setMuteButtonClickListener(r0)
            r1 = 40
            X.78L r0 = new X.78L
            r0.<init>(r3, r1)
            r5.setToggleVideoButtonClickListener(r0)
            r1 = 23
            X.78M r0 = new X.78M
            r0.<init>(r3, r5, r1)
            r5.setSpeakerButtonClickListener(r0)
            r1 = 24
            X.78M r0 = new X.78M
            r0.<init>(r3, r5, r1)
            r5.setBluetoothButtonClickListener(r0)
            r1 = 41
            X.78L r0 = new X.78L
            r0.<init>(r3, r1)
            r5.setEndCallButtonClickListener(r0)
            r1 = 42
            X.78L r0 = new X.78L
            r0.<init>(r3, r1)
            r5.A01 = r0
            r1 = 25
            X.78M r0 = new X.78M
            r0.<init>(r3, r5, r1)
            r5.A00 = r0
            boolean r1 = r6.A01
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0T
            if (r1 == 0) goto L_0x0443
            r0.A03()
        L_0x0425:
            com.whatsapp.calling.views.VoipCallFooter r0 = r2.A0T
            android.view.View r0 = r0.A0F
            r0.setVisibility(r4)
            X.6lg r0 = r2.A0b
            if (r0 == 0) goto L_0x043b
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r0)
            if (r0 == 0) goto L_0x043b
            r3.CQl(r0)
        L_0x043b:
            com.whatsapp.calling.views.VoipCallFooter r1 = r2.A0T
            float r0 = r2.A00
            r1.A04(r0)
            return
        L_0x0443:
            r0.A02()
            goto L_0x0425
        L_0x0447:
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2/failed to get voip activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r2.A29()
            goto L_0x043b
        L_0x0450:
            r0 = 2131432938(0x7f0b15ea, float:1.8487648E38)
            android.view.View r0 = r3.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0F = r0
            r0 = 2131433997(0x7f0b1a0d, float:1.8489795E38)
            android.view.View r0 = r3.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r2.A0G = r0
            r6 = 13
            r3 = 16
            X.C29261bv.A09(r0, r6, r3, r9, r5)
            com.google.android.material.button.MaterialButton r0 = r2.A0F
            X.C29261bv.A09(r0, r6, r3, r9, r5)
            X.6ob r0 = r12.A03
            X.C17960vV.A07(r0)
            boolean r3 = r0.A00
            X.6lg r0 = r2.A0b
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            boolean r6 = com.whatsapp.voipcalling.VoipActivityV2.A26(r0)
            r0 = 3
            r10 = 1
            if (r7 == r0) goto L_0x0489
            r10 = 0
            if (r7 != r1) goto L_0x0489
            r4 = 1
        L_0x0489:
            com.google.android.material.button.MaterialButton r0 = r2.A0G
            if (r0 == 0) goto L_0x0011
            com.google.android.material.button.MaterialButton r1 = r2.A0F
            if (r1 == 0) goto L_0x0011
            r0 = 2131898192(0x7f122f50, float:1.9431295E38)
            if (r10 == 0) goto L_0x0499
            r0 = 2131887656(0x7f120628, float:1.9409925E38)
        L_0x0499:
            r1.setText(r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0F
            r0 = 47
            X.AnonymousClass78L.A00(r1, r2, r0)
            com.google.android.material.button.MaterialButton r1 = r2.A0G
            r0 = 0
            r1.setIcon(r0)
            com.google.android.material.button.MaterialButton r0 = r2.A0G
            r0.setMaxLines(r5)
            com.google.android.material.button.MaterialButton r1 = r2.A0G
            if (r3 == 0) goto L_0x04c3
            r0 = 2131898171(0x7f122f3b, float:1.9431252E38)
        L_0x04b5:
            r1.setText(r0)
        L_0x04b8:
            com.google.android.material.button.MaterialButton r1 = r2.A0G
            X.AFG r0 = new X.AFG
            r0.<init>(r2, r9, r4, r10)
            r1.setOnClickListener(r0)
            return
        L_0x04c3:
            if (r6 == 0) goto L_0x04c9
            r0 = 2131898191(0x7f122f4f, float:1.9431293E38)
            goto L_0x04b5
        L_0x04c9:
            r1.setMaxLines(r9)
            com.google.android.material.button.MaterialButton r8 = r2.A0G
            r0 = 2131899582(0x7f1234be, float:1.9434114E38)
            java.lang.String r7 = r2.A1H(r0)
            r1 = 2130971762(0x7f040c72, float:1.7552272E38)
            android.app.Dialog r5 = r2.A03
            if (r5 == 0) goto L_0x04b8
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x04b8
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r0.resolveAttribute(r1, r3, r9)
            android.content.Context r1 = r5.getContext()
            int r0 = r3.resourceId
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            android.graphics.drawable.Drawable r6 = X.C27831Xu.A02(r0)
            android.content.Context r5 = r5.getContext()
            X.1FL r3 = r2.A1B()
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            int r0 = X.AnonymousClass3MZ.A02(r3, r5, r1, r0)
            X.C27831Xu.A0C(r6, r0)
            r8.setText(r7)
            r8.setIcon(r6)
            goto L_0x04b8
        L_0x051c:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.6sW r12 = (X.C135636sW) r12
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0531
            android.view.ViewGroup r0 = r3.A0F
            if (r0 == 0) goto L_0x0531
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0531
            return
        L_0x0531:
            com.whatsapp.calling.CallDetailsLayout r1 = r3.A0W
            if (r1 != 0) goto L_0x053b
            java.lang.String r0 = "voipActivityV2/getCallHeader/ call details should not be null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x053b:
            X.4ZN r0 = r12.A02
            if (r0 == 0) goto L_0x054d
            java.lang.CharSequence r0 = r0.A03(r3)
            java.lang.String r2 = r0.toString()
            X.1xh r1 = r1.A06
            r0 = 0
            r1.A0B(r0, r2)
        L_0x054d:
            X.4ZN r0 = r12.A01
            if (r0 == 0) goto L_0x0571
            java.lang.CharSequence r0 = r0.A03(r3)
            java.lang.String r1 = r0.toString()
        L_0x0559:
            com.whatsapp.calling.CallDetailsLayout r0 = r3.A0W
            r0.A05(r1, r1)
            com.whatsapp.calling.CallDetailsLayout r7 = r3.A0W
            X.4ZN r6 = r12.A00
            r1 = 8
            X.1bI r0 = r7.A0K
            if (r6 != 0) goto L_0x0573
            r0.A04(r1)
            X.1bI r0 = r7.A0J
            r0.A04(r1)
            return
        L_0x0571:
            r1 = 0
            goto L_0x0559
        L_0x0573:
            int r0 = r0.A01()
            r5 = 0
            if (r0 != r1) goto L_0x0585
            X.1bI r0 = r7.A0J
            int r1 = r0.A01()
            r0 = 8
            r2 = 1
            if (r1 == r0) goto L_0x0586
        L_0x0585:
            r2 = 0
        L_0x0586:
            X.1bI r4 = r7.A0K
            r4.A04(r5)
            X.1bI r3 = r7.A0J
            android.view.View r1 = X.AnonymousClass3MY.A0I(r3, r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r7.getContext()
            X.AnonymousClass4ZN.A01(r0, r1, r6)
            if (r2 == 0) goto L_0x0011
            android.view.animation.AlphaAnimation r2 = X.C72463Mc.A0Q()
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            android.view.View r0 = r4.A02()
            r0.startAnimation(r2)
            android.view.View r0 = r3.A02()
            r0.startAnimation(r2)
            return
        L_0x05b4:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            X.6zS r12 = (X.C139796zS) r12
            if (r12 == 0) goto L_0x0011
            X.6RC r1 = r12.A00
            X.6RC r0 = X.AnonymousClass6RC.SCREEN_SHARING
            if (r1 == r0) goto L_0x05d2
            X.6RC r0 = X.AnonymousClass6RC.MORE_MENU
            if (r1 == r0) goto L_0x05d2
            X.6RC r0 = X.AnonymousClass6RC.ADD_PARTICIPANTS
            if (r1 == r0) goto L_0x05d2
            X.6RC r0 = X.AnonymousClass6RC.AR_EFFECTS
            if (r1 == r0) goto L_0x05d2
            X.6RC r0 = X.AnonymousClass6RC.AR_EFFECTS_PIP
            if (r1 != r0) goto L_0x0011
        L_0x05d2:
            java.lang.Integer r2 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r2 != r0) goto L_0x05de
            android.os.Handler r1 = r3.A05
            r0 = 3
            r1.removeMessages(r0)
        L_0x05de:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x0011
            com.whatsapp.voipcalling.VoipActivityV2.A1a(r3)
            return
        L_0x05e6:
            java.lang.Object r1 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.util.List r12 = (java.util.List) r12
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r1)
            if (r0 == 0) goto L_0x0011
            X.8Au r1 = r1.A0p
            boolean r0 = r0.videoEnabled
            r1.CN2(r12, r0)
            return
        L_0x05fa:
            java.lang.Object r2 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            X.6Qw r12 = (X.C122566Qw) r12
            int r1 = r12.ordinal()
            r7 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0763
            if (r1 == r7) goto L_0x0766
            r0 = 2
            if (r1 == r0) goto L_0x0611
            r0 = 3
            if (r1 == r0) goto L_0x0611
            return
        L_0x0611:
            X.73p r3 = r2.A0k
            if (r3 == 0) goto L_0x0011
            X.6Qw r0 = X.C122566Qw.SHOW_FOCUS
            if (r12 != r0) goto L_0x062e
            r4 = 250(0xfa, double:1.235E-321)
            r1 = 1
        L_0x061c:
            X.1bX r2 = new X.1bX
            r2.<init>()
            X.1bZ r0 = new X.1bZ
            r0.<init>(r1)
            r2.A0a(r0)
            r6 = 0
            X.C1409273p.A00(r2, r3, r4, r6, r7)
            return
        L_0x062e:
            r7 = 0
            r4 = 200(0xc8, double:9.9E-322)
            r1 = 2
            goto L_0x061c
        L_0x0633:
            java.lang.Object r0 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            X.8Au r1 = r0.A0p
            if (r1 == 0) goto L_0x0011
            boolean r0 = r12.booleanValue()
            r1.CJG(r0)
            return
        L_0x0645:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            X.A99 r1 = r3.A0u
            if (r1 == 0) goto L_0x0655
            boolean r0 = r12.booleanValue()
            r1.A1X = r0
        L_0x0655:
            X.8At r2 = r3.A0n
            if (r2 == 0) goto L_0x0011
            boolean r0 = r12.booleanValue()
            if (r0 != 0) goto L_0x066a
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r3.A0t
            X.1vp r0 = r0.A0A
            boolean r1 = X.C72463Mc.A1O(r0)
            r0 = 0
            if (r1 == 0) goto L_0x066b
        L_0x066a:
            r0 = 1
        L_0x066b:
            r2.C50(r0)
            return
        L_0x066f:
            java.lang.Object r0 = r11.A01
            X.7NX r0 = (X.AnonymousClass7NX) r0
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            X.0vk r0 = r0.A03
            goto L_0x0680
        L_0x0678:
            java.lang.Object r0 = r11.A01
            X.7NX r0 = (X.AnonymousClass7NX) r0
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            X.0vk r0 = r0.A04
        L_0x0680:
            r0.invoke()
            r12.dismiss()
            return
        L_0x0687:
            java.lang.Object r3 = r11.A01
            com.whatsapp.wabloks.base.BkFragment r3 = (com.whatsapp.wabloks.base.BkFragment) r3
            X.9f9 r12 = (X.C187029f9) r12
            int r2 = r12.A00
            r0 = 5
            if (r2 != r0) goto L_0x06cc
            X.CvV r2 = r12.A01
            com.facebook.rendercore.RootHostView r1 = r3.A00
            r0 = 0
            r1.setVisibility(r0)
            X.CmQ r0 = r3.A01
            if (r0 == 0) goto L_0x06a1
            r0.A02()
        L_0x06a1:
            java.util.Map r1 = r3.A06
            X.CXY r0 = r3.A03
            X.CmQ r0 = X.C181119Pf.A00(r3, r2, r0, r1)
            r3.A01 = r0
            X.1FL r1 = r3.A1B()
            X.01E r1 = (X.AnonymousClass01E) r1
            if (r1 == 0) goto L_0x06ba
            android.content.res.Configuration r0 = X.C108965cb.A03(r1)
            r1.onConfigurationChanged(r0)
        L_0x06ba:
            X.CmQ r1 = r3.A01
            com.facebook.rendercore.RootHostView r0 = r3.A00
            r1.A03(r0)
            r3.A28()
            java.lang.Integer r1 = com.whatsapp.wabloks.base.BkFragment.A09
            java.lang.String r0 = "END_RENDER_SUCCESS"
            r3.A29(r1, r0)
            return
        L_0x06cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "received unsuccessful status: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x06db:
            java.lang.Object r1 = r11.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r1
            java.util.List r12 = (java.util.List) r12
            X.1FL r0 = r1.A1B()
            if (r0 == 0) goto L_0x06ee
            boolean r0 = X.AnonymousClass4Yv.A02(r0)
            if (r0 == 0) goto L_0x06ee
            return
        L_0x06ee:
            X.3WN r0 = r1.A0L
            r0.A0W(r12)
            return
        L_0x06f4:
            java.lang.Object r2 = r11.A01
            X.73c r2 = (X.C1407973c) r2
            boolean r1 = X.AnonymousClass000.A1Y(r12)
            r2.A09 = r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0705
            r0 = 3
            if (r1 != 0) goto L_0x0706
        L_0x0705:
            r0 = 4
        L_0x0706:
            X.C1407973c.A01(r2, r0)
            r2.A04()
            r2.A05()
            return
        L_0x0710:
            java.lang.Object r1 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r0 = X.AnonymousClass000.A1Y(r12)
            com.whatsapp.voipcalling.VoipActivityV2.A1n(r1, r0)
            com.whatsapp.voipcalling.VoipActivityV2.A1c(r1)
            return
        L_0x071f:
            java.lang.Object r1 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r0 = 1
            com.whatsapp.voipcalling.VoipActivityV2.A29(r1, r0)
            return
        L_0x0728:
            java.lang.Object r3 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r3.A0g
            if (r2 == 0) goto L_0x073f
            boolean r1 = r12.booleanValue()
            boolean r0 = r2.A0G
            if (r0 == r1) goto L_0x073f
            r2.A0G = r1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0D(r2)
        L_0x073f:
            X.00H r0 = r3.A1n
            java.lang.Object r0 = r0.get()
            X.6kZ r0 = (X.C131136kZ) r0
            X.1G4 r0 = r0.A0I
            r0.setValue(r12)
            return
        L_0x074d:
            java.lang.Object r1 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            int r0 = X.AnonymousClass000.A0M(r12)
            com.whatsapp.voipcalling.VoipActivityV2.A1f(r1, r0)
            return
        L_0x0759:
            java.lang.Object r0 = r11.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.util.Pair r12 = (android.util.Pair) r12
            r0.A4n(r12)
            return
        L_0x0763:
            X.6Qg r0 = X.C122436Qg.CAMERA_SWITCH
            goto L_0x0768
        L_0x0766:
            X.6Qg r0 = X.C122436Qg.AR_EFFECTS
        L_0x0768:
            com.whatsapp.voipcalling.VoipActivityV2.A18(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AM.Bo9(java.lang.Object):void");
    }
}
