package com.whatsapp.calling.service;

import X.A69;
import X.A7S;
import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass18K;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.AnonymousClass1G3;
import X.AnonymousClass1SV;
import X.AnonymousClass1VE;
import X.AnonymousClass1Vo;
import X.AnonymousClass3C3;
import X.AnonymousClass3MY;
import X.AnonymousClass71B;
import X.AnonymousClass7KO;
import X.AnonymousClass7KX;
import X.AnonymousClass7KZ;
import X.AnonymousClass7Q7;
import X.AnonymousClass7RL;
import X.AnonymousClass7RP;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8lL;
import X.AnonymousClass8lM;
import X.B59;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C132116mE;
import X.C134216qE;
import X.C136336te;
import X.C138686xW;
import X.C139296yb;
import X.C140076zu;
import X.C144647Id;
import X.C146427Pb;
import X.C178119Bw;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C179419Hw;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C181219Pp;
import X.C184279ah;
import X.C185189cB;
import X.C185759d6;
import X.C188749hv;
import X.C191599mr;
import X.C194869sQ;
import X.C19880zA;
import X.C21366Aiv;
import X.C21420Ajn;
import X.C21422Ajp;
import X.C21431Ajy;
import X.C21434Ak1;
import X.C21441Ak8;
import X.C21452AkJ;
import X.C216216s;
import X.C22971Dz;
import X.C27301Vn;
import X.C37231pB;
import X.C37251pD;
import X.C40811vJ;
import X.C42171xk;
import X.C59822mw;
import X.C61182pG;
import X.C70783Cm;
import X.C88054Yd;
import X.C97034oo;
import X.C98574rN;
import X.C98824rm;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.calling.CallSummary;
import com.whatsapp.calling.GroupCallReminder;
import com.whatsapp.calling.bcall.data.AudienceInfo;
import com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallFatalError;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallOfferAckError;
import com.whatsapp.voipcalling.CallParticipant;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SyncDevicesUserInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipEventCallback;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class VoiceServiceEventCallback implements VoipEventCallback {
    public static final int TIMEOUT_CALLER_BEFORE_ACCEPT_DEFAULT_MS = 90000;
    public final C185189cB bufferQueue = new C185189cB();
    public final AnonymousClass71B bweMLModelManager;
    public final AnonymousClass00H callStateDatasourceLazy;
    public final AnonymousClass00H callingPolicyLazy;
    public final AnonymousClass1SV httpsFormPostFactory;
    public final AnonymousClass00H privacyPhoneNumberHidingHelper;
    public final A99 voiceService;
    public int voipEventCallInfoBitmap = 0;
    public final WhatsAppDynamicExecuTorchLoader whatsAppDynamicExecuTorchLoader;
    public final WhatsAppDynamicPytorchLoader whatsappDynamicPytorchLoader;

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.voiceService.A23.A0O(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    public void bCallCreated(String str, byte[] bArr, String str2) {
        changeAudioRoute(1);
    }

    public void bCallJoined(String str, String str2, String str3) {
        changeAudioRoute(1);
    }

    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr) {
        C17960vV.A0C(false);
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length != 0) {
            int i2 = i;
            if (i > 0) {
                Voip.RecordingInfo[] recordingInfoArr2 = recordingInfoArr;
                if (recordingInfoArr != null) {
                    A99.A4A.execute(new AnonymousClass7Q7(this, recordingInfoArr2, debugTapType, bArr2, i2, 6));
                }
            }
        }
    }

    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        C17960vV.A0C(false);
        A99.A4A.execute(new AnonymousClass7RL(recordingInfoArr, debugTapType, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022a, code lost:
        if (r0 >= 1000) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024b, code lost:
        if (r0 >= 1000) goto L_0x022c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r13, com.whatsapp.voipcalling.CallInfo r14) {
        /*
            r12 = this;
            r4 = 0
            if (r14 != 0) goto L_0x0009
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_IMMEDIATELY
            r12.updateCallInfo(r4, r0)
        L_0x0008:
            return
        L_0x0009:
            com.whatsapp.voipcalling.CallState r3 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r1 = r14
            if (r3 != r0) goto L_0x0011
            r1 = r4
        L_0x0011:
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_IMMEDIATELY
            r12.updateCallInfo(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:callStateChanged("
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1F(r3, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == r13) goto L_0x0008
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r13 != r0) goto L_0x0054
            X.A99 r0 = r12.voiceService
            X.0ve r2 = r0.A2p
            r1 = 11689(0x2da9, float:1.638E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0054
            X.A99 r1 = r12.voiceService
            java.lang.String r0 = r14.callId
            X.9hv r1 = r1.A0Q(r0)
            X.A99 r0 = r12.voiceService
            X.11E r0 = r0.A2S
            java.lang.Boolean r0 = r0.A06()
            r1.A02 = r0
        L_0x0054:
            X.A99 r0 = r12.voiceService
            X.00H r0 = r0.A3P
            java.lang.Object r0 = r0.get()
            X.2hz r0 = (X.C56762hz) r0
            java.lang.String r2 = r14.callId
            boolean r7 = X.C18070vi.A15(r2, r3)
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            if (r3 != r1) goto L_0x025a
            r0.remove(r2)
        L_0x006d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r0) goto L_0x0077
            X.A99 r0 = r12.voiceService
            boolean r0 = r0.A47
            if (r0 == 0) goto L_0x007f
        L_0x0077:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 != r0) goto L_0x0084
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 != r0) goto L_0x0084
        L_0x007f:
            boolean r0 = r14.videoEnabled
            r12.updateSettingsFromVoipParamsAfterHandlingSignaling(r0)
        L_0x0084:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 != r0) goto L_0x009b
            boolean r0 = r14.isBotCall
            if (r0 == 0) goto L_0x009b
            X.A99 r0 = r12.voiceService
            X.00H r0 = r0.A3X
            java.lang.Object r1 = r0.get()
            X.6zu r1 = (X.C140076zu) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            r1.A02(r0)
        L_0x009b:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r3 == r0) goto L_0x00a6
            X.A99 r1 = r12.voiceService
            java.lang.String r0 = r14.callId
            r1.A0y(r3, r0)
        L_0x00a6:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            r5 = 4
            r2 = 0
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r3 == r0) goto L_0x0251
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r3 == r0) goto L_0x0216
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 == r0) goto L_0x0216
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r0) goto L_0x01d9
            X.A99 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r4)
            X.A99 r9 = r12.voiceService
            boolean r6 = r14.isGroupCall
            r0 = 23000(0x59d8, double:1.13635E-319)
            if (r6 == 0) goto L_0x01d1
            X.0ve r11 = r9.A2p
            r10 = 5170(0x1432, float:7.245E-42)
            X.0vf r8 = X.C18040vf.A02
            int r7 = X.C18020vd.A00(r8, r11, r10)
            r6 = 1
            if (r7 <= r6) goto L_0x01be
            long r0 = X.A99.A48
        L_0x00ea:
            X.A99 r6 = r12.voiceService
            android.os.Handler r6 = r6.A0G
            r6.sendEmptyMessageDelayed(r5, r0)
            X.A99 r6 = r12.voiceService
            android.os.Handler r6 = r6.A0G
            r6.sendEmptyMessageDelayed(r2, r0)
        L_0x00f8:
            int r6 = r3.ordinal()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            switch(r6) {
                case 0: goto L_0x013a;
                case 1: goto L_0x0101;
                case 2: goto L_0x013a;
                case 3: goto L_0x013a;
                case 4: goto L_0x0101;
                case 5: goto L_0x0101;
                case 6: goto L_0x017b;
                case 7: goto L_0x013a;
                case 8: goto L_0x0101;
                case 9: goto L_0x0101;
                case 10: goto L_0x017b;
                default: goto L_0x0101;
            }
        L_0x0101:
            X.A99 r0 = r12.voiceService
            android.os.Handler r1 = r0.A0H
            int r0 = r13.ordinal()
            android.os.Message r0 = android.os.Message.obtain(r1, r5, r0, r6, r14)
            r0.sendToTarget()
            X.A99 r0 = r12.voiceService
            X.0zA r1 = r0.A1v
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r2 = r1.A03()
            X.1pD r2 = (X.C37251pD) r2
            X.1TM r0 = r2.A01
            X.18O r1 = r0.A00
            X.18R r0 = X.AnonymousClass18O.A0G
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0136
            X.1pB r1 = r2.A02
            X.AVC r0 = new X.AVC
            r0.<init>(r13, r14)
            X.C37231pB.A00(r0, r1)
        L_0x0136:
            r12.logCallExternalEvent(r14)
            return
        L_0x013a:
            X.A99 r7 = r12.voiceService
            android.os.Handler r7 = r7.A0H
            r7.removeCallbacksAndMessages(r4)
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r13 == r4) goto L_0x0149
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r13 != r4) goto L_0x0154
        L_0x0149:
            X.A99 r4 = r12.voiceService
            r4.A00 = r0
            android.os.Handler r1 = r4.A0H
            r0 = 17
            r1.sendEmptyMessage(r0)
        L_0x0154:
            X.A99 r0 = r12.voiceService
            X.0ve r4 = r0.A2p
            r1 = 4778(0x12aa, float:6.695E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0101
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r13 == r0) goto L_0x016a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r13 != r0) goto L_0x0101
        L_0x016a:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 != r0) goto L_0x0101
            X.A99 r0 = r12.voiceService
            X.Adx r0 = r0.A0R
            r0.A0C(r2)
            java.lang.String r0 = "Device microphone unmute at call end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0101
        L_0x017b:
            X.A99 r3 = r12.voiceService
            r3.A01 = r0
            android.os.Handler r1 = r3.A0H
            r0 = 3
            X.AnonymousClass8BV.A15(r1, r12, r0)
            X.A99 r0 = r12.voiceService
            X.Adx r0 = r0.A0R
            r0.A0C(r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r13 == r0) goto L_0x0198
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 == r0) goto L_0x0198
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 != r0) goto L_0x019f
        L_0x0198:
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            java.lang.String r0 = r14.scheduledId
            r12.setScheduledCallJoinTimeDiffMs(r1, r0)
        L_0x019f:
            X.A99 r0 = r12.voiceService
            X.0ve r2 = r0.A2p
            X.0vf r1 = X.C18040vf.A01
            r0 = 8032(0x1f60, float:1.1255E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0101
            X.00H r0 = r12.callStateDatasourceLazy
            java.lang.Object r2 = r0.get()
            X.4Yd r2 = (X.C88054Yd) r2
            long r0 = com.whatsapp.voipcalling.Voip.getCallDuration()
            r2.A02(r0)
            goto L_0x0101
        L_0x01be:
            com.whatsapp.jid.GroupJid r6 = r14.groupJid
            if (r6 != 0) goto L_0x01d1
            int r6 = X.C18020vd.A00(r8, r11, r10)
            if (r6 <= 0) goto L_0x01d1
            java.lang.String r6 = r14.callId
            X.9hv r6 = r9.A0Q(r6)
            boolean r6 = r6.A0G
            goto L_0x01d3
        L_0x01d1:
            boolean r6 = r14.isGroupCall
        L_0x01d3:
            if (r6 != 0) goto L_0x00ea
            long r0 = X.A99.A48
            goto L_0x00ea
        L_0x01d9:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r3 != r0) goto L_0x01f0
            X.A99 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r4)
            X.A99 r0 = r12.voiceService
            android.os.Handler r7 = r0.A0G
            r6 = 2
            r0 = 15000(0x3a98, double:7.411E-320)
            r7.sendEmptyMessageDelayed(r6, r0)
            goto L_0x00f8
        L_0x01f0:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r3 != r0) goto L_0x0207
            X.A99 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r4)
            X.A99 r0 = r12.voiceService
            android.os.Handler r6 = r0.A0G
            r0 = 90000(0x15f90, double:4.4466E-319)
            r6.sendEmptyMessageDelayed(r7, r0)
            goto L_0x00f8
        L_0x0207:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UNKNOWN call state "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            X.C17960vV.A0F(r7, r0)
            goto L_0x00f8
        L_0x0216:
            X.A99 r9 = r12.voiceService
            boolean r0 = r14.isAudioChat()
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x023d
            X.0ve r1 = r9.A2p
            r0 = 6007(0x1777, float:8.418E-42)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x023d
        L_0x022c:
            X.A99 r6 = r12.voiceService
            android.os.Handler r6 = r6.A0G
            r6.removeCallbacksAndMessages(r4)
            X.A99 r6 = r12.voiceService
            android.os.Handler r7 = r6.A0G
            r6 = 1
            r7.sendEmptyMessageDelayed(r6, r0)
            goto L_0x00f8
        L_0x023d:
            boolean r0 = r14.isGroupCall
            if (r0 == 0) goto L_0x024e
            X.0ve r1 = r9.A2p
            r0 = 10443(0x28cb, float:1.4634E-41)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x024e
            goto L_0x022c
        L_0x024e:
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L_0x022c
        L_0x0251:
            X.A99 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r4)
            goto L_0x00f8
        L_0x025a:
            r0.put(r2, r3)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (X.C22971Dz.A0Y(r13[r8]) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lidCallerDisplayInfo(com.whatsapp.jid.UserJid[] r12, com.whatsapp.jid.UserJid[] r13, java.lang.String[] r14) {
        /*
            r11 = this;
            int r2 = r12.length
            int r0 = r13.length
            boolean r1 = X.AnonymousClass000.A1T(r2, r0)
            java.lang.String r0 = "Lid User array & Phone User Array length mismatch"
            X.C17960vV.A0F(r1, r0)
            int r9 = r14.length
            boolean r1 = X.AnonymousClass000.A1T(r2, r9)
            java.lang.String r0 = "Lid User array & Display Name Array length mismatch"
            X.C17960vV.A0F(r1, r0)
            java.util.HashMap r7 = X.C17880vN.A11()
            r8 = 0
        L_0x001a:
            if (r8 >= r9) goto L_0x0059
            r0 = r12[r8]
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 == 0) goto L_0x002d
            r0 = r13[r8]
            boolean r0 = X.C22971Dz.A0Y(r0)
            r1 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            java.lang.String r0 = "Lid User Jid or Phone User Jid class mismatch"
            X.C17960vV.A0F(r1, r0)
            r10 = 0
            r6 = 0
            r5 = 0
            java.lang.String r4 = ""
            r3 = 0
            r2 = r12[r8]
            if (r2 == 0) goto L_0x003e
            r6 = r2
        L_0x003e:
            r0 = r13[r8]
            if (r0 == 0) goto L_0x0043
            r5 = r0
        L_0x0043:
            r1 = r14[r8]
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x004f
            X.C18070vi.A0d(r1, r3)
            r10 = r1
        L_0x004f:
            X.2nJ r0 = X.C61202pI.A00(r6, r6, r5, r10, r4)
            r7.put(r2, r0)
            int r8 = r8 + 1
            goto L_0x001a
        L_0x0059:
            X.00H r0 = r11.privacyPhoneNumberHidingHelper
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A02(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.lidCallerDisplayInfo(com.whatsapp.jid.UserJid[], com.whatsapp.jid.UserJid[], java.lang.String[]):void");
    }

    public void setScheduledCallJoinTimeDiffMs(GroupJid groupJid, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str)) {
                A99 a99 = this.voiceService;
                if (a99.A3l) {
                    a99.A31.CGN(new C21366Aiv(this, groupJid2, str2, 2, System.currentTimeMillis()));
                }
            }
        }
    }

    public void showCallNotAllowedActivity(ArrayList arrayList, int i, String str) {
        String str2 = str;
        if (!(!C61182pG.A00((C61182pG) this.callingPolicyLazy.get()))) {
            C17900vP.A0f("voip/showCallNotAllowedActivity cant be shown, skipping for message: ", str, AnonymousClass000.A10());
        } else {
            this.voiceService.A22.A0J(new C70783Cm(this, arrayList, str2, i, 4));
        }
    }

    public void speakerStatusChanged(UserJid[] userJidArr, int[] iArr) {
        C17960vV.A0F(AnonymousClass000.A1T(userJidArr.length, iArr.length), "Participant jid list and audio level list should be one-to-one mapped");
        Message obtainMessage = this.voiceService.A0H.obtainMessage(39);
        obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        obtainMessage.getData().putIntArray("audio_levels", iArr);
        obtainMessage.sendToTarget();
    }

    public void startCallRecording() {
        C17960vV.A0C(false);
    }

    private void changeAudioRoute(int i) {
        this.voiceService.A0H.removeMessages(27);
        Handler handler = this.voiceService.A0H;
        handler.sendMessage(handler.obtainMessage(27, i, 0));
    }

    private CallInfo getCallInfo() {
        ((C216216s) this.voiceService.A3B.get()).A00.incrementAndGet();
        return Voip.getCallInfo();
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i, CallInfo callInfo) {
        int i2 = 3;
        if (i != 401) {
            i2 = 10;
            int i3 = 2;
            if (i != 460) {
                if (i != 463) {
                    if (i == 411) {
                        this.voiceService.A18(arrayList, 11);
                    } else if (i == 412) {
                        this.voiceService.A18(arrayList, 10);
                    } else if (i == 431) {
                        i2 = 15;
                    } else if (i != 432) {
                        i2 = 0;
                        switch (i) {
                            case 403:
                                if (callInfo.videoEnabled) {
                                    i2 = 7;
                                    break;
                                }
                                break;
                            case 404:
                                i2 = 16;
                                break;
                            case 405:
                                i2 = 4;
                                break;
                            case 406:
                                if (callInfo.videoEnabled) {
                                    i3 = 11;
                                }
                                i2 = i3;
                                break;
                            default:
                                switch (i) {
                                    case 426:
                                        i2 = 1;
                                        if (callInfo.videoEnabled) {
                                            i2 = 9;
                                            break;
                                        }
                                        break;
                                    case 427:
                                        i2 = 12;
                                        break;
                                    case 428:
                                        i2 = 14;
                                        break;
                                    case 429:
                                        ((AnonymousClass1G3) ((C88054Yd) this.callStateDatasourceLazy.get()).A01.getValue()).CPw(AnonymousClass8lM.A00);
                                        break;
                                    default:
                                        if (callInfo.videoEnabled) {
                                            i2 = 8;
                                            break;
                                        }
                                        break;
                                }
                        }
                    } else {
                        this.voiceService.A18(arrayList, 2);
                    }
                    i2 = -1;
                } else {
                    i2 = 17;
                }
            } else if (!callInfo.videoEnabled) {
                i2 = 2;
            }
        }
        if (i2 != -1) {
            showCallNotAllowedActivity(arrayList, i2, (String) null);
        }
        this.voiceService.A0n(25, (String) null);
    }

    private boolean isFatalErrorCode(int i) {
        return AnonymousClass000.A1T(i, 432);
    }

    private /* synthetic */ void lambda$startCallRecording$5() {
        if (!Voip.startCallRecording(this.voiceService.A1n)) {
            Log.w("voip/callCapture/start fail");
        }
    }

    private void logCallExternalEvent(CallInfo callInfo) {
        A99 a99;
        C132116mE A01;
        C132116mE r0;
        boolean z = callInfo.isCaller;
        CallState callState = callInfo.callState;
        if (!z ? callState == CallState.ACTIVE : callState == CallState.CALLING) {
            a99 = this.voiceService;
            A01 = ((C139296yb) a99.A3W.get()).A01(1);
        } else if (callState == CallState.NONE && (r0 = this.voiceService.A0n) != null) {
            r0.A00();
            a99 = this.voiceService;
            A01 = null;
        } else {
            return;
        }
        a99.A0n = A01;
    }

    private void updateCallInfo(CallInfo callInfo, C179419Hw r5) {
        if (C18020vd.A05(C18040vf.A01, this.voiceService.A2p, 8032)) {
            ((C88054Yd) this.callStateDatasourceLazy.get()).A03(callInfo, r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ac, code lost:
        if (r0 != 1) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        if (r1.intValue() != 1) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        if (r5.intValue() == 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        if (r4.intValue() == 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a1, code lost:
        if (r0 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateSettingsFromVoipParamsAfterHandlingSignaling(boolean r7) {
        /*
            r6 = this;
            java.lang.String r0 = "test.name"
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.A07(r0)
            if (r3 == 0) goto L_0x0022
            X.A99 r0 = r6.voiceService
            X.1Hb r2 = r0.A2q
            X.0z4 r0 = r2.A06
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "voip_call_ab_test_bucket"
            X.C17880vN.A1E(r1, r0, r3)
            X.188 r0 = r2.A08
            X.C24311Jr.A01(r0, r3)
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A0G = r0
        L_0x0022:
            java.lang.String r0 = "options.spam_call_threshold_seconds"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r0 == 0) goto L_0x002d
            r0.intValue()
        L_0x002d:
            X.A99 r1 = r6.voiceService
            java.lang.String r0 = "options.android_audio_mode_in_call"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A05(r0)
            r1.A0t = r0
            java.lang.String r0 = "options.audio_level_adjust"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r2 == 0) goto L_0x004f
            X.A99 r0 = r6.voiceService
            X.00H r0 = r0.A35
            java.lang.Object r1 = r0.get()
            X.6wm r1 = (X.C138256wm) r1
            int r0 = r2.intValue()
            r1.A01 = r0
        L_0x004f:
            X.A99 r0 = r6.voiceService
            X.0ve r1 = r0.A2p
            r0 = 5527(0x1597, float:7.745E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x006c
            X.A99 r0 = r6.voiceService
            X.00H r0 = r0.A3K
            java.lang.Object r1 = r0.get()
            X.2xj r1 = (X.C66162xj) r1
            X.2Qr r0 = X.C49492Qr.OPUS_MLOW
            r1.A00(r0)
        L_0x006c:
            X.A99 r0 = r6.voiceService
            X.0ve r1 = r0.A2p
            r0 = 5989(0x1765, float:8.392E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0087
            X.A99 r0 = r6.voiceService
            X.00H r0 = r0.A3K
            java.lang.Object r1 = r0.get()
            X.2xj r1 = (X.C66162xj) r1
            X.2Qr r0 = X.C49492Qr.AOM
            r1.A00(r0)
        L_0x0087:
            java.lang.String r0 = "vid_rc.cc_ml_model_should_skip_hash_check"
            com.whatsapp.voipcalling.Voip.A05(r0)
            r3 = 1
            java.lang.String r0 = "vid_rc.cc_enable_ml_plc_inference"
            java.lang.Integer r5 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_rc.cc_enable_ml_undershoot_inference"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_rc.enable_ptedge_lib_loading"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_rc.enable_executorch_lib_loading"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r2 == 0) goto L_0x00ae
            int r0 = r2.intValue()
            r2 = 1
            if (r0 == r3) goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            if (r1 == 0) goto L_0x00b8
            int r1 = r1.intValue()
            r0 = 1
            if (r1 == r3) goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            if (r2 != 0) goto L_0x02a1
            if (r0 != 0) goto L_0x0285
            if (r5 == 0) goto L_0x00c5
            int r0 = r5.intValue()
            if (r0 == r3) goto L_0x00cd
        L_0x00c5:
            if (r4 == 0) goto L_0x00e8
            int r0 = r4.intValue()
            if (r0 != r3) goto L_0x00e8
        L_0x00cd:
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r4 = r6.whatsappDynamicPytorchLoader
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00e4
            X.A99 r0 = r6.voiceService
            X.10I r2 = r0.A31
            r1 = 0
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGF(r0)
            X.A99 r0 = r6.voiceService
            r0.A1g = r3
        L_0x00e4:
            X.A99 r0 = r6.voiceService
            r0.A1f = r3
        L_0x00e8:
            java.lang.String r0 = "vid_driver.camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r2 == 0) goto L_0x0259
            if (r1 == 0) goto L_0x0259
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "video_call_front_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0114:
            r0.apply()
        L_0x0117:
            java.lang.String r0 = "vid_driver.back_camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.back_camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r2 == 0) goto L_0x022d
            if (r1 == 0) goto L_0x022d
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "video_call_back_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0143:
            r0.apply()
        L_0x0146:
            java.lang.String r0 = "options.portrait_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r1 == 0) goto L_0x0221
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0160:
            r0.apply()
            java.lang.String r0 = "options.landscape_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r1 == 0) goto L_0x0215
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x017d:
            r0.apply()
            java.lang.String r0 = "options.enable_vqm"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r1 == 0) goto L_0x020a
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x019a:
            r0.apply()
            if (r7 == 0) goto L_0x01ee
            java.lang.String r0 = "options.disable_device_specific_camera_size"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r1 == 0) goto L_0x01ff
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01b9:
            r0.apply()
            java.lang.String r0 = "options.android_camera2_support_level"
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A07(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "camera2_required_hardware_support_level"
            if (r2 == 0) goto L_0x01fa
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x01ce:
            r0.apply()
            java.lang.String r0 = "options.force_passive_capture_dev_stream_role"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r1 == 0) goto L_0x01ef
            X.A99 r0 = r6.voiceService
            X.1VE r0 = r0.A2A
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01eb:
            r0.apply()
        L_0x01ee:
            return
        L_0x01ef:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01eb
        L_0x01fa:
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01ce
        L_0x01ff:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01b9
        L_0x020a:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x019a
        L_0x0215:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x017d
        L_0x0221:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BW.A0A(r6)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0160
        L_0x022d:
            X.A99 r0 = r6.voiceService
            X.1VE r1 = r0.A2A
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r1)
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0249
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r1)
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0146
        L_0x0249:
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BW.A0A(r6)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0143
        L_0x0259:
            X.A99 r0 = r6.voiceService
            X.1VE r1 = r0.A2A
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r1)
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0275
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r1)
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0117
        L_0x0275:
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BW.A0A(r6)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0114
        L_0x0285:
            com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader r2 = r6.whatsAppDynamicExecuTorchLoader
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x029b
            X.A99 r0 = r6.voiceService
            X.10I r1 = r0.A31
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r2, (int) r3)
            r1.CGF(r0)
            X.A99 r0 = r6.voiceService
            r0.A1e = r3
        L_0x029b:
            X.A99 r0 = r6.voiceService
            r0.A1d = r3
            goto L_0x00e8
        L_0x02a1:
            if (r0 != 0) goto L_0x00e8
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.updateSettingsFromVoipParamsAfterHandlingSignaling(boolean):void");
    }

    public void audioInitError() {
        Log.i("VoiceService EVENT:audioInitError");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        C17880vN.A1B(AnonymousClass8BW.A0A(this).remove("audio_sampling_hash").remove("audio_sampling_rates"), "audio_native_sampling_rate");
        A99 a99 = this.voiceService;
        a99.A0n(23, a99.A1r.getString(2131898114));
    }

    public void audioTestReplayFinished() {
        throw AnonymousClass8BR.A0v("audioTestReplayFinished is a debug only method");
    }

    public void audioTxStarted() {
        Log.i("VoiceService EVENT:audioTxStarted");
        CallInfo callInfo = getCallInfo();
        updateCallInfo(callInfo, C179419Hw.SKIP_UI_UPDATE);
        if (callInfo != null && callInfo.isBotCall) {
            ((C140076zu) this.voiceService.A3X.get()).A02(AnonymousClass00R.A19);
        }
    }

    public void autoVideoPauseStateChanged() {
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 55);
    }

    public void batteryLevelLow() {
        Log.i("VoiceService EVENT:batteryLevelLow");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.sendEmptyMessage(18);
    }

    public void callAutoConnected(String str, String str2) {
        Log.i("VoiceService EVENT:callAutoConnected");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        Message.obtain(this.voiceService.A0H, 31, new C184279ah(str, str2)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        if (r2.delete() != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        if (r2.delete() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        com.whatsapp.util.Log.i("app/VoiceService: time series log could not be deleted");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callEnding(com.whatsapp.voipcalling.CallLogInfo r18, int r19, java.lang.String r20) {
        /*
            r17 = this;
            java.lang.String r8 = "app/VoiceService: time series log could not be deleted"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:callEnding result="
            r1.append(r0)
            r4 = r18
            if (r18 != 0) goto L_0x0165
            java.lang.String r0 = "null"
        L_0x0011:
            r1.append(r0)
            java.lang.String r0 = " rating interval="
            r1.append(r0)
            r3 = r19
            r1.append(r3)
            java.lang.String r0 = " time series dir= "
            r2 = r20
            X.C17900vP.A0f(r0, r2, r1)
            r6 = r17
            X.A99 r0 = r6.voiceService
            java.lang.Integer r0 = r0.A45
            if (r0 != 0) goto L_0x0035
            X.A99 r1 = r6.voiceService
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A45 = r0
        L_0x0035:
            X.A99 r0 = r6.voiceService
            r0.A46 = r2
            X.A99 r0 = r6.voiceService
            X.A8A r1 = r0.A2N
            java.lang.String r0 = "options.call_replayer_file_max_size"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r0 == 0) goto L_0x004f
            int r0 = r0.intValue()
            int r0 = r0 * 1024
            int r0 = r0 * 1024
            r1.A00 = r0
        L_0x004f:
            com.whatsapp.voipcalling.CallInfo r5 = r6.getCallInfo()
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_THROTTLED
            r6.updateCallInfo(r5, r0)
            if (r5 != 0) goto L_0x0060
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005f:
            return
        L_0x0060:
            int r1 = r5.callResult
            r0 = 1
            if (r1 != r0) goto L_0x0082
            java.lang.String r0 = "options.wa_log_dummy_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0082
            X.A99 r0 = r6.voiceService
            X.A8A r3 = r0.A2N
            X.10I r2 = r3.A04
            r1 = 3
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
        L_0x0082:
            java.lang.String r0 = "options.wa_log_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            r10 = 0
            if (r0 == 0) goto L_0x0106
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0106
            X.A99 r0 = r6.voiceService
            X.17r r0 = r0.A21
            r0.A08()
            X.A99 r0 = r6.voiceService
            android.content.Context r0 = r0.A1r
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wa_call_time_series.mtar.gz"
            java.io.File r2 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0106
            X.A99 r0 = r6.voiceService
            X.190 r0 = r0.A1x
            java.lang.String r7 = r0.A0A()
            X.1SV r9 = r6.httpsFormPostFactory     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r12 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r15 = 16
            r16 = 0
            r13 = r10
            r14 = r10
            r11 = r10
            X.A7N r3 = r9.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r3.A06(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.io.FileInputStream r1 = X.C108945cZ.A18(r2)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = "attachment"
            X.A7N.A03(r3, r2, r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = "from_jid"
            r3.A07(r0, r7)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "tags"
            java.lang.String r0 = "voip_time_series"
            r3.A07(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "android_hprof_extras"
            X.A99 r0 = r6.voiceService     // Catch:{ IOException -> 0x00f0 }
            X.190 r0 = r0.A1x     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = r0.A0B(r10)     // Catch:{ IOException -> 0x00f0 }
            r3.A07(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            r3.A04(r10)     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00fd
        L_0x00f0:
            r1 = move-exception
            java.lang.String r0 = "app/VoiceService: could not open time series log data"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x016d }
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0106
            goto L_0x0103
        L_0x00fd:
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0106
        L_0x0103:
            com.whatsapp.util.Log.i((java.lang.String) r8)
        L_0x0106:
            X.A99 r0 = r6.voiceService
            r0.A0a()
            int r3 = r5.callSetupErrorType
            r0 = 17
            r2 = 6
            if (r3 != r0) goto L_0x013c
            boolean r0 = r5.isCaller
            if (r0 != 0) goto L_0x011c
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x013c
        L_0x011c:
            com.whatsapp.jid.UserJid r0 = X.C108955ca.A0T(r5)
            r6.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r0, (int) r2, (java.lang.String) r10)
        L_0x0123:
            X.A99 r0 = r6.voiceService
            X.A7S r3 = r0.A0T
            java.lang.String r0 = r5.callId
            boolean r0 = X.A7S.A03(r5, r0)
            if (r0 == 0) goto L_0x005f
            X.AlA r2 = r3.A07
            r1 = 21
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r3, r4, r5, r1)
            r2.execute(r0)
            return
        L_0x013c:
            int r0 = r5.callResult
            if (r0 != r2) goto L_0x0123
            r0 = 18
            if (r3 == r0) goto L_0x0148
            r0 = 19
            if (r3 != r0) goto L_0x0123
        L_0x0148:
            X.A99 r1 = r6.voiceService
            X.BCr r0 = r1.A0f
            if (r0 == 0) goto L_0x0123
            android.os.Handler r0 = r1.A0H
            r3 = 59
            r0.removeMessages(r3)
            X.A99 r0 = r6.voiceService
            android.os.Handler r2 = r0.A0H
            r1 = 2131898104(0x7f122ef8, float:1.9431116E38)
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r3, r1, r0)
            r0.sendToTarget()
            goto L_0x0123
        L_0x0165:
            int r0 = r4.callLogResultType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0011
        L_0x016d:
            r1 = move-exception
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0177
            com.whatsapp.util.Log.i((java.lang.String) r8)
        L_0x0177:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callEnding(com.whatsapp.voipcalling.CallLogInfo, int, java.lang.String):void");
    }

    public void callGridRankingChanged() {
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.sendEmptyMessage(45);
    }

    public void callLinkStateChanged(int i, CallLinkInfo callLinkInfo) {
        CallInfo callInfo;
        if (callLinkInfo != null) {
            int i2 = callLinkInfo.linkState;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("VoiceService EVENT:callLinkStateChanged(");
            AnonymousClass8BT.A1V(A10, C181219Pp.A00(i));
            Log.i(C17900vP.A0B(C181219Pp.A00(i2), A10));
            updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
            if (i == 3 && i2 == 4) {
                this.voiceService.A1T = true;
                updateSettingsFromVoipParamsAfterHandlingSignaling(callLinkInfo.videoEnabled);
                if (C18020vd.A05(C18040vf.A01, this.voiceService.A2p, 8032)) {
                    callInfo = ((C88054Yd) this.callStateDatasourceLazy.get()).A01();
                } else {
                    callInfo = getCallInfo();
                }
                C17960vV.A07(callInfo);
                A7S a7s = this.voiceService.A0T;
                a7s.A07.execute(new C21434Ak1(a7s, callInfo, callLinkInfo, 20));
            }
            Message obtain = Message.obtain(this.voiceService.A0H, 42, callLinkInfo);
            obtain.arg1 = i;
            obtain.sendToTarget();
        }
    }

    public void callOfferAcked() {
        Log.i("VoiceService EVENT:callOfferAcked");
        this.voiceService.A0G.removeMessages(2);
        CallInfo callInfo = getCallInfo();
        updateCallInfo(callInfo, C179419Hw.UPDATE_UI_THROTTLED);
        A99 a99 = this.voiceService;
        if (!a99.A1G) {
            a99.A1G = true;
            a99.A0H.sendEmptyMessage(56);
        }
        if (callInfo != null) {
            updateSettingsFromVoipParamsAfterHandlingSignaling(callInfo.videoEnabled);
            if (Voip.A04("options.caller_end_call_threshold") != null) {
                this.voiceService.A0v = Voip.A05("options.caller_end_call_threshold");
            }
            CallState callState = callInfo.callState;
            if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
                Integer A05 = Voip.A05("options.caller_timeout");
                if (A05 != null) {
                    long intValue = (long) (A05.intValue() * 1000);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    A99 a992 = this.voiceService;
                    long j = intValue - (elapsedRealtime - a992.A05);
                    if (j > 0 && j < 120000) {
                        a992.A0G.removeCallbacksAndMessages((Object) null);
                        this.voiceService.A0G.sendEmptyMessageDelayed(0, j);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("voip/receive_message/call-offer-ack change the caller timeout to ");
                        A10.append(intValue);
                        C17900vP.A0m(", remaining ", A10, j);
                    }
                }
                this.voiceService.A0y(callInfo.callState, callInfo.callId);
            }
        }
    }

    public void callTerminateReceived() {
        Log.i("VoiceService EVENT:callTerminateReceived");
        CallInfo callInfo = getCallInfo();
        updateCallInfo(callInfo, C179419Hw.SKIP_UI_UPDATE);
        if (callInfo != null && callInfo.isBotCall && callInfo.callSetupErrorType == 26) {
            ((AnonymousClass1G3) ((C88054Yd) this.callStateDatasourceLazy.get()).A01.getValue()).CPw(AnonymousClass8lM.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r5 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callWaitingStateChanged(int r7, com.whatsapp.voipcalling.CallInfo r8) {
        /*
            r6 = this;
            X.A99 r0 = r6.voiceService
            X.0ve r1 = r0.A2p
            r0 = 3094(0xc16, float:4.336E-42)
            X.0vf r3 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r3, r1, r0)
            r1 = 8
            r0 = r0 & 8
            r2 = 1
            r4 = 0
            boolean r5 = X.AnonymousClass000.A1T(r0, r1)
            X.A99 r0 = r6.voiceService
            X.0ve r1 = r0.A2p
            r0 = 9210(0x23fa, float:1.2906E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0025
            r3 = 1
            if (r5 != 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:callWaitingStateChanged state "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", async "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", call info is "
            r1.append(r0)
            if (r8 != 0) goto L_0x0098
            java.lang.String r0 = "null"
        L_0x0043:
            X.C17890vO.A1A(r1, r0)
            if (r3 == 0) goto L_0x0093
            boolean r1 = X.AnonymousClass000.A1W(r8)
            java.lang.String r0 = "call_info is null"
            X.C17960vV.A0F(r1, r0)
        L_0x0051:
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_THROTTLED
            r6.updateCallInfo(r8, r0)
            if (r8 == 0) goto L_0x0091
            X.2gu r0 = r8.callWaitingInfo
            java.lang.String r3 = r0.A04
            if (r3 == 0) goto L_0x0075
            X.A99 r0 = r6.voiceService
            X.00H r0 = r0.A3P
            java.lang.Object r0 = r0.get()
            X.2hz r0 = (X.C56762hz) r0
            if (r7 != r2) goto L_0x008e
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
        L_0x006c:
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            if (r2 != r1) goto L_0x008a
            r0.remove(r3)
        L_0x0075:
            X.A99 r0 = r6.voiceService
            android.os.Handler r0 = r0.A0H
            r1 = 34
            r0.removeMessages(r1)
            X.A99 r0 = r6.voiceService
            android.os.Handler r0 = r0.A0H
            android.os.Message r0 = r0.obtainMessage(r1, r7, r4, r3)
            r0.sendToTarget()
            return
        L_0x008a:
            r0.put(r3, r2)
            goto L_0x0075
        L_0x008e:
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            goto L_0x006c
        L_0x0091:
            r3 = 0
            goto L_0x0075
        L_0x0093:
            com.whatsapp.voipcalling.CallInfo r8 = r6.getCallInfo()
            goto L_0x0051
        L_0x0098:
            java.lang.String r0 = "not null"
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callWaitingStateChanged(int, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void dataChannelConnectionTimeout() {
        ((AnonymousClass1G3) ((C88054Yd) this.callStateDatasourceLazy.get()).A01.getValue()).CPw(AnonymousClass8lL.A00);
    }

    public void endCallWhenRelayBindFailed(CallInfo callInfo) {
        Context context;
        int i;
        int A03 = this.voiceService.A2S.A03(true);
        if (A03 == 0) {
            A99 a99 = this.voiceService;
            a99.A0n(3, a99.A1r.getString(2131898115));
            return;
        }
        if (callInfo.isCaller || callInfo.callState == CallState.ACCEPT_SENT) {
            A99 a992 = this.voiceService;
            if (a992.A1Q) {
                boolean A05 = C18020vd.A05(C18040vf.A02, a992.A2p, 9663);
                context = this.voiceService.A1r;
                if (A05) {
                    i = 2131898253;
                } else {
                    i = 2131898254;
                    if (A03 == 1) {
                        i = 2131898257;
                    }
                }
            } else {
                context = a992.A1r;
                i = 2131898120;
            }
            showCallNotAllowedActivity(C108955ca.A0T(callInfo), 5, context.getString(i));
        }
        this.voiceService.A0n(3, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06e2, code lost:
        if (r5.longValue() > r6) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0876, code lost:
        if (r5.longValue() > r6) goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017b, code lost:
        if (((android.media.audiofx.AcousticEchoCanceler) r1).getEnabled() != false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c43, code lost:
        if (r7 == false) goto L_0x08fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0c8e, code lost:
        if (r5.A1N != false) goto L_0x0c90;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x086f  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x089b  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0ac7  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0ad3  */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0b03  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x0b42  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0b87  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0c3c  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x0c4d  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0c8b  */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0cbd  */
    /* JADX WARNING: Removed duplicated region for block: B:629:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a3 A[SYNTHETIC, Splitter:B:65:0x01a3] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0265  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r59, java.lang.String r60, boolean r61, boolean r62) {
        /*
            r58 = this;
            r21 = r62
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:fieldstatsReady lastReport: "
            r1.append(r0)
            r18 = r61
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = ", realtime="
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r0 = ", callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            r3 = r58
            X.A99 r0 = r3.voiceService
            java.lang.Long r0 = r0.A0z
            X.C17900vP.A0b(r0, r1)
            com.whatsapp.voipcalling.CallInfo r19 = r3.getCallInfo()
            X.9Hw r0 = X.C179419Hw.SKIP_UI_UPDATE
            r3.updateCallInfo(r0)
            if (r19 != 0) goto L_0x003b
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003a:
            return
        L_0x003b:
            X.A99 r1 = r3.voiceService
            r0 = r19
            java.lang.String r0 = r0.callId
            X.9hv r8 = r1.A0Q(r0)
            X.A99 r0 = r3.voiceService
            java.util.Set r0 = r0.A3i
            r0.clear()
            X.A99 r0 = r3.voiceService
            X.11C r0 = r0.A2b
            android.media.AudioManager r20 = r0.A0D()
            if (r20 != 0) goto L_0x0163
            r13 = 0
            r28 = 0
        L_0x0059:
            X.A99 r1 = r3.voiceService
            r0 = r19
            java.lang.String r0 = r0.callId
            X.8Ct r1 = r1.A0R(r0)
            if (r1 == 0) goto L_0x0160
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0160
            boolean r0 = r1.getAudioModeIsVoip()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService:fieldstatsReady audio mode: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", audioModeIsVoip: "
            X.C17900vP.A0Y(r2, r0, r1)
            r0 = r19
            boolean r0 = r0.isBotCall
            if (r0 == 0) goto L_0x015a
            X.A99 r0 = r3.voiceService
            X.0ve r2 = r0.A2p
            r1 = 9955(0x26e3, float:1.395E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x015a
            java.lang.String r12 = "genai"
        L_0x009a:
            X.A99 r0 = r3.voiceService
            X.2kF r0 = r0.A0U
            r22 = r0
            com.whatsapp.jid.UserJid r24 = X.C22941Dw.A02(r60)
            X.A99 r1 = r3.voiceService
            java.lang.Long r0 = r1.A0z
            r17 = r0
            java.lang.Integer r0 = r1.A0u
            r16 = r0
            java.lang.Integer r15 = r8.A05
            X.A99 r0 = r3.voiceService
            java.lang.String r14 = r0.A1A
            java.lang.Integer r11 = r8.A08
            java.lang.Integer r10 = r8.A04
            java.lang.Integer r9 = r8.A03
            java.lang.Long r7 = r8.A09
            java.lang.Long r6 = r8.A0B
            java.lang.Long r5 = r8.A0A
            java.lang.Integer r4 = r8.A06
            java.lang.StringBuilder r2 = r8.A0E
            java.lang.Boolean r1 = r8.A02
            r0 = r59
            r23 = r0
            r25 = r1
            r26 = r16
            r27 = r13
            r29 = r15
            r30 = r11
            r31 = r10
            r32 = r9
            r33 = r4
            r34 = r17
            r35 = r7
            r36 = r6
            r37 = r5
            r38 = r12
            r39 = r14
            r40 = r2
            r22.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            java.lang.Integer r1 = r8.A07
            if (r1 == 0) goto L_0x00f3
            java.lang.Integer r1 = r8.A07
            r0.incomingCallUiAction = r1
        L_0x00f3:
            boolean r1 = r8.A0G
            r22 = 1
            if (r1 == 0) goto L_0x00ff
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            r0.isRering = r1
        L_0x00ff:
            boolean r1 = r8.A0F
            if (r1 == 0) goto L_0x0109
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)
            r0.doNotDisturbEnabled = r1
        L_0x0109:
            X.A99 r1 = r3.voiceService
            X.9sR r4 = r1.A44
            boolean r1 = r4.A01
            boolean r2 = X.AnonymousClass000.A1O(r1)
            boolean r1 = r4.A00
            if (r1 == 0) goto L_0x0119
            r2 = r2 | 2
        L_0x0119:
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x011f
            r2 = r2 | 4
        L_0x011f:
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x0125
            r2 = r2 | 8
        L_0x0125:
            java.lang.Long r1 = X.C17880vN.A0n(r2)
            r0.callNotificationState = r1
            X.A99 r2 = r3.voiceService
            java.lang.Long r1 = r2.A11
            if (r1 == 0) goto L_0x0133
            r0.telecomFrameworkCallStartDelayT = r1
        L_0x0133:
            java.lang.Long r1 = r2.A12
            if (r1 == 0) goto L_0x0139
            r0.androidTelecomTimeSpentBeforeReject = r1
        L_0x0139:
            r12 = 0
            r0.callHistEchoLikelihood = r12
            r3.updateHistoricalEcho(r0)
            X.A99 r4 = r3.voiceService
            java.lang.Integer r1 = r4.A0w
            r0.endCallAfterConfirmation = r1
            java.lang.Integer r1 = r4.A0y
            r0.presentEndCallConfirmation = r1
            java.lang.Integer r1 = r0.callAecMode
            r13 = 0
            if (r1 == 0) goto L_0x017f
            int r2 = r1.intValue()
            r1 = 3
            if (r2 == r1) goto L_0x017d
            java.lang.Object r1 = r4.A14
            if (r1 == 0) goto L_0x019a
            goto L_0x0175
        L_0x015a:
            X.A99 r0 = r3.voiceService
            java.lang.String r12 = r0.A1B
            goto L_0x009a
        L_0x0160:
            r2 = 0
            goto L_0x0073
        L_0x0163:
            int r0 = r20.getMode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            int r0 = r20.getRingerMode()
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
            goto L_0x0059
        L_0x0175:
            android.media.audiofx.AcousticEchoCanceler r1 = (android.media.audiofx.AcousticEchoCanceler) r1     // Catch:{ all -> 0x0196 }
            boolean r1 = r1.getEnabled()     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x019a
        L_0x017d:
            r1 = 1
            goto L_0x019b
        L_0x017f:
            java.lang.Object r1 = r4.A14
            if (r1 == 0) goto L_0x01a1
            android.media.audiofx.AcousticEchoCanceler r1 = (android.media.audiofx.AcousticEchoCanceler) r1     // Catch:{ all -> 0x018a }
            boolean r1 = r1.getEnabled()     // Catch:{ all -> 0x018a }
            goto L_0x018f
        L_0x018a:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            r1 = 0
        L_0x018f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.builtinAecEnabled = r1
            goto L_0x01a1
        L_0x0196:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x019a:
            r1 = 0
        L_0x019b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.builtinAecEnabled = r1
        L_0x01a1:
            if (r20 == 0) goto L_0x01cc
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "voip/AudioManager PROPERTY_OUTPUT_SAMPLE_RATE = "
            r4.append(r1)     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = "android.media.property.OUTPUT_SAMPLE_RATE"
            r1 = r20
            java.lang.String r1 = r1.getProperty(r2)     // Catch:{ all -> 0x01c8 }
            r4.append(r1)     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = ", PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "
            r4.append(r1)     // Catch:{ all -> 0x01c8 }
            java.lang.String r2 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            r1 = r20
            java.lang.String r1 = r1.getProperty(r2)     // Catch:{ all -> 0x01c8 }
            X.C17890vO.A1A(r4, r1)     // Catch:{ all -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x01cc:
            java.lang.Long r1 = r8.A0C
            if (r1 == 0) goto L_0x01e3
            X.A99 r1 = r3.voiceService
            boolean r1 = r1.A1i
            if (r1 == 0) goto L_0x01e3
            java.lang.Long r1 = r8.A0C
            long r4 = r1.longValue()
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.pushToCallOfferDelay = r1
        L_0x01e3:
            r1 = r19
            boolean r1 = r1.isCaller
            if (r1 == 0) goto L_0x01fb
            X.A99 r1 = r3.voiceService
            int r2 = r1.A43
            r1 = 13
            if (r2 != r1) goto L_0x01fb
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.callResult = r1
            r21 = 1
        L_0x01fb:
            r1 = r19
            boolean r1 = r1.videoEnabled
            r2 = 2
            if (r1 == 0) goto L_0x0257
            java.lang.String r1 = android.os.Build.HARDWARE
            r0.deviceHardware = r1
            java.lang.String r1 = android.os.Build.BOARD
            r0.deviceBoard = r1
            X.A99 r1 = r3.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r1.A34
            int r4 = r1.getCameraStartMode()
            r1 = -1
            if (r4 == r1) goto L_0x02e6
            if (r4 == 0) goto L_0x02de
            r1 = r22
            if (r4 == r1) goto L_0x02d6
            if (r4 == r2) goto L_0x02ce
            java.lang.Integer r1 = X.C108955ca.A0g()
            r0.cameraStartMode = r1
        L_0x0223:
            X.A99 r1 = r3.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r1.A34
            boolean r1 = r1.isCameraTextureApiFailed()
            int r1 = X.C72453Mb.A03(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.cameraPreviewMode = r1
            X.A99 r1 = r3.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r1.A34
            int r1 = r1.getCurrentApiVersion()
            if (r1 != r2) goto L_0x02ba
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.androidCameraApi = r1
        L_0x0245:
            if (r61 == 0) goto L_0x0257
            X.A99 r1 = r3.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r1.A34
            int r1 = r1.getCachedCam2HardwareLevel()
            if (r1 < 0) goto L_0x0257
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.androidCamera2MinHardwareSupportLevel = r1
        L_0x0257:
            X.A99 r1 = r3.voiceService
            X.11P r1 = r1.A2c
            long r6 = X.AnonymousClass11P.A01(r1)
            r16 = 1
            r1 = 0
            if (r61 == 0) goto L_0x0493
            X.A99 r5 = r3.voiceService
            int r4 = r5.A02
            if (r4 <= 0) goto L_0x02f6
            r5.A0U()
            X.A99 r5 = r3.voiceService
            int r4 = r5.A02
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r0.groupCallVideoMaximizedCount = r4
            java.util.Map r4 = r5.A1C
            java.util.Iterator r11 = X.AnonymousClass000.A15(r4)
            r23 = 0
            r14 = 0
        L_0x0282:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x02ea
            java.util.Map$Entry r9 = X.AnonymousClass000.A16(r11)
            java.lang.Object r4 = r9.getValue()
            long r4 = X.C17880vN.A05(r4)
            long r23 = r23 + r4
            X.A99 r4 = r3.voiceService
            X.11S r5 = r4.A23
            java.lang.Object r4 = r9.getKey()
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r5 = r5.A0O(r4)
            java.lang.Object r4 = r9.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r5 == 0) goto L_0x02af
            r0.groupCallVideoSelfMaximizedDuration = r4
            goto L_0x0282
        L_0x02af:
            long r9 = r4.longValue()
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0282
            long r14 = r14 + r16
            goto L_0x0282
        L_0x02ba:
            X.A99 r1 = r3.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r1.A34
            int r2 = r1.getCurrentApiVersion()
            r1 = r22
            if (r2 != r1) goto L_0x0245
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0.androidCameraApi = r1
            goto L_0x0245
        L_0x02ce:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.cameraStartMode = r1
            goto L_0x0223
        L_0x02d6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0.cameraStartMode = r1
            goto L_0x0223
        L_0x02de:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.cameraStartMode = r1
            goto L_0x0223
        L_0x02e6:
            r0.cameraStartMode = r12
            goto L_0x0223
        L_0x02ea:
            java.lang.Long r4 = java.lang.Long.valueOf(r23)
            r0.groupCallVideoMaximizedDuration = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r0.groupCallMaximizedPeerCount = r4
        L_0x02f6:
            X.A99 r4 = r3.voiceService
            r4.A0Z()
            X.A99 r9 = r3.voiceService
            long r4 = r9.A0C
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0309
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.androidSystemPictureInPictureT = r4
        L_0x0309:
            long r4 = r9.A08
            r14 = -1
            int r10 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0579
            long r4 = X.AnonymousClass8BR.A04(r4)
            long r10 = r9.A0B
            long r4 = r4 + r10
        L_0x0318:
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0322
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.callMinimizedDurationT = r4
        L_0x0322:
            X.9d6 r11 = r9.A0d
            if (r11 == 0) goto L_0x033a
            r4 = r19
            boolean r4 = r4.isCaller
            if (r4 == 0) goto L_0x033a
            long r4 = r11.A00
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            long r4 = X.AnonymousClass8BW.A06(r11, r10, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.offerAckLatencyMs = r4
        L_0x033a:
            X.9d6 r11 = r9.A0Z
            if (r11 == 0) goto L_0x034c
            long r4 = r11.A00
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            long r4 = X.AnonymousClass8BW.A06(r11, r10, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.acceptAckLatencyMs = r4
        L_0x034c:
            boolean r4 = r9.A1f
            if (r4 != 0) goto L_0x0354
            boolean r4 = r9.A1d
            if (r4 == 0) goto L_0x035a
        L_0x0354:
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r0.pytorchEdgeLibAvgLoadingTime = r4
        L_0x035a:
            boolean r4 = r9.A1g
            if (r4 == 0) goto L_0x0557
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r4 = r3.whatsappDynamicPytorchLoader
            long r4 = r4.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.pytorchEdgeLibFirstLoadingTime = r4
            r0.pytorchEdgeLibAvgLoadingTime = r4
            r9.A1g = r13
        L_0x036c:
            r4 = r19
            boolean r4 = r4.isCaller
            if (r4 != 0) goto L_0x038a
            long r4 = r8.A00
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x038a
            long r9 = r8.A00
            long r4 = r8.A01
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x038a
            long r9 = r8.A01
            long r4 = r8.A00
            java.lang.Long r4 = X.C108945cZ.A1B(r9, r4)
            r0.calleeOfferToRingT = r4
        L_0x038a:
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A3B
            java.lang.Object r4 = r4.get()
            X.16s r4 = (X.C216216s) r4
            java.util.concurrent.atomic.AtomicLong r4 = r4.A00
            long r9 = r4.get()
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x03a4
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r0.getCallInfoCount = r4
        L_0x03a4:
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A3B
            java.lang.Object r4 = r4.get()
            X.16s r4 = (X.C216216s) r4
            java.util.concurrent.atomic.AtomicLong r4 = r4.A00
            r4.set(r1)
            java.lang.Integer r4 = r0.callResult
            if (r4 == 0) goto L_0x0493
            int r5 = r4.intValue()
            r4 = r22
            if (r5 == r4) goto L_0x03c3
            r4 = 10
            if (r5 != r4) goto L_0x0493
        L_0x03c3:
            X.A99 r4 = r3.voiceService
            X.1VE r4 = r4.A2A
            android.content.SharedPreferences r4 = X.AnonymousClass1VE.A00(r4)
            java.lang.String r13 = "previous_call_peer_id"
            java.lang.String r4 = r4.getString(r13, r12)
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A02(r4)
            X.A99 r4 = r3.voiceService
            X.1VE r4 = r4.A2A
            android.content.SharedPreferences r4 = X.AnonymousClass1VE.A00(r4)
            java.lang.String r15 = "previous_call_end_time"
            long r4 = r4.getLong(r15, r1)
            if (r11 == 0) goto L_0x0435
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0435
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0435
            X.A99 r9 = r3.voiceService
            X.1VE r9 = r9.A2A
            android.content.SharedPreferences r10 = X.AnonymousClass1VE.A00(r9)
            java.lang.String r9 = "previous_call_video_enabled"
            boolean r9 = X.C17880vN.A1W(r10, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0.previousCallVideoEnabled = r9
            com.whatsapp.jid.UserJid r9 = X.C108955ca.A0T(r19)
            boolean r9 = r11.equals(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r0.previousCallWithSamePeer = r9
            java.lang.Long r9 = X.C108945cZ.A1B(r6, r4)
            r0.previousCallInterval = r9
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "VoiceService:fieldstatsReady previous call callInfo: interval "
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = ", video enabled "
            r5.append(r4)
            java.lang.Boolean r4 = r0.previousCallVideoEnabled
            r5.append(r4)
            java.lang.String r4 = ", with same peer "
            r5.append(r4)
            java.lang.Boolean r4 = r0.previousCallWithSamePeer
            X.C17900vP.A0b(r4, r5)
        L_0x0435:
            java.lang.Integer r4 = r0.callResult
            int r5 = r4.intValue()
            r4 = r22
            if (r5 != r4) goto L_0x0493
            X.A99 r4 = r3.voiceService
            X.1VE r4 = r4.A2A
            r23 = r4
            r4 = r19
            boolean r14 = r4.videoEnabled
            com.whatsapp.jid.UserJid r12 = X.C108955ca.A0T(r19)
            java.lang.String r11 = r4.tsLogCallId
            java.lang.String r10 = r4.relayCallUuid
            java.lang.String r9 = r4.selfParticipantUuid
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "setPreviousCallInfo callEndTime "
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = ", video enabled "
            r5.append(r4)
            r5.append(r14)
            java.lang.String r4 = ", peerId "
            X.C17900vP.A0Y(r12, r4, r5)
            android.content.SharedPreferences$Editor r4 = X.AnonymousClass3MZ.A08(r23)
            android.content.SharedPreferences$Editor r5 = r4.putLong(r15, r6)
            java.lang.String r4 = "previous_call_video_enabled"
            android.content.SharedPreferences$Editor r4 = r5.putBoolean(r4, r14)
            java.lang.String r5 = r12.getRawString()
            android.content.SharedPreferences$Editor r5 = r4.putString(r13, r5)
            java.lang.String r4 = "previous_call_tslog_call_id"
            android.content.SharedPreferences$Editor r5 = r5.putString(r4, r11)
            java.lang.String r4 = "previous_relay_call_uuid"
            android.content.SharedPreferences$Editor r5 = r5.putString(r4, r10)
            java.lang.String r4 = "previous_self_participant_uuid"
            X.C17880vN.A1E(r5, r4, r9)
        L_0x0493:
            java.lang.Integer r4 = r0.callTermReason
            if (r4 == 0) goto L_0x04a4
            int r5 = r4.intValue()
            r4 = 10
            if (r5 != r4) goto L_0x04a4
            java.lang.String r4 = "VoiceService: call end because detect some peer's identity is changed!"
            com.whatsapp.util.Log.w((java.lang.String) r4)
        L_0x04a4:
            X.A99 r5 = r3.voiceService
            X.9td r4 = r5.A0g
            if (r4 == 0) goto L_0x0553
            java.lang.Long r4 = r4.A06
        L_0x04ac:
            if (r4 == 0) goto L_0x04b0
            r0.wifiRssiAtCallStart = r4
        L_0x04b0:
            r4 = r19
            java.lang.String r4 = r4.callId
            X.00H r5 = r5.A3D
            java.lang.Object r5 = r5.get()
            X.9mr r5 = (X.C191599mr) r5
            java.lang.String r9 = r5.A00(r4)
            r0.callRandomId = r9
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "VoiceService:fieldstatsReady callRandomId: "
            X.C17900vP.A0f(r4, r9, r5)
            java.lang.Integer r4 = r0.fieldStatsRowType
            if (r4 == 0) goto L_0x089b
            int r5 = r4.intValue()
            r4 = r22
            if (r5 == r4) goto L_0x04da
            r4 = 2
            if (r5 != r4) goto L_0x089b
        L_0x04da:
            r37 = 1
            java.lang.Long r4 = r8.A0D
            long r9 = r4.longValue()
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0508
            X.A99 r4 = r3.voiceService
            X.0ve r9 = r4.A2p
            r5 = 8538(0x215a, float:1.1964E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r9, r5)
            if (r4 == 0) goto L_0x0508
            java.lang.Long r4 = r8.A0D
            r0.hscrollInteractCount = r4
            X.A99 r5 = r3.voiceService
            r4 = r19
            java.lang.String r4 = r4.callId
            X.9hv r5 = r5.A0Q(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r5.A0D = r4
        L_0x0508:
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A39
            java.lang.Object r5 = r4.get()
            X.9l5 r5 = (X.C190519l5) r5
            boolean r4 = r5.A00()
            if (r4 == 0) goto L_0x089d
            X.0ve r8 = r5.A00
            X.0vf r5 = X.C18040vf.A01
            r4 = 9332(0x2474, float:1.3077E-41)
            boolean r4 = X.C18020vd.A05(r5, r8, r4)
            if (r4 == 0) goto L_0x089d
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A3A
            java.lang.Object r39 = r4.get()
            r4 = r39
            X.4Nk r4 = (X.C85444Nk) r4
            r39 = r4
            X.0vl r4 = r4.A03
            boolean r4 = X.C72453Mb.A1a(r4)
            if (r4 != 0) goto L_0x089d
            java.lang.Long r4 = r0.callT
            if (r4 == 0) goto L_0x089d
            long r4 = r4.longValue()
            long r42 = r6 - r4
            java.util.LinkedHashSet r36 = X.C17880vN.A14()
            r4 = r39
            java.util.Set r4 = r4.A01
            r38 = r4
            X.C18070vi.A0W(r38)
            monitor-enter(r38)
            goto L_0x057d
        L_0x0553:
            java.lang.Long r4 = r5.A13
            goto L_0x04ac
        L_0x0557:
            boolean r4 = r9.A1e
            if (r4 == 0) goto L_0x0575
            com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader r4 = r3.whatsAppDynamicExecuTorchLoader
            java.util.concurrent.atomic.AtomicLong r4 = r4.A00
            java.lang.Long r4 = X.AnonymousClass8BT.A0o(r4)
            r0.pytorchEdgeLibFirstLoadingTime = r4
            com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader r4 = r3.whatsAppDynamicExecuTorchLoader
            java.util.concurrent.atomic.AtomicLong r4 = r4.A00
            java.lang.Long r4 = X.AnonymousClass8BT.A0o(r4)
            r0.pytorchEdgeLibAvgLoadingTime = r4
            X.A99 r4 = r3.voiceService
            r4.A1e = r13
            goto L_0x036c
        L_0x0575:
            r0.pytorchEdgeLibFirstLoadingTime = r12
            goto L_0x036c
        L_0x0579:
            long r4 = r9.A0B
            goto L_0x0318
        L_0x057d:
            java.util.Iterator r35 = r38.iterator()     // Catch:{ all -> 0x0d00 }
        L_0x0581:
            boolean r4 = r35.hasNext()     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06f2
            java.lang.Object r12 = r35.next()     // Catch:{ all -> 0x0d00 }
            X.Br9 r12 = (X.C23852Br9) r12     // Catch:{ all -> 0x0d00 }
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x0d00 }
            java.lang.String r5 = r12.A0O     // Catch:{ all -> 0x0d00 }
            java.lang.Long r8 = r12.A0F     // Catch:{ all -> 0x0d00 }
            java.lang.Integer r15 = r12.A04     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r12.A0G     // Catch:{ all -> 0x0d00 }
            r34 = r4
            java.lang.Long r4 = r12.A0D     // Catch:{ all -> 0x0d00 }
            r33 = r4
            r31 = 0
            r29 = 0
            r27 = 0
            r25 = 0
            r10 = 0
            r13 = 0
            if (r5 == 0) goto L_0x0659
            java.lang.String r4 = r0.callRandomId     // Catch:{ all -> 0x0d00 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0659
            if (r33 == 0) goto L_0x05be
            long r23 = r33.longValue()     // Catch:{ all -> 0x0d00 }
            int r4 = (r23 > r42 ? 1 : (r23 == r42 ? 0 : -1))
            if (r4 <= 0) goto L_0x0659
        L_0x05be:
            if (r8 == 0) goto L_0x0cf6
            long r46 = r8.longValue()     // Catch:{ all -> 0x0d00 }
            int r4 = (r46 > r6 ? 1 : (r46 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0659
            int r4 = (r46 > r42 ? 1 : (r46 == r42 ? 0 : -1))
            if (r4 <= 0) goto L_0x05ce
            r31 = 1
        L_0x05ce:
            if (r33 == 0) goto L_0x05f8
            long r8 = r42 + r16
            X.B3s r4 = new X.B3s     // Catch:{ all -> 0x0d00 }
            r4.<init>(r8, r6)     // Catch:{ all -> 0x0d00 }
            long r23 = r33.longValue()     // Catch:{ all -> 0x0d00 }
            long r8 = r4.A00     // Catch:{ all -> 0x0d00 }
            int r5 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r5 > 0) goto L_0x05f8
            long r4 = r4.A01     // Catch:{ all -> 0x0d00 }
            int r8 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x05f8
            if (r15 == 0) goto L_0x05f8
            int r4 = r15.intValue()     // Catch:{ all -> 0x0d00 }
            r5 = 3
            if (r4 != r5) goto L_0x05f3
            r29 = 1
            goto L_0x05f8
        L_0x05f3:
            r5 = 2
            if (r4 != r5) goto L_0x05f8
            r27 = 1
        L_0x05f8:
            if (r34 == 0) goto L_0x064b
            long r40 = r34.longValue()     // Catch:{ all -> 0x0d00 }
            long r40 = r40 + r46
            if (r15 == 0) goto L_0x0616
            int r5 = r15.intValue()     // Catch:{ all -> 0x0d00 }
            r4 = r22
            if (r5 != r4) goto L_0x0616
            long r8 = r42 + r16
            int r4 = (r8 > r40 ? 1 : (r8 == r40 ? 0 : -1))
            if (r4 > 0) goto L_0x0616
            int r4 = (r40 > r6 ? 1 : (r40 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x0616
            r25 = 1
        L_0x0616:
            r52 = r6
            r44 = r6
            long r10 = X.C28851b7.A05(r40, r42, r44)     // Catch:{ all -> 0x0d00 }
            r48 = r42
            r50 = r6
            long r4 = X.C28851b7.A05(r46, r48, r50)     // Catch:{ all -> 0x0d00 }
            long r10 = r10 - r4
            if (r15 == 0) goto L_0x0659
            int r5 = r15.intValue()     // Catch:{ all -> 0x0d00 }
            r4 = r22
            if (r5 != r4) goto L_0x0659
            if (r33 == 0) goto L_0x0637
            long r52 = r33.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0637:
            r54 = r42
            r56 = r6
            long r13 = X.C28851b7.A05(r52, r54, r56)     // Catch:{ all -> 0x0d00 }
            r44 = r40
            r46 = r42
            r48 = r6
            long r4 = X.C28851b7.A05(r44, r46, r48)     // Catch:{ all -> 0x0d00 }
            long r13 = r13 - r4
            goto L_0x0659
        L_0x064b:
            if (r15 != 0) goto L_0x0659
            r44 = r46
            r46 = r42
            r48 = r6
            long r4 = X.C28851b7.A05(r44, r46, r48)     // Catch:{ all -> 0x0d00 }
            long r10 = r6 - r4
        L_0x0659:
            java.lang.Long r4 = r0.arEffectAttemptedCount     // Catch:{ all -> 0x0d00 }
            r23 = 0
            if (r4 == 0) goto L_0x06d5
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0663:
            r4 = r31
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.arEffectAttemptedCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.arEffectFailedCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06d2
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0673:
            r4 = r29
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.arEffectFailedCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.arEffectCanceledCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06cf
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0683:
            r4 = r27
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.arEffectCanceledCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.arEffectEnabledCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06cc
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0693:
            r4 = r25
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.arEffectEnabledCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.arEffectLoadingT     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06c9
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x06a3:
            java.lang.Long r4 = X.C17880vN.A0o(r4, r10)     // Catch:{ all -> 0x0d00 }
            r0.arEffectLoadingT = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.arEffectDurationT     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x06b1
            long r23 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x06b1:
            r4 = r23
            java.lang.Long r4 = X.C17880vN.A0o(r4, r13)     // Catch:{ all -> 0x0d00 }
            r0.arEffectDurationT = r4     // Catch:{ all -> 0x0d00 }
            java.lang.String r8 = r12.A0O     // Catch:{ all -> 0x0d00 }
            java.lang.Long r5 = r12.A0D     // Catch:{ all -> 0x0d00 }
            if (r8 == 0) goto L_0x06d8
            java.lang.String r4 = r0.callRandomId     // Catch:{ all -> 0x0d00 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0d00 }
            r10 = 1
            if (r4 != 0) goto L_0x06d9
            goto L_0x06d8
        L_0x06c9:
            r4 = 0
            goto L_0x06a3
        L_0x06cc:
            r8 = 0
            goto L_0x0693
        L_0x06cf:
            r8 = 0
            goto L_0x0683
        L_0x06d2:
            r8 = 0
            goto L_0x0673
        L_0x06d5:
            r8 = 0
            goto L_0x0663
        L_0x06d8:
            r10 = 0
        L_0x06d9:
            if (r5 == 0) goto L_0x06e4
            long r8 = r5.longValue()     // Catch:{ all -> 0x0d00 }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 1
            if (r5 <= 0) goto L_0x06e5
        L_0x06e4:
            r4 = 0
        L_0x06e5:
            if (r10 == 0) goto L_0x0581
            if (r4 != 0) goto L_0x06eb
            if (r61 == 0) goto L_0x0581
        L_0x06eb:
            r4 = r36
            r4.add(r12)     // Catch:{ all -> 0x0d00 }
            goto L_0x0581
        L_0x06f2:
            monitor-exit(r38)
            java.util.Iterator r8 = r36.iterator()
        L_0x06f7:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0707
            java.lang.Object r5 = r8.next()
            r4 = r38
            r4.remove(r5)
            goto L_0x06f7
        L_0x0707:
            java.util.LinkedHashSet r36 = X.C17880vN.A14()
            r4 = r39
            java.util.Set r4 = r4.A02
            r38 = r4
            X.C18070vi.A0W(r38)
            monitor-enter(r38)
            java.util.Iterator r35 = r38.iterator()     // Catch:{ all -> 0x0d00 }
        L_0x0719:
            boolean r4 = r35.hasNext()     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0886
            java.lang.Object r12 = r35.next()     // Catch:{ all -> 0x0d00 }
            X.Br3 r12 = (X.C23846Br3) r12     // Catch:{ all -> 0x0d00 }
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x0d00 }
            java.lang.String r5 = r12.A0E     // Catch:{ all -> 0x0d00 }
            java.lang.Long r9 = r12.A09     // Catch:{ all -> 0x0d00 }
            java.lang.Integer r4 = r12.A03     // Catch:{ all -> 0x0d00 }
            java.lang.Long r8 = r12.A0A     // Catch:{ all -> 0x0d00 }
            r34 = r8
            java.lang.Long r15 = r12.A08     // Catch:{ all -> 0x0d00 }
            r32 = 0
            r30 = 0
            r28 = 0
            r26 = 0
            r10 = 0
            r13 = 0
            if (r5 == 0) goto L_0x07ed
            java.lang.String r8 = r0.callRandomId     // Catch:{ all -> 0x0d00 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0d00 }
            if (r5 == 0) goto L_0x07ed
            if (r15 == 0) goto L_0x0754
            long r23 = r15.longValue()     // Catch:{ all -> 0x0d00 }
            int r5 = (r23 > r42 ? 1 : (r23 == r42 ? 0 : -1))
            if (r5 <= 0) goto L_0x07ed
        L_0x0754:
            if (r9 == 0) goto L_0x0cfb
            long r50 = r9.longValue()     // Catch:{ all -> 0x0d00 }
            int r5 = (r50 > r6 ? 1 : (r50 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x07ed
            int r5 = (r50 > r42 ? 1 : (r50 == r42 ? 0 : -1))
            if (r5 <= 0) goto L_0x0764
            r32 = 1
        L_0x0764:
            if (r15 == 0) goto L_0x078e
            long r8 = r42 + r16
            X.B3s r5 = new X.B3s     // Catch:{ all -> 0x0d00 }
            r5.<init>(r8, r6)     // Catch:{ all -> 0x0d00 }
            long r24 = r15.longValue()     // Catch:{ all -> 0x0d00 }
            long r8 = r5.A00     // Catch:{ all -> 0x0d00 }
            int r23 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r23 > 0) goto L_0x078e
            long r8 = r5.A01     // Catch:{ all -> 0x0d00 }
            int r5 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x078e
            if (r4 == 0) goto L_0x078e
            int r5 = r4.intValue()     // Catch:{ all -> 0x0d00 }
            r8 = 3
            if (r5 != r8) goto L_0x0789
            r30 = 1
            goto L_0x078e
        L_0x0789:
            r8 = 2
            if (r5 != r8) goto L_0x078e
            r28 = 1
        L_0x078e:
            if (r34 == 0) goto L_0x07e1
            long r44 = r34.longValue()     // Catch:{ all -> 0x0d00 }
            long r44 = r44 + r50
            if (r4 == 0) goto L_0x07ac
            int r8 = r4.intValue()     // Catch:{ all -> 0x0d00 }
            r5 = r22
            if (r8 != r5) goto L_0x07ac
            long r8 = r42 + r16
            int r5 = (r8 > r44 ? 1 : (r8 == r44 ? 0 : -1))
            if (r5 > 0) goto L_0x07ac
            int r5 = (r44 > r6 ? 1 : (r44 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x07ac
            r26 = 1
        L_0x07ac:
            r46 = r42
            r48 = r6
            long r10 = X.C28851b7.A05(r44, r46, r48)     // Catch:{ all -> 0x0d00 }
            r52 = r42
            r54 = r6
            long r8 = X.C28851b7.A05(r50, r52, r54)     // Catch:{ all -> 0x0d00 }
            long r10 = r10 - r8
            if (r4 == 0) goto L_0x07ed
            int r5 = r4.intValue()     // Catch:{ all -> 0x0d00 }
            r4 = r22
            if (r5 != r4) goto L_0x07ed
            if (r15 == 0) goto L_0x07ca
            goto L_0x07cd
        L_0x07ca:
            r46 = r6
            goto L_0x07d1
        L_0x07cd:
            long r46 = r15.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x07d1:
            r48 = r42
            r50 = r6
            long r13 = X.C28851b7.A05(r46, r48, r50)     // Catch:{ all -> 0x0d00 }
            r46 = r44
            long r4 = X.C28851b7.A05(r46, r48, r50)     // Catch:{ all -> 0x0d00 }
            long r13 = r13 - r4
            goto L_0x07ed
        L_0x07e1:
            if (r4 != 0) goto L_0x07ed
            r52 = r42
            r54 = r6
            long r4 = X.C28851b7.A05(r50, r52, r54)     // Catch:{ all -> 0x0d00 }
            long r10 = r6 - r4
        L_0x07ed:
            java.lang.Long r4 = r0.igluEffectAttemptedCount     // Catch:{ all -> 0x0d00 }
            r23 = 0
            if (r4 == 0) goto L_0x0869
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x07f7:
            r4 = r32
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectAttemptedCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.igluEffectFailedCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0866
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0807:
            r4 = r30
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectFailedCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.igluEffectCanceledCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0863
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0817:
            r4 = r28
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectCanceledCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.igluEffectEnabledCount     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0860
            long r8 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0827:
            r4 = r26
            java.lang.Long r4 = X.C17880vN.A0o(r8, r4)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectEnabledCount = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.igluEffectLoadingT     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x085d
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0837:
            java.lang.Long r4 = X.C17880vN.A0o(r4, r10)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectLoadingT = r4     // Catch:{ all -> 0x0d00 }
            java.lang.Long r4 = r0.igluEffectDurationT     // Catch:{ all -> 0x0d00 }
            if (r4 == 0) goto L_0x0845
            long r23 = r4.longValue()     // Catch:{ all -> 0x0d00 }
        L_0x0845:
            r4 = r23
            java.lang.Long r4 = X.C17880vN.A0o(r4, r13)     // Catch:{ all -> 0x0d00 }
            r0.igluEffectDurationT = r4     // Catch:{ all -> 0x0d00 }
            java.lang.String r8 = r12.A0E     // Catch:{ all -> 0x0d00 }
            java.lang.Long r5 = r12.A08     // Catch:{ all -> 0x0d00 }
            if (r8 == 0) goto L_0x086c
            java.lang.String r4 = r0.callRandomId     // Catch:{ all -> 0x0d00 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0d00 }
            r10 = 1
            if (r4 != 0) goto L_0x086d
            goto L_0x086c
        L_0x085d:
            r4 = 0
            goto L_0x0837
        L_0x0860:
            r8 = 0
            goto L_0x0827
        L_0x0863:
            r8 = 0
            goto L_0x0817
        L_0x0866:
            r8 = 0
            goto L_0x0807
        L_0x0869:
            r8 = 0
            goto L_0x07f7
        L_0x086c:
            r10 = 0
        L_0x086d:
            if (r5 == 0) goto L_0x0878
            long r8 = r5.longValue()     // Catch:{ all -> 0x0d00 }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 1
            if (r5 <= 0) goto L_0x0879
        L_0x0878:
            r4 = 0
        L_0x0879:
            if (r10 == 0) goto L_0x0719
            if (r4 != 0) goto L_0x087f
            if (r61 == 0) goto L_0x0719
        L_0x087f:
            r4 = r36
            r4.add(r12)     // Catch:{ all -> 0x0d00 }
            goto L_0x0719
        L_0x0886:
            monitor-exit(r38)
            java.util.Iterator r6 = r36.iterator()
        L_0x088b:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x089d
            java.lang.Object r5 = r6.next()
            r4 = r38
            r4.remove(r5)
            goto L_0x088b
        L_0x089b:
            r37 = 0
        L_0x089d:
            X.A99 r5 = r3.voiceService
            if (r61 != 0) goto L_0x0c4d
            X.A4u r5 = r5.A2M
            r4 = r21
            r5.A02(r0, r4)
        L_0x08a8:
            if (r37 == 0) goto L_0x0aa2
            X.A99 r4 = r3.voiceService
            X.1DC r4 = r4.A30
            boolean r4 = r4.BgK()
            if (r4 == 0) goto L_0x0a04
            X.A99 r5 = r3.voiceService
            X.A4u r4 = r5.A2M
            r23 = r4
            X.00H r4 = r5.A3T
            java.lang.Object r9 = r4.get()
            X.A1P r9 = (X.A1P) r9
            X.6uK r12 = r9.A0M
            boolean r15 = r12.A01
            X.6uK r11 = r9.A0P
            boolean r14 = r11.A01
            X.6uK r10 = r9.A0L
            boolean r13 = r10.A01
            r12.A00()
            r10.A00()
            X.8sC r8 = new X.8sC
            r8.<init>()
            long r4 = r12.A00
            r7 = 0
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0c4a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0B = r4
            r5 = 0
        L_0x08e7:
            int r4 = r9.A05
            if (r4 <= 0) goto L_0x0c47
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A08 = r4
        L_0x08f1:
            long r4 = r10.A00
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0c43
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A09 = r4
        L_0x08fd:
            long r4 = r9.A0C
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0909
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0A = r4
        L_0x0909:
            if (r61 == 0) goto L_0x09de
            long r4 = r9.A0D
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0917
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0F = r4
        L_0x0917:
            long r4 = r9.A0E
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0923
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0G = r4
        L_0x0923:
            long r4 = r9.A0F
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x092f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0C = r4
        L_0x092f:
            long r6 = r9.A0A
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0946
            long r4 = r9.A0G
            int r20 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r20 <= 0) goto L_0x0946
            r20 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r20
            long r6 = r6 / r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r8.A03 = r4
        L_0x0946:
            long r4 = r9.A0B
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0952
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A04 = r4
        L_0x0952:
            boolean r4 = r9.A0J
            if (r4 == 0) goto L_0x095f
            int r5 = r9.A08
            X.6RY r4 = X.AnonymousClass6RY.CALL_ENDED
            int r4 = r4.value
            r5 = r5 | r4
            r9.A08 = r5
        L_0x095f:
            int r4 = r9.A08
            if (r4 <= 0) goto L_0x0969
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A0E = r4
        L_0x0969:
            long r4 = r9.A0H
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0975
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0H = r4
        L_0x0975:
            int r4 = r9.A02
            if (r4 <= 0) goto L_0x097f
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A05 = r4
        L_0x097f:
            int r4 = r9.A04
            if (r4 <= 0) goto L_0x0989
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A06 = r4
        L_0x0989:
            r11.A00()
            long r4 = r11.A00
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0998
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r8.A0D = r4
        L_0x0998:
            int r4 = r9.A06
            if (r4 <= 0) goto L_0x09a2
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A0J = r4
        L_0x09a2:
            int r4 = r9.A07
            if (r4 <= 0) goto L_0x09ac
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A0K = r4
        L_0x09ac:
            int r4 = r9.A09
            if (r4 <= 0) goto L_0x09b6
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A0I = r4
        L_0x09b6:
            boolean r4 = r9.A0K
            if (r4 == 0) goto L_0x09c0
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r8.A07 = r4
        L_0x09c0:
            int r4 = r9.A00
            if (r4 <= 0) goto L_0x09ca
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A00 = r4
        L_0x09ca:
            int r4 = r9.A01
            if (r4 <= 0) goto L_0x09d4
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A01 = r4
        L_0x09d4:
            int r4 = r9.A03
            if (r4 <= 0) goto L_0x09de
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r8.A02 = r4
        L_0x09de:
            r4 = 0
            r9.A05 = r4
            r12.A01()
            r10.A01()
            if (r61 == 0) goto L_0x09ee
            r9.A0C = r1
            X.A1P.A00(r9)
        L_0x09ee:
            if (r15 == 0) goto L_0x09f3
            r12.A02()
        L_0x09f3:
            if (r14 == 0) goto L_0x09f8
            r11.A02()
        L_0x09f8:
            if (r13 == 0) goto L_0x09fd
            r10.A02()
        L_0x09fd:
            r4 = r23
            X.18K r4 = r4.A00
            r4.CC7(r8)
        L_0x0a04:
            X.A99 r4 = r3.voiceService
            X.0ve r6 = r4.A2p
            r5 = 3153(0xc51, float:4.418E-42)
            X.0vf r4 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r4, r6, r5)
            r4 = 4
            if (r5 < r4) goto L_0x0aa2
            r4 = r19
            boolean r4 = r4.videoEnabled
            if (r4 == 0) goto L_0x0aa2
            r4 = r19
            X.6qE r4 = r4.self
            boolean r5 = r4.A0N
            if (r5 != 0) goto L_0x0a23
            r16 = 0
        L_0x0a23:
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r0.landscapeModeEnabled = r4
            if (r5 == 0) goto L_0x0aa2
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A3M
            java.lang.Object r7 = r4.get()
            X.9g9 r7 = (X.C187649g9) r7
            X.6uK r9 = r7.A03
            boolean r12 = r9.A01
            X.6uK r8 = r7.A04
            boolean r11 = r8.A01
            X.6uK r6 = r7.A05
            boolean r10 = r6.A01
            r9.A00()
            r8.A00()
            r6.A00()
            long r4 = r7.A02
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a56
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.landscapeModeSwitchCount = r4
        L_0x0a56:
            long r4 = r7.A01
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a62
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.landscapeModeLockedSwitchCount = r4
        L_0x0a62:
            long r4 = r9.A00
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a6e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.landscapeModeDurationT = r4
        L_0x0a6e:
            long r4 = r8.A00
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a7a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.landscapeModeLockedDurationT = r4
        L_0x0a7a:
            long r4 = r6.A00
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x0a86
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.landscapeModePipMixedDurationT = r4
        L_0x0a86:
            r7.A02 = r1
            r7.A01 = r1
            r9.A01()
            r8.A01()
            r6.A01()
            if (r12 == 0) goto L_0x0a98
            r9.A02()
        L_0x0a98:
            if (r11 == 0) goto L_0x0a9d
            r8.A02()
        L_0x0a9d:
            if (r10 == 0) goto L_0x0aa2
            r6.A02()
        L_0x0aa2:
            java.lang.Integer r4 = r0.fieldStatsRowType
            if (r4 == 0) goto L_0x0acd
            int r5 = r4.intValue()
            r4 = 2
            if (r5 != r4) goto L_0x0acd
            r4 = r19
            com.whatsapp.jid.GroupJid r5 = r4.groupJid
            if (r5 == 0) goto L_0x0acd
            boolean r4 = r19.isPhashBasedCall()
            if (r4 == 0) goto L_0x0acd
            X.A99 r4 = r3.voiceService
            X.126 r4 = r4.A2r
            X.1MZ r4 = r4.A0O
            X.1MW r4 = r4.A08
            int r4 = r4.A0A(r5)
            if (r4 <= 0) goto L_0x0c3c
            java.lang.Long r4 = X.C17880vN.A0n(r4)
            r0.numInvitedParticipants = r4
        L_0x0acd:
            r4 = r19
            boolean r4 = r4.isCaller
            if (r4 != 0) goto L_0x0afd
            X.A99 r4 = r3.voiceService
            X.2it r5 = r4.A2v
            com.whatsapp.jid.UserJid r4 = r19.getPeerJid()
            boolean r4 = r5.A00(r4)
            java.lang.Boolean r4 = X.C108945cZ.A1A(r4)
            r0.privacyUnknownCaller = r4
            r4 = r19
            com.whatsapp.jid.GroupJid r5 = r4.groupJid
            if (r5 == 0) goto L_0x0afd
            X.A99 r4 = r3.voiceService
            X.1Mc r4 = r4.A2z
            int r5 = X.C24901Mc.A00(r5, r4)
            r4 = r22
            if (r5 != r4) goto L_0x0afd
            java.lang.Boolean r4 = X.AnonymousClass000.A0h()
            r0.privacyUnknownCaller = r4
        L_0x0afd:
            r4 = r19
            boolean r4 = r4.isJoinableGroupCall
            if (r4 == 0) goto L_0x0b17
            X.A99 r7 = r3.voiceService
            java.lang.Integer r5 = r7.A0x
            if (r5 != 0) goto L_0x0b15
            long r5 = r7.A07
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0c2c
            java.lang.Integer r5 = X.C17880vN.A0l()
            r7.A0x = r5
        L_0x0b15:
            r0.lobbyEntryPoint = r5
        L_0x0b17:
            X.A99 r5 = r3.voiceService
            boolean r4 = X.AnonymousClass112.A0A()
            if (r4 == 0) goto L_0x0b24
            android.content.Context r4 = r5.A1r
            r0.canUseFullScreenIntent = java.lang.Boolean.valueOf(((android.app.NotificationManager) r4.getSystemService("notification")).canUseFullScreenIntent())
        L_0x0b24:
            X.A99 r4 = r3.voiceService
            X.00H r4 = r4.A3Y
            java.lang.Object r9 = r4.get()
            X.9sx r9 = (X.C195199sx) r9
            r4 = r19
            java.lang.String r7 = r4.callId
            r4 = 0
            X.C18070vi.A0d(r7, r4)
            X.0ve r6 = r9.A04
            r5 = 8175(0x1fef, float:1.1456E-41)
            X.0vf r4 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r4, r6, r5)
            if (r4 <= 0) goto L_0x0b81
            X.9qW r5 = r9.A01
            java.lang.String r12 = "VoipUXResponsivenessLogger/populateFieldStatsAndReset call id mismatch or invalid logging state"
            if (r5 == 0) goto L_0x0b62
            java.lang.String r4 = r5.A01
            boolean r4 = X.C18070vi.A18(r4, r7)
            if (r4 == 0) goto L_0x0c27
            long r4 = r5.A00
            r10 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0c27
            java.lang.Integer r6 = r0.callFromUi
            if (r6 == 0) goto L_0x0c27
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.startCallDurationMs = r4
        L_0x0b62:
            r10 = 0
            r9.A01 = r10
            X.9qW r5 = r9.A00
            if (r5 == 0) goto L_0x0b7f
            java.lang.String r4 = r5.A01
            boolean r4 = X.C18070vi.A18(r4, r7)
            if (r4 == 0) goto L_0x0c22
            long r5 = r5.A00
            r7 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0c22
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r0.answerCallDurationMs = r4
        L_0x0b7f:
            r9.A00 = r10
        L_0x0b81:
            r4 = r19
            boolean r4 = r4.isBotCall
            if (r4 == 0) goto L_0x003a
            X.A99 r3 = r3.voiceService
            X.00H r3 = r3.A3X
            java.lang.Object r4 = r3.get()
            X.6zu r4 = (X.C140076zu) r4
            boolean r3 = X.C140076zu.A00(r4)
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "VoipAiRtcLogger/populateFieldStatsAndReset"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.00H r3 = r4.A05
            java.lang.Object r5 = r3.get()
            X.6uK r5 = (X.C136746uK) r5
            boolean r5 = r5.A01
            if (r5 != 0) goto L_0x0bba
            java.lang.Object r5 = r3.get()
            X.6uK r5 = (X.C136746uK) r5
            long r6 = r5.A00
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0bba
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0.genaiInitialConnectionLatencyMs = r1
        L_0x0bba:
            java.lang.Integer r1 = r4.A01
            r0.genaiEntryPoint = r1
            java.lang.Integer r1 = r4.A02
            r0.genaiExitPoint = r1
            java.util.Map r2 = r4.A07
            X.6RB r1 = X.AnonymousClass6RB.NUM_REQUESTS_SENT
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumRequestsSent = r1
            X.6RB r1 = X.AnonymousClass6RB.NUM_RESPONSES_RECEIVED
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumResponsesReceived = r1
            X.6RB r1 = X.AnonymousClass6RB.NUM_RESPONSE_IMAGES
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumResponseImages = r1
            X.6RB r1 = X.AnonymousClass6RB.NUM_RESPONSE_REELS
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumResponseReels = r1
            X.6RB r1 = X.AnonymousClass6RB.NUM_RESPONSE_SEARCH_RESULTS
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumResponseSearchResults = r1
            X.6RB r1 = X.AnonymousClass6RB.NUM_RESPONSE_TEXT_RESULTS
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r0.genaiNumResponseTextResults = r1
            java.lang.Boolean r1 = r4.A00
            r0.genaiResponseFullSheet = r1
            java.lang.String r1 = r4.A04
            r0.genaiVoiceSelection = r1
            java.lang.Long r1 = r4.A03
            r0.genaiInitialTranscriptionLatencyMs = r1
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r0
            r4.A03 = r0
            r2.clear()
            java.lang.Object r0 = r3.get()
            X.6uK r0 = (X.C136746uK) r0
            r0.A01()
            return
        L_0x0c22:
            com.whatsapp.util.Log.e((java.lang.String) r12)
            goto L_0x0b7f
        L_0x0c27:
            com.whatsapp.util.Log.e((java.lang.String) r12)
            goto L_0x0b62
        L_0x0c2c:
            java.lang.String r4 = "Bug with tracking call lobby"
            r5 = 0
            X.C17960vV.A0F(r5, r4)
            X.A99 r4 = r3.voiceService
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.A0x = r5
            goto L_0x0b15
        L_0x0c3c:
            java.lang.String r4 = "VoiceService:fieldstatsReady groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x0acd
        L_0x0c43:
            if (r7 != 0) goto L_0x0909
            goto L_0x08fd
        L_0x0c47:
            r7 = r5
            goto L_0x08f1
        L_0x0c4a:
            r5 = 1
            goto L_0x08e7
        L_0x0c4d:
            java.lang.Boolean r6 = r5.A0s
            if (r6 == 0) goto L_0x0c57
            boolean r4 = r6.booleanValue()
            if (r4 != 0) goto L_0x0cf2
        L_0x0c57:
            if (r20 == 0) goto L_0x0cf2
            r4 = r20
            boolean r4 = r5.A1C(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.A0s = r4
        L_0x0c65:
            X.A99 r5 = r3.voiceService
            boolean r4 = r5.A1V
            if (r4 == 0) goto L_0x0ce8
            r4 = 18
        L_0x0c6d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.callTermReason = r4
        L_0x0c73:
            if (r20 == 0) goto L_0x0c85
            boolean r4 = r19.isSelfCallOnHold()
            if (r4 != 0) goto L_0x0c85
            boolean r4 = r20.isMicrophoneMute()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.isOsMicrophoneMute = r4
        L_0x0c85:
            X.A99 r5 = r3.voiceService
            int r4 = r5.A04
            if (r4 != 0) goto L_0x0c90
            boolean r6 = r5.A1N
            r4 = 0
            if (r6 == 0) goto L_0x0c91
        L_0x0c90:
            r4 = 1
        L_0x0c91:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.pstnCallExists = r4
            X.9eS r4 = r5.A2B
            boolean r4 = r4.A02
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.connectedToCar = r4
            java.lang.Long r4 = r5.A10
            r0.scheduledCallJoinTimeDiffMs = r4
            r5.A0l = r0
            r4 = r21
            r5.A1l = r4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "VoiceService:fieldstatsReady call ending. callFieldStat will be posted when call/link state change to None. callOfferElapsedTimeInMillisOnServer: "
            r5.append(r4)
            java.lang.Long r4 = r0.callOfferElapsedT
            X.C17900vP.A0b(r4, r5)
            java.lang.Integer r4 = r0.callFromUi
            if (r4 == 0) goto L_0x08a8
            int r5 = r4.intValue()
            r4 = 45
            if (r5 == r4) goto L_0x0ce6
            r4 = 46
            if (r5 != r4) goto L_0x08a8
            r8 = 8
        L_0x0ccb:
            java.lang.String r7 = r0.callRandomId
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = r0.videoEnabled
            boolean r6 = r5.equals(r4)
            r5 = r22
            X.63F r5 = X.AnonymousClass74H.A03(r7, r8, r6, r5, r5)
            X.A99 r4 = r3.voiceService
            X.A4u r4 = r4.A2M
            X.18K r4 = r4.A00
            r4.CC7(r5)
            goto L_0x08a8
        L_0x0ce6:
            r8 = 7
            goto L_0x0ccb
        L_0x0ce8:
            int r5 = r5.A43
            r4 = 31
            if (r5 != r4) goto L_0x0c73
            r4 = 21
            goto L_0x0c6d
        L_0x0cf2:
            r0.androidAudioRouteMismatch = r6
            goto L_0x0c65
        L_0x0cf6:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0d00 }
            goto L_0x0cff
        L_0x0cfb:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0d00 }
        L_0x0cff:
            throw r0     // Catch:{ all -> 0x0d00 }
        L_0x0d00:
            r0 = move-exception
            monitor-exit(r38)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i) {
        byte[] bArr;
        C185189cB r3 = this.bufferQueue;
        synchronized (r3) {
            Iterator it = r3.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r3.A00 += i;
                    bArr = new byte[i];
                    break;
                }
                bArr = (byte[]) it.next();
                if (bArr.length >= i) {
                    it.remove();
                    break;
                }
            }
        }
        return bArr;
    }

    public void groupCallBufferHandleMessages() {
        Log.i("VoiceService EVENT:groupCallBufferProcessMessages");
        this.voiceService.A1E.execute(new C21422Ajp(7));
    }

    public void groupCallReminderReceived(GroupCallReminder groupCallReminder) {
        GroupCallReminder groupCallReminder2 = groupCallReminder;
        C178119Bw A06 = this.voiceService.A0T.A06(groupCallReminder2.callID);
        if (A06 != null && !A06.A0Y(this.voiceService.A23)) {
            CallParticipant[] callParticipantArr = groupCallReminder2.participants;
            LinkedList A14 = AnonymousClass8BR.A14();
            for (int i = 0; i < callParticipantArr.length; i++) {
                if (!callParticipantArr[i].jid.equals(groupCallReminder2.creatorDeviceJid.userJid)) {
                    A14.add(callParticipantArr[i].jid);
                }
            }
            A14.add(0, groupCallReminder2.creatorDeviceJid.userJid);
            boolean z = this.voiceService.A1a;
            String A09 = C40811vJ.A09(A06.A09().A02);
            CallState callState = CallState.NONE;
            boolean z2 = A06.A0J;
            UserJid userJid = A06.A04.A01;
            GroupJid groupJid = A06.A0C;
            boolean A0W = A06.A0W();
            C178119Bw.A00(A06);
            C138686xW r5 = new C138686xW(groupJid, userJid, callState, A09, A14, -1, A06.A09, 0, false, true, z2, z, false, false, true, false, A0W, true);
            Log.i("VoiceService EVENT:groupCallReminderReceived sending notification");
            A99 a99 = this.voiceService;
            C27301Vn r4 = a99.A2d;
            AnonymousClass1Vo r42 = (AnonymousClass1Vo) r4;
            r42.BkS(groupCallReminder2.callID, 27, a99.A2H.A06(a99.A1r, r5, a99.A2J, 1, false));
        }
    }

    public void groupInfoChanged(CallInfo callInfo) {
        String str;
        boolean z = true;
        boolean A1T = AnonymousClass000.A1T(C18020vd.A00(C18040vf.A02, this.voiceService.A2p, 3094) & 8, 8);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:groupInfoChanged async ");
        A10.append(A1T);
        A10.append(" callinfo is ");
        if (callInfo == null) {
            str = "null";
        } else {
            str = "not null";
        }
        C17890vO.A1A(A10, str);
        if (A1T) {
            C17960vV.A0F(AnonymousClass000.A1W(callInfo), "call_info is null");
        } else {
            callInfo = getCallInfo();
        }
        updateCallInfo(callInfo, C179419Hw.UPDATE_UI_IMMEDIATELY);
        if (callInfo == null) {
            z = false;
        } else if (callInfo.callState != CallState.NONE) {
            A7S a7s = this.voiceService.A0T;
            a7s.A07.execute(new C21431Ajy(a7s, callInfo, 31));
            this.voiceService.A0H.removeMessages(25);
            boolean contains = this.voiceService.A3f.contains(callInfo.callId);
            A99 a99 = this.voiceService;
            if (contains) {
                a99.A0H.sendEmptyMessageDelayed(25, AnonymousClass8BR.A05(a99.A2p, 12245));
                return;
            } else {
                a99.A0H.sendEmptyMessage(25);
                return;
            }
        }
        C17960vV.A0F(z, " CallInfo should not be null in groupInfoChanged callback");
    }

    public void handleCallLinkLobbyError(int i) {
        Message obtainMessage = this.voiceService.A0H.obtainMessage(44);
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    public void handleFDLeakDetected() {
        Log.i("VoiceService EVENT:handleFDLeakDetected");
    }

    public void handleOfferAckFailed() {
        Log.i("VoiceService EVENT:handleOfferAckFailed");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0n(30, (String) null);
    }

    public void highDataUsageDetected() {
        Log.i("VoiceService EVENT:highDataUsageDetected");
        AnonymousClass8BT.A17(this.voiceService.A0H, 54);
    }

    public void interruptionStateChanged() {
        Log.i("VoiceService EVENT:interruptionStateChanged");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.removeMessages(30);
        AnonymousClass8BT.A17(this.voiceService.A0H, 30);
        this.voiceService.A2J.A00(new A69("refresh_notification"));
    }

    public void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z) {
        CallInfo A04 = C40811vJ.A04(this.voiceService.A29);
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        if (A04 == null) {
            Log.e("VoiceService:joinableFieldstatsReady not in an active call");
            return;
        }
        C188749hv A0Q = this.voiceService.A0Q(A04.callId);
        A99 a99 = this.voiceService;
        String A00 = ((C191599mr) a99.A3D.get()).A00(A04.callId);
        wamJoinableCall.callRandomId = A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:joinableFieldstatsReady callId:");
        A10.append(A04.callId);
        A10.append(" callRandomId:");
        A10.append(A00);
        A10.append(" callSide:");
        A10.append(wamJoinableCall.callSide);
        C17900vP.A0n(" realtime:", A10, z);
        A99 a992 = this.voiceService;
        int i = a992.A0x;
        boolean z2 = false;
        if (i == null) {
            if (a992.A07 == 0) {
                i = C17880vN.A0l();
                a992.A0x = i;
            } else {
                C17960vV.A0F(false, "Bug with tracking call lobby");
                i = 0;
                this.voiceService.A0x = 0;
            }
        }
        wamJoinableCall.lobbyEntryPoint = i;
        if (C42171xk.A00(wamJoinableCall.lobbyExit, AnonymousClass8BS.A0U())) {
            this.voiceService.A0x = 20;
        }
        A99 a993 = this.voiceService;
        long j = a993.A07;
        if (j > 0) {
            wamJoinableCall.lobbyVisibleT = C108945cZ.A1B(System.currentTimeMillis(), j);
        }
        if (a993.A1M) {
            wamJoinableCall.hasSpamDialog = true;
        }
        if (A0Q.A0G) {
            wamJoinableCall.isRering = true;
        }
        Boolean bool = wamJoinableCall.isRejoin;
        if (bool != null && bool.booleanValue()) {
            A99 a994 = this.voiceService;
            C185759d6 r5 = a994.A0c;
            if (r5 != null) {
                long j2 = r5.A00;
                wamJoinableCall.lobbyAckLatencyMs = Long.valueOf(AnonymousClass8BW.A06(r5, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
            C185759d6 r52 = a994.A0Z;
            if (r52 != null) {
                long j3 = r52.A00;
                wamJoinableCall.acceptAckLatencyMs = Long.valueOf(AnonymousClass8BW.A06(r52, (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j3));
            }
            long j4 = AnonymousClass1VE.A00(a994.A2A).getLong("zombie_cleanup", 0);
            if (!(wamJoinableCall.lobbyExitNackCode == null || j4 == 0)) {
                wamJoinableCall.timeSinceLastClientPollMinutes = Long.valueOf(C17880vN.A04(AnonymousClass8BR.A04(j4)) / 60);
            }
        }
        if (Build.VERSION.SDK_INT < 31 || this.voiceService.A2Z.A00.A00()) {
            z2 = true;
        }
        wamJoinableCall.hasScheduleExactAlarmPermission = Boolean.valueOf(z2);
        Boolean bool2 = wamJoinableCall.isLinkJoin;
        if (bool2 != null && bool2.booleanValue()) {
            A99 a995 = this.voiceService;
            C185759d6 r53 = a995.A0b;
            if (r53 != null) {
                long j5 = r53.A00;
                wamJoinableCall.queryAckLatencyMs = Long.valueOf(AnonymousClass8BW.A06(r53, (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1)), j5));
            }
            C185759d6 r54 = a995.A0a;
            if (r54 != null) {
                long j6 = r54.A00;
                wamJoinableCall.joinAckLatencyMs = Long.valueOf(AnonymousClass8BW.A06(r54, (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1)), j6));
            }
        }
        AnonymousClass18K r0 = this.voiceService.A2M.A00;
        r0.CC7(wamJoinableCall);
        if (z) {
            r0.Bio();
        }
    }

    /* renamed from: lambda$linkCreateAcked$0$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m39lambda$linkCreateAcked$0$comwhatsappcallingserviceVoiceServiceEventCallback(String str, boolean z) {
        C17880vN.A0V(this.voiceService.A3C).notifyAllObservers(new C97034oo(str, z, 1));
    }

    /* renamed from: lambda$linkCreateNacked$1$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m40lambda$linkCreateNacked$1$comwhatsappcallingserviceVoiceServiceEventCallback() {
        C17880vN.A0V(this.voiceService.A3C).notifyAllObservers(new AnonymousClass7KX(5));
    }

    /* renamed from: lambda$linkEditAcked$9$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m41lambda$linkEditAcked$9$comwhatsappcallingserviceVoiceServiceEventCallback(String str) {
        C17880vN.A0V(this.voiceService.A3C).notifyAllObservers(new AnonymousClass7KZ(str, 0));
    }

    /* renamed from: lambda$linkEditNacked$10$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m42lambda$linkEditNacked$10$comwhatsappcallingserviceVoiceServiceEventCallback(int i) {
        C17880vN.A0V(this.voiceService.A3C).notifyAllObservers(new AnonymousClass7KO(i, 0));
    }

    /* renamed from: lambda$rejectedDecryptionFailure$4$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m43lambda$rejectedDecryptionFailure$4$comwhatsappcallingserviceVoiceServiceEventCallback(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        this.voiceService.A0i.A06(deviceJid, C40811vJ.A0A(str), bArr, i);
    }

    /* renamed from: lambda$setScheduledCallJoinTimeDiffMs$6$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m44lambda$setScheduledCallJoinTimeDiffMs$6$comwhatsappcallingserviceVoiceServiceEventCallback(long j, C59822mw r6) {
        this.voiceService.A10 = C108945cZ.A1B(j, r6.A03);
    }

    /* renamed from: lambda$setScheduledCallJoinTimeDiffMs$7$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m45lambda$setScheduledCallJoinTimeDiffMs$7$comwhatsappcallingserviceVoiceServiceEventCallback(String str, GroupJid groupJid, long j) {
        C59822mw A02 = this.voiceService.A2m.A02(groupJid, str);
        if (A02 != null) {
            this.voiceService.A22.A0J(new AnonymousClass3C3(this, A02, 3, j));
        }
    }

    /* renamed from: lambda$showCallNotAllowedActivity$8$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m46lambda$showCallNotAllowedActivity$8$comwhatsappcallingserviceVoiceServiceEventCallback(ArrayList arrayList, int i, String str) {
        A99 a99 = this.voiceService;
        a99.A1h = true;
        Intent className = C17880vN.A0A().setClassName(a99.A1r.getPackageName(), "com.whatsapp.calling.VoipNotAllowedActivity");
        className.putStringArrayListExtra("jids", C22971Dz.A0B(arrayList));
        className.putExtra("reason", i);
        if (str != null) {
            className.putExtra("message", str);
        }
        className.setFlags(268435456);
        this.voiceService.A1r.startActivity(className);
    }

    public void lobbyTimeout() {
        Log.i("VoiceService EVENT:lobbyTimeout");
        CallState A03 = Voip.A03(this.voiceService.A2p);
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        if (A03 == CallState.REJOINING || A03 == CallState.PRECALLING) {
            this.voiceService.A0n(28, (String) null);
        } else if (this.voiceService.A2R.A02()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            C17960vV.A07(callLinkInfo);
            int i = callLinkInfo.linkState;
            if (i == 1 || i == 2) {
                handleCallLinkLobbyError(21);
            }
        }
    }

    public void muteRequestFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:muteRequestFailed");
        this.voiceService.A0H.removeMessages(43);
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        Message message = new Message();
        message.what = 43;
        message.obj = userJid;
        this.voiceService.A0H.sendMessage(message);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void muteStateChanged(int r6, com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r5 = this;
            X.A99 r0 = r5.voiceService
            X.0ve r1 = r0.A2p
            r0 = 3094(0xc16, float:4.336E-42)
            X.0vf r2 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r2, r1, r0)
            r1 = 8
            r0 = r0 & 8
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1T(r0, r1)
            X.A99 r0 = r5.voiceService
            X.0ve r1 = r0.A2p
            r0 = 9210(0x23fa, float:1.2906E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r3 != 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:muteStateChanged state "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", async "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " callinfo is "
            r1.append(r0)
            if (r7 != 0) goto L_0x008a
            java.lang.String r0 = "null"
        L_0x0042:
            X.C17890vO.A1A(r1, r0)
            if (r2 == 0) goto L_0x0085
            if (r7 != 0) goto L_0x004a
            r4 = 0
        L_0x004a:
            java.lang.String r0 = "call_info is null"
            X.C17960vV.A0F(r4, r0)
        L_0x004f:
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_IMMEDIATELY
            r5.updateCallInfo(r7, r0)
            X.A99 r0 = r5.voiceService
            android.os.Handler r1 = r0.A0H
            r0 = 32
            X.AnonymousClass8BV.A15(r1, r5, r0)
            X.A99 r0 = r5.voiceService
            X.0zA r1 = r0.A1v
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = r1.A03()
            X.1pD r2 = (X.C37251pD) r2
            X.1TM r0 = r2.A01
            X.18O r1 = r0.A00
            X.18R r0 = X.AnonymousClass18O.A0G
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0084
            X.1pB r2 = r2.A02
            r1 = 3
            X.7Id r0 = new X.7Id
            r0.<init>(r1)
            X.C37231pB.A00(r0, r2)
        L_0x0084:
            return
        L_0x0085:
            com.whatsapp.voipcalling.CallInfo r7 = r5.getCallInfo()
            goto L_0x004f
        L_0x008a:
            java.lang.String r0 = "not null"
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.muteStateChanged(int, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void mutedByOthers(UserJid userJid) {
        Log.i("VoiceService EVENT:mutedByOthers");
        this.voiceService.A0H.removeMessages(41);
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        Message message = new Message();
        message.what = 41;
        message.obj = userJid;
        this.voiceService.A0H.sendMessage(message);
    }

    public void networkHealthChangedV2(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        C136336te r2 = new C136336te(i, i2, (long) i3, z, z2, z3, z4);
        C17900vP.A0Y(r2, "VoiceService EVENT:networkHealthChangedV2 eventData: ", AnonymousClass000.A10());
        this.voiceService.A0H.obtainMessage(53, r2).sendToTarget();
    }

    public void offerPeekTimeout() {
        Log.i("VoiceService EVENT:offerPeekTimeout");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        A99 a99 = this.voiceService;
        a99.A0H.obtainMessage(49, 32, 0, a99.A1r.getString(2131898110)).sendToTarget();
    }

    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i) {
        DeviceJid A06 = DeviceJid.Companion.A06(str);
        C17960vV.A07(A06);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:rejectedDecryptionFailure, Jid:");
        A10.append(A06);
        A10.append(", callId:");
        A10.append(str2);
        C17900vP.A0j(", retryCount:", A10, i);
        this.voiceService.A3c.put(A06, str2);
        this.voiceService.A31.CGF(new C98824rm(this, A06, bArr, str2, i, 4));
    }

    public void removeUserFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:removeUserAckedOrNacked");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A1D.remove(userJid);
        Message.obtain(this.voiceService.A0H, 47, userJid).sendToTarget();
    }

    public void restartCamera() {
        Log.i("VoiceService EVENT:restartCamera");
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 58);
    }

    public void rtcpByeReceived() {
        Log.i("VoiceService EVENT:rtcpByeReceived");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0n(18, (String) null);
    }

    public void rxTrafficStateForPeerChanged() {
        Log.i("VoiceService EVENT:rxTrafficStateForPeerChanged");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 33);
    }

    public void sendAcceptFailed() {
        Log.i("VoiceService EVENT:sendAcceptFailed");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0X.A06();
    }

    public void sendOfferFailed() {
        Log.i("VoiceService EVENT:sendOfferFailed");
    }

    public void showLonelyStateNotification(CallInfo callInfo, int i) {
        A99 a99 = this.voiceService;
        a99.A2d.BkS(callInfo.callId, 51, a99.A2H.A06(a99.A1r, C138686xW.A00(callInfo, i, a99.A1a), this.voiceService.A2J, 1, false));
    }

    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        ArrayList A0w = AnonymousClass8BU.A0w("VoiceService EVENT:syncDevices");
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.voiceService.A2o.A0H(syncDevicesUserInfo.jid, syncDevicesUserInfo.phash)) {
                A0w.add(syncDevicesUserInfo.jid);
            }
        }
        if (!A0w.isEmpty()) {
            this.voiceService.A2W.A01((UserJid[]) A0w.toArray(new UserJid[0]), 4);
        }
    }

    public void updateHistoricalEcho(WamCall wamCall) {
        Long l;
        float f;
        if (wamCall != null && wamCall.callAecMode != null && wamCall.callEchoLikelihoodBeforeEc != null && (l = wamCall.callT) != null && l.intValue() >= 10000) {
            float f2 = AnonymousClass1VE.A00(this.voiceService.A2A).getFloat("pref_hist_echo", -1.0f);
            float floatValue = wamCall.callEchoLikelihoodBeforeEc.floatValue();
            if (floatValue < 0.0f || floatValue > 100.0f) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/updateHistoricalEcho wrong new Echo: ");
                A10.append(floatValue);
                C17890vO.A0w(A10);
                return;
            }
            int intValue = wamCall.callAecMode.intValue();
            boolean z = true;
            if (intValue == 1 || intValue == 2) {
                if (f2 < 0.0f) {
                    f = floatValue;
                } else {
                    f = (f2 * 0.5f) + (0.5f * floatValue);
                }
                if (f < 0.0f || f > 100.0f) {
                    z = false;
                }
                C17960vV.A0F(z, "echo should be in the range of 0 to 100");
                AnonymousClass8BW.A0A(this).putFloat("pref_hist_echo", f).apply();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("voip/updateHistoricalEcho histEcho: ");
                A102.append(f2);
                A102.append(", newEcho: ");
                A102.append(floatValue);
                A102.append(", updated: ");
                A102.append(f);
                Log.i(A102.toString());
            }
        }
    }

    public void userRemoved(UserJid userJid, UserJid userJid2) {
        Log.i("VoiceService EVENT:userRemoved");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        if (C40811vJ.A0K(this.voiceService.A23, userJid2)) {
            C17960vV.A07(userJid);
            A99 a99 = this.voiceService;
            a99.A1W = true;
            String A0q = AnonymousClass3MY.A0q(this.voiceService.A2V, a99.A2T.A0H(userJid));
            A99 a992 = this.voiceService;
            Message obtainMessage = a992.A0H.obtainMessage(49, C108975cc.A0b(a992.A1r, A0q, new Object[1], 2131887693));
            obtainMessage.arg1 = 29;
            obtainMessage.sendToTarget();
            return;
        }
        Message obtain = Message.obtain(this.voiceService.A0H, 51, userJid2);
        if (this.voiceService.A1D.contains(userJid2)) {
            obtain.arg1 = 1;
            this.voiceService.A1D.remove(userJid2);
        }
        this.voiceService.A0H.sendMessage(obtain);
    }

    public void videoCaptureStarted() {
        Log.i("VoiceService EVENT:videoCaptureStarted");
    }

    public void videoCodecMismatch() {
        Log.i("VoiceService EVENT:videoCodecMismatch");
        this.voiceService.A22.A05(2131897836);
    }

    public void videoCodecStateChanged() {
        Log.i("VoiceService EVENT:videoCodecStateChanged");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 15);
    }

    public void videoDecodeFatalError() {
        Log.i("VoiceService EVENT:videoDecodeFatalError");
    }

    public void videoDecodePaused() {
        Log.i("VoiceService EVENT:videoDecodePaused");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 15);
    }

    public void videoDecodeResumed() {
        Log.i("VoiceService EVENT:videoDecodeResumed");
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        AnonymousClass8BV.A15(this.voiceService.A0H, this, 15);
    }

    public void videoDecodeStarted() {
        Log.i("VoiceService EVENT:videoDecodeStarted");
    }

    public void videoEncodeFatalError() {
        Log.i("VoiceService EVENT:videoEncodeFatalError");
    }

    public void videoPortCreateFailed() {
        Log.i("VoiceService EVENT:videoPortCreateFailed");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0n(17, (String) null);
    }

    public void videoPreviewError() {
        Log.i("VoiceService EVENT:videoPreviewError");
    }

    public void videoPreviewReady() {
        Log.i("VoiceService EVENT:videoPreviewReady");
    }

    public void videoRenderFormatChanged(UserJid userJid) {
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0H.obtainMessage(10, userJid).sendToTarget();
    }

    public void videoStreamCreateError() {
        Log.i("VoiceService EVENT:videoStreamCreateError");
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        this.voiceService.A0n(16, (String) null);
    }

    public void weakWifiSwitchedToCellular() {
        Log.i("VoiceService EVENT:weakWifiSwitchedToCellular");
        if (((this.voipEventCallInfoBitmap >> 1) & 1) == 0) {
            updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        }
        this.voiceService.A0H.sendEmptyMessage(35);
    }

    public VoiceServiceEventCallback(A99 a99, AnonymousClass71B r5, AnonymousClass00H r6, AnonymousClass1SV r7, AnonymousClass00H r8, WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader, WhatsAppDynamicExecuTorchLoader whatsAppDynamicExecuTorchLoader2, AnonymousClass00H r11) {
        this.voiceService = a99;
        this.bweMLModelManager = r5;
        this.callingPolicyLazy = r6;
        this.httpsFormPostFactory = r7;
        this.callStateDatasourceLazy = r8;
        this.whatsappDynamicPytorchLoader = whatsAppDynamicPytorchLoader;
        this.whatsAppDynamicExecuTorchLoader = whatsAppDynamicExecuTorchLoader2;
        this.privacyPhoneNumberHidingHelper = r11;
        this.voipEventCallInfoBitmap = C18020vd.A00(C18040vf.A02, a99.A2p, 9745);
    }

    private B59 getBCallManager() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        if (r1.isAudioChat() == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleNonFatalOfferNack(java.util.List r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A14(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.A99 r0 = r8.voiceService
            X.1M9 r0 = r0.A2T
            X.1E7 r1 = r0.A0H(r1)
            X.A99 r0 = r8.voiceService
            X.1Me r0 = r0.A2V
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r1)
            r6.add(r0)
            goto L_0x0008
        L_0x0026:
            X.A99 r0 = r8.voiceService
            X.1Me r0 = r0.A2V
            r5 = 1
            X.0vb r0 = r0.A02
            java.lang.String r2 = X.C60592oI.A00(r0, r6, r5)
            r0 = 404(0x194, float:5.66E-43)
            r7 = 1
            r4 = 0
            if (r10 == r0) goto L_0x0050
            r0 = 431(0x1af, float:6.04E-43)
            if (r10 == r0) goto L_0x00df
            r0 = 435(0x1b3, float:6.1E-43)
            if (r10 == r0) goto L_0x00c4
            r0 = 538(0x21a, float:7.54E-43)
            if (r10 == r0) goto L_0x00ec
            r0 = 427(0x1ab, float:5.98E-43)
            if (r10 == r0) goto L_0x0072
            r0 = 428(0x1ac, float:6.0E-43)
            if (r10 == r0) goto L_0x006a
            java.lang.String r0 = "Unknown error code"
            X.C17960vV.A0F(r4, r0)
        L_0x0050:
            X.A99 r0 = r8.voiceService
            X.0vb r7 = r0.A2g
            r6 = 2131755510(0x7f1001f6, float:1.9141901E38)
        L_0x0057:
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r2
            java.lang.String r1 = r7.A0K(r3, r6, r0)
        L_0x0064:
            X.A99 r0 = r8.voiceService
            r0.A12(r1)
            return
        L_0x006a:
            X.A99 r0 = r8.voiceService
            android.content.Context r3 = r0.A1r
            r2 = 2131898159(0x7f122f2f, float:1.9431228E38)
            goto L_0x00b1
        L_0x0072:
            com.whatsapp.voipcalling.CallInfo r1 = r8.getCallInfo()
            if (r1 == 0) goto L_0x00bc
            int r0 = r9.size()
            if (r0 != r5) goto L_0x00a2
            java.lang.Object r0 = r9.get(r4)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.6qE r3 = r1.getInfoByJid(r0)
        L_0x0088:
            boolean r0 = r1.isGroupCall
            if (r0 == 0) goto L_0x00a4
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 4
            if (r1 <= r0) goto L_0x00a4
            X.A99 r1 = r8.voiceService
            if (r3 == 0) goto L_0x009e
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x009e
            r7 = 6
        L_0x009e:
            r1.A18(r9, r7)
            return
        L_0x00a2:
            r3 = 0
            goto L_0x0088
        L_0x00a4:
            if (r3 == 0) goto L_0x00bc
            int r0 = r3.A04
            if (r0 != r5) goto L_0x00bc
            X.A99 r0 = r8.voiceService
            android.content.Context r3 = r0.A1r
            r2 = 2131898265(0x7f122f99, float:1.9431443E38)
        L_0x00b1:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r1 = X.C17880vN.A0q(r3, r0, r1, r4, r2)
            goto L_0x0064
        L_0x00bc:
            X.A99 r0 = r8.voiceService
            X.0vb r7 = r0.A2g
            r6 = 2131755502(0x7f1001ee, float:1.9141885E38)
            goto L_0x0057
        L_0x00c4:
            com.whatsapp.voipcalling.CallInfo r1 = r8.getCallInfo()
            X.A99 r0 = r8.voiceService
            android.content.Context r2 = r0.A1r
            if (r1 == 0) goto L_0x00d7
            boolean r1 = r1.isAudioChat()
            r0 = 2131897259(0x7f122bab, float:1.9429402E38)
            if (r1 != 0) goto L_0x00da
        L_0x00d7:
            r0 = 2131897252(0x7f122ba4, float:1.9429388E38)
        L_0x00da:
            java.lang.String r1 = r2.getString(r0)
            goto L_0x0064
        L_0x00df:
            X.A99 r0 = r8.voiceService
            android.content.Context r1 = r0.A1r
            r0 = 2131897251(0x7f122ba3, float:1.9429386E38)
            java.lang.String r1 = X.C17890vO.A0R(r1, r2, r5, r4, r0)
            goto L_0x0064
        L_0x00ec:
            X.A99 r2 = r8.voiceService
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r0 = 35
            r2.A18(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.handleNonFatalOfferNack(java.util.List, int):void");
    }

    public static /* synthetic */ void lambda$callCaptureEnded$3(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo != null && (outputStream = recordingInfo.outputStream) != null) {
            try {
                outputStream.close();
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("VoiceService EVENT:callCaptureEnded ");
                A10.append(recordingInfo.outputFile);
                A10.append(" size ");
                C17890vO.A16(A10, recordingInfo.outputFile.length());
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public void bCallAudienceUpdated(AudienceInfo audienceInfo) {
    }

    public void bCallCreateFailed(int i) {
    }

    public void bCallEnded(String str) {
    }

    public void callLinkSelfStateChanged(CallLinkInfo callLinkInfo) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("callLinkSelfStateChanged muted: ");
        C134216qE r1 = callLinkInfo.self;
        A10.append(r1.A0I);
        A10.append(" Video stopped: ");
        C17900vP.A0r(A10, AnonymousClass000.A1T(r1.A08, 6));
        updateCallInfo(C179419Hw.UPDATE_UI_IMMEDIATELY);
        Message.obtain(this.voiceService.A0H, 61, callLinkInfo).sendToTarget();
    }

    public void callMissed(String str, UserJid userJid, String str2, String str3, int i, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4, GroupJid groupJid, int i2, WamCall wamCall, long j2, boolean z5) {
        int i3;
        UserJid userJid2 = userJid;
        C17900vP.A0Y(userJid2, "VoiceService EVENT:callMissed ", AnonymousClass000.A10());
        CallInfo callInfo = getCallInfo();
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        CallGroupInfo callGroupInfo2 = callGroupInfo;
        if (callGroupInfo == null || callGroupInfo2.participants.length <= 0) {
            i3 = -1;
        } else {
            i3 = callGroupInfo2.transactionId;
        }
        A7S a7s = this.voiceService.A0T;
        int i4 = i;
        long j3 = j2;
        String str4 = str2;
        WamCall wamCall2 = wamCall;
        String str5 = str;
        int i5 = i2;
        String str6 = str3;
        long j4 = j;
        boolean z6 = z;
        boolean z7 = z2;
        a7s.A07.execute(new C21420Ajn(a7s, wamCall2, groupJid, userJid2, callGroupInfo2, callInfo, str5, str4, str6, i3, i5, i4, j4, j3, z6, z7, z3, z4, z5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r6.isAudioChat() != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r12) {
        /*
            r11 = this;
            com.whatsapp.voipcalling.CallInfo r6 = r11.getCallInfo()
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_THROTTLED
            r11.updateCallInfo(r6, r0)
            if (r6 != 0) goto L_0x0011
            java.lang.String r0 = "we are not in a active call"
        L_0x000d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            if (r12 == 0) goto L_0x002c
            int r9 = r12.length
            if (r9 == 0) goto L_0x002c
            r10 = 0
            r5 = 1
            if (r9 != r5) goto L_0x002f
            r0 = r12[r10]
            int r1 = r0.errorCode
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0026
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x002f
        L_0x0026:
            java.lang.String r0 = "Server received duplicate offers. Just return"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x002c:
            java.lang.String r0 = "Received offer nack without any errors"
            goto L_0x000d
        L_0x002f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:callOfferNacked error: "
            X.C17900vP.A0j(r0, r1, r9)
            java.util.ArrayList r4 = X.C17880vN.A0z(r9)
            java.util.Map r0 = r6.participants
            int r2 = r0.size()
            int r2 = r2 - r5
            r0 = r12[r10]
            int r3 = r0.errorCode
            java.lang.String r0 = r6.callLinkToken
            if (r0 != 0) goto L_0x0052
            boolean r0 = r6.isAudioChat()
            r1 = 0
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            boolean r0 = r11.isSelfNacked(r12)
            if (r0 != 0) goto L_0x005d
            if (r1 != 0) goto L_0x0092
            if (r2 != r9) goto L_0x0092
        L_0x005d:
            r8 = 1
        L_0x005e:
            r7 = 0
        L_0x005f:
            r2 = r12[r7]
            int r1 = r2.errorCode
            r0 = 432(0x1b0, float:6.05E-43)
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r8 != 0) goto L_0x006f
            if (r0 == 0) goto L_0x0090
            int r3 = r2.errorCode
        L_0x006f:
            r8 = 1
        L_0x0070:
            com.whatsapp.jid.UserJid r0 = r2.errorJid
            r4.add(r0)
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x005f
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0083
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0086
        L_0x0083:
            if (r8 == 0) goto L_0x0086
            r10 = 1
        L_0x0086:
            X.A99 r0 = r11.voiceService
            r0.A1G = r5
            if (r10 == 0) goto L_0x0094
            r11.handleFatalOfferNack(r4, r3, r6)
            return
        L_0x0090:
            r8 = 0
            goto L_0x0070
        L_0x0092:
            r8 = 0
            goto L_0x005e
        L_0x0094:
            r11.handleNonFatalOfferNack(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callRejectReceived(com.whatsapp.jid.UserJid r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService EVENT:callRejectReceived("
            r1.append(r0)
            java.lang.String r0 = X.C17900vP.A0B(r11, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r3 = r9.getCallInfo()
            X.9Hw r0 = X.C179419Hw.UPDATE_UI_THROTTLED
            r9.updateCallInfo(r3, r0)
            if (r3 == 0) goto L_0x004d
            boolean r0 = r3.isGroupCall
            r7 = 3
            java.lang.String r8 = "uncallable"
            java.lang.String r4 = "tos"
            java.lang.String r2 = "busy"
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0093
            X.A99 r0 = r9.voiceService
            X.1Me r1 = r0.A2V
            X.1M9 r0 = r0.A2T
            X.1E7 r0 = r0.A0H(r10)
            java.lang.String r7 = X.AnonymousClass3MY.A0q(r1, r0)
            int r0 = r11.hashCode()
            switch(r0) {
                case 0: goto L_0x0083;
                case 115032: goto L_0x0061;
                case 3035641: goto L_0x0053;
                case 1353979473: goto L_0x004e;
                default: goto L_0x003d;
            }
        L_0x003d:
            X.A99 r0 = r9.voiceService
            android.content.Context r1 = r0.A1r
            r0 = 2131897251(0x7f122ba3, float:1.9429386E38)
        L_0x0044:
            java.lang.String r1 = X.C17890vO.A0R(r1, r7, r6, r5, r0)
        L_0x0048:
            X.A99 r0 = r9.voiceService
            r0.A12(r1)
        L_0x004d:
            return
        L_0x004e:
            boolean r0 = r11.equals(r8)
            goto L_0x0065
        L_0x0053:
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x003d
            X.A99 r0 = r9.voiceService
            android.content.Context r1 = r0.A1r
            r0 = 2131894259(0x7f121ff3, float:1.9423318E38)
            goto L_0x0044
        L_0x0061:
            boolean r0 = r11.equals(r4)
        L_0x0065:
            if (r0 == 0) goto L_0x003d
            boolean r1 = r3.videoEnabled
            X.A99 r0 = r9.voiceService
            if (r1 == 0) goto L_0x0073
            android.content.Context r1 = r0.A1r
            r0 = 2131898293(0x7f122fb5, float:1.94315E38)
            goto L_0x0044
        L_0x0073:
            X.0vb r4 = r0.A2g
            r3 = 2131755510(0x7f1001f6, float:1.9141901E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r7
            r0 = 1
            java.lang.String r1 = r4.A0K(r2, r3, r0)
            goto L_0x0048
        L_0x0083:
            java.lang.String r0 = ""
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.A99 r0 = r9.voiceService
            android.content.Context r1 = r0.A1r
            r0 = 2131898157(0x7f122f2d, float:1.9431224E38)
            goto L_0x0044
        L_0x0093:
            boolean r0 = r2.equals(r11)
            r2 = 0
            if (r0 == 0) goto L_0x00ad
            X.A99 r0 = r9.voiceService
            r0.A1a = r6
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r2)
            X.A99 r0 = r9.voiceService
            android.os.Handler r2 = r0.A0G
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.sendEmptyMessageDelayed(r7, r0)
            return
        L_0x00ad:
            boolean r0 = r8.equals(r11)
            r1 = 12
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x00c1
            X.A99 r0 = r9.voiceService
            r0.A0n(r1, r2)
            return
        L_0x00c1:
            X.A99 r0 = r9.voiceService
            r0.A0n(r1, r2)
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x00cc
            r5 = 11
        L_0x00cc:
            r9.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r10, (int) r5, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callRejectReceived(com.whatsapp.jid.UserJid, java.lang.String):void");
    }

    public void dataChannelReady() {
    }

    public void eventNotHandled(int i, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Event ");
        A10.append(str);
        A10.append(" (code  ");
        A10.append(i);
        this.voiceService.A12(AnonymousClass000.A0y(") not handled", A10));
    }

    public void groupParticipantLeft(UserJid userJid, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:groupParticipantLeft ");
        A10.append(userJid);
        A10.append(" (");
        A10.append(i);
        C17890vO.A1A(A10, ")");
        if (i == 4) {
            if (str == null) {
                str = "";
            }
            callRejectReceived(userJid, str);
        }
    }

    public void handleAcceptAckFailed(String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:handleAcceptAckFailed, error_code = ");
        A10.append(i);
        C17900vP.A0f("error_raw_device_jid: ", str, A10);
        if ((this.voipEventCallInfoBitmap & 1) == 0) {
            updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        }
        A99 a99 = this.voiceService;
        int i2 = 25;
        if (i == 434) {
            i2 = 26;
        }
        a99.A0n(i2, (String) null);
    }

    public void handleCallFatal(CallFatalError callFatalError) {
        A99 a99;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:handleCallFatal Reason: ");
        C17900vP.A0o(A10, callFatalError.reasonCode);
        AnonymousClass190 r3 = this.voiceService.A1x;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/callFatal Reason:");
        r3.A0G("VoiceServiceEventCallback/handleCallFatal", C17880vN.A0t(A102, callFatalError.reasonCode), true);
        if ((this.voipEventCallInfoBitmap & 1) == 0) {
            updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        }
        int i = 23;
        String str = null;
        switch (callFatalError.reasonCode) {
            case 3:
                a99 = this.voiceService;
                i = 6;
                break;
            case 4:
                a99 = this.voiceService;
                i = 5;
                break;
            case 5:
                a99 = this.voiceService;
                i = 16;
                break;
            case 6:
                a99 = this.voiceService;
                i = 17;
                break;
            case 7:
                break;
            case 8:
                C17880vN.A1B(AnonymousClass8BW.A0A(this).remove("audio_sampling_hash").remove("audio_sampling_rates"), "audio_native_sampling_rate");
                break;
            default:
                this.voiceService.A0n(30, (String) null);
                return;
        }
        a99 = this.voiceService;
        str = a99.A1r.getString(2131898114);
        a99.A0n(i, str);
    }

    public void handleVoipAssert(String str, int i) {
        String str2;
        String A1I = AnonymousClass001.A1I(":", AnonymousClass000.A11(str), i);
        if (this.voiceService.A3i.add(A1I)) {
            this.voiceService.A1x.A0G(AnonymousClass001.A1H("voip-assert:", str, AnonymousClass000.A10()), A1I, false);
            str2 = " (first occurence)";
        } else {
            str2 = "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoipAssert at ");
        C17900vP.A0e(A1I, str2, A10);
    }

    public void heartbeatNacked(int i, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:heartbeatNacked callId: ");
        A10.append(str);
        C17900vP.A0j(" errorCode:", A10, i);
        if (AnonymousClass8BT.A1Y(str)) {
            updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
            this.voiceService.A0n(25, (String) null);
        }
    }

    /* renamed from: lambda$callCaptureBufferFilled$2$com-whatsapp-calling-service-VoiceServiceEventCallback  reason: not valid java name */
    public /* synthetic */ void m38lambda$callCaptureBufferFilled$2$comwhatsappcallingserviceVoiceServiceEventCallback(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.voiceService.A21, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
        } else {
            try {
                outputStream.write(bArr, 0, i);
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
            C185189cB r1 = this.bufferQueue;
            synchronized (r1) {
                if (bArr != null) {
                    r1.A01.addFirst(bArr);
                }
            }
            if (recordingInfo.outputFile.length() >= 52428800) {
                Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            } else {
                return;
            }
        }
        Voip.stopCallRecording();
    }

    public void linkCreateAcked(String str, boolean z) {
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:linkCreateAcked token: ");
        A10.append(str);
        A10.append(" media: ");
        if (z) {
            str2 = "video";
        } else {
            str2 = "audio";
        }
        C17890vO.A1A(A10, str2);
        this.voiceService.A22.A0J(new C98574rN(this, str, 2, z));
        this.voiceService.A3G.get();
    }

    public void linkCreateNacked(int i) {
        C17900vP.A0j("VoiceService EVENT:linkCreateNacked errorCode:", AnonymousClass000.A10(), i);
        this.voiceService.A22.A0J(new C146427Pb(this, 48));
    }

    public void linkEditAcked(String str) {
        C17900vP.A0f("kEventLinkEditAcked token ", str, AnonymousClass000.A10());
        this.voiceService.A22.A0J(new C21452AkJ(45, str, this));
    }

    public void linkEditNacked(String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("kEventLinkEditNacked token ");
        A10.append(str);
        C17900vP.A0i(" error ", A10, i);
        this.voiceService.A22.A0J(new AnonymousClass7RP(this, i, 34));
    }

    public void linkJoinNacked(int i) {
        C17900vP.A0j("VoiceService EVENT:linkJoinNacked errorCode:", AnonymousClass000.A10(), i);
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        AtomicInteger atomicInteger = A99.A4B;
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void linkQueryNacked(int i) {
        C17900vP.A0j("VoiceService EVENT:linkQueryNacked errorCode:", AnonymousClass000.A10(), i);
        updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
        AtomicInteger atomicInteger = A99.A4B;
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void lobbyNacked(int i, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:lobbyNacked callId: ");
        A10.append(str);
        C17900vP.A0j(" errorCode:", A10, i);
        if (AnonymousClass8BT.A1Y(str)) {
            if ((this.voipEventCallInfoBitmap & 1) == 0) {
                updateCallInfo(C179419Hw.SKIP_UI_UPDATE);
            }
            this.voiceService.A0n(25, (String) null);
        }
    }

    public void lonelyStateTimeout(int i) {
        C17900vP.A0j("VoiceService EVENT:lonelyStateTimeout remainingDurationMs: ", AnonymousClass000.A10(), i);
        CallInfo A04 = C40811vJ.A04(this.voiceService.A29);
        C17960vV.A07(A04);
        updateCallInfo(A04, C179419Hw.SKIP_UI_UPDATE);
        if (i == 0) {
            A99 a99 = this.voiceService;
            Message obtainMessage = a99.A0H.obtainMessage(49, a99.A1r.getString(2131887631));
            obtainMessage.arg1 = 27;
            obtainMessage.sendToTarget();
            return;
        }
        showLonelyStateNotification(A04, (int) (((long) i) / 60000));
    }

    public void peerBatteryLevelLow(UserJid userJid) {
        C17900vP.A0Y(userJid, "VoiceService EVENT:peerBatteryLevelLow, Jid:", AnonymousClass000.A10());
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        A99 a99 = this.voiceService;
        Message message = new Message();
        message.what = 19;
        message.obj = userJid;
        a99.A0H.sendMessageDelayed(message, 3000);
    }

    public void peerVideoStateChanged(int i) {
        C17900vP.A0j("VoiceService EVENT:peerVideoStateChanged ", AnonymousClass000.A10(), i);
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.removeMessages(12);
        this.voiceService.A0H.obtainMessage(12, i, 0).sendToTarget();
        C19880zA r1 = this.voiceService.A1v;
        if (r1.A07()) {
            C37251pD r2 = (C37251pD) r1.A03();
            if (r2.A01.A00.A09(AnonymousClass18O.A0G)) {
                C37231pB.A00(new C144647Id(0), r2.A02);
            }
        }
    }

    public void playCallTone(int i) {
        C17900vP.A0j("VoiceService EVENT:playCallTone type:", AnonymousClass000.A10(), i);
        Integer num = (Integer) AnonymousClass000.A0w(this.voiceService.A3e, i);
        A99 a99 = this.voiceService;
        if (a99.A0F == null) {
            a99.A0F = new SoundPool(1, 0, 0);
        }
        this.voiceService.A10(num, "callTone", 1.0f, 1.0f);
    }

    public void preacceptReceived() {
        CallInfo callInfo = getCallInfo();
        if (callInfo != null && callInfo.isBotCall) {
            ((C140076zu) this.voiceService.A3X.get()).A02(AnonymousClass00R.A0j);
        }
    }

    public void relayBindsFailed(boolean z) {
        C17900vP.A0n("VoiceService EVENT:relayBindsFailed self bad asn=", AnonymousClass000.A10(), z);
        CallInfo callInfo = getCallInfo();
        updateCallInfo(callInfo, C179419Hw.UPDATE_UI_THROTTLED);
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        this.voiceService.A1Q = z;
        endCallWhenRelayBindFailed(callInfo);
    }

    public void screenShare(UserJid userJid, int i, int i2, int i3) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:screenShare ");
        A10.append(i);
        C17900vP.A0Y(userJid, " for ", A10);
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.obtainMessage(52, new C194869sQ(userJid, i, i2, i3)).sendToTarget();
    }

    public void selfVideoStateChanged(int i) {
        C17900vP.A0j("VoiceService EVENT:selfVideoStateChanged ", AnonymousClass000.A10(), i);
        updateCallInfo(C179419Hw.UPDATE_UI_IMMEDIATELY);
        this.voiceService.A0H.removeMessages(11);
        this.voiceService.A0H.obtainMessage(11, i, 0).sendToTarget();
    }

    public void sendJoinableClientPollCriticalEvent(int i) {
        C17900vP.A0j("VoiceService EVENT:sendJoinableClientPollCriticalEvent errorCode:", AnonymousClass000.A10(), i);
        this.voiceService.A1x.A0G("linked-group-call/client-poll-nack", String.valueOf(i), false);
    }

    public void sendLinkedGroupCallDowngradedCriticalEvent(boolean z) {
        String str;
        C17900vP.A0n("VoiceService EVENT:sendLinkedGroupCallDowngradedCriticalEvent isPendingCall:", AnonymousClass000.A10(), z);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("linked-group-call/downgrade-");
        if (z) {
            str = "pending-call";
        } else {
            str = "ongoing-call";
        }
        this.voiceService.A1x.A0G(AnonymousClass000.A0y(str, A10), (String) null, false);
    }

    public void soundPortCreated(int i) {
        NoiseSuppressor A02;
        AutomaticGainControl A01;
        AcousticEchoCanceler A00;
        C17900vP.A0j("VoiceService EVENT:soundPortCreated with engine type ", AnonymousClass000.A10(), i);
        Integer A05 = Voip.A05("aec.builtin");
        A99 a99 = this.voiceService;
        if (a99.A14 == null && A05 != null) {
            int intValue = A05.intValue();
            if (intValue == 2) {
                A00 = Voip.A00(a99.A33.previousAudioSessionId, true);
            } else if (intValue == 3) {
                A00 = Voip.A00(a99.A33.previousAudioSessionId, false);
            }
            a99.A14 = A00;
        }
        Integer A052 = Voip.A05("agc.builtin");
        A99 a992 = this.voiceService;
        if (a992.A15 == null && A052 != null) {
            int intValue2 = A052.intValue();
            if (intValue2 == 2) {
                A01 = Voip.A01(a992.A33.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                A01 = Voip.A01(a992.A33.previousAudioSessionId, false);
            }
            a992.A15 = A01;
        }
        Integer A053 = Voip.A05("ns.builtin");
        A99 a993 = this.voiceService;
        if (a993.A16 == null && A053 != null) {
            int intValue3 = A053.intValue();
            if (intValue3 == 2) {
                A02 = Voip.A02(a993.A33.previousAudioSessionId, true);
            } else if (intValue3 == 3) {
                A02 = Voip.A02(a993.A33.previousAudioSessionId, false);
            } else {
                return;
            }
            a993.A16 = A02;
        }
    }

    public void update1to1CallLog(String str, UserJid userJid, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:update1to1callLog callId ");
        A10.append(str);
        A10.append(" result ");
        A10.append(i);
        C17900vP.A0Y(userJid, " Jid ", A10);
        if (i != 6) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VoiceService update1:1callLog unexpected result callId ");
            A102.append(str);
            C17900vP.A0i(" result ", A102, i);
            return;
        }
        A7S a7s = this.voiceService.A0T;
        if (A7S.A03(a7s.A02.BO3(), str)) {
            a7s.A07.execute(new C70783Cm(a7s, userJid, str));
        }
    }

    public void updateJoinableCallLog(int i, String str, UserJid userJid, boolean z, int i2, CallParticipant[] callParticipantArr, CallSummary callSummary) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService EVENT:updateJoinableCallLog updateType: ");
        A10.append(i);
        C17900vP.A0f(" callId:", str, A10);
        A7S a7s = this.voiceService.A0T;
        UserJid userJid2 = userJid;
        CallParticipant[] callParticipantArr2 = callParticipantArr;
        CallSummary callSummary2 = callSummary;
        a7s.A07.execute(new C21441Ak8(callSummary2, a7s, userJid2, str, callParticipantArr2, i2, i, z));
    }

    public void updateVoipSettings(boolean z) {
        C17900vP.A0n("VoiceService EVENT:updateVoipSettings isVideoCall: ", AnonymousClass000.A10(), z);
        updateSettingsFromVoipParamsAfterHandlingSignaling(z);
    }

    public void videoPortCreated(UserJid userJid) {
        C17900vP.A0Y(userJid, "VoiceService EVENT:videoPortCreated ", AnonymousClass000.A10());
        if ((this.voipEventCallInfoBitmap & 1) == 0) {
            updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        }
        AnonymousClass8BT.A17(this.voiceService.A0H, 7);
    }

    public void videoRenderStarted(UserJid userJid) {
        C17900vP.A0Y(userJid, "VoiceService EVENT:videoRenderStarted ", AnonymousClass000.A10());
        updateCallInfo(C179419Hw.UPDATE_UI_THROTTLED);
        this.voiceService.A0H.obtainMessage(8, userJid).sendToTarget();
    }

    private void updateCallInfo(C179419Hw r4) {
        if (C18020vd.A05(C18040vf.A01, this.voiceService.A2p, 8032)) {
            ((C88054Yd) this.callStateDatasourceLazy.get()).A03(getCallInfo(), r4);
        }
    }

    public void showCallNotAllowedActivity(UserJid userJid, int i, String str) {
        ArrayList A0z = AnonymousClass8BT.A0z();
        A0z.add(userJid);
        showCallNotAllowedActivity(A0z, i, str);
    }
}
