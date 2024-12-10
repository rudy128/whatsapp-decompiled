package X;

import android.view.ViewTreeObserver;

/* renamed from: X.793  reason: invalid class name */
public class AnonymousClass793 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass793(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass793(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03bc, code lost:
        if (r0.isShowing() != true) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0555, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0558, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0573, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x059c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x059e, code lost:
        r0.removeOnGlobalLayoutListener(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r0 = "cameraView";
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x05ae;
                case 1: goto L_0x05bb;
                case 2: goto L_0x002e;
                case 3: goto L_0x0052;
                case 4: goto L_0x0083;
                case 5: goto L_0x003f;
                case 6: goto L_0x05cf;
                case 7: goto L_0x00b5;
                case 8: goto L_0x00cb;
                case 9: goto L_0x0105;
                case 10: goto L_0x05d7;
                case 11: goto L_0x0162;
                case 12: goto L_0x01a1;
                case 13: goto L_0x05fe;
                case 14: goto L_0x0297;
                case 15: goto L_0x02a7;
                case 16: goto L_0x02d2;
                case 17: goto L_0x060b;
                case 18: goto L_0x032e;
                case 19: goto L_0x0362;
                case 20: goto L_0x03c0;
                case 21: goto L_0x040f;
                case 22: goto L_0x0618;
                case 23: goto L_0x0463;
                case 24: goto L_0x04d2;
                case 25: goto L_0x0515;
                case 26: goto L_0x0559;
                case 27: goto L_0x0589;
                case 28: goto L_0x0634;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            X.73c r0 = r2.A0K
            if (r0 == 0) goto L_0x002d
            r0.A05()
            X.6lg r0 = r2.A0b
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r2.A0M
            if (r0 == 0) goto L_0x002d
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x002d
            X.6lg r1 = r2.A0b
            X.73c r0 = r2.A0K
            boolean r0 = r0.A08()
            r0 = r0 ^ 1
            r1.A00(r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.Object r1 = r14.A01
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r1 = (com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet) r1
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A07
            X.C108995ce.A0x(r0, r14)
            X.5jD r0 = r1.A0J
            if (r0 != 0) goto L_0x05a2
            java.lang.String r0 = "viewModel"
            goto L_0x056f
        L_0x003f:
            java.lang.Object r1 = r14.A01
            X.7DY r1 = (X.AnonymousClass7DY) r1
            android.view.View r0 = r1.A0A
            if (r0 == 0) goto L_0x00b1
            X.AnonymousClass3MY.A1D(r0, r14)
            X.8Av r0 = r1.A0K
            if (r0 != 0) goto L_0x05aa
            java.lang.String r0 = "camera"
            goto L_0x056f
        L_0x0052:
            java.lang.Object r3 = r14.A01
            X.5wX r3 = (X.C116185wX) r3
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r2 = r3.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x006b
            android.view.ViewParent r1 = r2.getParent()
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = r3.A0E
            r1.getHitRect(r0)
        L_0x006b:
            android.graphics.Rect r0 = r3.A0E
            boolean r0 = r2.getLocalVisibleRect(r0)
            if (r0 == 0) goto L_0x002d
            android.view.View r1 = r3.A0G
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A0I
            r1.removeOnGlobalLayoutListener(r0)
            return
        L_0x0083:
            java.lang.Object r2 = r14.A01
            X.7DY r2 = (X.AnonymousClass7DY) r2
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L_0x00b1
            X.AnonymousClass3MY.A1D(r0, r14)
            X.AnonymousClass7DY.A0M(r2)
            X.6u4 r0 = r2.A15
            java.util.Set r0 = r0.A09
            boolean r0 = X.C108945cZ.A1U(r0)
            if (r0 != 0) goto L_0x00a4
            boolean r0 = X.AnonymousClass7DY.A0f(r2)
            if (r0 == 0) goto L_0x00a4
            X.AnonymousClass7DY.A0H(r2)
        L_0x00a4:
            X.3ho r0 = r2.A0O
            if (r0 == 0) goto L_0x002d
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x002d
            X.AnonymousClass7DY.A0Y(r2, r0)
            return
        L_0x00b1:
            java.lang.String r0 = "cameraView"
            goto L_0x056f
        L_0x00b5:
            java.lang.Object r2 = r14.A01
            X.74J r2 = (X.AnonymousClass74J) r2
            android.view.View r0 = r2.A03
            X.C108995ce.A0x(r0, r14)
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r2.A0E
            if (r1 == 0) goto L_0x002d
            r0 = 7
            X.7Ql r0 = X.C146747Ql.A00(r2, r0)
            r1.post(r0)
            return
        L_0x00cb:
            java.lang.Object r0 = r14.A01
            com.whatsapp.flows.webview.view.FlowsWebViewFragment r0 = (com.whatsapp.flows.webview.view.FlowsWebViewFragment) r0
            X.5ey r4 = r0.A00
            if (r4 == 0) goto L_0x002d
            X.1L4 r0 = r0.A0A
            if (r0 == 0) goto L_0x0101
            boolean r0 = X.AnonymousClass1L4.A00(r4)
            r3 = 0
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = "didShow"
        L_0x00e0:
            X.7zb r0 = new X.7zb
            r0.<init>(r1)
            X.84U r0 = X.AnonymousClass84U.A00(r0)
            java.lang.String r2 = X.C18070vi.A0H(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "window.onkeyboardStateChange("
            r1.append(r0)
            java.lang.String r0 = X.C17900vP.A0B(r2, r1)
            r4.evaluateJavascript(r0, r3)
            return
        L_0x00fe:
            java.lang.String r1 = "hidden"
            goto L_0x00e0
        L_0x0101:
            java.lang.String r0 = "imeUtils"
            goto L_0x056f
        L_0x0105:
            java.lang.Object r2 = r14.A01
            X.6jr r2 = (X.C130696jr) r2
            android.view.View r0 = r2.A01
            boolean r1 = X.AnonymousClass1L4.A00(r0)
            r4 = 0
            r3 = 8
            X.3d3 r0 = r2.A05
            boolean r0 = r0.isShowing()
            if (r1 == 0) goto L_0x013e
            if (r0 != 0) goto L_0x002d
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != r3) goto L_0x002d
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            r6 = 1
            r10 = r6
            r12 = r6
            r13 = r9
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r8 = r6
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 100
            r5.setDuration(r0)
            r2.startAnimation(r5)
            r2.setVisibility(r4)
            return
        L_0x013e:
            if (r0 != 0) goto L_0x002d
            android.view.View r2 = r2.A00
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x002d
            r6 = 0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1
            r9 = r5
            r11 = r5
            r12 = r6
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r7 = r5
            r10 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 100
            r4.setDuration(r0)
            r2.startAnimation(r4)
            r2.setVisibility(r3)
            return
        L_0x0162:
            java.lang.Object r2 = r14.A01
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = (com.whatsapp.mediacomposer.MediaComposerFragment) r2
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.A02
            if (r1 == 0) goto L_0x016f
            android.view.View r0 = r2.A0B
            X.C108995ce.A0x(r0, r1)
        L_0x016f:
            X.1FL r0 = r2.A1B()
            r1 = 1
            if (r0 == 0) goto L_0x017d
            boolean r0 = r0.isFinishing()
            if (r0 != r1) goto L_0x017d
            return
        L_0x017d:
            X.78w r0 = r2.A0K
            if (r0 == 0) goto L_0x002d
            android.widget.FrameLayout r0 = r0.A03
            if (r0 == 0) goto L_0x002d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x002d
            X.78w r1 = r2.A0K
            if (r1 == 0) goto L_0x0199
            android.graphics.Bitmap r0 = r1.A02
            if (r0 == 0) goto L_0x0199
            r0.recycle()
            r0 = 0
            r1.A02 = r0
        L_0x0199:
            X.78w r0 = r2.A0K
            if (r0 == 0) goto L_0x002d
            r0.A04()
            return
        L_0x01a1:
            int[] r1 = X.C108945cZ.A1W()
            java.lang.Object r4 = r14.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r4
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "titleBar"
            goto L_0x056f
        L_0x01b1:
            r0.getLocationOnScreen(r1)
            r0 = 0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x002d
            com.whatsapp.WaTextView r0 = r4.A0F
            if (r0 != 0) goto L_0x01c1
            java.lang.String r0 = "mediaQualityToolTip"
            goto L_0x056f
        L_0x01c1:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x01ca
            r0.removeOnGlobalLayoutListener(r14)
        L_0x01ca:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166581(0x7f070575, float:1.7947411E38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169052(0x7f070f1c, float:1.7952423E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r5 = 2
            int[] r7 = new int[r5]
            android.widget.ImageView r0 = r4.A06
            if (r0 == 0) goto L_0x01ea
            r0.getLocationOnScreen(r7)
        L_0x01ea:
            android.widget.ImageView r0 = r4.A06
            r3 = 0
            if (r0 == 0) goto L_0x028f
            int r9 = r0.getMeasuredWidth()
        L_0x01f3:
            com.whatsapp.WaTextView r0 = r4.A0F
            java.lang.String r8 = "mediaQualityToolTip"
            if (r0 == 0) goto L_0x0292
            int r6 = r0.getMeasuredWidth()
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r4)
            int r2 = r0.widthPixels
            int r0 = r11 * 2
            int r2 = r2 - r0
            int r0 = r10 * 2
            int r2 = r2 - r0
            r1 = r7[r3]
            int r0 = r9 / 2
            int r1 = r1 + r0
            int r0 = r6 / 2
            int r1 = r1 - r0
            int r1 = r1 - r11
            int r1 = r1 - r10
            if (r1 >= 0) goto L_0x0273
            com.whatsapp.WaTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0292
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r9 = r9 / r5
            int r0 = r0 + r9
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r0 * 2
            r1.width = r0
        L_0x0227:
            com.whatsapp.WaTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0292
            r0.setLayoutParams(r1)
        L_0x022e:
            com.whatsapp.WaTextView r1 = r4.A0F
            if (r1 == 0) goto L_0x0292
            float r0 = (float) r3
            r1.setTranslationX(r0)
            r1.requestLayout()
            r0 = 32
            X.AnonymousClass78K.A00(r1, r4, r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 8
            X.3Br r2 = X.C108945cZ.A0X(r4, r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            X.0z4 r0 = r4.getWaSharedPreferences()
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "media_quality_tooltip_shown"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131891187(0x7f1213f3, float:1.9417087E38)
            java.lang.String r2 = X.C18070vi.A0F(r1, r0)
            android.content.Context r1 = r4.getContext()
            X.11C r0 = r4.getSystemServices()
            X.AnonymousClass1Y5.A00(r1, r0, r2)
            return
        L_0x0273:
            int r6 = r6 + r1
            if (r6 <= r2) goto L_0x028d
            com.whatsapp.WaTextView r0 = r4.A0F
            if (r0 == 0) goto L_0x0292
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r2 - r0
            int r9 = r9 / r5
            int r0 = r0 - r9
            int r0 = r0 * 2
            r1.width = r0
            int r3 = r2 - r0
            goto L_0x0227
        L_0x028d:
            r3 = r1
            goto L_0x022e
        L_0x028f:
            r9 = 0
            goto L_0x01f3
        L_0x0292:
            X.C18070vi.A11(r8)
            goto L_0x0572
        L_0x0297:
            java.lang.Object r1 = r14.A01
            X.740 r1 = (X.AnonymousClass740) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0P
            X.AnonymousClass3MY.A1D(r0, r14)
            X.AnonymousClass740.A04(r1)
            X.5kz r0 = r1.A0B
            goto L_0x032a
        L_0x02a7:
            java.lang.Object r4 = r14.A01
            X.5ra r4 = (X.C114665ra) r4
            X.5YX r3 = r4.A04
            android.view.View r3 = (android.view.View) r3
            X.AnonymousClass3MY.A1D(r3, r14)
            boolean r0 = r4.isShowing()
            if (r0 != 0) goto L_0x002d
            r2 = 48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0 = 0
            r4.showAtLocation(r3, r2, r0, r1)
            X.AQ4 r2 = r4.A0H
            android.view.View r0 = r2.A03
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x002d
            r0.setVisibility(r1)
            return
        L_0x02d2:
            java.lang.Object r4 = r14.A01
            X.6ju r4 = (X.C130726ju) r4
            r7 = 0
            X.C18070vi.A0d(r4, r7)
            androidx.recyclerview.widget.RecyclerView r6 = r4.A07
            r5 = 0
            if (r6 == 0) goto L_0x02e3
            int r7 = r6.getHeight()
        L_0x02e3:
            int r0 = r4.A02
            if (r7 == r0) goto L_0x0305
            r4.A02 = r7
            int r3 = r4.A04
            int r2 = r3 / 4
            int r0 = r3 * 3
            int r1 = r0 / 4
            int r0 = r7 % r3
            if (r0 < r2) goto L_0x02f8
            if (r0 > r1) goto L_0x02f8
            r1 = r0
        L_0x02f8:
            int r7 = r7 - r1
            int r1 = java.lang.Math.max(r5, r7)
            int r0 = r1 / r3
            int r1 = r1 % r3
            int r0 = r0 + 1
            int r1 = r1 / r0
            r4.A01 = r1
        L_0x0305:
            if (r6 == 0) goto L_0x030b
            int r5 = r6.getWidth()
        L_0x030b:
            int r0 = r4.A03
            if (r0 == r5) goto L_0x002d
            r4.A03 = r5
            int r0 = r4.A04
            if (r0 == 0) goto L_0x0328
            int r5 = r5 / r0
            int r0 = r4.A00
            if (r0 == r5) goto L_0x0328
            r4.A00 = r5
            androidx.recyclerview.widget.GridLayoutManager r0 = r4.A06
            r0.A1g(r5)
            X.5l4 r0 = r4.A08
            if (r0 == 0) goto L_0x0328
            r0.notifyDataSetChanged()
        L_0x0328:
            X.5l4 r0 = r4.A08
        L_0x032a:
            if (r0 == 0) goto L_0x002d
            goto L_0x0555
        L_0x032e:
            java.lang.Object r4 = r14.A01
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            android.content.res.Configuration r3 = X.C108965cb.A03(r4)
            android.widget.FrameLayout r1 = r4.A08
            r2 = 0
            if (r1 == 0) goto L_0x0346
            boolean r0 = r4.A4f()
            int r0 = X.C72453Mb.A02(r0)
            r1.setVisibility(r0)
        L_0x0346:
            int r1 = r3.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0354
            android.view.View r0 = r4.A04
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 != 0) goto L_0x0354
            r2 = 1
        L_0x0354:
            boolean r0 = com.whatsapp.status.playback.MessageReplyActivity.A14(r4, r2)
            if (r0 == 0) goto L_0x002d
            android.view.ViewGroup r0 = r4.A07
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            goto L_0x059e
        L_0x0362:
            java.lang.Object r4 = r14.A01
            com.whatsapp.status.playback.StatusReplyActivity r4 = (com.whatsapp.status.playback.StatusReplyActivity) r4
            com.whatsapp.status.playback.StatusReplyActivity.A0r(r4)
            android.view.View r0 = r4.A04
            java.lang.Runnable r3 = r4.A04
            r0.removeCallbacks(r3)
            android.view.View r2 = r4.A04
            android.content.res.Resources r1 = r4.getResources()
            r0 = 17694722(0x10e0002, float:2.6081287E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            int r1 = X.C72453Mb.A08(r4)
            r0 = 2
            if (r1 != r0) goto L_0x002d
            boolean r0 = X.C108975cc.A1E(r4)
            r3 = 0
            if (r0 == 0) goto L_0x03b2
            X.74J r0 = X.C108965cb.A0L(r4)
            boolean r2 = r0.A0U()
        L_0x0397:
            android.widget.FrameLayout r1 = r4.A08
            android.view.View r0 = r4.A04
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 != 0) goto L_0x03ac
            boolean r0 = r4.A4f()
            if (r0 == 0) goto L_0x03ac
            if (r2 == 0) goto L_0x03ae
        L_0x03ac:
            r3 = 8
        L_0x03ae:
            r1.setVisibility(r3)
            return
        L_0x03b2:
            X.5z4 r0 = r4.A0b
            if (r0 == 0) goto L_0x03be
            boolean r1 = r0.isShowing()
            r0 = 1
            r2 = 1
            if (r1 == r0) goto L_0x0397
        L_0x03be:
            r2 = 0
            goto L_0x0397
        L_0x03c0:
            java.lang.Object r8 = r14.A01
            X.78S r8 = (X.AnonymousClass78S) r8
            java.lang.Object r7 = r8.A06
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r6 = r8.A02
            int[] r6 = (int[]) r6
            r7.getLocationOnScreen(r6)
            java.lang.Object r5 = r8.A03
            int[] r5 = (int[]) r5
            r4 = 0
            r0 = r5[r4]
            r3 = r6[r4]
            r2 = 1
            if (r0 != r3) goto L_0x03e1
            r1 = r5[r2]
            r0 = r6[r2]
            if (r1 == r0) goto L_0x002d
        L_0x03e1:
            r5[r4] = r3
            r0 = r6[r2]
            r5[r2] = r0
            java.lang.Object r1 = r8.A07
            X.0Iy r1 = (X.C03610Iy) r1
            X.0Od r0 = r1.A04
            r0.A02()
            r1.A00()
            java.lang.Object r0 = r8.A00
            if (r0 != 0) goto L_0x0405
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()
            X.C17960vV.A07(r0)
            r8.A00 = r0
            if (r0 == 0) goto L_0x0405
            r0.addOnGlobalLayoutListener(r14)
        L_0x0405:
            java.lang.Object r0 = r8.A05
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            r0.A07 = r2
            r0.A27()
            return
        L_0x040f:
            java.lang.Object r5 = r14.A01
            com.whatsapp.status.playback.widget.VoiceStatusContentView r5 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r5
            X.85p r4 = r5.A05
            if (r4 == 0) goto L_0x0440
            int r3 = r5.getPreviewWavesSegmentsCount()
            X.7MH r4 = (X.AnonymousClass7MH) r4
            X.1DT r0 = r4.A01
            X.AnonymousClass3MX.A1J(r0, r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0440
            java.util.ArrayList r2 = X.C17880vN.A0z(r3)
            r1 = 0
        L_0x042b:
            if (r1 >= r3) goto L_0x0438
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x042b
        L_0x0438:
            X.882 r0 = r4.A04
            r0.setVoiceVisualizerSegments(r2)
            r0 = 1
            r4.A00 = r0
        L_0x0440:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A01
            java.lang.String r2 = "voiceVisualizer"
            if (r0 == 0) goto L_0x045e
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A01
            if (r0 == 0) goto L_0x045e
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x002d
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x002d
            r1.removeOnGlobalLayoutListener(r14)
            return
        L_0x045e:
            X.C18070vi.A11(r2)
            goto L_0x0572
        L_0x0463:
            java.lang.Object r5 = r14.A01
            X.6CF r5 = (X.AnonymousClass6CF) r5
            androidx.viewpager.widget.ViewPager r4 = r5.A07
            int r2 = r4.getHeight()
            int r1 = r4.getWidth()
            if (r2 == 0) goto L_0x049d
            if (r1 == 0) goto L_0x049d
            int r0 = r5.A01
            if (r0 != r1) goto L_0x047d
            int r0 = r5.A00
            if (r0 == r2) goto L_0x049d
        L_0x047d:
            r5.A01 = r1
            r5.A00 = r2
            java.util.List r0 = r5.A0E
            java.util.Iterator r3 = r0.iterator()
        L_0x0487:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x049d
            java.lang.Object r2 = r3.next()
            X.7Kl r2 = (X.C145227Kl) r2
            if (r2 == 0) goto L_0x0487
            int r1 = r5.A01
            int r0 = r5.A00
            r2.A02(r1, r0)
            goto L_0x0487
        L_0x049d:
            android.view.ViewParent r0 = r4.getParent()
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getWidth()
            int r0 = r5.A02
            if (r2 == r0) goto L_0x002d
            r5.A02 = r2
            X.7Kn r6 = r5.A0b
            if (r6 == 0) goto L_0x002d
            android.view.View r0 = r6.A08
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131168919(0x7f070e97, float:1.7952153E38)
            int r5 = r1.getDimensionPixelSize(r0)
            int r4 = r2 / 9
            X.0vb r0 = r6.A0B
            boolean r3 = X.AnonymousClass3MY.A1b(r0)
            r2 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0A
            int r4 = r4 - r5
            int r0 = r4 / 2
            if (r3 == 0) goto L_0x063c
            r1.setPadding(r0, r2, r2, r2)
            return
        L_0x04d2:
            java.lang.Object r4 = r14.A01
            X.6CG r4 = (X.AnonymousClass6CG) r4
            androidx.viewpager.widget.ViewPager r0 = r4.A07
            int r2 = r0.getHeight()
            int r1 = r0.getWidth()
            if (r2 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            int r0 = r4.A01
            if (r0 != r1) goto L_0x04ec
            int r0 = r4.A00
            if (r0 == r2) goto L_0x002d
        L_0x04ec:
            r4.A01 = r1
            r4.A00 = r2
            X.6Hy r0 = r4.A0L
            r0.A02(r1, r2)
            X.6Hx r2 = r4.A0M
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            r3 = 2
        L_0x04ff:
            int r0 = r4.A08
            if (r3 >= r0) goto L_0x002d
            java.util.List r0 = r4.A05
            java.lang.Object r2 = r0.get(r3)
            X.7Kl r2 = (X.C145227Kl) r2
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A02(r1, r0)
            int r3 = r3 + 1
            goto L_0x04ff
        L_0x0515:
            java.lang.Object r4 = r14.A01
            com.whatsapp.stickers.store.StickerStoreTabFragment r4 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r4
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A03
            int r1 = r0.A1O()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A04
            X.1xT r1 = r0.A0O(r1)
            boolean r0 = r1 instanceof X.C113495nB
            if (r0 == 0) goto L_0x002d
            X.5nB r1 = (X.C113495nB) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0G
            int r3 = r0.getWidth()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131168929(0x7f070ea1, float:1.7952174E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131168930(0x7f070ea2, float:1.7952176E38)
            int r0 = X.AnonymousClass3MX.A00(r1, r0, r2)
            int r3 = r3 / r0
            r0 = 5
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = r4.A00
            if (r0 == r1) goto L_0x002d
            r4.A00 = r1
            X.5lF r0 = r4.A0B
        L_0x0555:
            r0.notifyDataSetChanged()
            return
        L_0x0559:
            java.lang.Object r2 = r14.A01
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            X.861 r1 = r2.A09
            if (r1 == 0) goto L_0x0569
            int r0 = r2.getPreviewSegmentsCount()
            X.7Mt r1 = (X.C145827Mt) r1
            r1.A00 = r0
        L_0x0569:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r1 = r2.A07
            if (r1 != 0) goto L_0x0574
            java.lang.String r0 = "previewVoiceVisualizer"
        L_0x056f:
            X.C18070vi.A11(r0)
        L_0x0572:
            r0 = 0
            throw r0
        L_0x0574:
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L_0x002d
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x002d
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            goto L_0x059c
        L_0x0589:
            int[] r2 = X.C108945cZ.A1W()
            java.lang.Object r1 = r14.A01
            X.6KN r1 = (X.AnonymousClass6KN) r1
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r0 = r1.A02
            r0.getLocationOnScreen(r2)
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L_0x059c:
            if (r0 == 0) goto L_0x002d
        L_0x059e:
            r0.removeOnGlobalLayoutListener(r14)
            return
        L_0x05a2:
            X.6R4 r1 = X.AnonymousClass6R4.LARGE
            X.1DT r0 = r0.A0J
            X.C137196v4.A01(r0, r1)
            return
        L_0x05aa:
            r0.CFx()
            return
        L_0x05ae:
            java.lang.Object r1 = r14.A01
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            X.AnonymousClass3MY.A1D(r1, r14)
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x05bb:
            java.lang.Object r2 = r14.A01
            com.whatsapp.PagerSlidingTabStrip r2 = (com.whatsapp.PagerSlidingTabStrip) r2
            X.AnonymousClass3MY.A1D(r2, r14)
            androidx.viewpager.widget.ViewPager r0 = r2.A04
            int r1 = r0.getCurrentItem()
            r2.A01 = r1
            r0 = 0
            com.whatsapp.PagerSlidingTabStrip.A01(r2, r1, r0)
            return
        L_0x05cf:
            java.lang.Object r0 = r14.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A03(r0)
            return
        L_0x05d7:
            java.lang.Object r4 = r14.A01
            X.75M r4 = (X.AnonymousClass75M) r4
            android.view.View r0 = r4.A0F
            X.AnonymousClass3MY.A1D(r0, r14)
            android.view.View r0 = r4.A0F
            int r0 = r0.getMeasuredHeight()
            r4.A02 = r0
            android.view.View r0 = r4.A0F
            int r0 = r0.getMeasuredHeight()
            double r2 = (double) r0
            r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r2 = r2 * r0
            int r0 = (int) r2
            r4.A03 = r0
            r1 = 0
            r0 = 0
            r4.A0Y(r0, r1)
            return
        L_0x05fe:
            java.lang.Object r1 = r14.A01
            X.740 r1 = (X.AnonymousClass740) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0P
            X.AnonymousClass3MY.A1D(r0, r14)
            X.AnonymousClass740.A04(r1)
            return
        L_0x060b:
            java.lang.Object r1 = r14.A01
            X.70F r1 = (X.AnonymousClass70F) r1
            android.widget.ImageView r0 = r1.A0O
            X.AnonymousClass3MY.A1D(r0, r14)
            X.AnonymousClass70F.A00(r1)
            return
        L_0x0618:
            java.lang.Object r3 = r14.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r3 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r3
            android.view.ViewGroup r0 = r3.A05
            X.C108995ce.A0x(r0, r14)
            android.view.ViewGroup r1 = r3.A05
            if (r1 == 0) goto L_0x062c
            float r0 = X.C108945cZ.A04(r1)
            r1.setTranslationY(r0)
        L_0x062c:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = 0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0J(r3, r2, r1, r0)
            return
        L_0x0634:
            java.lang.Object r0 = r14.A01
            X.8Ag r0 = (X.C160868Ag) r0
            r0.onGlobalLayout()
            return
        L_0x063c:
            r1.setPadding(r2, r2, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass793.onGlobalLayout():void");
    }
}
