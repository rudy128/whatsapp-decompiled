package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$bottomSheetBehavior$1;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;

/* renamed from: X.6Gp  reason: invalid class name */
public abstract class AnonymousClass6Gp extends AnonymousClass70K implements AnonymousClass89L {
    public ColorStateList A00;
    public BottomSheetBehavior A01 = new StatusPlaybackPageItemBase$bottomSheetBehavior$1(this);
    public StatusPlaybackProgressView A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public final Handler A0D;
    public final AnonymousClass1L9 A0E;
    public final AnonymousClass1KB A0F;
    public final AnonymousClass11S A0G;
    public final C40751vD A0H;
    public final C36531o3 A0I;
    public final AnonymousClass11C A0J;
    public final AnonymousClass1WX A0K;
    public final C18030ve A0L;
    public final C24641Lc A0M;
    public final AnonymousClass6p9 A0N;
    public final C1596985n A0O;
    public final AnonymousClass1Ez A0P;
    public final AnonymousClass1Ez A0Q;
    public final AnonymousClass1Ez A0R;
    public final AnonymousClass10I A0S;
    public final AnonymousClass00H A0T;
    public final Runnable A0U;
    public final boolean A0V;
    public final AnonymousClass11P A0W;
    public final AnonymousClass00H A0X;

