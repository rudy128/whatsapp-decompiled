package com.whatsapp.voicetranscriptionconfig;

import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import X.C88534a3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1", f = "PttTranscriptionConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ C88534a3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1(C88534a3 r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r3.A05.getValue() != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            if (r0 != 0) goto L_0x0032
            X.C30691eM.A01(r5)
            X.4a3 r3 = r4.this$0
            X.0ve r2 = r3.A01
            r1 = 2890(0xb4a, float:4.05E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002c
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "voice_message_transcription_enabled"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x002c
            X.1G4 r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            r0 = 1
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$isGlobalLanguageSelectionRequiredFlow$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
