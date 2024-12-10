package com.whatsapp.metaai.voice;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I4;
import X.AnonymousClass5WL;
import X.C23421Fz;
import X.C26092CsA;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C85914Pf;
import X.C93644jJ;
import X.C99464sr;
import X.C99614tB;
import com.whatsapp.calling.calldatasource.CallRepository$getParticipantAudioLevels$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$5", f = "MetaAiRtcVoiceManager.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiRtcVoiceManager$startInteraction$1$1$5 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C93644jJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiRtcVoiceManager$startInteraction$1$1$5(C93644jJ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MetaAiRtcVoiceManager$startInteraction$1$1$5(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MetaAiRtcVoiceManager$startInteraction$1$1$5(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass5WL A00 = AnonymousClass4I4.A00(new CallRepository$getParticipantAudioLevels$1((C85914Pf) this.this$0.A0F.get(), (C30391dr) null));
            C93644jJ r2 = this.this$0;
            C23421Fz A02 = C26092CsA.A02(new C99464sr(r2, A00, 7));
            C99614tB A002 = C99614tB.A00(r2, 33);
            this.label = 1;
            if (A02.BFC(this, A002) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
