package com.whatsapp.calling.vcoverscroll.view;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1F9;
import X.AnonymousClass1VE;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48l;
import X.AnonymousClass4PJ;
import X.AnonymousClass4ZV;
import X.AnonymousClass5EM;
import X.AnonymousClass5EN;
import X.AnonymousClass7R9;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C20113A7w;
import X.C27011Uj;
import X.C27691Xc;
import X.C28931bI;
import X.C30391dr;
import X.C38471rL;
import X.C43531zx;
import X.C72453Mb;
import X.C72463Mc;
import X.C76603ne;
import X.C84074Ht;
import X.C90334du;
import X.C93634jI;
import X.C98214ql;
import X.C98264qq;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.PeerAvatarLayout;
import java.util.HashMap;

public final class VCMiniPlayerView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1VE A00;
    public C76603ne A01;
    public AnonymousClass4PJ A02;
    public AnonymousClass11C A03;
    public AnonymousClass11P A04;
    public C18000vb A05;
    public AnonymousClass031 A06;
    public C18600wl A07;
    public boolean A08;
    public AnonymousClass1EC A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static final void A00(C76603ne r13, VCMiniPlayerView vCMiniPlayerView) {
        if (vCMiniPlayerView.isAttachedToWindow()) {
            C18100vl r3 = vCMiniPlayerView.A0I;
            if (AnonymousClass3MX.A0D(AnonymousClass3MX.A0v(r3)).getVisibility() == 0) {
                AnonymousClass4ZV r6 = new AnonymousClass4ZV(AnonymousClass3MY.A04(AnonymousClass3MX.A0v(r3).A02()), vCMiniPlayerView.getSystemServices(), vCMiniPlayerView.getWaLocale());
                View A0D2 = AnonymousClass3MX.A0D(AnonymousClass3MX.A0v(r3));
                View A0L = C72463Mc.A0L(vCMiniPlayerView);
                Integer num = r13.A03;
                C18070vi.A0d(num, 1);
                C18070vi.A0d(A0L, 1);
                WaTextView waTextView = r6.A02;
                waTextView.setText(2131897733);
                waTextView.setGravity(17);
                Context context = r6.A00;
                AnonymousClass3MX.A1C(context, waTextView, 2131103198);
                AnonymousClass1Y5.A00(context, r6.A03, context.getString(2131897733));
                AnonymousClass4ZV.A01(r6, num, 2131233125);
                PopupWindow popupWindow = r6.A01;
                popupWindow.setOnDismissListener((PopupWindow.OnDismissListener) null);
                popupWindow.setOutsideTouchable(true);
                C90334du.A00(waTextView, r6, 8);
                AnonymousClass1D6 A002 = AnonymousClass4ZV.A00(A0D2, A0L, r6, num, -20.0f);
                int A042 = AnonymousClass3MZ.A04(A002);
                int A0M = AnonymousClass000.A0M(A002.second);
                popupWindow.setAnimationStyle(2132083059);
                popupWindow.showAtLocation(A0L, 8388659, A042, A0M);
                A0L.postDelayed(new AnonymousClass7R9((Object) r6, 2), C20113A7w.A0L);
                r13.A0A();
            }
        }
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public void onVisibilityChanged(View view, int i) {
        C18070vi.A0d(view, 0);
        super.onVisibilityChanged(view, i);
        AnonymousClass00H r2 = getStateHolder().A07;
        C93634jI r1 = (C93634jI) r2.get();
        r1.A01 = Integer.valueOf(i);
        A99 a99 = r1.A00;
        if (a99 != null) {
            a99.A0j(i);
        }
        if (i == 8) {
            C93634jI.A00((C93634jI) r2.get(), (A99) null);
        }
    }

    public final void setLatencySensitiveDispatcher(C18600wl r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setStateHolder(AnonymousClass4PJ r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setVoipSharedPreference(AnonymousClass1VE r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C76653nj r12, com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView r13) {
        /*
            java.lang.Integer r1 = r12.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x001b
            X.1bX r3 = new X.1bX
            r3.<init>()
            X.1bY r2 = new X.1bY
            r2.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r2.A0W(r0)
            r3.A0a(r2)
            X.C29191bl.A02(r13, r3)
        L_0x001b:
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x01e8
            r0 = 0
        L_0x0020:
            r13.setTranslationZ(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r0)
            X.0vl r0 = r13.A0B
            android.view.View r4 = X.AnonymousClass3MW.A0A(r0)
            android.widget.LinearLayout$LayoutParams r2 = X.AnonymousClass3Ma.A0D()
            int r0 = r12.A01
            r3 = 0
            if (r0 != 0) goto L_0x01e2
            r0 = 0
        L_0x0038:
            r4.setMinimumWidth(r0)
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r12.A00
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
            r4.setLayoutParams(r2)
            X.4N3 r5 = r12.A03
            boolean r0 = r5 instanceof X.C76623ng
            r2 = 0
            r7 = 8
            if (r0 == 0) goto L_0x015d
            X.0vl r0 = r13.A0C
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r0.A04(r7)
        L_0x005c:
            X.0vl r0 = r13.A0G
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            r0.A04(r7)
        L_0x0065:
            X.0vl r0 = r13.A0A
            X.1bI r0 = X.AnonymousClass3MX.A0v(r0)
            android.view.View r4 = r0.A02()
            com.whatsapp.calling.PeerAvatarLayout r4 = (com.whatsapp.calling.PeerAvatarLayout) r4
            int r0 = r12.A02
            r4.setFixedContactPhotoSizeRes(r0)
            java.util.List r1 = r12.A07
            X.3WM r0 = r4.A05
            r0.A0W(r1)
            X.0vl r9 = r13.A0I
            X.1bI r5 = X.AnonymousClass3MX.A0v(r9)
            int r0 = r5.A01()
            boolean r4 = X.AnonymousClass000.A1P(r0)
            boolean r1 = r12.A0A
            int r0 = X.C72453Mb.A07(r1)
            r5.A04(r0)
            if (r4 != 0) goto L_0x00e1
            if (r1 == 0) goto L_0x00e1
            X.3ne r8 = r13.A01
            if (r8 != 0) goto L_0x00ab
            X.11P r1 = r13.getTime()
            X.1VE r0 = r13.getVoipSharedPreference()
            X.3ne r8 = new X.3ne
            r8.<init>(r0, r1)
            r13.A01 = r8
        L_0x00ab:
            X.1VE r0 = r8.A00
            android.content.SharedPreferences r5 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r4 = "vc_mini_player_wave_all_education_last_seen"
            r0 = 0
            long r10 = r5.getLong(r4, r0)
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x00e1
            X.11P r0 = r8.A02
            long r6 = X.AnonymousClass11P.A01(r0)
            long r6 = r6 - r10
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            X.1bI r0 = X.AnonymousClass3MX.A0v(r9)
            android.view.View r5 = r0.A02()
            r0 = 10
            X.7RL r4 = new X.7RL
            r4.<init>(r13, r8, r0)
            long r0 = r8.A04()
            r5.postDelayed(r4, r0)
        L_0x00e1:
            X.0vl r0 = r13.A0D
            X.1bI r1 = X.AnonymousClass3MX.A0v(r0)
            java.lang.Integer r5 = r12.A06
            java.lang.Integer r4 = X.AnonymousClass00R.A0N
            r0 = 0
            if (r5 == r4) goto L_0x00f0
            r0 = 8
        L_0x00f0:
            r1.A04(r0)
            X.0vl r0 = r13.A0F
            X.1bI r1 = X.AnonymousClass3MX.A0v(r0)
            r0 = 0
            if (r5 == r4) goto L_0x00fe
            r0 = 8
        L_0x00fe:
            r1.A04(r0)
            boolean r0 = r12.A09
            r13.setSelected(r0)
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0143
            android.view.View r5 = r1.A02()
            java.util.HashMap r1 = r13.getMuteSelectedStateToA11yMap()
            boolean r0 = r13.isSelected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x015b
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
        L_0x0128:
            java.util.HashMap r1 = r13.getMuteSelectedStateToA11yMap()
            boolean r0 = r13.isSelected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x0140
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
        L_0x0140:
            X.AnonymousClass4aR.A07(r5, r4, r2)
        L_0x0143:
            X.0vl r0 = r13.A0E
            X.1bI r2 = X.AnonymousClass3MX.A0v(r0)
            X.4ZN r1 = r12.A04
            if (r1 == 0) goto L_0x0158
            android.widget.TextView r0 = X.AnonymousClass3MX.A0M(r2)
            X.AnonymousClass4ZN.A02(r13, r0, r1)
        L_0x0154:
            r2.A04(r3)
            return
        L_0x0158:
            r3 = 8
            goto L_0x0154
        L_0x015b:
            r4 = r2
            goto L_0x0128
        L_0x015d:
            boolean r1 = r5 instanceof X.C76613nf
            X.0vl r0 = r13.A0C
            X.1bI r6 = X.AnonymousClass3MX.A0v(r0)
            if (r1 == 0) goto L_0x0193
            r6.A04(r3)
            android.content.Context r1 = r13.getContext()
            int r0 = r5.A00
            android.graphics.drawable.Drawable r5 = X.C24261Jm.A00(r1, r0)
            if (r5 == 0) goto L_0x005c
            X.0vb r4 = r13.getWaLocale()
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r6)
            boolean r0 = X.AnonymousClass3MW.A1Z(r4)
            if (r0 == 0) goto L_0x018e
            X.3cP r0 = new X.3cP
            r0.<init>(r5, r4)
            r1.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r0, r2)
            goto L_0x005c
        L_0x018e:
            r1.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2)
            goto L_0x005c
        L_0x0193:
            r6.A04(r7)
            X.0vl r0 = r13.A0G
            X.1bI r4 = X.AnonymousClass3MX.A0v(r0)
            android.view.View r0 = X.AnonymousClass3MY.A0I(r4, r3)
            com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton r0 = (com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.getButton()
            X.4ZN r0 = r5.A01
            if (r0 == 0) goto L_0x01e0
            java.lang.CharSequence r0 = X.AnonymousClass4ZN.A00(r13, r0)
        L_0x01ae:
            r1.setText(r0)
            android.view.View r0 = r4.A02()
            com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton r0 = (com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.getButton()
            int r0 = r5.A00
            r1.setIcon((int) r0)
            android.view.View r0 = r4.A02()
            com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton r0 = (com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.getButton()
            X.1Xz r0 = r5.A02
            r1.setVariant(r0)
            android.view.View r0 = r4.A02()
            com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton r0 = (com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.getButton()
            r0 = 45
            X.C89994dM.A00(r1, r13, r12, r0)
            goto L_0x0065
        L_0x01e0:
            r0 = r2
            goto L_0x01ae
        L_0x01e2:
            int r0 = X.AnonymousClass3Ma.A02(r4, r0)
            goto L_0x0038
        L_0x01e8:
            X.0vl r0 = r13.A0H
            float r0 = X.C72453Mb.A00(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView.A01(X.3nj, com.whatsapp.calling.vcoverscroll.view.VCMiniPlayerView):void");
    }

    private final C28931bI getAvatarView() {
        return AnonymousClass3MX.A0v(this.A0A);
    }

    private final View getBodyRow() {
        return AnonymousClass3MW.A0A(this.A0B);
    }

    private final C28931bI getConnectTextStub() {
        return AnonymousClass3MX.A0v(this.A0C);
    }

    private final C28931bI getEndCallButton() {
        return AnonymousClass3MX.A0v(this.A0D);
    }

    private final C28931bI getHelperTextViewStub() {
        return AnonymousClass3MX.A0v(this.A0E);
    }

    private final C28931bI getMuteButton() {
        return AnonymousClass3MX.A0v(this.A0F);
    }

    private final HashMap getMuteSelectedStateToA11yMap() {
        return (HashMap) this.A0J.getValue();
    }

    private final C28931bI getPillButtonView() {
        return AnonymousClass3MX.A0v(this.A0G);
    }

    private final float getTranslationZListScrolled() {
        return C72453Mb.A00(this.A0H);
    }

    private final C28931bI getWaveAllButton() {
        return AnonymousClass3MX.A0v(this.A0I);
    }

    private final void setupAvatarView(C38471rL r5) {
        PeerAvatarLayout peerAvatarLayout = (PeerAvatarLayout) AnonymousClass3MX.A0v(this.A0A).A02();
        int A002 = AnonymousClass1YL.A00(peerAvatarLayout.getContext(), 2130971741, 2131102875);
        peerAvatarLayout.A01 = 2131169522;
        peerAvatarLayout.A00 = A002;
        peerAvatarLayout.A0B = r5;
        peerAvatarLayout.A0G = true;
        peerAvatarLayout.A0H = false;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1EC getGroupJid() {
        return this.A09;
    }

    public final C18600wl getLatencySensitiveDispatcher() {
        C18600wl r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("latencySensitiveDispatcher");
        throw null;
    }

    public final AnonymousClass4PJ getStateHolder() {
        AnonymousClass4PJ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stateHolder");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final AnonymousClass1VE getVoipSharedPreference() {
        AnonymousClass1VE r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("voipSharedPreference");
        throw null;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public final void setGroupJid(AnonymousClass1EC r2) {
        if (C18070vi.A18(this.A09, r2)) {
            this.A09 = r2;
        }
        getStateHolder().A00 = r2;
    }

    public final void A02() {
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            AnonymousClass48l r0 = new AnonymousClass48l(this, 25);
            setOnClickListener(r0);
            setupAvatarView(r0);
            AnonymousClass3MX.A1Q(new VCMiniPlayerView$init$1(A002, this, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAlpha(0.0f);
    }

    public final void setIsAtBottom(boolean z) {
        AnonymousClass3MY.A1Y(getStateHolder().A0E, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A08) {
            this.A08 = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A07 = C27011Uj.A00();
            this.A02 = C27691Xc.A0D(r2);
            AnonymousClass10E r22 = r2.A10;
            this.A03 = AnonymousClass3Ma.A0a(r22);
            this.A04 = AnonymousClass10E.A6O(r22);
            this.A00 = (AnonymousClass1VE) r22.ABT.get();
            this.A05 = AnonymousClass10E.A6Q(r22);
        }
        Integer num = AnonymousClass00R.A0C;
        this.A0A = C84074Ht.A00(this, num, 2131428010);
        this.A0F = C84074Ht.A00(this, num, 2131432879);
        this.A0D = C84074Ht.A00(this, num, 2131430467);
        this.A0G = C84074Ht.A00(this, num, 2131433841);
        this.A0E = C84074Ht.A00(this, num, 2131435711);
        this.A0I = C84074Ht.A00(this, num, 2131437020);
        this.A0B = C43531zx.A02(this, num, 2131428274);
        this.A0C = C84074Ht.A00(this, num, 2131429360);
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass5EN(context));
        this.A0J = AnonymousClass1DF.A01(new AnonymousClass5EM(context));
        View.inflate(context, 2131627329, this);
        setGravity(1);
        setClipToPadding(false);
        setClipChildren(false);
        setOrientation(1);
        setLayoutTransition((LayoutTransition) null);
        C28931bI A0v = AnonymousClass3MX.A0v(this.A0F);
        setPressed(false);
        A0v.A07(new C98214ql(A0v, this, 1));
        C28931bI A0v2 = AnonymousClass3MX.A0v(this.A0D);
        A0v2.A07(new C98264qq(context, this, A0v2, 0));
        C28931bI A0v3 = AnonymousClass3MX.A0v(this.A0I);
        A0v3.A07(new C98264qq(context, this, A0v3, 1));
    }

    public /* synthetic */ VCMiniPlayerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VCMiniPlayerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
