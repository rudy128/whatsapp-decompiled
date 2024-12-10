package com.whatsapp.bot.metaai.voice;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1", f = "MetaAiVoiceSettingViewModel.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MetaAiVoiceSettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1(MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = metaAiVoiceSettingViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r4) goto L_0x008e
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x000e:
            X.C30691eM.A01(r8)
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = r7.this$0
            X.6pw r6 = r0.A02
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0036
            X.1G4 r1 = r6.A06
            r0 = 0
            r1.CPw(r0)
        L_0x0021:
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r3 = r7.this$0
            X.6pw r0 = r3.A02
            X.1G4 r2 = r0.A06
            r1 = 6
            X.7Sn r0 = new X.7Sn
            r0.<init>(r3, r1)
            r7.label = r4
            java.lang.Object r0 = r2.BFC(r7, r0)
            if (r0 != r5) goto L_0x0091
            return r5
        L_0x0036:
            X.00H r0 = r6.A02
            X.1UD r1 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x008b
            X.0ve r2 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 12187(0x2f9b, float:1.7078E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
        L_0x0050:
            X.1G4 r1 = r6.A06
            X.7Jp r0 = X.C145027Jp.A00
            r1.CPw(r0)
            X.A7K r3 = new X.A7K
            r3.<init>()
            int r0 = r2.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0089
            r0 = 2
        L_0x0065:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "voice_option_setting"
            r3.A05(r1, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.aivoice.MetaAIVoiceWAOptionsWithDefaultFetchQueryResponseImpl> r2 = com.whatsapp.infra.graphql.generated.aivoice.MetaAIVoiceWAOptionsWithDefaultFetchQueryResponseImpl.class
            java.lang.String r0 = "MetaAIVoiceWAOptionsWithDefaultFetchQuery"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.00H r0 = r6.A04
            X.A2g r1 = X.C108975cc.A0J(r1, r0)
            r1.A01 = r4
            r0 = 21
            X.7SB r0 = X.AnonymousClass7SB.A00(r6, r0)
            r1.A04(r0)
            goto L_0x0021
        L_0x0089:
            r0 = 1
            goto L_0x0065
        L_0x008b:
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            goto L_0x0050
        L_0x008e:
            X.C30691eM.A01(r8)
        L_0x0091:
            X.7Sr r0 = new X.7Sr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
