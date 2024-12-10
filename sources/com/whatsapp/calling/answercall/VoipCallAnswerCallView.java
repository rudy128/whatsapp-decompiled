package com.whatsapp.calling.answercall;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7DG;
import X.AnonymousClass7DR;
import X.C108975cc;
import X.C116075wM;
import X.C123066Sz;
import X.C1402770r;
import X.C1594384n;
import X.C18070vi;
import X.C18100vl;
import X.C18140vp;
import X.C19740yt;
import X.C43531zx;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.calling.views.CallResponseLayout;
import com.whatsapp.components.AnimatingArrowsLayout;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;

public final class VoipCallAnswerCallView extends C116075wM {
    public C18140vp A00;
    public boolean A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C72463Mc.A0X(this).A8t;
        }
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C72463Mc.A0X(this).A8t;
        }
        Integer num = AnonymousClass00R.A0C;
        this.A05 = C43531zx.A02(this, num, 2131427369);
        this.A06 = C43531zx.A02(this, num, 2131427368);
        this.A07 = C43531zx.A02(this, num, 2131429840);
        this.A08 = C43531zx.A02(this, num, 2131429839);
        this.A09 = C43531zx.A02(this, num, 2131434516);
        this.A0A = C43531zx.A02(this, num, 2131429842);
        this.A02 = C43531zx.A02(this, num, 2131427366);
        this.A03 = C43531zx.A02(this, num, 2131429837);
        this.A04 = C43531zx.A02(this, num, 2131434513);
        View.inflate(context, 2131624194, this);
    }

    public static /* synthetic */ void getEnableNewCallControls$annotations() {
    }

    public static final void setupCallResponseLayout$lambda$10(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        voipCallAnswerCallView.A04();
    }

    public static final void setupCallResponseLayout$lambda$5(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        voipCallAnswerCallView.A03();
    }

    public static final void setupCallResponseLayout$lambda$6(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        int i = 2;
        if (voipCallAnswerCallView.A02) {
            i = 7;
        }
        C1594384n r0 = voipCallAnswerCallView.A00;
        if (r0 != null) {
            ((AnonymousClass7DG) r0).A00.CEC(i);
        }
    }

    public static final void setupCallResponseLayout$lambda$7(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        voipCallAnswerCallView.A04();
    }

    public static final void setupCallResponseLayout$lambda$8(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        voipCallAnswerCallView.A03();
    }

    public static final void setupCallResponseLayout$lambda$9(VoipCallAnswerCallView voipCallAnswerCallView) {
        C18070vi.A0d(voipCallAnswerCallView, 0);
        int i = 2;
        if (voipCallAnswerCallView.A02) {
            i = 7;
        }
        C1594384n r0 = voipCallAnswerCallView.A00;
        if (r0 != null) {
            ((AnonymousClass7DG) r0).A00.CEC(i);
        }
    }

    public void A06(CallInfo callInfo, boolean z, boolean z2) {
        Log.i("voip/VoipCallAnswerCallView/show");
        super.A06(callInfo, z, z2);
        A00();
        setVisibility(0);
        setupCallAnswerBtns(z2);
    }

    public final void setEnableNewCallControls(C18140vp r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final ImageView getAcceptCall() {
        return (ImageView) this.A05.getValue();
    }

    private final TextView getAcceptCallHint() {
        return (TextView) this.A06.getValue();
    }

    private final View getAcceptCallSwipeUpHintView() {
        return AnonymousClass3MW.A0A(this.A02);
    }

    private final ImageView getDeclineCall() {
        return (ImageView) this.A07.getValue();
    }

    private final TextView getDeclineCallHint() {
        return (TextView) this.A08.getValue();
    }

    private final View getDeclineCallSwipeUpHintView() {
        return AnonymousClass3MW.A0A(this.A03);
    }

    private final ImageView getReplyCall() {
        return (ImageView) this.A09.getValue();
    }

    private final TextView getReplyCallHint() {
        return (TextView) this.A0A.getValue();
    }

    private final View getReplyCallSwipeUpHintView() {
        return AnonymousClass3MW.A0A(this.A04);
    }

    private final void setupDeclineCallViews(C123066Sz r2) {
        throw AnonymousClass000.A0s("getType");
    }

    private final void setupReplyCallViews(C123066Sz r2) {
        throw AnonymousClass000.A0s("getType");
    }

    public final C18140vp getEnableNewCallControls() {
        C18140vp r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("enableNewCallControls");
        throw null;
    }

    private final void A00() {
        getAcceptCall().clearAnimation();
        getDeclineCall().clearAnimation();
        getReplyCall().clearAnimation();
        getAcceptCallHint().clearAnimation();
        getDeclineCallHint().clearAnimation();
        getReplyCallHint().clearAnimation();
    }

    public static final void A01(MotionEvent motionEvent, VoipCallAnswerCallView voipCallAnswerCallView) {
        boolean A1J = C108975cc.A1J(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            voipCallAnswerCallView.getDeclineCallHint().setVisibility(A1J ? 1 : 0);
            View A0A2 = AnonymousClass3MW.A0A(voipCallAnswerCallView.A03);
            A0A2.setVisibility(A1J);
            ((AnimatingArrowsLayout) A0A2).A03.start();
        }
    }

    public static final void A02(MotionEvent motionEvent, VoipCallAnswerCallView voipCallAnswerCallView) {
        boolean A1J = C108975cc.A1J(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            voipCallAnswerCallView.getReplyCallHint().setVisibility(A1J ? 1 : 0);
            View A0A2 = AnonymousClass3MW.A0A(voipCallAnswerCallView.A04);
            A0A2.setVisibility(A1J);
            ((AnimatingArrowsLayout) A0A2).A03.start();
        }
    }

    private final void setupAcceptCallViews(C123066Sz r2) {
        if (C72473Md.A1Z(getEnableNewCallControls())) {
            getAcceptCall();
            throw AnonymousClass000.A0s("getCallInfo");
        }
        throw AnonymousClass000.A0s("getType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c1, code lost:
        if (r1 != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupCallAnswerBtns(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x01b6
            r0 = 2131427367(0x7f0b0027, float:1.8476348E38)
            android.view.View r9 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r9 = (com.whatsapp.calling.views.CallResponseLayout) r9
            r5 = 0
            X.7DR r0 = new X.7DR
            r0.<init>(r11, r5)
            r9.A02 = r0
            r0 = 1
            r9.A06 = r0
            r0 = 2131429838(0x7f0b09ce, float:1.848136E38)
            android.view.View r8 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r8 = (com.whatsapp.calling.views.CallResponseLayout) r8
            r4 = 1
            X.7DR r0 = new X.7DR
            r0.<init>(r11, r4)
            r8.A02 = r0
            r0 = 2131434515(0x7f0b1c13, float:1.8490846E38)
            android.view.View r7 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r7 = (com.whatsapp.calling.views.CallResponseLayout) r7
            boolean r0 = r11.A03
            int r0 = X.C72453Mb.A01(r0)
            r7.setVisibility(r0)
            r3 = 2
            X.7DR r0 = new X.7DR
            r0.<init>(r11, r3)
            r7.A02 = r0
            r7.A07 = r4
            android.widget.ImageView r0 = r11.getAcceptCall()
            r9.A01 = r0
            android.widget.ImageView r0 = r11.getDeclineCall()
            r8.A01 = r0
            android.widget.ImageView r0 = r11.getReplyCall()
            r7.A01 = r0
            X.0vl r10 = r11.A02
            android.view.View r0 = X.AnonymousClass3MW.A0A(r10)
            r0.setVisibility(r5)
            com.whatsapp.components.AnimatingArrowsLayout r0 = (com.whatsapp.components.AnimatingArrowsLayout) r0
            android.animation.AnimatorSet r0 = r0.A03
            r0.start()
            X.0vl r6 = r11.A03
            android.view.View r0 = X.AnonymousClass3MW.A0A(r6)
            r0.clearAnimation()
            r2 = 4
            r0.setVisibility(r2)
            X.0vl r1 = r11.A04
            android.view.View r0 = X.AnonymousClass3MW.A0A(r1)
            r0.clearAnimation()
            r0.setVisibility(r2)
            android.view.View r0 = X.AnonymousClass3MW.A0A(r10)
            r9.A00 = r0
            android.view.View r0 = X.AnonymousClass3MW.A0A(r6)
            r8.A00 = r0
            android.view.View r0 = X.AnonymousClass3MW.A0A(r1)
            r7.A00 = r0
            X.0vp r0 = r11.getEnableNewCallControls()
            boolean r0 = X.C72473Md.A1Z(r0)
            if (r0 == 0) goto L_0x01dd
            com.whatsapp.voipcalling.CallInfo r0 = r11.A01
            if (r0 == 0) goto L_0x00b6
            android.widget.ImageView r2 = r11.getAcceptCall()
            boolean r1 = r0.videoEnabled
            X.C18070vi.A0d(r2, r5)
            r0 = 2131231623(0x7f080387, float:1.8079332E38)
            if (r1 == 0) goto L_0x00b3
            r0 = 2131231646(0x7f08039e, float:1.8079379E38)
        L_0x00b3:
            r2.setImageResource(r0)
        L_0x00b6:
            android.widget.TextView r2 = r11.getAcceptCallHint()
            com.whatsapp.voipcalling.CallInfo r0 = r11.A01
            if (r0 == 0) goto L_0x00c3
            boolean r1 = r0.videoEnabled
            r0 = 1
            if (r1 == 0) goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            r0 = r0 ^ 1
            X.C1402770r.A02(r2, r0)
        L_0x00c9:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x01cb
            r1 = 2131896652(0x7f12294c, float:1.9428171E38)
            r2 = 2131886181(0x7f120065, float:1.9406934E38)
        L_0x00d3:
            android.widget.TextView r0 = r11.getAcceptCallHint()
            r0.setText(r1)
            android.widget.TextView r0 = r11.getAcceptCallHint()
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r11.getAcceptCall()
            r0.setVisibility(r5)
            android.widget.ImageView r1 = r11.getAcceptCall()
            android.content.Context r0 = r11.getContext()
            X.AnonymousClass3MY.A0w(r0, r1, r2)
            r11.A00()
            android.widget.ImageView r0 = r11.getAcceptCall()
            android.view.animation.AnimationSet r1 = X.AnonymousClass4aR.A04(r0)
            android.widget.ImageView r0 = r11.getAcceptCall()
            r0.startAnimation(r1)
            boolean r0 = r11.A03
            r2 = 0
            r1 = 4
            if (r0 != 0) goto L_0x010c
            r1 = 0
        L_0x010c:
            android.widget.ImageView r0 = r11.getDeclineCall()
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.getDeclineCallHint()
            r0.setVisibility(r1)
            X.0vp r0 = r11.getEnableNewCallControls()
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 != 0) goto L_0x01b7
            android.widget.ImageView r2 = r11.getDeclineCall()
            boolean r1 = r11.A03
            r0 = 2131232429(0x7f0806ad, float:1.8080967E38)
            if (r1 == 0) goto L_0x0132
            r0 = 2131231750(0x7f080406, float:1.807959E38)
        L_0x0132:
            r2.setImageResource(r0)
        L_0x0135:
            boolean r0 = r11.A03
            r6 = 2131898125(0x7f122f0d, float:1.9431159E38)
            r2 = 2131889221(0x7f120c45, float:1.94131E38)
            if (r0 == 0) goto L_0x0145
            r6 = 2131896653(0x7f12294d, float:1.9428173E38)
            r2 = 2131889224(0x7f120c48, float:1.9413106E38)
        L_0x0145:
            android.widget.ImageView r1 = r11.getDeclineCall()
            android.content.Context r0 = r11.getContext()
            X.AnonymousClass3MY.A0w(r0, r1, r2)
            android.widget.TextView r0 = r11.getDeclineCallHint()
            r0.setText(r6)
            android.widget.ImageView r0 = r11.getDeclineCall()
            X.C1422678u.A00(r0, r11, r4)
            boolean r0 = r11.A03
            r2 = 0
            int r1 = X.C72453Mb.A01(r0)
            android.widget.ImageView r0 = r11.getReplyCall()
            r0.setVisibility(r5)
            android.widget.TextView r0 = r11.getReplyCallHint()
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r11.getReplyCall()
            X.C1422678u.A00(r0, r11, r3)
            X.0vp r0 = r11.getEnableNewCallControls()
            boolean r0 = X.C72473Md.A1Z(r0)
            if (r0 == 0) goto L_0x0196
            android.widget.TextView r1 = r11.getReplyCallHint()
            com.whatsapp.voipcalling.CallInfo r0 = r11.A01
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.videoEnabled
            if (r0 != 0) goto L_0x0191
            r2 = 1
        L_0x0191:
            r0 = r2 ^ 1
            X.C1402770r.A02(r1, r0)
        L_0x0196:
            if (r12 == 0) goto L_0x01b6
            android.widget.TextView r1 = r11.getAcceptCallHint()
            r0 = 2131886173(0x7f12005d, float:1.9406917E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.getDeclineCallHint()
            r0 = 2131889222(0x7f120c46, float:1.9413101E38)
            r1.setText(r0)
            android.widget.TextView r1 = r11.getReplyCallHint()
            r0 = 2131895160(0x7f122378, float:1.9425145E38)
            r1.setText(r0)
        L_0x01b6:
            return
        L_0x01b7:
            android.widget.TextView r1 = r11.getDeclineCallHint()
            com.whatsapp.voipcalling.CallInfo r0 = r11.A01
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r0.videoEnabled
            if (r0 != 0) goto L_0x01c4
            r2 = 1
        L_0x01c4:
            r0 = r2 ^ 1
            X.C1402770r.A02(r1, r0)
            goto L_0x0135
        L_0x01cb:
            boolean r0 = r11.A02
            r1 = 2131896651(0x7f12294b, float:1.942817E38)
            r2 = 2131886172(0x7f12005c, float:1.9406915E38)
            if (r0 == 0) goto L_0x00d3
            r1 = 2131896654(0x7f12294e, float:1.9428175E38)
            r2 = 2131889884(0x7f120edc, float:1.9414444E38)
            goto L_0x00d3
        L_0x01dd:
            boolean r2 = r11.A02
            java.lang.String r1 = "Required value was null."
            com.whatsapp.voipcalling.CallInfo r0 = r11.A01
            if (r2 == 0) goto L_0x01fa
            if (r0 == 0) goto L_0x020c
            boolean r0 = r0.videoEnabled
            r1 = 2131232169(0x7f0805a9, float:1.808044E38)
            if (r0 == 0) goto L_0x01f1
            r1 = 2131232168(0x7f0805a8, float:1.8080438E38)
        L_0x01f1:
            android.widget.ImageView r0 = r11.getAcceptCall()
            r0.setImageResource(r1)
            goto L_0x00c9
        L_0x01fa:
            if (r0 == 0) goto L_0x0211
            boolean r0 = r0.videoEnabled
            if (r0 == 0) goto L_0x00c9
            android.widget.ImageView r1 = r11.getAcceptCall()
            r0 = 2131231743(0x7f0803ff, float:1.8079576E38)
            r1.setImageResource(r0)
            goto L_0x00c9
        L_0x020c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.answercall.VoipCallAnswerCallView.setupCallAnswerBtns(boolean):void");
    }

    private final void setupCallResponseLayout(C123066Sz r4) {
        CallResponseLayout callResponseLayout = (CallResponseLayout) findViewById(2131427367);
        callResponseLayout.A02 = new AnonymousClass7DR(this, 3);
        callResponseLayout.A06 = true;
        ((CallResponseLayout) findViewById(2131429838)).A02 = new AnonymousClass7DR(this, 4);
        findViewById(2131434515);
        throw AnonymousClass000.A0s("getType");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C72473Md.A1Z(getEnableNewCallControls())) {
            Context A042 = AnonymousClass3MY.A04(this);
            ImageView acceptCall = getAcceptCall();
            ImageView declineCall = getDeclineCall();
            ImageView replyCall = getReplyCall();
            C18070vi.A0d(acceptCall, 1);
            C18070vi.A0k(declineCall, replyCall);
            C1402770r.A01(acceptCall, C19740yt.A00(A042, 2131103277), true);
            C1402770r.A01(replyCall, C19740yt.A00(A042, 2131102993), true);
            replyCall.setImageResource(2131233237);
            C1402770r.A01(declineCall, AnonymousClass3Ma.A00(A042, 2130971851, 2131102996), true);
            declineCall.setImageResource(2131231634);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final void setupCallAnswerBtns(C123066Sz r2) {
        if (getVisibility() == 0) {
            setupCallResponseLayout(r2);
            throw null;
        }
    }

    public /* synthetic */ VoipCallAnswerCallView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoipCallAnswerCallView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
