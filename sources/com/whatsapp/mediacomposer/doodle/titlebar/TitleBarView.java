package com.whatsapp.mediacomposer.doodle.titlebar;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass6EY;
import X.AnonymousClass78K;
import X.AnonymousClass79D;
import X.AnonymousClass7JF;
import X.AnonymousClass7JS;
import X.AnonymousClass80G;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108985cd;
import X.C109195cy;
import X.C109455dT;
import X.C114545r0;
import X.C123936Wk;
import X.C132916nr;
import X.C136986uj;
import X.C1418277c;
import X.C1421478i;
import X.C152067nJ;
import X.C152077nK;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C19830z4;
import X.C23621Gz;
import X.C25291Nq;
import X.C28931bI;
import X.C72453Mb;
import X.C74743cP;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.pushtorecordmedia.MediaTimeDisplay;
import com.whatsapp.wds.components.button.WDSButton;

public final class TitleBarView extends RelativeLayout implements AnonymousClass009 {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public RelativeLayout A0D;
    public AnonymousClass1KB A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public AnonymousClass11C A0H;
    public AnonymousClass11P A0I;
    public C19830z4 A0J;
    public C18000vb A0K;
    public C18030ve A0L;
    public C109455dT A0M;
    public C109455dT A0N;
    public C109455dT A0O;
    public C109455dT A0P;
    public C109455dT A0Q;
    public C109455dT A0R;
    public C109455dT A0S;
    public C109455dT A0T;
    public C109455dT A0U;
    public MediaTimeDisplay A0V;
    public C28931bI A0W;
    public AnonymousClass10I A0X;
    public WDSButton A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass031 A0b;
    public Runnable A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public C136986uj A0h;
    public final C18100vl A0i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0d) {
            this.A0d = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A0L = AnonymousClass10E.A8r(A0O2);
            this.A0E = AnonymousClass10E.A12(A0O2);
            AnonymousClass10G r1 = A0O2.A00;
            this.A0Z = C000200d.A00(r1.ADA);
            this.A0a = C000200d.A00(r1.A06);
            this.A0H = AnonymousClass3Ma.A0a(A0O2);
            this.A0I = AnonymousClass10E.A6O(A0O2);
            this.A0J = AnonymousClass3Ma.A0c(A0O2);
            this.A0X = AnonymousClass10E.AL1(A0O2);
            this.A0K = AnonymousClass10E.A6Q(A0O2);
        }
        this.A0e = true;
        this.A0i = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152077nK(this));
    }

    public static final void A00(C136986uj r5, TitleBarView titleBarView) {
        C18070vi.A0d(r5, 1);
        ImageView imageView = titleBarView.A0C;
        if (imageView != null) {
            imageView.setEnabled(false);
        }
        titleBarView.getUndoDebouncer().A00 = new C152067nJ(titleBarView);
        if (!(r5.A05 == null || r5.A04 == null || r5.A0B)) {
            C108955ca.A1Q(r5.A0J, 57, 1, r5.A0G.A06());
            AnonymousClass7JF r4 = r5.A05;
            r4.A0J.A04();
            r4.A0T.A00();
            DoodleView doodleView = r4.A0P;
            if (doodleView.A0M.A09()) {
                Handler handler = doodleView.A0I;
                Runnable runnable = doodleView.A0N;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000);
            }
            r4.A0W.A08(C72453Mb.A06(AnonymousClass000.A1a(r4.A0V.A03.A00) ? 1 : 0));
            r5.A04.A03();
            AnonymousClass7JF.A05(r5.A05);
        }
        titleBarView.getUndoDebouncer().A00();
    }

    public static final void setMusicToolVisibility$lambda$25$lambda$24(TitleBarView titleBarView, View view) {
        C18070vi.A0d(titleBarView, 0);
        C136986uj r3 = titleBarView.A0h;
        if (r3 != null && !r3.A0B) {
            AnonymousClass7JS r2 = r3.A0G;
            Uri A0A2 = r2.A0A();
            if (A0A2 == null || !r2.A08.A02(A0A2).A0W()) {
                r2.A0E(7);
            } else {
                r3.A0H.A00.CMx((Integer) null, 2131892359, 2131892358, 2131898766, (Integer) null, "music_error_in_gif_mode", (String) null, (Object[]) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setShapeToolVisibility$lambda$21$lambda$20(com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r13, android.view.View r14) {
        /*
            r10 = 0
            X.C18070vi.A0d(r13, r10)
            X.6uj r4 = r13.A0h
            if (r4 == 0) goto L_0x00d8
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x00d8
            android.animation.ValueAnimator r0 = r4.A0D
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x00d8
            X.A4v r2 = r4.A0J
            X.7JS r3 = r4.A0G
            int r1 = r3.A06()
            r0 = 48
            X.C72463Mc.A1F(r2, r0, r1)
            int r0 = r3.A09()
            r2 = 5
            if (r0 == r2) goto L_0x00d8
            int r1 = r3.A09()
            r0 = 2
            if (r1 == r0) goto L_0x00d8
            r3.A0E(r2)
            X.7JF r11 = r4.A05
            if (r11 == 0) goto L_0x00d8
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r11.A0P
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00d8
            X.6UC r3 = r11.A0M
            int r0 = r3.A00
            r1.A03 = r0
            X.6ud r9 = r11.A0J
            r9.A04()
            X.0ve r2 = r11.A0I
            X.0vf r1 = X.C18040vf.A01
            r0 = 5976(0x1758, float:8.374E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r8 = 1
            if (r0 == 0) goto L_0x00d9
            X.74J r3 = r11.A0H
            X.6uj r0 = r11.A0W
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = r0.A0I
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r4)
            float r0 = r4.getY()
            int r0 = (int) r0
            int r1 = X.AnonymousClass3MW.A02(r4, r0)
            int r0 = r2.topMargin
            int r1 = r1 + r0
            r3.A0K(r1)
            X.7GH r0 = new X.7GH
            r0.<init>(r11, r10)
            r3.A0C = r0
            r2 = 3
            X.7MW r0 = new X.7MW
            r0.<init>(r11, r2)
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r3.A0E
            if (r1 == 0) goto L_0x0088
            r1.A0M = r0
        L_0x0088:
            r3.A0H = r0
            X.80E r0 = new X.80E
            r0.<init>(r11)
            if (r1 == 0) goto L_0x0093
            r1.A0R = r0
        L_0x0093:
            X.7Bo r0 = new X.7Bo
            r0.<init>(r11, r2)
            r3.A0N(r0)
            X.7GI r0 = new X.7GI
            r0.<init>(r11, r10)
            r3.A0D = r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r4)
            float r0 = r4.getY()
            int r0 = (int) r0
            int r1 = X.AnonymousClass3MW.A02(r4, r0)
            int r0 = r2.topMargin
            int r1 = r1 + r0
            r3.A00 = r1
            r3.A0Q(r8)
            java.lang.Integer r1 = X.C108955ca.A0i()
            r0 = 0
            r3.A0O(r1, r0)
        L_0x00bf:
            X.6uj r0 = r11.A0W
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            r0.setToolbarExtraVisibility(r10)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r11.A0L
            r0.A05(r8)
            X.6yX r0 = r11.A0R
            r0.A02 = r10
            X.AnonymousClass7JF.A05(r11)
            X.AnonymousClass7JF.A04(r11)
            r9.A02()
        L_0x00d8:
            return
        L_0x00d9:
            X.0vq r0 = r11.A0a
            java.lang.Object r4 = r0.get()
            X.C18070vi.A0X(r4)
            X.72m r4 = (X.AnonymousClass72m) r4
            int r1 = r3.A00
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r11.A0L
            float r0 = r0.getMinSize()
            r4.A01 = r1
            r4.A00 = r0
            X.5lP r0 = r4.A0I
            r0.notifyDataSetChanged()
            X.71R r0 = r4.A0M
            com.whatsapp.ClearableEditText r0 = r0.A0A
            X.AnonymousClass3MW.A1S(r0)
            android.graphics.Rect r0 = r11.A07
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r13 = r4.A0Q
            int r3 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            r13.setPadding(r3, r2, r1, r0)
            X.73x r12 = r11.A0O
            X.71z r7 = r11.A0Q
            r13.setVisibility(r10)
            com.whatsapp.mediacomposer.MediaComposerFragment r1 = r4.A0E
            boolean r0 = r1.A2T()
            r4.A04 = r0
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.VideoComposerFragment     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x0131
            com.whatsapp.mediacomposer.VideoComposerFragment r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x0279 }
            X.70X r0 = r1.A0W     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x012a
            android.graphics.Bitmap r6 = r0.A08()     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r6 != 0) goto L_0x0182
        L_0x012a:
            java.io.File r0 = r1.A0Z     // Catch:{ OutOfMemoryError -> 0x0279 }
            android.graphics.Bitmap r6 = X.C1408873l.A01(r0)     // Catch:{ OutOfMemoryError -> 0x0279 }
            goto L_0x017e
        L_0x0131:
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.ImageComposerFragment     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x0174
            com.whatsapp.mediacomposer.ImageComposerFragment r1 = (com.whatsapp.mediacomposer.ImageComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x0279 }
            boolean r0 = r1.A2W()     // Catch:{ OutOfMemoryError -> 0x0279 }
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x015a
            X.7JF r0 = r1.A0J     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x00bf
            X.70N r0 = r0.A0V     // Catch:{ OutOfMemoryError -> 0x0279 }
            X.69K r0 = r0.A01()     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x00bf
            android.graphics.Bitmap r1 = r0.A01     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r1 == 0) goto L_0x00bf
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 != 0) goto L_0x016f
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)     // Catch:{ OutOfMemoryError -> 0x0279 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0279 }
        L_0x015a:
            com.whatsapp.mediaview.PhotoView r0 = r1.A06     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x00bf
            android.graphics.Bitmap r1 = r0.getPhoto()     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r1 == 0) goto L_0x00bf
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 != 0) goto L_0x016f
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)     // Catch:{ OutOfMemoryError -> 0x0279 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0279 }
        L_0x016f:
            android.graphics.Bitmap r6 = r1.copy(r0, r8)     // Catch:{ OutOfMemoryError -> 0x0279 }
            goto L_0x017e
        L_0x0174:
            com.whatsapp.mediacomposer.GifComposerFragment r1 = (com.whatsapp.mediacomposer.GifComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x0279 }
            X.70X r0 = r1.A00     // Catch:{ OutOfMemoryError -> 0x0279 }
            if (r0 == 0) goto L_0x00bf
            android.graphics.Bitmap r6 = r0.A08()     // Catch:{ OutOfMemoryError -> 0x0279 }
        L_0x017e:
            if (r6 != 0) goto L_0x0182
            goto L_0x00bf
        L_0x0182:
            android.graphics.Bitmap$Config r1 = r6.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 != r0) goto L_0x0190
            boolean r0 = r6.isMutable()
            if (r0 != 0) goto L_0x0196
        L_0x0190:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0275 }
            android.graphics.Bitmap r6 = r6.copy(r0, r8)     // Catch:{ OutOfMemoryError -> 0x0275 }
        L_0x0196:
            X.C18070vi.A0d(r6, r10)
            X.71z r4 = r12.A0F
            android.graphics.RectF r2 = r4.A08
            if (r2 == 0) goto L_0x0270
            android.graphics.Canvas r5 = X.C108945cZ.A0I(r6)
            int r0 = r4.A02
            int r0 = r0 % 180
            r1 = 90
            if (r0 != r1) goto L_0x026a
            float r14 = r2.height()
        L_0x01af:
            int r0 = r4.A02
            int r0 = r0 % 180
            if (r0 != r1) goto L_0x0264
            float r3 = r2.width()
        L_0x01b9:
            int r0 = r6.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r14
            int r0 = r6.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r3
            r5.scale(r1, r0)
            android.graphics.Matrix r0 = r4.A0A
            r5.concat(r0)
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            r5.translate(r1, r0)
            X.70N r4 = r12.A0G
            X.69K r3 = r4.A01()
            if (r3 == 0) goto L_0x01e8
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x01e5
            android.os.SystemClock.elapsedRealtime()
        L_0x01e5:
            r3.A0M(r5)
        L_0x01e8:
            java.util.List r0 = r4.A04
            boolean r0 = X.C1410073x.A03(r12, r0)
            if (r0 == 0) goto L_0x0223
            r5.save()
            int r0 = r12.A00
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r1
            r5.scale(r0, r0)
            X.69K r0 = r4.A01()
            if (r0 != 0) goto L_0x0260
            android.graphics.Bitmap r14 = r12.A05
            if (r14 == 0) goto L_0x0211
            android.graphics.PointF r0 = r12.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r12.A0C
            r5.drawBitmap(r14, r2, r1, r0)
        L_0x0211:
            android.graphics.Bitmap r14 = r12.A06
            if (r14 == 0) goto L_0x0220
            android.graphics.PointF r0 = r12.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r12.A0C
            r5.drawBitmap(r14, r2, r1, r0)
        L_0x0220:
            r5.restore()
        L_0x0223:
            java.util.List r0 = r4.A03()
            java.util.Iterator r4 = r0.iterator()
        L_0x022b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0270
            X.73u r2 = X.C108945cZ.A0k(r4)
            if (r3 == 0) goto L_0x0255
            boolean r0 = r2 instanceof X.AnonymousClass69V
            if (r0 == 0) goto L_0x0255
            r1 = r2
            X.69V r1 = (X.AnonymousClass69V) r1
            X.70B r0 = r1.A04
            boolean r0 = r0 instanceof X.C1196869l
            if (r0 == 0) goto L_0x0255
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x024b
            android.os.SystemClock.elapsedRealtime()
        L_0x024b:
            r1.A03 = r3
            r1.A06 = r8
            r1.A0M(r5)
            r1.A06 = r10
            goto L_0x022b
        L_0x0255:
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x025c
            android.os.SystemClock.elapsedRealtime()
        L_0x025c:
            r2.A0M(r5)
            goto L_0x022b
        L_0x0260:
            X.C1410073x.A01(r5, r12)
            goto L_0x0211
        L_0x0264:
            float r3 = r2.height()
            goto L_0x01b9
        L_0x026a:
            float r14 = r2.width()
            goto L_0x01af
        L_0x0270:
            r13.A01(r6, r7)
            goto L_0x00bf
        L_0x0275:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground copying bitmap"
            goto L_0x027c
        L_0x0279:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground getting bitmap from preview container"
        L_0x027c:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setShapeToolVisibility$lambda$21$lambda$20(com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView, android.view.View):void");
    }

    public static final void setTemplateToolVisibility$lambda$23$lambda$22(TitleBarView titleBarView, View view) {
        C18070vi.A0d(titleBarView, 0);
        C136986uj r0 = titleBarView.A0h;
        if (r0 != null) {
            r0.A03();
        }
    }

    public static final void setTooltipInPosition$lambda$12$lambda$11(TitleBarView titleBarView, View view) {
        C18070vi.A0d(titleBarView, 0);
        A01(titleBarView);
    }

    public static final void setTooltipInPosition$lambda$13(TitleBarView titleBarView) {
        C18070vi.A0d(titleBarView, 0);
        WaTextView waTextView = titleBarView.A0F;
        if (waTextView == null) {
            C18070vi.A11("mediaQualityToolTip");
            throw null;
        } else {
            waTextView.setVisibility(0);
        }
    }

    public final void A04(AnonymousClass7JS r12, C136986uj r13, boolean z) {
        KeyEvent.Callback callback;
        ImageView imageView;
        this.A0h = r13;
        this.A04 = AnonymousClass3Ma.A0C(this, 2131428012);
        this.A0Y = (WDSButton) C18070vi.A05(this, 2131430123);
        this.A0D = (RelativeLayout) C18070vi.A05(this, 2131436269);
        this.A01 = C18070vi.A05(this, 2131432438);
        this.A02 = C18070vi.A05(this, 2131436219);
        this.A09 = AnonymousClass3Ma.A0C(this, 2131433732);
        this.A0G = AnonymousClass3Ma.A0N(this, 2131436044);
        this.A05 = AnonymousClass3Ma.A0C(this, 2131429722);
        this.A0V = (MediaTimeDisplay) C18070vi.A05(this, 2131433897);
        this.A0F = AnonymousClass3Ma.A0N(this, 2131432421);
        ViewStub A0F2 = AnonymousClass3MW.A0F(this, 2131432443);
        if (A0F2 != null) {
            A0F2.setLayoutResource(2131625975);
        }
        ImageView imageView2 = null;
        if (A0F2 != null) {
            callback = A0F2.inflate();
        } else {
            callback = null;
        }
        if (callback instanceof ImageView) {
            imageView2 = (ImageView) callback;
        }
        this.A06 = imageView2;
        WaTextView waTextView = this.A0G;
        if (waTextView != null) {
            AnonymousClass3MW.A1Q(waTextView);
            this.A0Q = new C109455dT(AnonymousClass3MY.A04(this), 2131231878);
            this.A0T = new C109455dT(AnonymousClass3MY.A04(this), 2131232357);
            this.A0N = new C109455dT(AnonymousClass3MY.A04(this), 2131231839);
            this.A0M = new C109455dT(AnonymousClass3MY.A04(this), 2131231822);
            int i = 0;
            this.A0O = new C109455dT(AnonymousClass3MY.A04(this), 0);
            this.A0W = C28931bI.A00(this, 2131436453);
            C18030ve abProps = getAbProps();
            C18040vf r4 = C18040vf.A02;
            if (!C18020vd.A05(r4, abProps, 12296) && !C18020vd.A05(r4, abProps, 10024)) {
                this.A0C = (ImageView) C28931bI.A00(this, 2131436498).A02();
                this.A0U = new C109455dT(AnonymousClass3MY.A04(this), 2131232370);
            }
            WaTextView waTextView2 = this.A0G;
            if (waTextView2 != null) {
                AnonymousClass3MW.A1S(waTextView2);
                this.A00 = C19740yt.A00(getContext(), 2131103238);
                String str = "doneButton";
                if (z) {
                    WDSButton wDSButton = this.A0Y;
                    if (wDSButton != null) {
                        ViewGroup.LayoutParams layoutParams = wDSButton.getLayoutParams();
                        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.removeRule(9);
                        layoutParams2.removeRule(20);
                        layoutParams2.addRule(21);
                        layoutParams2.addRule(11);
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                DisplayMetrics displayMetrics = AnonymousClass000.A0Y(this).getDisplayMetrics();
                if (((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) {
                    ImageView imageView3 = this.A04;
                    if (imageView3 != null) {
                        imageView3.setPadding(0, 0, 0, 0);
                        ImageView imageView4 = this.A05;
                        if (imageView4 != null) {
                            imageView4.setPadding(0, 0, 0, 0);
                            ImageView imageView5 = this.A0C;
                            if (imageView5 != null) {
                                imageView5.setPadding(0, 0, 0, 0);
                            }
                            ImageView imageView6 = this.A06;
                            if (imageView6 != null) {
                                imageView6.setPadding(0, 0, 0, 0);
                            }
                        }
                        C18070vi.A11("cropTool");
                        throw null;
                    }
                    C18070vi.A11("backButton");
                    throw null;
                }
                ImageView imageView7 = this.A09;
                if (imageView7 != null) {
                    C109455dT r0 = this.A0Q;
                    if (r0 == null) {
                        str = "penToolDrawable";
                    } else {
                        imageView7.setImageDrawable(r0);
                        WaTextView waTextView3 = this.A0G;
                        if (waTextView3 != null) {
                            C109455dT r02 = this.A0T;
                            if (r02 == null) {
                                str = "textToolDrawable";
                            } else {
                                waTextView3.setBackground(r02);
                                ImageView imageView8 = this.A04;
                                if (imageView8 != null) {
                                    C18000vb whatsAppLocale = getWhatsAppLocale();
                                    C109455dT r03 = this.A0M;
                                    if (r03 == null) {
                                        str = "closeButtonDrawable";
                                    } else {
                                        C74743cP.A03(r03, imageView8, whatsAppLocale);
                                        ImageView imageView9 = this.A05;
                                        if (imageView9 != null) {
                                            C109455dT r04 = this.A0N;
                                            if (r04 == null) {
                                                str = "cropToolDrawable";
                                            } else {
                                                imageView9.setImageDrawable(r04);
                                                ImageView imageView10 = this.A0C;
                                                if (imageView10 != null) {
                                                    imageView10.setImageDrawable(this.A0U);
                                                }
                                                ImageView imageView11 = this.A06;
                                                if (imageView11 != null) {
                                                    C109455dT r05 = this.A0O;
                                                    if (r05 == null) {
                                                        str = "mediaQualityButtonDrawable";
                                                    } else {
                                                        imageView11.setImageDrawable(r05);
                                                    }
                                                }
                                                ImageView imageView12 = this.A04;
                                                if (imageView12 != null) {
                                                    AnonymousClass78K.A00(imageView12, r13, 37);
                                                    WDSButton wDSButton2 = this.A0Y;
                                                    if (wDSButton2 != null) {
                                                        AnonymousClass78K.A00(wDSButton2, r13, 38);
                                                        ImageView imageView13 = this.A0C;
                                                        if (imageView13 != null) {
                                                            AnonymousClass3MZ.A1O(imageView13, this, r13, 15);
                                                        }
                                                        ImageView imageView14 = this.A0C;
                                                        if (imageView14 != null) {
                                                            C1421478i.A00(imageView14, r13, 9);
                                                        }
                                                        ImageView imageView15 = this.A09;
                                                        if (imageView15 != null) {
                                                            AnonymousClass78K.A00(imageView15, r13, 39);
                                                            ImageView imageView16 = this.A05;
                                                            if (imageView16 != null) {
                                                                AnonymousClass78K.A00(imageView16, r13, 40);
                                                                WaTextView waTextView4 = this.A0G;
                                                                if (waTextView4 != null) {
                                                                    AnonymousClass78K.A00(waTextView4, r13, 41);
                                                                    ImageView imageView17 = this.A06;
                                                                    if (imageView17 != null) {
                                                                        AnonymousClass78K.A00(imageView17, r13, 31);
                                                                    }
                                                                    if (C18020vd.A05(r4, getAbProps(), 4049) && (imageView = this.A06) != null) {
                                                                        C1421478i.A00(imageView, r13, 8);
                                                                    }
                                                                    if (C72453Mb.A1a(r12.A01.A0H)) {
                                                                        setShapeToolVisibility(8);
                                                                    } else {
                                                                        setShapeToolVisibility(0);
                                                                    }
                                                                    if (r12.A0I) {
                                                                        RelativeLayout relativeLayout = this.A0D;
                                                                        if (relativeLayout == null) {
                                                                            str = "toolBarExtraView";
                                                                        } else {
                                                                            relativeLayout.setVisibility(8);
                                                                            View view = this.A01;
                                                                            if (view == null) {
                                                                                str = "mediaTools";
                                                                            } else {
                                                                                view.setVisibility(8);
                                                                                ImageView imageView18 = this.A0C;
                                                                                if (imageView18 != null) {
                                                                                    imageView18.setVisibility(8);
                                                                                }
                                                                                WDSButton wDSButton3 = this.A0Y;
                                                                                if (wDSButton3 != null) {
                                                                                    wDSButton3.setVisibility(8);
                                                                                    ImageView imageView19 = this.A09;
                                                                                    if (imageView19 == null) {
                                                                                        str = "penTool";
                                                                                    } else {
                                                                                        imageView19.setVisibility(8);
                                                                                        WaTextView waTextView5 = this.A0G;
                                                                                        if (waTextView5 == null) {
                                                                                            str = "textTool";
                                                                                        } else {
                                                                                            waTextView5.setVisibility(8);
                                                                                            ImageView imageView20 = this.A05;
                                                                                            if (imageView20 == null) {
                                                                                                str = "cropTool";
                                                                                            } else {
                                                                                                imageView20.setVisibility(8);
                                                                                                WaTextView waTextView6 = this.A0F;
                                                                                                if (waTextView6 == null) {
                                                                                                    str = "mediaQualityToolTip";
                                                                                                } else {
                                                                                                    waTextView6.setVisibility(8);
                                                                                                    ImageView imageView21 = this.A06;
                                                                                                    if (imageView21 != null) {
                                                                                                        imageView21.setVisibility(8);
                                                                                                    }
                                                                                                    ImageView imageView22 = this.A0B;
                                                                                                    if (imageView22 != null) {
                                                                                                        imageView22.setVisibility(8);
                                                                                                    }
                                                                                                    FrameLayout frameLayout = this.A03;
                                                                                                    if (frameLayout != null) {
                                                                                                        frameLayout.setVisibility(8);
                                                                                                    }
                                                                                                    C28931bI r06 = this.A0W;
                                                                                                    if (r06 == null) {
                                                                                                        str = "templateTooltipView";
                                                                                                    } else {
                                                                                                        r06.A04(8);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    setTemplateToolVisibility(8);
                                                                    if (!r12.A0I()) {
                                                                        i = 8;
                                                                    }
                                                                    setMusicToolVisibility(i);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C18070vi.A11("cropTool");
                                        throw null;
                                    }
                                }
                                C18070vi.A11("backButton");
                                throw null;
                            }
                        }
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                C18070vi.A11("penTool");
                throw null;
            }
        }
        C18070vi.A11("textTool");
        throw null;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0L = r2;
    }

    public final void setFont(int i) {
        int i2;
        if (i == 2) {
            i2 = getResources().getDimensionPixelSize(2131169016);
        } else {
            i2 = 0;
        }
        WaTextView waTextView = this.A0G;
        if (waTextView == null) {
            C18070vi.A11("textTool");
            throw null;
        }
        waTextView.setTypeface(C123936Wk.A00(AnonymousClass3MY.A04(waTextView), i));
        waTextView.setPadding(0, i2, i2, 0);
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setMediaQualityTooltipUtil(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0Z = r2;
    }

    public final void setMusicAlbumArtworkDownloader(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0a = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setToolBarExtra(RelativeLayout relativeLayout) {
        C18070vi.A0d(relativeLayout, 0);
        this.A0D = relativeLayout;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A0X = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public static final void A01(TitleBarView titleBarView) {
        WaTextView waTextView = titleBarView.A0F;
        if (waTextView != null) {
            if (waTextView.getVisibility() == 0) {
                AlphaAnimation A0H2 = C108985cd.A0H();
                C108985cd.A13(A0H2, new AnonymousClass1YY());
                A0H2.setAnimationListener(new AnonymousClass79D(titleBarView, 0));
                WaTextView waTextView2 = titleBarView.A0F;
                if (waTextView2 != null) {
                    waTextView2.startAnimation(A0H2);
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("mediaQualityToolTip");
        throw null;
    }

    private final C132916nr getUndoDebouncer() {
        return (C132916nr) this.A0i.getValue();
    }

    private final void setTemplateToolVisibility(int i) {
        ViewStub A0F2;
        ImageView imageView = this.A0B;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else if (i == 0 && (A0F2 = AnonymousClass3MW.A0F(this, 2131432433)) != null) {
            View inflate = A0F2.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate;
            C109455dT r1 = new C109455dT(AnonymousClass3MY.A04(this), 2131232347);
            imageView2.setImageDrawable(r1);
            AnonymousClass78K.A00(imageView2, this, 35);
            this.A0B = imageView2;
            this.A0S = r1;
        }
    }

    public final void A02() {
        C28931bI r0 = this.A0W;
        if (r0 != null) {
            if (r0.A01() == 0) {
                C28931bI r02 = this.A0W;
                if (r02 != null) {
                    View view = r02.A00;
                    if (view != null) {
                        view.clearAnimation();
                    }
                    AlphaAnimation A0H2 = C108985cd.A0H();
                    C108985cd.A13(A0H2, new AnonymousClass1YY());
                    C114545r0.A00(A0H2, this, 11);
                    C28931bI r03 = this.A0W;
                    if (r03 != null) {
                        r03.A02().startAnimation(A0H2);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C18070vi.A11("templateTooltipView");
        throw null;
    }

    public final void A03(Animation animation) {
        View view = this.A02;
        if (view != null) {
            if (view.getVisibility() != 0) {
                View view2 = this.A02;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.A02;
                    if (view3 != null) {
                        view3.startAnimation(animation);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C18070vi.A11("titleBar");
        throw null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0b;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0b = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final int getCropToolId() {
        ImageView imageView = this.A05;
        if (imageView != null) {
            return imageView.getId();
        }
        C18070vi.A11("cropTool");
        throw null;
    }

    public final float getCropToolOffsetX() {
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
        } else {
            float x = imageView.getX();
            ImageView imageView2 = this.A05;
            if (imageView2 != null) {
                float x2 = x - imageView2.getX();
                ImageView imageView3 = this.A05;
                if (imageView3 != null) {
                    return x2 - imageView3.getTranslationX();
                }
            }
            C18070vi.A11("cropTool");
        }
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass00H getMediaQualityTooltipUtil() {
        AnonymousClass00H r0 = this.A0Z;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaQualityTooltipUtil");
        throw null;
    }

    public final float getMediaSettingsToolOffsetX() {
        float f;
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
            throw null;
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A06;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A06;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final AnonymousClass00H getMusicAlbumArtworkDownloader() {
        AnonymousClass00H r0 = this.A0a;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("musicAlbumArtworkDownloader");
        throw null;
    }

    public final float getMusicToolOffsetX() {
        float f;
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
            throw null;
        }
        float x = imageView.getX();
        FrameLayout frameLayout = this.A03;
        float f2 = 0.0f;
        if (frameLayout != null) {
            f = frameLayout.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 != null) {
            f2 = frameLayout2.getTranslationX();
        }
        return f3 - f2;
    }

    public final int getPenToolId() {
        ImageView imageView = this.A09;
        if (imageView != null) {
            return imageView.getId();
        }
        C18070vi.A11("penTool");
        throw null;
    }

    public final Integer getShapeToolId() {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            return Integer.valueOf(imageView.getId());
        }
        return null;
    }

    public final float getShapeToolOffsetX() {
        float f;
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
            throw null;
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A0A;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A0A;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final View getStartingViewFromToolbarExtra() {
        ImageView imageView = this.A04;
        if (imageView != null) {
            return imageView;
        }
        C18070vi.A11("backButton");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final float getTemplateToolOffsetX() {
        float f;
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
            throw null;
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A0B;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A0B;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final int getTextToolId() {
        WaTextView waTextView = this.A0G;
        if (waTextView != null) {
            return waTextView.getId();
        }
        C18070vi.A11("textTool");
        throw null;
    }

    public final float getTextToolOffsetX() {
        ImageView imageView = this.A09;
        if (imageView == null) {
            C18070vi.A11("penTool");
        } else {
            float x = imageView.getX();
            WaTextView waTextView = this.A0G;
            if (waTextView != null) {
                float x2 = x - waTextView.getX();
                WaTextView waTextView2 = this.A0G;
                if (waTextView2 != null) {
                    return x2 - waTextView2.getTranslationX();
                }
            }
            C18070vi.A11("textTool");
        }
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final Animator getTitleBarHideAnimator() {
        Property property = View.ALPHA;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 1065353216;
        A1V[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, A1V);
        C109195cy.A02(ofFloat, this, 23);
        return ofFloat;
    }

    public final Animator getTitleBarShowAnimator() {
        Property property = View.ALPHA;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, A1V);
        C109195cy.A02(ofFloat, this, 24);
        return ofFloat;
    }

    public final RelativeLayout getToolbarExtra() {
        RelativeLayout relativeLayout = this.A0D;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        C18070vi.A11("toolBarExtraView");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A0X;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setCloseButtonAlpha(float f) {
        ImageView imageView = this.A04;
        if (imageView == null) {
            C18070vi.A11("backButton");
            throw null;
        } else {
            imageView.setAlpha(f);
        }
    }

    public final void setCropToolVisibility(int i) {
        ImageView imageView = this.A05;
        if (imageView == null) {
            C18070vi.A11("cropTool");
            throw null;
        } else {
            imageView.setVisibility(i);
        }
    }

    public final void setCropToolX(float f) {
        ImageView imageView = this.A05;
        if (imageView == null) {
            C18070vi.A11("cropTool");
            throw null;
        } else {
            imageView.setTranslationX(f);
        }
    }

    public final void setMediaQualityVisibility(int i) {
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public final void setMediaSettingsToolX(float f) {
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setMediaToolsVisibility(int i) {
        View view = this.A01;
        if (view == null) {
            C18070vi.A11("mediaTools");
            throw null;
        } else {
            view.setVisibility(i);
        }
    }

    public final void setMusicToolX(float f) {
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f);
        }
    }

    public final void setPenToolDrawableStrokePreview(boolean z) {
        C109455dT r0 = this.A0Q;
        if (r0 == null) {
            C18070vi.A11("penToolDrawable");
            throw null;
        } else {
            r0.A05 = z;
        }
    }

    public final void setSelectedSong(C1418277c r4) {
        if (r4 == null) {
            C109455dT r1 = this.A0P;
            if (r1 != null) {
                r1.A04 = false;
                r1.invalidateSelf();
            }
            ImageView imageView = this.A08;
            if (imageView != null) {
                imageView.setImageDrawable((Drawable) null);
                return;
            }
            return;
        }
        String str = r4.A04;
        if (str != null && !r4.A0B) {
            ((AnonymousClass6EY) getMusicAlbumArtworkDownloader().get()).A0C(str, new AnonymousClass80G(this));
        }
    }

    public final void setShapeToolDrawableStrokePreview(boolean z) {
        C109455dT r0 = this.A0R;
        if (r0 != null) {
            r0.A05 = z;
        }
    }

    public final void setShapeToolVisibility(int i) {
        ViewStub A0F2;
        ImageView imageView = this.A0A;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else if (i == 0 && (A0F2 = AnonymousClass3MW.A0F(this, 2131435352)) != null) {
            View inflate = A0F2.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate;
            Context A042 = AnonymousClass3MY.A04(this);
            int i2 = 2131232730;
            if (C25291Nq.A04(getAbProps(), 10925)) {
                i2 = 2131232331;
            }
            C109455dT r1 = new C109455dT(A042, i2);
            imageView2.setImageDrawable(r1);
            AnonymousClass78K.A00(imageView2, this, 33);
            this.A0A = imageView2;
            this.A0R = r1;
        }
    }

    public final void setShapeToolX(float f) {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setTemplateToolX(float f) {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setTextToolX(float f) {
        WaTextView waTextView = this.A0G;
        if (waTextView == null) {
            C18070vi.A11("textTool");
            throw null;
        } else {
            waTextView.setTranslationX(f);
        }
    }

    public final void setToolbarExtraVisibility(int i) {
        RelativeLayout relativeLayout = this.A0D;
        if (relativeLayout == null) {
            C18070vi.A11("toolBarExtraView");
            throw null;
        } else {
            relativeLayout.setVisibility(i);
        }
    }

    public final void setUndoButtonVisibility(int i) {
        Interpolator r0;
        ImageView imageView = this.A0C;
        if (imageView != null && imageView.getVisibility() != i) {
            imageView.setVisibility(i);
            float f = 1.0f;
            float f2 = 0.0f;
            if (i == 4) {
                f2 = 1.0f;
                f = 0.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
            if (i == 4) {
                r0 = new AnonymousClass1YY();
            } else {
                r0 = new C23621Gz();
            }
            C108985cd.A13(alphaAnimation, r0);
            imageView.startAnimation(alphaAnimation);
        }
    }

    public final void setUndoToolX(float f) {
        ImageView imageView = this.A0C;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    private final void setMusicToolVisibility(int i) {
        C28931bI A0s = C72453Mb.A0s(this, 2131432403);
        A0s.A04(i);
        if (i == 0) {
            this.A03 = (FrameLayout) A0s.A02();
            this.A07 = AnonymousClass3MW.A0H(A0s.A02(), 2131432401);
            this.A08 = AnonymousClass3MW.A0H(A0s.A02(), 2131432402);
            C109455dT r1 = new C109455dT(AnonymousClass3MY.A04(this), 2131233372);
            this.A0P = r1;
            ImageView imageView = this.A07;
            if (imageView != null) {
                imageView.setImageDrawable(r1);
            }
            A0s.A05(new AnonymousClass78K(this, 36));
        }
    }

    public final void setBackButtonDrawable(boolean z) {
        int i = 2131231822;
        if (z) {
            i = 2131231675;
        }
        C74743cP A002 = AnonymousClass3NL.A00(getContext(), getWhatsAppLocale(), i);
        C109455dT r0 = this.A0M;
        if (r0 != null) {
            r0.A03 = A002;
            r0.invalidateSelf();
            C109455dT r1 = this.A0M;
            if (r1 != null) {
                r1.A02 = this.A00;
                r1.A00 = 1.0f;
                r1.invalidateSelf();
                ImageView imageView = this.A04;
                String str = "backButton";
                if (imageView != null) {
                    C109455dT r02 = this.A0M;
                    if (r02 != null) {
                        imageView.setImageDrawable(r02);
                        ImageView imageView2 = this.A04;
                        if (imageView2 != null) {
                            imageView2.requestLayout();
                            ImageView imageView3 = this.A04;
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                                WDSButton wDSButton = this.A0Y;
                                if (wDSButton == null) {
                                    str = "doneButton";
                                } else {
                                    wDSButton.setVisibility(8);
                                    return;
                                }
                            }
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        C18070vi.A11("closeButtonDrawable");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ TitleBarView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