    public AnonymousClass6Gp(AnonymousClass1L9 r5, AnonymousClass1KB r6, AnonymousClass11S r7, C40751vD r8, C36531o3 r9, AnonymousClass11C r10, AnonymousClass11P r11, AnonymousClass1WX r12, C18030ve r13, C24641Lc r14, AnonymousClass6p9 r15, AnonymousClass10I r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A0W = r11;
        this.A0L = r13;
        this.A0F = r6;
        this.A0S = r16;
        this.A0E = r5;
        this.A0K = r12;
        this.A0J = r10;
        this.A0N = r15;
        this.A0M = r14;
        this.A0H = r8;
        this.A0I = r9;
        this.A0G = r7;
        this.A0X = r17;
        this.A0T = r18;
        this.A0V = C18020vd.A05(C18040vf.A01, r14.A01, 9228);
        this.A0R = new AnonymousClass1Ez(true);
        this.A0P = new AnonymousClass1Ez(true);
        this.A0Q = new AnonymousClass1Ez(true);
        this.A0D = C17890vO.A0D();
        this.A0U = new AnonymousClass7RH((Object) this, 42);
        this.A0O = new AnonymousClass7MF(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r7.A0A != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.graphics.Rect r8) {
        /*
            r7 = this;
            r4 = 0
            super.A0I(r8)
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x009e
            X.70R r1 = r7.A0L()
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x009a
            com.whatsapp.ui.media.MediaCaptionTextView r3 = r1.A06()
        L_0x0014:
            if (r3 == 0) goto L_0x001f
            int r2 = r8.left
            int r1 = r8.right
            int r0 = r8.bottom
            r3.setPadding(r2, r4, r1, r0)
        L_0x001f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r7.A01
            android.content.Context r0 = r7.A0J()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168806(0x7f070e26, float:1.7951924E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r8.bottom
            int r1 = r1 + r0
            r2.A0V(r1)
        L_0x0036:
            r7.A04()
        L_0x0039:
            X.70R r5 = r7.A0L()
            android.view.View r3 = r5.A03
            if (r3 == 0) goto L_0x004a
            int r2 = r8.left
            int r1 = r8.right
            int r0 = r8.bottom
            r3.setPadding(r2, r4, r1, r0)
        L_0x004a:
            X.70O r2 = r7.A0K()
            boolean r0 = r2 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x0072
            X.6GW r2 = (X.AnonymousClass6GW) r2
            android.content.Context r0 = X.AnonymousClass70K.A0B(r2)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168875(0x7f070e6b, float:1.7952064E38)
            int r6 = r1.getDimensionPixelSize(r0)
            X.5fs r4 = r2.A0G
            int r3 = r8.left
            int r2 = r8.top
            int r2 = r2 + r6
            int r1 = r8.right
            int r0 = r8.bottom
            int r6 = r6 + r0
            r4.setPadding(r3, r2, r1, r6)
        L_0x0072:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0099
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0099
            X.6p9 r0 = r7.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r0.A01
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof com.whatsapp.status.playback.StatusPlaybackActivity
            if (r0 == 0) goto L_0x0099
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            if (r1 == 0) goto L_0x0099
            boolean r1 = r1.A0V
            r0 = 1
            if (r1 != r0) goto L_0x0099
            android.view.ViewGroup r1 = r5.A03()
            int r0 = r8.top
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x0099:
            return
        L_0x009a:
            android.view.View r3 = r1.A00
            goto L_0x0014
        L_0x009e:
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0039
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0I(android.graphics.Rect):void");
    }

    public abstract AnonymousClass70O A0K();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M() {
        /*
            r5 = this;
            r0 = 1
            r5.A05 = r0
            X.00H r0 = r5.A0X
            java.lang.Object r2 = r0.get()
            X.73q r2 = (X.C1409373q) r2
            boolean r1 = r5.A04
            r2.A03 = r1
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0016
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            X.C1409373q.A04(r2, r0)
            X.6p9 r2 = r5.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = r2.A02
            java.util.List r4 = r1.A0w
            if (r4 == 0) goto L_0x003a
            X.00H r0 = r1.A0i
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.2lE r3 = (X.C58772lE) r3
            X.206 r2 = r2.A00
            int r1 = r1.A01
            r0 = 9
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r0 = 0
            r3.A01(r2, r4, r1, r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.String r0 = "statusManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0M():void");
    }

    public abstract void A0Q();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(int r4) {
        /*
            r3 = this;
            r0 = 4
            if (r4 != r0) goto L_0x0035
            X.70R r2 = r3.A0L()
            android.view.View r1 = r2.A01()
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewGroup r0 = r2.A08
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0019
            r0.setAlpha(r1)
        L_0x0019:
            boolean r0 = r2 instanceof X.C120886Gk
            if (r0 == 0) goto L_0x002d
            X.6Gk r2 = (X.C120886Gk) r2
            X.1bI r0 = r2.A0D
            if (r0 == 0) goto L_0x0029
            android.view.View r0 = r0.A02()
            if (r0 != 0) goto L_0x0031
        L_0x0029:
            r3.A0N()
        L_0x002c:
            return
        L_0x002d:
            android.view.View r0 = X.AnonymousClass70R.A00(r2)
        L_0x0031:
            r0.setAlpha(r1)
            goto L_0x0029
        L_0x0035:
            r0 = 3
            if (r4 == r0) goto L_0x002c
            r3.A0P()
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0R(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0255, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r10.A02, 6033) == false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bd, code lost:
        if (r0 == null) goto L_0x01bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(android.view.View r17) {
        /*
            r16 = this;
            r4 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StatusPlaybackPage/onViewCreated page="
            r11 = r16
            X.C108985cd.A1H(r11, r0, r1)
            X.6p9 r0 = r11.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r0.A01
            X.C17900vP.A0b(r0, r1)
            X.70R r7 = r11.A0L()
            android.view.ViewGroup r0 = r7.A02()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            X.C18070vi.A0z(r0, r2)
            X.1qK r0 = (X.C37891qK) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r11.A01
            r0.A00(r1)
            r0 = 14
            X.C114315qV.A00(r1, r11, r0)
            com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$onViewCreated$contentSheetBehaviour$1 r1 = new com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$onViewCreated$contentSheetBehaviour$1
            r1.<init>(r11)
            android.view.View r0 = r7.A02
            if (r0 == 0) goto L_0x02fc
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.C18070vi.A0z(r0, r2)
            X.1qK r0 = (X.C37891qK) r0
            r0.A00(r1)
            X.5qO r0 = new X.5qO
            r0.<init>(r11)
            r1.A0a(r0)
            android.view.ViewGroup r1 = r7.A03()
            X.70O r0 = r11.A0K()
            android.view.View r0 = r0.A0B()
            r1.addView(r0)
            X.70O r0 = r11.A0K()
            boolean r0 = r0 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x02de
            r0 = 1
        L_0x0065:
            r5 = 0
            if (r0 != 0) goto L_0x02db
            r2 = r11
            X.6Gn r2 = (X.AnonymousClass6Gn) r2
            X.206 r1 = r2.A07
            boolean r0 = r1 instanceof X.C439421n
            if (r0 != 0) goto L_0x007f
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x007f
            X.21V r1 = (X.AnonymousClass21V) r1
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = r1.A18()
            if (r1 != 0) goto L_0x0081
        L_0x007f:
            java.lang.String r1 = r2.A09
        L_0x0081:
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String r9 = X.AnonymousClass1EG.A0F(r1, r0)
            boolean r3 = r11.A0V
            if (r3 == 0) goto L_0x02b2
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0114
            X.1bI r0 = r7.A0B
            if (r0 == 0) goto L_0x00af
            android.view.View r8 = r0.A02()
            com.whatsapp.ui.media.MediaCaptionTextView r8 = (com.whatsapp.ui.media.MediaCaptionTextView) r8
            if (r8 == 0) goto L_0x00af
            r0 = r11
            X.6Go r0 = (X.AnonymousClass6Go) r0
            X.86P r6 = r0.A01
            X.0ve r2 = r11.A0L
            r1 = 2032(0x7f0, float:2.847E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r8.A0U(r6, r9, r0)
        L_0x00af:
            X.1bI r0 = r7.A0A
            if (r0 == 0) goto L_0x00b6
            r0.A04(r4)
        L_0x00b6:
            X.1Lc r0 = r11.A0M
            X.0ve r2 = r0.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 11189(0x2bb5, float:1.5679E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0114
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0114
            X.1bI r0 = r7.A0A
            if (r0 == 0) goto L_0x0114
            android.view.View r6 = r0.A02()
            if (r6 == 0) goto L_0x0114
            r6.setBackground(r5)
            android.content.Context r1 = r6.getContext()
            r0 = 2131099885(0x7f0600ed, float:1.7812136E38)
            X.AnonymousClass3MX.A1A(r1, r6, r0)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            if (r2 == 0) goto L_0x02f5
            X.1sZ r2 = (X.C39151sZ) r2
            X.1bI r0 = r7.A0B
            if (r0 == 0) goto L_0x02f0
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x02f0
            int r1 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x02f0
            r2.A0p = r1
            boolean r0 = r11.A0W()
            if (r0 == 0) goto L_0x02a8
            android.view.View r0 = r7.A02
            if (r0 == 0) goto L_0x02ea
            int r0 = r0.getId()
        L_0x010f:
            r2.A0B = r0
            r6.setLayoutParams(r2)
        L_0x0114:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r7.A06()
            if (r0 == 0) goto L_0x011d
            r0.setOnClickListener(r5)
        L_0x011d:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r7.A06()
            if (r0 == 0) goto L_0x0126
            r0.setClickable(r4)
        L_0x0126:
            com.whatsapp.ui.media.MediaCaptionTextView r1 = r7.A06()
            if (r1 == 0) goto L_0x0133
            X.7Mq r0 = new X.7Mq
            r0.<init>(r11)
            r1.A03 = r0
        L_0x0133:
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>()
            java.util.concurrent.atomic.AtomicLong r12 = new java.util.concurrent.atomic.AtomicLong
            r12.<init>()
            android.view.View r1 = r7.A05
            if (r1 == 0) goto L_0x02e4
            X.78o r0 = new X.78o
            r0.<init>(r13, r11, r12)
            r1.setOnTouchListener(r0)
            android.view.View r1 = r7.A02
            if (r1 == 0) goto L_0x02e1
            r0 = 2131433356(0x7f0b178c, float:1.8488495E38)
            android.view.View r14 = r1.findViewById(r0)
            X.11C r0 = r11.A0J
            boolean r0 = X.C108965cb.A1X(r0)
            if (r0 == 0) goto L_0x029f
            X.1Lc r0 = r11.A0M
            X.0ve r2 = r0.A01
            r1 = 11675(0x2d9b, float:1.636E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x029f
            r10 = 0
        L_0x016b:
            X.70O r0 = r11.A0K()
            android.view.View r0 = r0.A0B()
            r0.setOnClickListener(r10)
            if (r3 != 0) goto L_0x017c
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0181
        L_0x017c:
            if (r14 == 0) goto L_0x0181
            r14.setOnClickListener(r10)
        L_0x0181:
            X.70O r6 = r11.A0K()
            X.6oj r0 = r6.A05
            X.6Gp r5 = r0.A00
            X.6p9 r0 = r5.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r7 = r0.A02
            X.11P r3 = r7.A2F()
            X.206 r2 = r0.A00
            long r0 = r2.A0I
            long r0 = r3.A09(r0)
            java.lang.String r0 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A02(r2, r7, r0)
            java.lang.String r2 = r7.A0u
            java.lang.String r1 = r0.toString()
            X.6rP r0 = new X.6rP
            r0.<init>(r2, r1)
            java.lang.String r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            boolean r7 = r6 instanceof X.AnonymousClass6GX
            if (r7 == 0) goto L_0x0276
            r0 = r6
            X.6GX r0 = (X.AnonymousClass6GX) r0
            X.22l r0 = r0.A08
        L_0x01b9:
            java.lang.String r0 = r0.A18()
        L_0x01bd:
            if (r0 != 0) goto L_0x01c1
        L_0x01bf:
            java.lang.String r0 = ""
        L_0x01c1:
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            android.content.Context r9 = r5.A0J()
            if (r7 == 0) goto L_0x0219
            r7 = 2131886151(0x7f120047, float:1.9406873E38)
        L_0x01d2:
            java.lang.String r0 = r9.getString(r7)
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r1)
            android.view.View r7 = r6.A0B()
            if (r3 == 0) goto L_0x01f6
            if (r2 == 0) goto L_0x01f6
            android.content.Context r6 = r5.A0J()
            r5 = 2131886145(0x7f120041, float:1.940686E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r4] = r8
            r0 = 1
            r1[r0] = r3
            r0 = 2
            java.lang.String r8 = X.C17880vN.A0q(r6, r2, r1, r0, r5)
        L_0x01f6:
            r7.setContentDescription(r8)
            X.6Go r11 = (X.AnonymousClass6Go) r11
            X.1Qe r2 = r11.A04
            r0 = r11
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.206 r1 = r0.A07
            X.C18070vi.A0d(r1, r4)
            java.lang.Class<X.7LD> r0 = X.AnonymousClass7LD.class
            X.25F r0 = X.C18070vi.A09(r1, r0)
            boolean r0 = r2.A0B(r0)
            if (r0 == 0) goto L_0x0218
            X.10I r1 = r11.A0S
            r0 = 40
            X.AnonymousClass7RH.A01(r1, r11, r0)
        L_0x0218:
            return
        L_0x0219:
            boolean r0 = r6 instanceof X.AnonymousClass6GV
            if (r0 == 0) goto L_0x0221
            r7 = 2131886149(0x7f120045, float:1.9406869E38)
            goto L_0x01d2
        L_0x0221:
            boolean r0 = r6 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x0229
            r7 = 2131886146(0x7f120042, float:1.9406863E38)
            goto L_0x01d2
        L_0x0229:
            boolean r0 = r6 instanceof X.AnonymousClass6GY
            if (r0 == 0) goto L_0x025c
            r7 = r6
            X.6GY r7 = (X.AnonymousClass6GY) r7
            X.21d r0 = r7.A09
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0257
            X.6ub r10 = r7.A07
            int r8 = r0.A08
            int r0 = r0.A06
            X.6r5 r7 = new X.6r5
            r7.<init>(r8, r0)
            r0 = 1
            boolean r0 = r10.A02(r7, r0)
            if (r0 == 0) goto L_0x0257
            X.0ve r8 = r10.A02
            X.0vf r7 = X.C18040vf.A01
            r0 = 6033(0x1791, float:8.454E-42)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            r7 = 2131886434(0x7f120162, float:1.9407447E38)
            if (r0 != 0) goto L_0x01d2
        L_0x0257:
            r7 = 2131886138(0x7f12003a, float:1.9406846E38)
            goto L_0x01d2
        L_0x025c:
            boolean r0 = r6 instanceof X.AnonymousClass6Ga
            if (r0 == 0) goto L_0x0271
            r0 = r6
            X.6Ga r0 = (X.AnonymousClass6Ga) r0
            boolean r0 = r0 instanceof X.AnonymousClass6GZ
            if (r0 == 0) goto L_0x026c
            r7 = 2131886137(0x7f120039, float:1.9406844E38)
            goto L_0x01d2
        L_0x026c:
            r7 = 2131886150(0x7f120046, float:1.940687E38)
            goto L_0x01d2
        L_0x0271:
            r7 = 2131886127(0x7f12002f, float:1.9406824E38)
            goto L_0x01d2
        L_0x0276:
            boolean r0 = r6 instanceof X.AnonymousClass6Ga
            if (r0 == 0) goto L_0x0281
            r0 = r6
            X.6Ga r0 = (X.AnonymousClass6Ga) r0
            X.21X r0 = r0.A0O
            goto L_0x01b9
        L_0x0281:
            boolean r0 = r6 instanceof X.AnonymousClass6GV
            if (r0 != 0) goto L_0x01bf
            boolean r0 = r6 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x0294
            r0 = r6
            X.6GW r0 = (X.AnonymousClass6GW) r0
            X.210 r0 = r0.A0E
            java.lang.String r0 = r0.A17()
            goto L_0x01bd
        L_0x0294:
            boolean r0 = r6 instanceof X.AnonymousClass6GY
            if (r0 == 0) goto L_0x01bf
            r0 = r6
            X.6GY r0 = (X.AnonymousClass6GY) r0
            X.21d r0 = r0.A09
            goto L_0x01b9
        L_0x029f:
            r15 = 28
            X.78E r10 = new X.78E
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x016b
        L_0x02a8:
            android.view.ViewGroup r0 = r7.A03()
            int r0 = r0.getId()
            goto L_0x010f
        L_0x02b2:
            com.whatsapp.ui.media.MediaCaptionTextView r8 = r7.A06()
            if (r8 == 0) goto L_0x02ca
            r0 = r11
            X.6Go r0 = (X.AnonymousClass6Go) r0
            X.86P r6 = r0.A01
            X.0ve r2 = r11.A0L
            r1 = 2032(0x7f0, float:2.847E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r8.A0U(r6, r9, r0)
        L_0x02ca:
            android.view.View r1 = r7.A01
            if (r1 == 0) goto L_0x0114
            boolean r0 = r7.A09()
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            goto L_0x0114
        L_0x02db:
            r1 = r5
            goto L_0x0081
        L_0x02de:
            r0 = 0
            goto L_0x0065
        L_0x02e1:
            java.lang.String r0 = "contentSheet"
            goto L_0x02e6
        L_0x02e4:
            java.lang.String r0 = "touchHandler"
        L_0x02e6:
            X.C18070vi.A11(r0)
            throw r5
        L_0x02ea:
            java.lang.String r0 = "contentSheet"
            X.C18070vi.A11(r0)
            throw r5
        L_0x02f0:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x02f5:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02fc:
            java.lang.String r0 = "contentSheet"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0U(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (X.AnonymousClass72Z.A03((X.AnonymousClass21W) r8) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Y(boolean r12) {
        /*
            r11 = this;
            r0 = r11
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.72w r4 = r0.A08
            X.206 r8 = r0.A07
            X.6co r1 = new X.6co
            r1.<init>(r0)
            r7 = 0
            X.C18070vi.A0d(r8, r7)
            boolean r0 = r8 instanceof X.AnonymousClass21V
            r2 = 0
            if (r0 == 0) goto L_0x003b
            java.util.concurrent.ConcurrentHashMap r0 = r4.A06
            r0.put(r8, r1)
            X.205 r6 = r8.A0v
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x003d
            r3 = r8
            X.21V r3 = (X.AnonymousClass21V) r3
            boolean r0 = r3.A1E()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r8 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0036
            r0 = r8
            X.21W r0 = (X.AnonymousClass21W) r0
            boolean r0 = X.AnonymousClass72Z.A03(r0)
            if (r0 != 0) goto L_0x003d
        L_0x0036:
            X.73o r0 = X.C1407572w.A08
        L_0x0038:
            X.C1407572w.A00(r0, r3, r4)
        L_0x003b:
            r0 = 0
            return r0
        L_0x003d:
            r3 = r8
            X.21V r3 = (X.AnonymousClass21V) r3
            X.2rc r1 = X.AnonymousClass3Ma.A0M(r3)
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0056
            int r1 = r1.A07
            r0 = 1
            if (r1 == r0) goto L_0x0053
            boolean r0 = r3.A1F()
            if (r0 != 0) goto L_0x0036
        L_0x0053:
            X.73o r0 = X.C1407572w.A09
            goto L_0x0038
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusdownload/downloadifneeded "
            r1.append(r0)
            r1.append(r12)
            r5 = 32
            r1.append(r5)
            java.lang.String r0 = r6.A01
            r1.append(r0)
            r1.append(r5)
            X.1BI r0 = r3.A0H()
            X.C17900vP.A0b(r0, r1)
            if (r12 == 0) goto L_0x00c8
            X.1hB r8 = r4.A03
            java.util.ArrayList r0 = r8.A0B()
            java.util.Iterator r10 = r0.iterator()
        L_0x0082:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00df
            X.21V r9 = X.C17880vN.A0b(r10)
            X.205 r2 = r9.A0v
            boolean r0 = X.C108945cZ.A1S(r2)
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x00bb
            X.C32431hB.A06(r8, r9, r7, r7, r7)
            java.util.ArrayList r0 = r4.A05
            r0.add(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusdownload/cancel "
        L_0x00a8:
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            r1.append(r5)
            X.1BI r0 = r9.A0H()
            X.C17900vP.A0b(r0, r1)
            goto L_0x0082
        L_0x00bb:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusdownload/is-current "
            goto L_0x00a8
        L_0x00c8:
            X.21V r0 = r4.A00
            if (r0 != 0) goto L_0x00d9
            X.0ve r0 = r4.A02
            boolean r0 = X.AnonymousClass72Z.A01(r0, r8)
            if (r0 == 0) goto L_0x00d5
            r2 = 6
        L_0x00d5:
            X.C1407572w.A01(r3, r4, r2)
            goto L_0x00e2
        L_0x00d9:
            java.util.ArrayList r0 = r4.A05
            r0.add(r8)
            goto L_0x00e2
        L_0x00df:
            X.C1407572w.A01(r3, r4, r7)
        L_0x00e2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0Y(boolean):boolean");
    }

    public void Boy() {
    }

    public static final View A03(AnonymousClass6Gp r1) {
        C28931bI r0;
        if (r1 instanceof C120906Gm) {
            r0 = ((C120906Gm) r1).A0B.A0D;
            if (r0 == null) {
                throw C17890vO.A0K();
            }
        } else {
            r0 = r1.A0L().A08();
        }
        return AnonymousClass3MX.A0D(r0);
    }

    private final void A04() {
        if (!this.A0V || this.A0A) {
            AnonymousClass70R A0L2 = A0L();
            ViewGroup A022 = A0L2.A02();
            Rect rect = this.A06;
            A022.setPadding(rect.left, A0L2.A02().getPaddingTop(), rect.right, rect.bottom);
            if (this.A0A) {
                View A032 = A03(this);
                A032.setPadding(rect.left, A032.getPaddingTop(), rect.right, A032.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = A032.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = rect.bottom;
                    A032.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r0 != null) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass6Gp r7) {
        /*
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L_0x013b
            android.os.Handler r1 = r7.A0D
            java.lang.Runnable r0 = r7.A0U
            r1.removeCallbacks(r0)
            X.70R r3 = r7.A0L()
            android.view.ViewGroup r0 = r3.A02()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00cb
            android.view.animation.AlphaAnimation r2 = X.C72463Mc.A0Q()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0137
            com.whatsapp.ui.media.MediaCaptionTextView r4 = r3.A06()
        L_0x002a:
            r1 = 0
            if (r4 == 0) goto L_0x0063
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0053
            r4.startAnimation(r2)
            r4.setVisibility(r1)
            X.1bI r0 = r3.A0A
            if (r0 == 0) goto L_0x0046
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0046
            r0.startAnimation(r2)
        L_0x0046:
            X.1bI r0 = r3.A0A
            if (r0 == 0) goto L_0x0053
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0053
            r0.setVisibility(r1)
        L_0x0053:
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x0063
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0127
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0127
        L_0x0063:
            android.view.ViewGroup r0 = r3.A02()
            int r4 = r0.getVisibility()
            r0 = 4
            if (r4 != r0) goto L_0x009d
            android.view.ViewGroup r0 = r3.A02()
            r0.startAnimation(r2)
            android.view.ViewGroup r0 = r3.A02()
            r0.setVisibility(r1)
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x009d
            boolean r0 = r3 instanceof X.C120886Gk
            if (r0 == 0) goto L_0x0106
            X.6Gk r3 = (X.C120886Gk) r3
            X.1bI r0 = r3.A0D
            if (r0 == 0) goto L_0x0093
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0093
            r0.startAnimation(r2)
        L_0x0093:
            X.1bI r0 = r3.A0D
            if (r0 == 0) goto L_0x009d
            android.view.View r0 = r0.A02()
            if (r0 != 0) goto L_0x0122
        L_0x009d:
            X.6p9 r2 = r7.A0N
            X.70O r1 = r7.A0K()
            boolean r0 = r1 instanceof X.AnonymousClass6GX
            if (r0 != 0) goto L_0x0104
            boolean r0 = r1 instanceof X.AnonymousClass6GW
            if (r0 != 0) goto L_0x0104
            r6 = 1
        L_0x00ac:
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r5 = r2.A01
            X.6kV r0 = r5.A05
            if (r0 == 0) goto L_0x00cc
            android.view.View r0 = r0.A05
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00cc
        L_0x00ba:
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x00cb
        L_0x00c2:
            android.view.View r1 = r7.A00
            if (r1 == 0) goto L_0x00cb
            r0 = 1792(0x700, float:2.511E-42)
            r1.setSystemUiVisibility(r0)
        L_0x00cb:
            return
        L_0x00cc:
            X.6kV r4 = r5.A05
            if (r4 == 0) goto L_0x00ba
            android.view.animation.AlphaAnimation r3 = X.C72463Mc.A0Q()
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
            android.view.View r2 = r4.A05
            r2.startAnimation(r3)
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r4.A0E
            r0.startAnimation(r3)
            r1 = 0
            r2.setVisibility(r1)
            r0.setVisibility(r1)
            android.widget.Button r0 = r4.A00
            if (r0 == 0) goto L_0x00f1
            r0.startAnimation(r3)
        L_0x00f1:
            android.widget.Button r0 = r4.A00
            if (r0 == 0) goto L_0x00f8
            r0.setVisibility(r1)
        L_0x00f8:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x00ba
            if (r6 == 0) goto L_0x00ba
            android.view.View r0 = r4.A04
            r0.setVisibility(r1)
            goto L_0x00ba
        L_0x0104:
            r6 = 0
            goto L_0x00ac
        L_0x0106:
            r0 = r7
            X.6Go r0 = (X.AnonymousClass6Go) r0
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.206 r0 = r0.A07
            X.1BI r0 = r0.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x009d
            android.view.View r0 = X.AnonymousClass70R.A00(r3)
            r0.startAnimation(r2)
            android.view.View r0 = X.AnonymousClass70R.A00(r3)
        L_0x0122:
            r0.setVisibility(r1)
            goto L_0x009d
        L_0x0127:
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x012e
            r0.startAnimation(r2)
        L_0x012e:
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0063
            r0.setVisibility(r1)
            goto L_0x0063
        L_0x0137:
            android.view.View r4 = r3.A00
            goto L_0x002a
        L_0x013b:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A07(X.6Gp):void");
    }

    public static final void A08(AnonymousClass6Gp r3) {
        AnonymousClass1Ez r2 = r3.A0P;
        r2.A01 = 0;
        r2.A00 = 0;
        if (r3.A0Y(true)) {
            r2.A04();
        }
        r3.A0F.CGP(new AnonymousClass7RH((Object) r3, 43));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00be, code lost:
        if (r0 != null) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.AnonymousClass6Gp r5, boolean r6, boolean r7) {
        /*
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x012e
            X.70R r3 = r5.A0L()
            android.view.ViewGroup r0 = r3.A02()
            int r0 = r0.getVisibility()
            r4 = 4
            if (r0 != r4) goto L_0x0027
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0024
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r3.A06()
        L_0x001b:
            if (r0 == 0) goto L_0x0027
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x0027
        L_0x0023:
            return
        L_0x0024:
            android.view.View r0 = r3.A00
            goto L_0x001b
        L_0x0027:
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            if (r6 == 0) goto L_0x005c
            boolean r1 = r3.A0I
            if (r1 == 0) goto L_0x00f5
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r3.A06()
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.startAnimation(r2)
        L_0x003f:
            if (r1 == 0) goto L_0x00f1
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r3.A06()
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.setVisibility(r4)
        L_0x004a:
            X.1bI r0 = r3.A0A
            if (r0 == 0) goto L_0x0057
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x0057
            r0.startAnimation(r2)
        L_0x0057:
            X.1bI r0 = r3.A0A
            X.AnonymousClass3Ma.A1M(r0)
        L_0x005c:
            if (r7 == 0) goto L_0x0087
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0066
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x006f
        L_0x0066:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x006f
            r0 = 1798(0x706, float:2.52E-42)
            r1.setSystemUiVisibility(r0)
        L_0x006f:
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0087
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0087
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0080
            r0.startAnimation(r2)
        L_0x0080:
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0087
            r0.setVisibility(r4)
        L_0x0087:
            android.view.ViewGroup r0 = r3.A02()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00c0
            android.view.ViewGroup r0 = r3.A02()
            r0.startAnimation(r2)
            android.view.ViewGroup r0 = r3.A02()
            r0.setVisibility(r4)
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r3 instanceof X.C120886Gk
            if (r0 == 0) goto L_0x00d1
            X.6Gk r3 = (X.C120886Gk) r3
            X.1bI r0 = r3.A0D
            if (r0 == 0) goto L_0x00b6
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x00b6
            r0.startAnimation(r2)
        L_0x00b6:
            X.1bI r0 = r3.A0D
            if (r0 == 0) goto L_0x00c0
            android.view.View r0 = r0.A02()
            if (r0 != 0) goto L_0x00ed
        L_0x00c0:
            X.6p9 r0 = r5.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r5 = r0.A01
            X.6kV r0 = r5.A05
            if (r0 == 0) goto L_0x00f9
            android.view.View r0 = r0.A05
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x00f9
            return
        L_0x00d1:
            r0 = r5
            X.6Go r0 = (X.AnonymousClass6Go) r0
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.206 r0 = r0.A07
            X.1BI r0 = r0.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x00c0
            android.view.View r0 = X.AnonymousClass70R.A00(r3)
            r0.startAnimation(r2)
            android.view.View r0 = X.AnonymousClass70R.A00(r3)
        L_0x00ed:
            r0.setVisibility(r4)
            goto L_0x00c0
        L_0x00f1:
            android.view.View r0 = r3.A00
            goto L_0x0045
        L_0x00f5:
            android.view.View r0 = r3.A00
            goto L_0x003a
        L_0x00f9:
            X.6kV r3 = r5.A05
            if (r3 == 0) goto L_0x0023
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.view.View r1 = r3.A05
            r1.startAnimation(r2)
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0E
            r0.startAnimation(r2)
            r1.setVisibility(r4)
            r0.setVisibility(r4)
            android.widget.Button r0 = r3.A00
            if (r0 == 0) goto L_0x011d
            r0.startAnimation(r2)
        L_0x011d:
            android.widget.Button r0 = r3.A00
            if (r0 == 0) goto L_0x0124
            r0.setVisibility(r4)
        L_0x0124:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0023
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            return
        L_0x012e:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A09(X.6Gp, boolean, boolean):void");
    }

    public static final boolean A0A(AnonymousClass6Gp r2) {
        return C23661Hd.A03.A01(r2.A0N.A01.A14());
    }

    public final Context A0J() {
        View view = this.A00;
        if (view != null) {
            return AnonymousClass3MY.A04(view);
        }
        throw C17880vN.A0g();
    }

    public AnonymousClass70R A0L() {
        if (this instanceof C120906Gm) {
            return ((C120906Gm) this).A0B;
        }
        return ((C120896Gl) this).A08;
    }

    public void A0N() {
        if (this.A04 && this.A07 && !this.A02 && this.A01.A0J == 4) {
            MediaCaptionTextView A062 = A0L().A06();
            if (A062 == null || !A062.A0T()) {
                StringBuilder A10 = AnonymousClass000.A10();
                C108985cd.A1H(this, "playbackPage/resumePlayback page=", A10);
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0N.A01;
                C17900vP.A0b(statusPlaybackBaseFragment, A10);
                AnonymousClass1FL A1B = statusPlaybackBaseFragment.A1B();
                if (A1B instanceof StatusPlaybackActivity) {
                    StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) A1B;
                    if (statusPlaybackActivity.A0W) {
                        statusPlaybackActivity.A0W = false;
                        new Handler().postDelayed(new AnonymousClass7RH((Object) this, 45), 1000);
                        return;
                    }
                }
                if (this.A03) {
                    this.A06 = false;
                    A0K().A0C();
                    this.A0Q.A02();
                    A07(this);
                }
            }
        }
    }

    public void A0O() {
        MediaCaptionTextView A062;
        if (this.A00 == null || !this.A04 || this.A07 || !A0K().A0I()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("playbackPage/startPlayback not possible page=");
            A10.append(this);
            A10.append("; host=");
            Log.w(C17890vO.A0V(this.A0N.A01, A10));
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("playbackPage/startPlayback page=");
        A102.append(this);
        A102.append("; host=");
        C17900vP.A0b(this.A0N.A01, A102);
        this.A07 = true;
        this.A06 = false;
        A0K().A0F();
        Boolean bool = C17970vW.A03;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            statusPlaybackProgressView.setProgressProvider(this.A0O);
        }
        A07(this);
        this.A0P.A02();
        this.A0R.A04();
        if (this.A02 || !this.A03 || this.A01.A0J != 4 || ((A062 = A0L().A06()) != null && A062.A0T())) {
            A0P();
        }
    }

    public final void A0P() {
        if (this.A07 && !this.A06) {
            StringBuilder A10 = AnonymousClass000.A10();
            C108985cd.A1H(this, "playbackPage/pausePlayback page=", A10);
            C17900vP.A0b(this.A0N.A01, A10);
            this.A06 = true;
            A0K().A0E();
            this.A0Q.A04();
        }
    }

    public void A0V(boolean z) {
        Drawable drawable;
        if (!this.A0V) {
            AnonymousClass70R A0L2 = A0L();
            ViewGroup viewGroup = A0L2.A08;
            Drawable drawable2 = null;
            if (viewGroup != null) {
                if (z) {
                    drawable = C24261Jm.A00(A0J(), 2131231783);
                } else {
                    drawable = null;
                }
                viewGroup.setBackground(drawable);
            }
            View A002 = AnonymousClass70R.A00(A0L2);
            if (z) {
                drawable2 = C24261Jm.A00(A0J(), 2131231783);
            }
            A002.setBackground(drawable2);
        }
    }

    public static final void A05(View view, AnonymousClass6Gp r9) {
        AnonymousClass70R r6;
        C39151sZ r1;
        Drawable A002;
        View view2;
        View A0D2 = AnonymousClass3MX.A0D(C72453Mb.A0s(view, 2131427795));
        View A032 = A03(r9);
        if (r9.A0W()) {
            A0D2.setVisibility(8);
            r6 = r9.A0L();
            ViewGroup A033 = r6.A03();
            String str = null;
            if (A0A(r9)) {
                A002 = null;
            } else {
                A002 = C24261Jm.A00(A033.getContext(), 2131233037);
            }
            A033.setBackground(A002);
            ViewGroup.LayoutParams layoutParams = A033.getLayoutParams();
            if (layoutParams != null) {
                C39151sZ r12 = (C39151sZ) layoutParams;
                r12.A0B = 0;
                r12.A0C = -1;
                if (!A0A(r9)) {
                    str = "9:16";
                }
                r12.A0t = str;
                A033.setLayoutParams(r12);
                A032.setPadding(A032.getPaddingStart(), 0, A032.getPaddingEnd(), A032.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams2 = A032.getLayoutParams();
                if (layoutParams2 != null) {
                    r1 = (C39151sZ) layoutParams2;
                    r1.A0o = -1;
                    if (r9.A0A) {
                        view2 = r6.A02;
                        if (view2 == null) {
                            C18070vi.A11("contentSheet");
                            throw null;
                        }
                    } else {
                        view2 = r6.A03();
                    }
                    r1.A0B = view2.getId();
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            A0D2.setVisibility(0);
            r6 = r9.A0L();
            ViewGroup A034 = r6.A03();
            AnonymousClass3MY.A0v(A034.getContext(), A034, 2131233037);
            ViewGroup.LayoutParams layoutParams3 = A034.getLayoutParams();
            if (layoutParams3 != null) {
                C39151sZ r13 = (C39151sZ) layoutParams3;
                r13.A0B = -1;
                r13.A0C = A0D2.getId();
                r13.A0t = "9:16";
                A034.setLayoutParams(r13);
                A032.setPadding(A032.getPaddingStart(), A032.getPaddingBottom(), A032.getPaddingEnd(), A032.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams4 = A032.getLayoutParams();
                if (layoutParams4 != null) {
                    r1 = (C39151sZ) layoutParams4;
                    r1.A0o = r6.A03().getId();
                    r1.A0B = -1;
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        A032.setLayoutParams(r1);
        if (!r9.A0A) {
            ViewGroup A035 = r6.A03();
            if (!A035.isLaidOut() || A035.isLayoutRequested()) {
                C1420978d.A00(A035, r9, 17);
            } else {
                r9.A0N.A01.A2E(r6.A03());
            }
        }
    }

    public static final void A06(AnonymousClass6Gp r4) {
        Drawable A002;
        ViewGroup A032 = r4.A0L().A03();
        String str = null;
        if (A0A(r4)) {
            A002 = null;
        } else {
            A002 = C24261Jm.A00(A032.getContext(), 2131233037);
        }
        A032.setBackground(A002);
        ViewGroup.LayoutParams layoutParams = A032.getLayoutParams();
        if (layoutParams != null) {
            C39151sZ r1 = (C39151sZ) layoutParams;
            if (!A0A(r4)) {
                str = "9:16";
            }
            r1.A0t = str;
            if (r4.A03) {
                r1.A08 = 0.0f;
            }
            A032.setLayoutParams(r1);
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C() {
        /*
            r2 = this;
            super.A0C()
            X.70O r1 = r2.A0K()
            boolean r0 = r1 instanceof X.AnonymousClass6Ga
            if (r0 == 0) goto L_0x002a
            X.6Ga r1 = (X.AnonymousClass6Ga) r1
            X.6nb r0 = r1.A03
        L_0x000f:
            if (r0 == 0) goto L_0x0016
            android.widget.PopupWindow r0 = r0.A03
            r0.dismiss()
        L_0x0016:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x001e
            A06(r2)
        L_0x001d:
            return
        L_0x001e:
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x001d
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x003d
            A05(r0, r2)
            return
        L_0x002a:
            boolean r0 = r1 instanceof X.AnonymousClass6GW
            if (r0 == 0) goto L_0x0034
            X.6GW r1 = (X.AnonymousClass6GW) r1
            X.AnonymousClass6GW.A01(r1)
            goto L_0x0016
        L_0x0034:
            boolean r0 = r1 instanceof X.AnonymousClass6GY
            if (r0 == 0) goto L_0x0016
            X.6GY r1 = (X.AnonymousClass6GY) r1
            X.6nb r0 = r1.A01
            goto L_0x000f
        L_0x003d:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gp.A0C():void");
    }

    public void A0D() {
        C132796nb r0;
        Handler handler;
        super.A0D();
        A0L().A0H = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            C1596985n r1 = this.A0O;
            C18070vi.A0d(r1, 0);
            if (statusPlaybackProgressView.A00 == r1) {
                statusPlaybackProgressView.A00 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        AnonymousClass70O A0K2 = A0K();
        if (A0K2 instanceof AnonymousClass6GX) {
            AnonymousClass6GX r3 = (AnonymousClass6GX) A0K2;
            C109645dm r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                AnonymousClass7RH.A00(handler, r2, 28);
            }
            r3.A01 = null;
            r3.A0A.A06(r3);
            r3.A02 = false;
            return;
        }
        if (A0K2 instanceof AnonymousClass6Ga) {
            AnonymousClass6Ga r32 = (AnonymousClass6Ga) A0K2;
            AnonymousClass6Ga.A06(r32);
            r32.A0Q.A06(r32);
            r32.A06 = false;
            r0 = r32.A03;
        } else if (!(A0K2 instanceof AnonymousClass6GV) && !(A0K2 instanceof AnonymousClass6GW) && (A0K2 instanceof AnonymousClass6GY)) {
            r0 = ((AnonymousClass6GY) A0K2).A01;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A03.dismiss();
        }
    }

    public void A0E() {
        super.A0E();
        A0P();
        if (this.A04) {
            this.A0R.A02();
            this.A0Q.A02();
        }
    }

    public void A0F() {
        super.A0F();
        A0N();
        if (this.A04) {
            this.A0R.A04();
        }
    }

    public void A0G() {
        super.A0G();
        AnonymousClass6Gn r0 = (AnonymousClass6Gn) this;
        C24661Le r4 = r0.A05;
        AnonymousClass206 r3 = r0.A07;
        C18030ve r1 = r0.A0L;
        C18040vf r2 = C18040vf.A02;
        this.A09 = r4.A0K(r3, C18020vd.A05(r2, r1, 8880));
        if (C18020vd.A05(r2, this.A0L, 9775)) {
            AnonymousClass7RH.A01(this.A0S, this, 44);
        } else {
            A08(this);
        }
    }

    public void A0H() {
        super.A0H();
        this.A0R.A02();
        this.A0P.A02();
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "playbackPage/stopPlayback page=", A10);
        C17900vP.A0b(this.A0N.A01, A10);
        this.A07 = false;
        this.A06 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            C1596985n r1 = this.A0O;
            C18070vi.A0d(r1, 0);
            if (statusPlaybackProgressView.A00 == r1) {
                statusPlaybackProgressView.A00 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        A0K().A0G();
        A07(this);
        A07(this);
    }

    public void A0S(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("playbackPage/reportStatusExitStats exit-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
        }
        A10.append(str);
        C108985cd.A1H(this, "; page=", A10);
        C17900vP.A0b(this.A0N.A01, A10);
    }

    public void A0T(int i, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("playbackPage/reportStatusEnterStats entry-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
        }
        A10.append(str);
        C108985cd.A1H(this, "; page=", A10);
        C17900vP.A0b(this.A0N.A01, A10);
    }

    public boolean A0W() {
        StatusPlaybackActivity statusPlaybackActivity;
        if (A0A(this)) {
            return true;
        }
        AnonymousClass1FL A1B = this.A0N.A01.A1B();
        if (!(A1B instanceof StatusPlaybackActivity) || (statusPlaybackActivity = (StatusPlaybackActivity) A1B) == null) {
            return false;
        }
        if (C23661Hd.A03.A01(statusPlaybackActivity) || C72453Mb.A1a(statusPlaybackActivity.A0i)) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        AnonymousClass21V r1;
        String A18;
        AnonymousClass70O A0K2 = A0K();
        if ((A0K2 instanceof AnonymousClass6GX) || (A0K2 instanceof AnonymousClass6GW)) {
            return false;
        }
        AnonymousClass206 r12 = ((AnonymousClass6Gn) this).A07;
        if ((r12 instanceof C439421n) || !(r12 instanceof AnonymousClass21V) || (r1 = (AnonymousClass21V) r12) == null || (A18 = r1.A18()) == null || A18.length() == 0) {
            return true;
        }
        return false;
    }

    public void BrX() {
        A0N();
    }
}
