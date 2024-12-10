package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;

public class DR0 implements C108645c3 {
    public int A00 = 3;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public FrameLayout A05;
    public AnonymousClass205 A06;
    public C22655BIe A07;
    public BID A08;
    public AnonymousClass4QM A09;
    public AnonymousClass70X A0A;
    public String A0B;
    public boolean A0C;
    public double A0D;
    public int A0E = 0;
    public int A0F = 0;
    public AnonymousClass4LQ A0G;
    public boolean A0H;
    public final Context A0I;
    public final Rect A0J = AnonymousClass3MW.A07();
    public final AnonymousClass1L9 A0K;
    public final AnonymousClass11C A0L;
    public final C18030ve A0M;
    public final C25022CTy A0N;
    public final AnonymousClass190 A0O;
    public final C61862qP A0P;
    public final AnonymousClass1KB A0Q;
    public final AnonymousClass118 A0R;
    public final C18000vb A0S;
    public final AnonymousClass18K A0T;
    public final C32011gU A0U;
    public final WamediaManager A0V;
    public final C32571hP A0W;
    public final AnonymousClass10I A0X;
    public final AnonymousClass00H A0Y;

    public static void A00(Context context, Rect rect, Rect rect2, View view, C22655BIe bIe, BID bid, boolean z) {
        float f;
        float A022;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        bid.getFullscreenControls();
        bid.getInlineControls();
        context.getResources().getColor(2131102739);
        context.getResources().getColor(2131103052);
        float f2 = 1.0f;
        if (bIe == null || !z) {
            f = 1.0f;
        } else {
            f = bIe.A00;
        }
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f) {
            view.setX((float) rect.left);
            view.setY((float) rect.top);
            view.setScaleX(f);
            view.setScaleY(f);
            view.requestLayout();
            return;
        }
        float A023 = BE6.A02(rect2) / ((float) rect2.height());
        float A024 = BE6.A02(rect) / ((float) rect.height());
        if (z ? A023 >= A024 : A023 <= A024) {
            A022 = BE6.A02(rect) / BE6.A02(rect2);
            float height = ((((float) rect2.height()) * A022) - ((float) rect.height())) / 2.0f;
            rect.top = (int) (((float) rect.top) - height);
            rect.bottom = (int) (((float) rect.bottom) + height);
        } else {
            A022 = ((float) rect.height()) / ((float) rect2.height());
            float A025 = ((BE6.A02(rect2) * A022) - BE6.A02(rect)) / 2.0f;
            rect.left = (int) (((float) rect.left) - A025);
            rect.right = (int) (((float) rect.right) + A025);
        }
        if (Float.isNaN(A022) || Float.isInfinite(A022)) {
            A022 = 1.0f;
        }
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            f2 = f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.X;
        float[] fArr = new float[2];
        fArr[0] = (float) rect.left;
        AnimatorSet.Builder play = animatorSet.play(C108945cZ.A0C(property, view, fArr, (float) rect2.left, 1));
        Property property2 = View.Y;
        float[] fArr2 = new float[2];
        fArr2[0] = (float) rect.top;
        AnimatorSet.Builder with = play.with(C108945cZ.A0C(property2, view, fArr2, (float) rect2.top, 1));
        Property property3 = View.SCALE_X;
        float[] fArr3 = new float[2];
        fArr3[0] = A022;
        AnimatorSet.Builder with2 = with.with(C108945cZ.A0C(property3, view, fArr3, f2, 1));
        Property property4 = View.SCALE_Y;
        float[] fArr4 = new float[2];
        fArr4[0] = A022;
        with2.with(C108945cZ.A0C(property4, view, fArr4, f2, 1));
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    public static void A01(DR0 dr0) {
        String str = dr0.A0B;
        Context context = dr0.A0I;
        C25022CTy cTy = dr0.A0N;
        AnonymousClass1L9 r2 = dr0.A0K;
        if (str != null) {
            r2.CGU(context, Uri.parse(str), (AnonymousClass206) null);
        }
        cTy.A02 = true;
        cTy.A00 = null;
        dr0.BF9();
    }

