package com.whatsapp.metaai.voice;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C93644jJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1", f = "MetaAiRtcVoiceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiRtcVoiceManager$startInteraction$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C93644jJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiRtcVoiceManager$startInteraction$1(C93644jJ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MetaAiRtcVoiceManager$startInteraction$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MetaAiRtcVoiceManager$startInteraction$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r2.equals(com.whatsapp.jid.PhoneUserJid.Companion.A03(r8.A0I(9624))) != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.label
            if (r0 != 0) goto L_0x0189
            X.C30691eM.A01(r17)
            X.4jJ r0 = r1.this$0
            X.00H r0 = r0.A0D
            X.1Ps r0 = X.AnonymousClass3MW.A0W(r0)
            X.1E7 r3 = r0.A02()
            if (r3 == 0) goto L_0x00e3
            X.4jJ r4 = r1.this$0
            X.00H r0 = r4.A0H
            java.lang.Object r5 = r0.get()
            X.1VP r5 = (X.AnonymousClass1VP) r5
            X.00H r0 = r4.A0M
            java.lang.Object r0 = r0.get()
            X.1rn r0 = (X.C38731rn) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "meta_ai_voice_option_selection_identifier"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L_0x003a
            r1 = r0
        L_0x003a:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0186
            java.lang.String r0 = "voice_option"
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r1)
            java.util.Map r15 = X.C200610r.A04(r0)
        L_0x004a:
            X.1VQ r5 = (X.AnonymousClass1VQ) r5
            X.1BI r2 = r3.A0J
            X.0ve r8 = r5.A0J
            if (r2 == 0) goto L_0x0095
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 != 0) goto L_0x0070
            boolean r0 = X.C22971Dz.A0X(r2)
            if (r0 == 0) goto L_0x0095
            r0 = 9624(0x2598, float:1.3486E-41)
            java.lang.String r1 = r8.A0I(r0)
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0095
        L_0x0070:
            r0 = 9427(0x24d3, float:1.321E-41)
            X.0vf r7 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r7, r8, r0)
            r0 = 1
            if (r1 < r0) goto L_0x0095
            r2 = 1
            r0 = 9955(0x26e3, float:1.395E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            r10 = 8
            if (r0 == 0) goto L_0x0088
            r10 = 55
        L_0x0088:
            X.1BI r0 = r3.A0J
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A00(r0)
            if (r11 != 0) goto L_0x00e6
            java.lang.String r0 = "app/startOutgoingBotCall invalid bot jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0095:
            java.lang.String r0 = "MetaAiRtcVoiceManager/acquireResources"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r4.A0O
            java.lang.Object r0 = r0.get()
            X.1V7 r0 = (X.AnonymousClass1V7) r0
            r0.A01(r4)
            X.1OX r5 = r4.A0W
            r3 = 0
            com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$1 r0 = new com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$1
            r0.<init>(r4, r3)
            X.1OR r2 = X.AnonymousClass1OR.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.1e4 r0 = X.C30451dy.A02(r1, r2, r0, r5)
            r4.A08 = r0
            com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$2 r0 = new com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$2
            r0.<init>(r4, r3)
            X.1e4 r0 = X.C30451dy.A02(r1, r2, r0, r5)
            r4.A06 = r0
            com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$3 r0 = new com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$3
            r0.<init>(r4, r3)
            X.1e4 r0 = X.C30451dy.A02(r1, r2, r0, r5)
            r4.A07 = r0
            com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$4 r0 = new com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$4
            r0.<init>(r4, r3)
            X.1e4 r0 = X.C30451dy.A02(r1, r2, r0, r5)
            r4.A05 = r0
            com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$5 r0 = new com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$5
            r0.<init>(r4, r3)
            X.1e4 r0 = X.C30451dy.A02(r1, r2, r0, r5)
            r4.A09 = r0
        L_0x00e3:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00e6:
            boolean r0 = X.C22971Dz.A0X(r11)
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "CallsManagerImpl/startOutgoingBotCall/call to fbid@bot is not supported"
        L_0x00ee:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0095
        L_0x00f2:
            X.17x r3 = r5.A0G
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x0095
            X.1HQ r0 = r5.A07
            com.whatsapp.voipcalling.CallInfo r0 = r0.BO3()
            if (r0 == 0) goto L_0x0109
            com.whatsapp.voipcalling.CallState r1 = r0.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0109
            goto L_0x0095
        L_0x0109:
            X.11C r0 = r5.A0E
            android.telephony.TelephonyManager r0 = r0.A0K()
            int r0 = X.C63982u1.A00(r0, r3)
            if (r0 != 0) goto L_0x0095
            X.11E r1 = r5.A0C
            r0 = 0
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0095
            r9 = 0
            X.11P r1 = r5.A0F
            X.11S r0 = r5.A06
            java.lang.String r14 = X.AnonymousClass1PP.A00(r0, r1, r2)
            r0 = 10293(0x2835, float:1.4424E-41)
            int r1 = X.C18020vd.A00(r7, r8, r0)
            r0 = 2
            java.lang.String r6 = "867051314767696"
            if (r1 != r0) goto L_0x013d
            X.2qw r0 = X.C42711yc.A01
            X.1yc r3 = r0.A01(r6)
        L_0x0138:
            if (r3 != 0) goto L_0x0144
            java.lang.String r0 = "CallsManagerImpl/startOutgoingBotCall/call Jid conversion failed"
            goto L_0x00ee
        L_0x013d:
            java.lang.String r0 = "103242709127222@lid"
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A02(r0)
            goto L_0x0138
        L_0x0144:
            com.whatsapp.jid.DeviceJid[] r2 = new com.whatsapp.jid.DeviceJid[r2]
            com.whatsapp.jid.DeviceJid r0 = r3.getPrimaryDevice()
            r2[r9] = r0
            r1 = r11
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            r0 = 0
            com.whatsapp.voipcalling.CallParticipantJid r12 = new com.whatsapp.voipcalling.CallParticipantJid
            r12.<init>(r3, r0, r2, r1)
            r0 = 12638(0x315e, float:1.771E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x0168
            X.2qw r0 = X.C42711yc.A01
            X.1yc r11 = r0.A01(r6)
            if (r11 != 0) goto L_0x0168
            java.lang.String r0 = "CallsManagerImpl/startOutgoingBotCall/agent Jid is null"
            goto L_0x00ee
        L_0x0168:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r3 = 1
            X.9sy r10 = new X.9sy
            r10.<init>(r11, r12, r13, r14, r15)
            X.1V7 r2 = r5.A0A
            java.lang.String r1 = "start_bot_call"
            X.A69 r0 = new X.A69
            r0.<init>((java.lang.String) r1, (java.lang.Object) r10)
            android.os.Handler r1 = r2.A00
            android.os.Message r0 = r1.obtainMessage(r3, r0)
            r1.sendMessageAtFrontOfQueue(r0)
            goto L_0x0095
        L_0x0186:
            r15 = 0
            goto L_0x004a
        L_0x0189:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
