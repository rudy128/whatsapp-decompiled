package com.whatsapp.calling.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass1DC;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aR;
import X.AnonymousClass74H;
import X.C134216qE;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C26911Ty;
import X.C28931bI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

public class VoipCallFooter extends LinearLayout implements AnonymousClass009 {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public ImageButton A02;
    public ImageButton A03;
    public AnonymousClass1KB A04;
    public C26911Ty A05;
    public AnonymousClass1PM A06;
    public C18030ve A07;
    public AnonymousClass1DC A08;
    public AnonymousClass10I A09;
    public VoipCameraManager A0A;
    public AnonymousClass031 A0B;
    public boolean A0C;
    public boolean A0D;
    public final View A0E;
    public final View A0F;
    public final ImageButton A0G;
    public final ImageButton A0H;
    public final ImageButton A0I;
    public final ImageButton A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final ImageButton A0O;
    public final ImageButton A0P;
    public final C28931bI A0Q;

    private void A00(CallInfo callInfo, boolean z, boolean z2) {
        C134216qE r0;
        if (AnonymousClass74H.A0B(this.A07, this.A08, callInfo)) {
            boolean z3 = false;
            this.A0Q.A04(0);
            ImageButton imageButton = this.A03;
            if (imageButton == null) {
                imageButton = (ImageButton) AnonymousClass1HF.A06(this, 2131434824);
                this.A03 = imageButton;
            }
            imageButton.setSelected(z);
            if (callInfo.callState == CallState.ACTIVE && !callInfo.isSelfRequestingUpgrade() && (r0 = callInfo.self) != null && r0.A08 == 1 && !z2) {
                z3 = true;
            }
            AnonymousClass4aR.A09(this.A03, z3);
            if (z3) {
                this.A03.setOnClickListener(this.A01);
                return;
            }
            return;
        }
        this.A0Q.A04(8);
    }

    private void setMuteButtonEnabled(boolean z) {
        AnonymousClass4aR.A09(this.A0H, z);
    }

    public void A02() {
        this.A0I.setImageResource(2131232426);
        if (!this.A0D) {
            this.A0P.setImageResource(2131232403);
        }
        AnonymousClass3MY.A0w(getContext(), this.A0P, 2131898122);
        A01(false);
    }

    public void A03() {
        this.A0I.setImageResource(2131231918);
        if (!this.A0D) {
            this.A0P.setImageResource(2131232404);
        }
        AnonymousClass3MY.A0w(getContext(), this.A0P, 2131898121);
        A01(true);
    }