    /* JADX WARNING: type inference failed for: r14v4, types: [X.6Ms] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r28v0 X.205) = (r32v0 X.205)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void A02(X.C24004Btq r30, X.AnonymousClass206 r31, X.AnonymousClass205 r32, android.graphics.Bitmap[] r33, int r34) {
        /*
            r29 = this;
            r5 = r29
            X.70X r0 = r5.A0A
            if (r0 != 0) goto L_0x0345
            X.205 r1 = r5.A06
            r28 = r32
            r0 = r28
            if (r0 != r1) goto L_0x0345
            r7 = r30
            if (r30 != 0) goto L_0x002a
            java.lang.String r0 = "InlineVideoPlaybackImplHandler/startInlinePlayback - loadPage returned null.  Opening video externally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r5.A0B
            com.whatsapp.util.LRUCache r1 = X.C20016A3i.A00
            monitor-enter(r1)
            if (r0 == 0) goto L_0x0025
            r1.remove(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0025:
            monitor-exit(r1)
            A01(r5)
            return
        L_0x002a:
            X.CTy r8 = r5.A0N
            X.6uK r0 = r8.A07
            r0.A02()
            X.6uK r0 = r8.A08
            r0.A02()
            X.10I r0 = r5.A0X
            r16 = r0
            X.1hP r2 = r5.A0W
            r0 = 17
            X.7RJ r1 = new X.7RJ
            r1.<init>(r2, r0)
            r0 = r16
            r0.CGF(r1)
            X.4QM r2 = r5.A09
            if (r2 == 0) goto L_0x0054
            r1 = 2
            r0 = r28
            r2.A00(r0, r1)
            r5.A00 = r1
        L_0x0054:
            int r1 = r7.A00
            r4 = -1
            r6 = r34
            if (r1 == r4) goto L_0x032a
            int r0 = r7.A01
            if (r0 == r4) goto L_0x032a
            double r2 = (double) r0
            double r0 = (double) r1
            double r2 = r2 / r0
        L_0x0062:
            double r0 = r5.A0D
            double r0 = r0 / r2
            double r0 = java.lang.Math.sqrt(r0)
            int r9 = (int) r0
            r5.A02 = r9
            double r0 = (double) r9
            double r0 = r0 * r2
            int r2 = (int) r0
            r5.A04 = r2
            r5.A01 = r9
            android.content.Context r12 = r5.A0I
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131167104(0x7f070780, float:1.7948472E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r5.A01
            int r0 = r0 + r1
            r5.A01 = r0
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131167105(0x7f070781, float:1.7948474E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            X.BwE r1 = new X.BwE
            r1.<init>(r12, r0)
            r5.A05 = r1
            boolean r0 = r5.A0C
            r1.setIsFullscreen(r0)
            r0 = 2131891360(0x7f1214a0, float:1.9417438E38)
            X.AnonymousClass3MY.A0w(r12, r1, r0)
            android.widget.FrameLayout r0 = r5.A05
            r2 = 1
            r0.setFocusable(r2)
            android.widget.FrameLayout r0 = r5.A05
            r0.setImportantForAccessibility(r2)
            android.widget.FrameLayout r0 = r5.A05
            r0.setFocusableInTouchMode(r2)
            X.BIe r1 = r5.A07
            X.DQx r0 = new X.DQx
            r0.<init>(r5)
            r1.A0H = r0
            r5.A0H = r2
            android.widget.FrameLayout r1 = r5.A05
            r0 = 1086324736(0x40c00000, float:6.0)
            X.AnonymousClass1HF.A0W(r1, r0)
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r12)
            android.widget.FrameLayout r0 = r5.A05
            r0.addView(r11)
            X.BwF r0 = new X.BwF
            r0.<init>(r12, r8, r6, r2)
            r5.A08 = r0
            r13 = 0
            r0 = r33[r13]
            if (r0 == 0) goto L_0x00f5
            X.0ve r3 = r5.A0M
            r1 = 1052(0x41c, float:1.474E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x00f5
            X.BID r1 = r5.A08
            r0 = 2131428018(0x7f0b02b2, float:1.8477669E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r1, r0)
            r0 = r33[r13]
            r1.setImageBitmap(r0)
        L_0x00f5:
            X.BID r1 = r5.A08
            X.DQz r0 = new X.DQz
            r0.<init>(r5, r13)
            r1.setCloseButtonListener(r0)
            X.BID r8 = r5.A08
            r10 = 1
            X.DQz r0 = new X.DQz
            r0.<init>(r5, r2)
            X.BwF r8 = (X.C24149BwF) r8
            r8.A0G = r0
            boolean r0 = X.C24149BwF.A07(r8)
            r2 = 8
            if (r0 == 0) goto L_0x031e
            android.widget.ImageButton r3 = r8.A0g
            int r0 = X.C63712tZ.A00(r6)
            r3.setImageResource(r0)
            r0 = 22
            X.AnonymousClass78L.A00(r3, r8, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A0s
            switch(r34) {
                case 1: goto L_0x02fb;
                case 2: goto L_0x0300;
                case 3: goto L_0x0305;
                case 4: goto L_0x030a;
                case 5: goto L_0x0300;
                case 6: goto L_0x030f;
                case 7: goto L_0x0314;
                case 8: goto L_0x0319;
                default: goto L_0x0126;
            }
        L_0x0126:
            r0 = -1
        L_0x0127:
            r1.setIcon((int) r0)
            r0 = 23
            X.AnonymousClass78L.A00(r1, r8, r0)
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x02f3
            r1.setVisibility(r13)
            r3.setVisibility(r2)
        L_0x0139:
            X.BID r2 = r5.A08
            r1 = 2
            X.DQz r0 = new X.DQz
            r0.<init>(r5, r1)
            r2.setFullscreenButtonClickListener(r0)
            X.BID r0 = r5.A08
            r11.addView(r0)
            android.widget.FrameLayout r2 = r5.A05
            X.D4q r0 = new X.D4q
            r0.<init>(r5)
            r2.setOnHoverListener(r0)
            android.widget.FrameLayout r2 = r5.A05
            r0 = 31
            X.AnonymousClass78L.A00(r2, r5, r0)
            X.BIe r14 = r5.A07
            android.widget.FrameLayout r9 = r5.A05
            X.4QM r3 = r5.A09
            X.206 r0 = r3.A00
            X.205 r2 = r0.A0v
            r0 = r28
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02f0
            X.5cU r0 = r3.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = (com.whatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.FrameLayout r8 = r0.A05
        L_0x0172:
            int r3 = r5.A04
            int r2 = r5.A01
            boolean r0 = r14.A0R
            if (r0 == 0) goto L_0x0184
            int r0 = r14.A09
            r14.A06 = r0
            int r0 = r14.A0A
            r14.A07 = r0
            r14.A0R = r13
        L_0x0184:
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.A00 = r0
            r14.A05 = r3
            r14.A02 = r2
            r14.A04 = r3
            r14.A03 = r2
            int r0 = r14.A03(r3)
            r14.A06 = r0
            int r0 = r14.A04(r2)
            r14.A07 = r0
            if (r8 == 0) goto L_0x01ce
            int[] r1 = new int[r1]
            r8.getLocationInWindow(r1)
            r0 = r1[r13]
            int r15 = r14.A06
            int r0 = r0 - r15
            float r0 = (float) r0
            r9.setTranslationX(r0)
            r1 = r1[r10]
            int r0 = r14.A07
            int r1 = r1 - r0
            float r0 = (float) r1
            r9.setTranslationY(r0)
            r0 = 0
            r9.setPivotY(r0)
            r9.setPivotX(r0)
            float r1 = X.C108945cZ.A03(r8)
            float r0 = (float) r3
            float r1 = r1 / r0
            r9.setScaleX(r1)
            float r1 = X.C108945cZ.A04(r8)
            float r0 = (float) r2
            float r1 = r1 / r0
            r9.setScaleY(r1)
        L_0x01ce:
            r14.A0L = r10
            r14.addView(r9, r3, r2)
            java.lang.String r15 = r7.A02
            r0 = 4
            if (r6 != r0) goto L_0x029f
            r2 = r33[r13]
            if (r2 == 0) goto L_0x0281
            int r1 = r5.A04
            int r0 = r5.A02
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r2, r1, r0, r13)
        L_0x01e4:
            X.2qP r2 = r5.A0P
            X.BID r1 = r5.A08
            X.BwF r1 = (X.C24149BwF) r1
            int r0 = r5.A02
            r16 = r31
            r17 = r1
            r18 = r15
            r19 = r0
            r14 = r2
            r15 = r3
            X.6Ms r14 = r14.A01(r15, r16, r17, r18, r19)
        L_0x01fa:
            r5.A0A = r14
            android.view.View r0 = r14.A09()
            r11.addView(r0, r13)
            r11.setClipChildren(r13)
            X.BID r0 = r5.A08
            r0.setClipChildren(r13)
            X.70X r0 = r5.A0A
            android.view.View r2 = r0.A09()
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r5.A02
            r1.height = r0
            r1.width = r4
            r2.setLayoutParams(r1)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131103052(0x7f060d4c, float:1.781856E38)
            int r0 = r1.getColor(r0)
            r11.setBackgroundColor(r0)
            X.70X r0 = r5.A0A
            android.view.View r3 = r0.A09()
            android.content.res.Resources r2 = r12.getResources()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r0 = X.AnonymousClass3Ma.A01(r12, r2, r1, r0)
            r3.setBackgroundColor(r0)
            X.70X r2 = r5.A0A
            X.DR3 r0 = new X.DR3
            r0.<init>(r5, r10)
            r2.A09 = r0
            X.DR4 r1 = new X.DR4
            r0 = r28
            r1.<init>(r0, r5)
            r2.A0A = r1
            X.BID r0 = r5.A08
            r0.setPlayer(r2)
            X.BID r2 = r5.A08
            X.BwF r2 = (X.C24149BwF) r2
            android.widget.ImageButton r1 = r2.A0h
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageButton r1 = r2.A0i
            r0 = 8
            r1.setVisibility(r0)
            X.BIe r1 = r5.A07
            X.BID r0 = r5.A08
            r1.setControlView(r0)
            X.70X r0 = r5.A0A
            r0.A0E()
            X.BIe r1 = r5.A07
            X.DQy r0 = new X.DQy
            r0.<init>(r5)
            r1.A0I = r0
            return
        L_0x0281:
            int r2 = r5.A04
            int r1 = r5.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r3)
            r1 = 2130970830(0x7f0408ce, float:1.7550381E38)
            r0 = 2131102245(0x7f060a25, float:1.7816922E38)
            int r0 = X.AnonymousClass3Ma.A00(r12, r1, r0)
            r2.drawColor(r0)
            goto L_0x01e4
        L_0x029f:
            X.190 r9 = r5.A0O
            X.1KB r8 = r5.A0Q
            X.11C r7 = r5.A0L
            android.app.Activity r17 = X.AnonymousClass1L9.A00(r12)
            X.118 r6 = r5.A0R
            X.0ve r3 = r5.A0M
            com.whatsapp.media.WamediaManager r1 = r5.A0V
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A08(r12, r0)
            X.6Mx r2 = new X.6Mx
            r2.<init>(r6, r1, r0)
            X.00H r0 = r5.A0Y
            java.lang.Object r1 = r0.get()
            X.6gC r1 = (X.AnonymousClass6gC) r1
            r0 = 0
            X.6Mr r14 = new X.6Mr
            r27 = r13
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r3
            r23 = r1
            r24 = r16
            r25 = r0
            r26 = r13
            r16 = r14
            r18 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14.A0f(r2)
            android.net.Uri r1 = android.net.Uri.parse(r15)
            r14.A04 = r1
            r14.A05 = r0
            goto L_0x01fa
        L_0x02f0:
            r8 = 0
            goto L_0x0172
        L_0x02f3:
            r1.setVisibility(r2)
            r3.setVisibility(r13)
            goto L_0x0139
        L_0x02fb:
            r0 = 2131232214(0x7f0805d6, float:1.808053E38)
            goto L_0x0127
        L_0x0300:
            r0 = 2131232206(0x7f0805ce, float:1.8080515E38)
            goto L_0x0127
        L_0x0305:
            r0 = 2131232209(0x7f0805d1, float:1.808052E38)
            goto L_0x0127
        L_0x030a:
            r0 = 2131232215(0x7f0805d7, float:1.8080533E38)
            goto L_0x0127
        L_0x030f:
            r0 = 2131232210(0x7f0805d2, float:1.8080523E38)
            goto L_0x0127
        L_0x0314:
            r0 = 2131232211(0x7f0805d3, float:1.8080525E38)
            goto L_0x0127
        L_0x0319:
            r0 = 2131232213(0x7f0805d5, float:1.8080529E38)
            goto L_0x0127
        L_0x031e:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0s
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r8.A0g
            r0.setVisibility(r2)
            goto L_0x0139
        L_0x032a:
            r0 = 4
            if (r6 != r0) goto L_0x033e
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "/shorts/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x033e
            r2 = 4603237813974170650(0x3fe1fc671e937c1a, double:0.5620608899297423)
            goto L_0x0062
        L_0x033e:
            r2 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            goto L_0x0062
        L_0x0345:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DR0.A02(X.Btq, X.206, X.205, android.graphics.Bitmap[], int):void");
    }

    public void BF9() {
        long j;
        AnonymousClass205 r0;
        long j2;
        int i;
        Integer valueOf;
        if (this.A0H) {
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0M, 2431);
            C25022CTy cTy = this.A0N;
            int i2 = this.A03;
            AnonymousClass70X r02 = this.A0A;
            if (r02 != null) {
                j = (long) r02.A06();
            } else {
                j = 0;
            }
            C136746uK r7 = cTy.A09;
            if (r7.A01) {
                r7.A00();
            }
            C136746uK r9 = cTy.A07;
            r9.A00();
            C23839Bqw bqw = new C23839Bqw();
            if (!cTy.A02 || A052) {
                boolean z = cTy.A04;
                long j3 = 0;
                if (z) {
                    j2 = 0;
                } else {
                    j2 = r9.A00;
                }
                bqw.A04 = Long.valueOf(j2);
                bqw.A06 = Long.valueOf(Math.round(((double) j) / 10000.0d) * 10000);
                if (z) {
                    j3 = cTy.A08.A00;
                }
                bqw.A07 = Long.valueOf(j3);
                bqw.A01 = Boolean.valueOf(z);
                bqw.A08 = Long.valueOf(cTy.A06.A00);
                long j4 = r7.A00;
                bqw.A09 = Long.valueOf(Math.round(((double) j4) / 10000.0d) * 10000);
                switch (i2) {
                    case 1:
                        i = 5;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 6;
                        break;
                    case 8:
                        i = 8;
                        break;
                    default:
                        valueOf = null;
                        break;
                }
                valueOf = Integer.valueOf(i);
                bqw.A03 = valueOf;
                if (A052) {
                    bqw.A05 = Long.valueOf((long) ((((float) j4) * 100.0f) / ((float) j)));
                    bqw.A00 = Boolean.valueOf(cTy.A03);
                    bqw.A0A = cTy.A01;
                    bqw.A02 = cTy.A00;
                }
                cTy.A05.CC7(bqw);
            }
            cTy.A02 = false;
            cTy.A04 = false;
            cTy.A03 = false;
            cTy.A00 = null;
            cTy.A01 = null;
            cTy.A08.A01();
            r9.A01();
            r7.A01();
            cTy.A06.A01();
            this.A00 = 3;
            AnonymousClass4QM r1 = this.A09;
            if (!(r1 == null || (r0 = this.A06) == null)) {
                r1.A00(r0, 3);
                this.A09 = null;
            }
            BID bid = this.A08;
            if (bid != null) {
                bid.A09();
            }
            AnonymousClass70X r03 = this.A0A;
            if (r03 != null) {
                r03.A0F();
                this.A0A = null;
            }
            this.A07.setSystemUiVisibility(0);
            C22655BIe bIe = this.A07;
            bIe.A0S = false;
            bIe.A0O = false;
            bIe.A0M = true;
            bIe.A0B = 0;
            bIe.A0C = 0;
            bIe.removeAllViews();
            this.A0H = false;
            this.A0C = false;
            this.A06 = null;
            this.A0B = null;
        }
    }

    public void BKP() {
        Context context = this.A0I;
        if (!AnonymousClass1L9.A00(context).isFinishing()) {
            AnonymousClass70X r0 = this.A0A;
            if (r0 != null) {
                View A092 = r0.A09();
                ViewGroup.LayoutParams layoutParams = A092.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                A092.setLayoutParams(layoutParams);
                if (this.A0A instanceof C122086Ms) {
                    int i = C108965cb.A03(context).orientation;
                    YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C122086Ms) this.A0A).A0G;
                    if (i == 2) {
                        youtubePlayerTouchOverlay.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                        layoutParams2.addRule(13);
                        youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                    }
                    youtubePlayerTouchOverlay.requestLayout();
                }
            }
            AnonymousClass3MY.A0w(context, this.A05, 2131891359);
            C22655BIe bIe = this.A07;
            bIe.A0M = false;
            bIe.A0S = false;
            bIe.A0O = true;
            bIe.A0N = false;
            C22655BIe.A02(bIe, 1.0f);
            C22655BIe bIe2 = this.A07;
            FrameLayout frameLayout = this.A05;
            if (!(frameLayout == null || frameLayout.getX() == 0.0f || frameLayout.getY() == 0.0f)) {
                bIe2.A0B = bIe2.A03(bIe2.A05);
                bIe2.A0C = bIe2.A04(bIe2.A02);
            }
            AnonymousClass1HF.A0T(AnonymousClass3MZ.A0F(AnonymousClass1L9.A00(context)));
            this.A05.setScaleX(1.0f);
            this.A05.setScaleY(1.0f);
            AnonymousClass4aY r1 = this.A0G.A00;
            r1.A2Q.getImeUtils();
            if (AnonymousClass1L4.A00(r1.A0D)) {
                r1.A2P();
            } else {
                AnonymousClass4aY.A1w(r1);
            }
            FrameLayout frameLayout2 = this.A05;
            C22655BIe bIe3 = this.A07;
            Rect A072 = AnonymousClass3MW.A07();
            Rect A073 = AnonymousClass3MW.A07();
            Point point = new Point();
            Point point2 = new Point();
            frameLayout2.getGlobalVisibleRect(A072, point2);
            bIe3.getGlobalVisibleRect(A073, point);
            A072.offset(point2.x - A072.left, point2.y - A072.top);
            A073.offset(-point.x, -point.y);
            this.A0J.set(A072);
            C108965cb.A12(frameLayout2, -1);
            A00(context, A072, A073, frameLayout2, this.A07, this.A08, this.A0C);
            this.A0C = true;
            C24149BwF bwF = (C24149BwF) this.A08;
            bwF.A0M = true;
            if (bwF.A0H != null) {
                C24149BwF.A01(bwF);
            }
            if (!bwF.A0N) {
                bwF.A0l.setVisibility(8);
            }
            bwF.A0Z.setVisibility(8);
            if (C24149BwF.A07(bwF)) {
                bwF.A0s.setVisibility(0);
                if (!bwF.A0N) {
                    bwF.A0g.setVisibility(8);
                }
            }
            if (bwF.A0j.getVisibility() == 0) {
                C24149BwF.A02(bwF);
            }
            if (!TextUtils.isEmpty(bwF.A0p.getText())) {
                bwF.A0b.setVisibility(0);
            }
            bwF.setVideoCaption(bwF.A0q.getText());
            C24149BwF.A03(bwF);
            C24149BwF.A04(bwF);
            C24149BwF.A00(bwF);
            bwF.A0E();
            bwF.A0F();
            this.A07.requestLayout();
            FrameLayout frameLayout3 = this.A05;
            if (frameLayout3 instanceof C24148BwE) {
                ((C24148BwE) frameLayout3).setIsFullscreen(this.A0C);
            }
        }
    }

    public void BKs(boolean z) {
        AnonymousClass70X r0 = this.A0A;
        if (r0 != null) {
            View A092 = r0.A09();
            ViewGroup.LayoutParams layoutParams = A092.getLayoutParams();
            layoutParams.height = this.A02;
            layoutParams.width = -1;
            A092.setLayoutParams(layoutParams);
            AnonymousClass70X r1 = this.A0A;
            if (r1 instanceof C122086Ms) {
                YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C122086Ms) r1).A0G;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                layoutParams2.addRule(13);
                youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                youtubePlayerTouchOverlay.requestLayout();
            }
        }
        FrameLayout frameLayout = this.A05;
        Context context = this.A0I;
        AnonymousClass3MY.A0w(context, frameLayout, 2131891360);
        C22655BIe bIe = this.A07;
        boolean z2 = true;
        bIe.A0M = true;
        bIe.A0S = false;
        C22655BIe.A02(bIe, bIe.A00);
        if (z || this.A0F != this.A0E) {
            this.A05.setLayoutParams(new FrameLayout.LayoutParams(this.A04, this.A01));
        } else {
            FrameLayout frameLayout2 = this.A05;
            C22655BIe bIe2 = this.A07;
            Rect A072 = AnonymousClass3MW.A07();
            Rect A073 = AnonymousClass3MW.A07();
            Point point = new Point();
            bIe2.getGlobalVisibleRect(A072, point);
            A072.offset(-point.x, -point.y);
            A073.set(this.A0J);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(this.A04, this.A01));
            A00(context, A072, A073, frameLayout2, this.A07, this.A08, this.A0C);
        }
        this.A0C = false;
        C24149BwF bwF = (C24149BwF) this.A08;
        bwF.A0M = false;
        bwF.A0a.setVisibility(8);
        bwF.A0i.setVisibility(8);
        bwF.A0k.setVisibility(8);
        bwF.A0l.setVisibility(0);
        if (!bwF.A0N) {
            bwF.A0Z.setVisibility(0);
        }
        if (C24149BwF.A07(bwF) && !bwF.A0N) {
            bwF.A0s.setVisibility(8);
            bwF.A0g.setVisibility(0);
        }
        if (bwF.A0j.getVisibility() == 0) {
            C24149BwF.A02(bwF);
        }
        bwF.A0b.setVisibility(8);
        bwF.A0q.setVisibility(8);
        C24149BwF.A03(bwF);
        C24149BwF.A04(bwF);
        C24149BwF.A00(bwF);
        bwF.A0F();
        this.A08.setSystemUiVisibility(0);
        C22655BIe bIe3 = this.A07;
        bIe3.A0N = true;
        if (this.A0F != this.A0E) {
            z2 = false;
        }
        bIe3.A06(z2);
        this.A07.A0O = false;
        AnonymousClass1HF.A0T(AnonymousClass3MZ.A0F(AnonymousClass1L9.A00(context)));
        this.A0F = this.A0E;
        FrameLayout frameLayout3 = this.A05;
        if (frameLayout3 instanceof C24148BwE) {
            ((C24148BwE) frameLayout3).setIsFullscreen(this.A0C);
        }
    }

    public void BL2(C143887Fe r18, AnonymousClass206 r19, AnonymousClass205 r20, AnonymousClass4QM r21, String str, String str2, Bitmap[] bitmapArr, int i) {
        C24004Btq btq;
        int i2 = i;
        AnonymousClass205 r5 = r20;
        String str3 = str2;
        if (this.A06 != r5) {
            BF9();
            this.A06 = r5;
            this.A0B = str3;
            this.A09 = r21;
            this.A03 = i2;
        }
        if (i2 != 3) {
            str = str3;
        }
        String obj = Uri.parse(str).buildUpon().appendQueryParameter("wa_logging_event", "video_play_open").build().toString();
        AnonymousClass1KB r8 = this.A0Q;
        AnonymousClass10I r14 = this.A0X;
        C18000vb r10 = this.A0S;
        C18030ve r11 = this.A0M;
        AnonymousClass18K r12 = this.A0T;
        AnonymousClass206 r6 = r19;
        Bitmap[] bitmapArr2 = bitmapArr;
        if (i2 != 4) {
            C143887Fe A002 = C20016A3i.A00(obj);
            if (A002 == null) {
                try {
                    AnonymousClass4QM r0 = this.A09;
                    if (r0 != null) {
                        r0.A00(r5, 1);
                        this.A00 = 1;
                    }
                    AnonymousClass4WC.A00(r8, r18, r10, r11, r12, new DPT(r6, r5, this, bitmapArr2), r14, obj, false);
                    return;
                } catch (Exception unused) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("InlineVideoPlaybackImplHandler/onPlaybackError=");
                    A10.append("InlineVideoPlaybackImplHandler/fetchPageInfo - loadPage failed");
                    Log.e(C17900vP.A0D(" isTransient=", A10, true));
                    A01(this);
                    return;
                }
            } else if (r20 != null) {
                btq = A002.A06;
            } else {
                return;
            }
        } else if (r20 != null) {
            btq = new C24004Btq(str3, -1, -1);
            i2 = 4;
        } else {
            return;
        }
        AnonymousClass205 r7 = r5;
        A02(btq, r6, r7, bitmapArr2, i2);
    }

    public int BPu() {
        return this.A00;
    }

    public AnonymousClass205 BPv() {
        return this.A06;
    }

    public boolean BT0() {
        return this.A0C;
    }

    public boolean BT1() {
        return this.A0H;
    }

    public void CBJ() {
        AnonymousClass70X r0 = this.A0A;
        if (r0 != null && r0.A0a()) {
            this.A08.A08();
        }
    }

    public void CON(AnonymousClass4LQ r6, C22655BIe bIe, int i) {
        this.A07 = bIe;
        this.A0G = r6;
        Context context = this.A0I;
        int dimensionPixelSize = i - (context.getResources().getDimensionPixelSize(2131167133) * 2);
        this.A0D = (((double) (dimensionPixelSize * dimensionPixelSize)) * 9.0d) / 16.0d;
        C22655BIe bIe2 = this.A07;
        int[] viewIdsToIgnoreScaling = BID.getViewIdsToIgnoreScaling();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167091);
        bIe2.A0U = viewIdsToIgnoreScaling;
        bIe2.A08 = dimensionPixelSize2;
    }

    public DR0(Context context, AnonymousClass1L9 r3, AnonymousClass190 r4, C61862qP r5, AnonymousClass1KB r6, AnonymousClass11C r7, AnonymousClass118 r8, C18000vb r9, C18030ve r10, AnonymousClass18K r11, C32011gU r12, WamediaManager wamediaManager, C32571hP r14, AnonymousClass10I r15, AnonymousClass00H r16) {
        this.A0R = r8;
        this.A0I = context;
        this.A0M = r10;
        this.A0Q = r6;
        this.A0O = r4;
        this.A0X = r15;
        this.A0U = r12;
        this.A0T = r11;
        this.A0K = r3;
        this.A0L = r7;
        this.A0S = r9;
        this.A0V = wamediaManager;
        this.A0W = r14;
        this.A0N = new C25022CTy(r11);
        this.A0P = r5;
        this.A0Y = r16;
    }

    public void CIa(int i) {
        this.A0E = i;
    }

    public void CJ2(AnonymousClass4QM r1) {
        this.A09 = r1;
    }

    public void CJk(int i) {
        this.A0F = i;
    }
}
