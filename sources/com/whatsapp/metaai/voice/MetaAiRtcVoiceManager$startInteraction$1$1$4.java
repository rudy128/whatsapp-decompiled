package com.whatsapp.metaai.voice;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C93644jJ;
import X.C99384sj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1$1$4", f = "MetaAiRtcVoiceManager.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAiRtcVoiceManager$startInteraction$1$1$4 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C93644jJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiRtcVoiceManager$startInteraction$1$1$4(C93644jJ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MetaAiRtcVoiceManager$startInteraction$1$1$4(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MetaAiRtcVoiceManager$startInteraction$1$1$4(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C99384sj r0 = new C99384sj(this.this$0, 5);
            this.label = 1;
            if (((AnonymousClass1G0) this.this$0.A0U.getValue()).BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}