    public void A04(float f) {
        this.A0G.setRotation(f);
        this.A0I.setRotation(f);
        this.A0H.setRotation(f);
        this.A0P.setRotation(f);
        this.A0O.setRotation(f);
        ImageButton imageButton = this.A03;
        if (imageButton != null) {
            imageButton.setRotation(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r9.A08.BcY() == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r13 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        if (r15 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
        if (X.AnonymousClass000.A1T(r6.A08, 6) != false) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(com.whatsapp.voipcalling.CallInfo r10, java.lang.String r11, int r12, boolean r13, boolean r14, boolean r15) {
        /*
            r9 = this;
            com.whatsapp.voipcalling.CallState r5 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 == r0) goto L_0x0095
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r5)
            if (r0 != 0) goto L_0x0095
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x0016
            boolean r0 = r10.isStartedFromCallLink()
            if (r0 == 0) goto L_0x001a
        L_0x0016:
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x0023
        L_0x001a:
            X.1DC r0 = r9.A08
            boolean r1 = r0.BcY()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0038
            X.1PM r0 = r9.A06
            boolean r0 = X.C63982u1.A0A(r0, r10)
            if (r0 == 0) goto L_0x01ac
        L_0x0038:
            X.0ve r0 = r9.A07
            boolean r0 = X.C40811vJ.A0Q(r0)
            if (r0 == 0) goto L_0x01ac
        L_0x0040:
            r7 = 1
        L_0x0041:
            android.view.View r1 = r9.A0M
            r2 = 8
            r0 = 0
            if (r7 == 0) goto L_0x004a
            r0 = 8
        L_0x004a:
            r1.setVisibility(r0)
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0187
            X.0ve r0 = r9.A07
            boolean r0 = X.C40811vJ.A0S(r0)
            if (r0 == 0) goto L_0x0187
            android.view.View r0 = r9.A0E
            r0.setVisibility(r3)
            r0 = 2131429988(0x7f0b0a64, float:1.8481664E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r9, r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r9.A02 = r0
            X.AnonymousClass4aR.A09(r0, r4)
            android.widget.ImageButton r1 = r9.A02
            android.view.View$OnClickListener r0 = r9.A00
            r1.setOnClickListener(r0)
        L_0x0077:
            if (r7 == 0) goto L_0x007d
            r0 = 1082130432(0x40800000, float:4.0)
            if (r13 == 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r9.setWeightSum(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r5 != r0) goto L_0x0096
            android.widget.ImageButton r0 = r9.A0I
            X.AnonymousClass4aR.A09(r0, r3)
            android.widget.ImageButton r0 = r9.A0P
            X.AnonymousClass4aR.A09(r0, r3)
            r9.A00(r10, r14, r15)
            r9.setMuteButtonEnabled(r3)
        L_0x0095:
            return
        L_0x0096:
            X.6qE r6 = r10.self
            if (r6 != 0) goto L_0x00a0
            java.lang.String r0 = "VoipCallFooter/updateAudioButtonsState Self info is null, skip"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00a0:
            boolean r0 = r10.videoEnabled
            r7 = 3
            android.widget.ImageButton r1 = r9.A0I
            if (r0 == 0) goto L_0x0162
            int r0 = r6.A08
            r8 = 6
            boolean r0 = X.AnonymousClass000.A1T(r0, r8)
            if (r0 != 0) goto L_0x00c1
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r9.A0A
            int r0 = r0.getCameraCount(r3)
            if (r0 <= r4) goto L_0x00c1
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x00c1
            if (r14 != 0) goto L_0x00c1
            r0 = 1
            if (r15 == 0) goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            X.AnonymousClass4aR.A09(r1, r0)
            r1.setSelected(r3)
            android.widget.ImageButton r1 = r9.A0G
            boolean r0 = X.AnonymousClass000.A1T(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0F
            r0 = r0 ^ 1
            X.AnonymousClass4aR.A09(r1, r0)
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x015b
            com.whatsapp.voipcalling.CallState r0 = r10.callState
            boolean r0 = X.AnonymousClass72U.A01(r0)
            if (r0 == 0) goto L_0x00ed
            int r0 = r6.A08
            boolean r1 = X.AnonymousClass000.A1T(r0, r8)
            r0 = 1
            if (r1 == 0) goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            android.widget.ImageButton r1 = r9.A0P
            r1.setSelected(r0)
        L_0x00f3:
            android.view.View r0 = r9.A0K
            if (r13 == 0) goto L_0x00f8
            r2 = 0
        L_0x00f8:
            r0.setVisibility(r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 == r0) goto L_0x0103
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r0) goto L_0x0114
        L_0x0103:
            boolean r0 = r10.isGroupCall
            if (r0 == 0) goto L_0x010b
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x0114
        L_0x010b:
            boolean r0 = r10.isCallOnHold()
            if (r0 != 0) goto L_0x0114
            if (r14 != 0) goto L_0x0114
            r3 = 1
        L_0x0114:
            X.AnonymousClass4aR.A09(r1, r3)
            r9.setMuteButtonEnabled(r4)
            android.widget.ImageButton r1 = r9.A0H
            boolean r0 = r6.A0I
            r1.setSelected(r0)
            boolean r0 = r10.videoEnabled
            r9.A01(r0)
            r9.A00(r10, r14, r15)
            android.widget.ImageButton r0 = r9.A03
            if (r0 == 0) goto L_0x0095
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0095
            android.content.Context r4 = r9.getContext()
            android.widget.ImageButton r0 = r9.A03
            boolean r3 = r0.isSelected()
            android.widget.ImageButton r2 = r9.A03
            r0 = 2131895454(0x7f12249e, float:1.9425741E38)
            if (r3 == 0) goto L_0x0147
            r0 = 2131895458(0x7f1224a2, float:1.942575E38)
        L_0x0147:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131895453(0x7f12249d, float:1.942574E38)
            if (r3 == 0) goto L_0x0153
            r0 = 2131895457(0x7f1224a1, float:1.9425748E38)
        L_0x0153:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass4aR.A07(r2, r1, r0)
            return
        L_0x015b:
            int r0 = r6.A08
            boolean r0 = X.AnonymousClass000.A1T(r0, r8)
            goto L_0x00ee
        L_0x0162:
            boolean r0 = r6.A0F
            r0 = r0 ^ 1
            X.AnonymousClass4aR.A09(r1, r0)
            boolean r0 = X.AnonymousClass000.A1T(r12, r4)
            r1.setSelected(r0)
            android.widget.ImageButton r1 = r9.A0G
            boolean r0 = X.AnonymousClass000.A1T(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0F
            r0 = r0 ^ 1
            X.AnonymousClass4aR.A09(r1, r0)
            android.widget.ImageButton r1 = r9.A0P
            r1.setSelected(r3)
            goto L_0x00f3
        L_0x0187:
            X.1PM r0 = r9.A06
            boolean r0 = X.C63982u1.A0A(r0, r10)
            if (r0 == 0) goto L_0x01a5
            X.0ve r0 = r9.A07
            boolean r0 = X.C40811vJ.A0S(r0)
            if (r0 == 0) goto L_0x01a5
            X.10I r6 = r9.A09
            r1 = 14
            X.7RL r0 = new X.7RL
            r0.<init>(r9, r10, r1)
            r6.CGF(r0)
            goto L_0x0077
        L_0x01a5:
            android.view.View r0 = r9.A0E
            r0.setVisibility(r2)
            goto L_0x0077
        L_0x01ac:
            r7 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A05(com.whatsapp.voipcalling.CallInfo, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void setBluetoothButtonClickListener(View.OnClickListener onClickListener) {
        this.A0G.setOnClickListener(onClickListener);
    }

    public void setDialpadBtnSelected(boolean z) {
        this.A02.setSelected(z);
    }

    public void setEndCallButtonClickListener(View.OnClickListener onClickListener) {
        this.A0O.setOnClickListener(onClickListener);
    }

    public void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        this.A0H.setOnClickListener(onClickListener);
    }

    public void setSpeakerButtonClickListener(View.OnClickListener onClickListener) {
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonClickListener(View.OnClickListener onClickListener) {
        this.A0P.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonSelected(boolean z) {
        this.A0P.setSelected(z);
    }

    public void setViewPeopleBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.A0J;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A07 = AnonymousClass10E.A8r(A0O2);
            this.A04 = AnonymousClass10E.A12(A0O2);
            this.A09 = AnonymousClass10E.AL1(A0O2);
            this.A08 = AnonymousClass3MZ.A13(A0O2);
            this.A05 = (C26911Ty) A0O2.A1J.get();
            this.A06 = AnonymousClass3MZ.A0f(A0O2);
            this.A0A = (VoipCameraManager) A0O2.ABQ.get();
        }
        this.A0D = false;
        LayoutInflater.from(context).inflate(2131627486, this, true);
        this.A0I = (ImageButton) findViewById(2131435539);
        this.A0L = findViewById(2131435540);
        this.A0G = (ImageButton) findViewById(2131428258);
        this.A0K = findViewById(2131428259);
        this.A0P = (ImageButton) findViewById(2131436264);
        this.A0M = findViewById(2131436265);
        this.A0H = (ImageButton) findViewById(2131432875);
        this.A0O = (ImageButton) AnonymousClass1HF.A06(this, 2131430953);
        this.A0F = AnonymousClass1HF.A06(this, 2131430465);
        this.A0Q = C28931bI.A00(this, 2131434825);
        this.A0E = findViewById(2131429989);
        this.A02 = (ImageButton) findViewById(2131429988);
        this.A0N = findViewById(2131436810);
        this.A0J = (ImageButton) findViewById(2131436809);
        this.A0D = C18020vd.A05(C18040vf.A02, this.A07, 7175);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r5.A0D != r5.A0P.isSelected()) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(boolean r6) {
        /*
            r5 = this;
            android.content.Context r4 = r5.getContext()
            android.widget.ImageButton r2 = r5.A0I
            if (r6 != 0) goto L_0x0092
            boolean r1 = r2.isSelected()
            r0 = 2131898224(0x7f122f70, float:1.943136E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131898223(0x7f122f6f, float:1.9431358E38)
        L_0x0014:
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            if (r6 == 0) goto L_0x0022
            r0 = 2131898218(0x7f122f6a, float:1.9431348E38)
            java.lang.String r0 = r4.getString(r0)
        L_0x0022:
            X.AnonymousClass4aR.A07(r2, r1, r0)
            android.widget.ImageButton r2 = r5.A0G
            boolean r1 = r2.isSelected()
            r0 = 2131898167(0x7f122f37, float:1.9431244E38)
            if (r1 == 0) goto L_0x0033
            r0 = 2131898166(0x7f122f36, float:1.9431242E38)
        L_0x0033:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131898182(0x7f122f46, float:1.9431275E38)
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass4aR.A07(r2, r1, r0)
            if (r6 == 0) goto L_0x004e
            boolean r1 = r5.A0D
            android.widget.ImageButton r0 = r5.A0P
            boolean r0 = r0.isSelected()
            r3 = 1
            if (r1 == r0) goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            android.widget.ImageButton r2 = r5.A0P
            r0 = 2131898222(0x7f122f6e, float:1.9431356E38)
            if (r3 == 0) goto L_0x0059
            r0 = 2131898220(0x7f122f6c, float:1.9431352E38)
        L_0x0059:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131898221(0x7f122f6d, float:1.9431354E38)
            if (r3 == 0) goto L_0x0065
            r0 = 2131898219(0x7f122f6b, float:1.943135E38)
        L_0x0065:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass4aR.A07(r2, r1, r0)
            android.widget.ImageButton r3 = r5.A0H
            boolean r1 = r3.isSelected()
            r0 = 2131898207(0x7f122f5f, float:1.9431325E38)
            if (r1 == 0) goto L_0x007a
            r0 = 2131898227(0x7f122f73, float:1.9431366E38)
        L_0x007a:
            java.lang.String r2 = r4.getString(r0)
            boolean r1 = r3.isSelected()
            r0 = 2131898206(0x7f122f5e, float:1.9431323E38)
            if (r1 == 0) goto L_0x008a
            r0 = 2131898226(0x7f122f72, float:1.9431364E38)
        L_0x008a:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass4aR.A07(r3, r2, r0)
            return
        L_0x0092:
            r0 = 2131898218(0x7f122f6a, float:1.9431348E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A01(boolean):void");
    }

    public void setDialpadBtnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public void setScreenShareBtnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallFooter(Context context) {
        this(context, (AttributeSet) null);
    }
}
