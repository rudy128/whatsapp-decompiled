package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y1;
import X.AnonymousClass21X;
import X.AnonymousClass3M2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass88S;
import X.C18030ve;
import X.C18070vi;
import X.C24681Lg;
import X.C31131f4;
import X.C32021gV;
import X.C41111vp;
import X.C62842s5;
import X.C827349n;
import X.C86034Px;
import X.C88144Ym;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;

public final class PushToVideoInlineVideoPlayer extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C31131f4 A01;
    public C24681Lg A02;
    public C18030ve A03;
    public C86034Px A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public final FrameLayout A07;
    public final WaImageView A08;
    public final C827349n A09;
    public final AnonymousClass3M2 A0A;
    public final C41111vp A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToVideoInlineVideoPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void A04(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, AnonymousClass21X r18, C32021gV r19, AnonymousClass88S r20, Runnable runnable, boolean z, boolean z2, boolean z3, boolean z4) {
        C32021gV r5 = r19;
        C18070vi.A0d(r5, 5);
        C88144Ym uiState = getUiState();
        setUiState(new C88144Ym(onClickListener, onLongClickListener, onTouchListener, r18, r5, r20, runnable, z, z2, z3, uiState.A0A, z4, uiState.A0C));
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setMessageAudioPlayerProvider(C31131f4 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageObservers(C24681Lg r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setVideoPlayerPoolManager(C86034Px r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    /* access modifiers changed from: private */
    public final C88144Ym getUiState() {
        return (C88144Ym) this.A0B.A06();
    }

    private final void setUiState(C88144Ym r2) {
        this.A0B.A0F(r2);
    }

    public final void A03() {
        C827349n r3 = this.A09;
        if (r3.A00.A02() == 4) {
            r3.A0M(0);
            setPlayWhenReadyAndActive(true);
            return;
        }
        setPlayWhenReadyAndActive(!getUiState().A0C);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final int getCurrentPosition() {
        return this.A09.A07();
    }

    public final int getDuration() {
        return this.A09.A06();
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C31131f4 getMessageAudioPlayerProvider() {
        C31131f4 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageAudioPlayerProvider");
        throw null;
    }

    public final C24681Lg getMessageObservers() {
        C24681Lg r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageObservers");
        throw null;
    }

    public final boolean getPlayWhenReady() {
        return this.A09.A00.A07;
    }

    public final int getPlaybackState() {
        return this.A09.A00.A02();
    }

    public final C86034Px getVideoPlayerPoolManager() {
        C86034Px r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("videoPlayerPoolManager");
        throw null;
    }

    public static final void A01(PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer, int i, boolean z) {
        AnonymousClass21X r2 = pushToVideoInlineVideoPlayer.getUiState().A03;
        if (r2 != null && pushToVideoInlineVideoPlayer.getUiState().A08 && z && i == 3 && C62842s5.A02(r2)) {
            pushToVideoInlineVideoPlayer.getMessageObservers().A02(r2, 25);
        }
        AnonymousClass88S r0 = pushToVideoInlineVideoPlayer.getUiState().A05;
        if (r0 != null) {
            r0.C0q(z, i);
        }
    }

    public final void A02() {
        C32021gV r0;
        AnonymousClass21X r2 = getUiState().A03;
        if (r2 != null && (r0 = getUiState().A04) != null) {
            r0.A0G(this.A08, r2, this.A0A, r2.A0v, false);
        }
    }

    public final boolean getPlayWhenReadyAndActive() {
        return getUiState().A0C;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C88144Ym uiState = getUiState();
        AnonymousClass21X r4 = uiState.A03;
        boolean z = uiState.A08;
        boolean z2 = uiState.A0B;
        boolean z3 = uiState.A07;
        boolean z4 = uiState.A09;
        setUiState(new C88144Ym(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z, z2, z3, true, z4, false));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C88144Ym uiState = getUiState();
        AnonymousClass21X r4 = uiState.A03;
        boolean z = uiState.A08;
        boolean z2 = uiState.A0B;
        boolean z3 = uiState.A07;
        boolean z4 = uiState.A09;
        boolean z5 = uiState.A0C;
        setUiState(new C88144Ym(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z, z2, z3, false, z4, z5));
    }

    public final void setPlayWhenReadyAndActive(boolean z) {
        C88144Ym uiState = getUiState();
        AnonymousClass21X r4 = uiState.A03;
        boolean z2 = uiState.A08;
        boolean z3 = uiState.A0B;
        boolean z4 = uiState.A07;
        boolean z5 = uiState.A0A;
        boolean z6 = uiState.A09;
        setUiState(new C88144Ym(uiState.A00, uiState.A01, uiState.A02, r4, uiState.A04, uiState.A05, uiState.A06, z2, z3, z4, z5, z6, z));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PushToVideoInlineVideoPlayer(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r5 = 1
            r2 = r21
            X.C18070vi.A0d(r2, r5)
            r4 = r20
            r1 = r22
            r0 = r23
            r4.<init>(r2, r1, r0)
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0047
            r4.A06 = r5
            java.lang.Object r0 = r4.generatedComponent()
            X.10E r1 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r4.A03 = r0
            X.1KB r0 = X.AnonymousClass10E.A12(r1)
            r4.A00 = r0
            X.00S r0 = r1.A6M
            java.lang.Object r0 = r0.get()
            X.1f4 r0 = (X.C31131f4) r0
            r4.A01 = r0
            X.1Lg r0 = X.AnonymousClass3MZ.A0o(r1)
            r4.A02 = r0
            X.10G r0 = r1.A00
            X.00S r0 = r0.A58
            java.lang.Object r0 = r0.get()
            X.4Px r0 = (X.C86034Px) r0
            r4.A04 = r0
        L_0x0047:
            r7 = 0
            r14 = 0
            X.4Ym r6 = new X.4Ym
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r8 = r7
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vp r3 = X.AnonymousClass3MW.A0n(r6)
            r4.A0B = r3
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131897848(0x7f122df8, float:1.9430597E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0m(r1, r0)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r2)
            r7 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r7, r7)
            r9.setLayoutParams(r0)
            r9.setClipChildren(r14)
            r0 = 8
            r9.setVisibility(r0)
            r9.setImportantForAccessibility(r5)
            r9.setContentDescription(r1)
            r4.addView(r9)
            r4.A07 = r9
            com.whatsapp.WaImageView r8 = new com.whatsapp.WaImageView
            r8.<init>(r2)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r7, r7)
            r8.setLayoutParams(r0)
            X.AnonymousClass3MW.A1R(r8)
            r8.setImportantForAccessibility(r5)
            r8.setContentDescription(r1)
            r4.addView(r8)
            r4.A08 = r8
            android.view.View r6 = new android.view.View
            r6.<init>(r2)
            r0 = 2131232849(0x7f080851, float:1.8081819E38)
            X.AnonymousClass3MY.A0v(r2, r6, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166285(0x7f07044d, float:1.7946811E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r1 = 80
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r7, r5, r1)
            r6.setLayoutParams(r0)
            r6.setClickable(r14)
            r6.setFocusable(r14)
            r0 = 2
            r6.setImportantForAccessibility(r0)
            r4.addView(r6)
            X.0ve r11 = r4.getAbProps()
            X.1KB r10 = r4.getGlobalUI()
            X.4Px r12 = r4.getVideoPlayerPoolManager()
            X.49n r7 = new X.49n
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = 2
            X.4r0 r0 = new X.4r0
            r0.<init>(r4, r1)
            r7.A0T(r0)
            r4.A09 = r7
            X.4qd r0 = new X.4qd
            r0.<init>(r2, r4)
            r4.A0A = r0
            X.4rF r0 = X.C98494rF.A00()
            X.5Uq r2 = new X.5Uq
            r2.<init>(r4, r0)
            r1 = 10
            X.4g1 r0 = new X.4g1
            r0.<init>(r2, r1)
            r3.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ PushToVideoInlineVideoPlayer(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToVideoInlineVideoPlayer(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
