package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1L9;
import X.AnonymousClass1RW;
import X.AnonymousClass3MY;
import X.AnonymousClass5CO;
import X.C134216qE;
import X.C17880vN;
import X.C18070vi;
import X.C18110vm;
import X.C201110w;
import X.C40811vJ;
import X.C84704Kn;
import X.C86534Sa;
import android.content.Context;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.voipcalling.CallState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class VoiceChatGridViewModel extends CallGridViewModel {
    public C84704Kn A00;
    public final AnonymousClass1RW A01;

    public float A0T(CallState callState, boolean z) {
        C18070vi.A0d(callState, 0);
        if (z || !C40811vJ.A0X(this.A0g)) {
            return 1.0f;
        }
        if (callState == CallState.REJOINING) {
            return 0.7f;
        }
        if (callState == CallState.ACCEPT_SENT) {
            return 0.3f;
        }
        return 1.0f;
    }

    public boolean A0a() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6RE A0U(X.C86534Sa r8) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallState r3 = r8.A0B
            X.C18070vi.A0W(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r0) goto L_0x0036
            X.0ve r6 = r7.A0g
            X.10w r0 = r8.A06
            int r5 = r0.size()
            boolean r4 = r8.A0O
            r0 = 6359(0x18d7, float:8.911E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r2, r6, r0)
            r0 = 5241(0x1479, float:7.344E-42)
            int r0 = X.C18020vd.A00(r2, r6, r0)
            if (r5 > r0) goto L_0x0036
            if (r4 == 0) goto L_0x0027
            if (r1 == 0) goto L_0x0036
        L_0x0027:
            r2 = 1
        L_0x0028:
            X.5CN r0 = new X.5CN
            r0.<init>(r7)
            X.0vm r1 = X.AnonymousClass1DF.A01(r0)
            if (r2 == 0) goto L_0x0038
            X.6RE r0 = X.AnonymousClass6RE.NO_ONE_HERE
            return r0
        L_0x0036:
            r2 = 0
            goto L_0x0028
        L_0x0038:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r0) goto L_0x003f
            X.6RE r0 = X.AnonymousClass6RE.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST
            return r0
        L_0x003f:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 == r0) goto L_0x0047
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r0) goto L_0x0054
        L_0x0047:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0054
            X.6RE r0 = X.AnonymousClass6RE.NONE
            return r0
        L_0x0054:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x005f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r0) goto L_0x005f
            X.6RE r0 = X.AnonymousClass6RE.CONNECTING
            return r0
        L_0x005f:
            X.6RE r0 = super.A0U(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.A0U(X.4Sa):X.6RE");
    }

    public LinkedHashMap A0V(C86534Sa r6) {
        CallState callState = r6.A0B;
        C18070vi.A0W(callState);
        C18110vm A012 = AnonymousClass1DF.A01(new AnonymousClass5CO(this));
        if (callState == CallState.REJOINING || callState == CallState.RECEIVED_CALL) {
            C201110w r0 = r6.A06;
            C18070vi.A0W(r0);
            LinkedHashMap A13 = C17880vN.A13();
            Iterator it = r0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                if (!((C134216qE) A16.getValue()).A0M && ((C134216qE) A16.getValue()).A04 == 1) {
                    A13.put(A16.getKey(), A16.getValue());
                }
            }
            return A13;
        } else if (callState != CallState.ACCEPT_SENT || !AnonymousClass000.A1Y(A012.getValue())) {
            return CallGridViewModel.A07(r6, this);
        } else {
            C201110w r02 = r6.A06;
            C18070vi.A0W(r02);
            LinkedHashMap A132 = C17880vN.A13();
            Iterator it2 = r02.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(it2);
                if (((C134216qE) A162.getValue()).A0M || ((C134216qE) A162.getValue()).A04 == 1) {
                    A132.put(A162.getKey(), A162.getValue());
                }
            }
            return A132;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1LU, java.lang.Object] */
    public void A0X(Context context) {
        C84704Kn r2;
        Context A1n;
        AnonymousClass1E7 r5 = this.A05;
        if (r5 != null && (r2 = this.A00) != null) {
            boolean A012 = this.A01.A00().A01(r5.A0J);
            AudioChatBottomSheetDialog audioChatBottomSheetDialog = r2.A00;
            audioChatBottomSheetDialog.A2K().A00(14, 35);
            if (!A012 && (A1n = audioChatBottomSheetDialog.A1n()) != null) {
                AnonymousClass1L9 r22 = audioChatBottomSheetDialog.A03;
                if (r22 != null) {
                    r22.A0B(A1n, AnonymousClass3MY.A06(A1n, new Object(), r5.A0J), "AudioChatBottomSheetDialog/onGoToChatButtonClicked");
                } else {
                    C18070vi.A11("activityUtils");
                    throw null;
                }
            }
            audioChatBottomSheetDialog.A29();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoiceChatGridViewModel(X.AnonymousClass1L9 r46, X.AnonymousClass190 r47, X.AnonymousClass11S r48, X.C175258yP r49, X.C143867Fc r50, X.C129986ih r51, X.AnonymousClass1V9 r52, X.C21141AfC r53, X.AnonymousClass1M9 r54, X.AnonymousClass1PM r55, X.C24921Me r56, X.AnonymousClass1RW r57, X.AnonymousClass118 r58, X.AnonymousClass1MZ r59, X.C23661Hd r60, X.C18030ve r61, X.AnonymousClass126 r62, X.C24901Mc r63, X.AnonymousClass1DC r64, X.AnonymousClass10I r65, com.whatsapp.voipcalling.camera.VoipCameraManager r66, X.AnonymousClass00H r67, X.AnonymousClass00H r68, X.C18140vp r69, X.C18140vp r70, X.C18140vp r71, X.C18140vp r72) {
        /*
            r45 = this;
            r6 = r58
            r42 = r48
            r3 = r65
            r4 = r63
            r5 = r61
            r0 = r42
            X.C18070vi.A0w(r5, r0, r6, r3, r4)
            r8 = 7
            r21 = r50
            r20 = r49
            r44 = r46
            r7 = r64
            r2 = r20
            r1 = r21
            r0 = r44
            X.C72483Me.A16(r0, r2, r1, r7, r8)
            r16 = r56
            r17 = r54
            r18 = r53
            r9 = r66
            r10 = r62
            r2 = r17
            r1 = r16
            r0 = r18
            X.C18070vi.A0y(r2, r1, r10, r0, r9)
            r1 = r55
            r19 = r52
            r13 = r59
            r12 = r67
            r0 = r19
            X.C18070vi.A0t(r1, r0, r13, r12)
            r1 = r72
            r2 = r71
            r8 = r70
            r11 = r69
            X.C18070vi.A0u(r11, r8, r2, r1)
            r0 = 24
            r14 = r68
            X.C18070vi.A0d(r14, r0)
            r15 = 26
            r43 = r47
            r0 = r43
            X.C18070vi.A0d(r0, r15)
            r0 = 27
            r15 = r57
            X.C18070vi.A0d(r15, r0)
            r0 = r45
            r22 = r51
            r29 = r60
            r32 = r4
            r33 = r7
            r34 = r3
            r35 = r9
            r36 = r12
            r37 = r14
            r38 = r11
            r39 = r8
            r40 = r2
            r41 = r1
            r23 = r19
            r24 = r18
            r25 = r17
            r26 = r16
            r27 = r6
            r28 = r13
            r30 = r5
            r31 = r10
            r16 = r0
            r17 = r44
            r18 = r43
            r19 = r42
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.A01 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.<init>(X.1L9, X.190, X.11S, X.8yP, X.7Fc, X.6ih, X.1V9, X.AfC, X.1M9, X.1PM, X.1Me, X.1RW, X.118, X.1MZ, X.1Hd, X.0ve, X.126, X.1Mc, X.1DC, X.10I, com.whatsapp.voipcalling.camera.VoipCameraManager, X.00H, X.00H, X.0vp, X.0vp, X.0vp, X.0vp):void");
    }
}
