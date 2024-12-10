package com.whatsapp.voicetranscriptionconfig;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C88534a3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscriptionconfig.PttTranscriptionConfig$userSettingIsEnabledFlow$2$1", f = "PttTranscriptionConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PttTranscriptionConfig$userSettingIsEnabledFlow$2$1 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ C88534a3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PttTranscriptionConfig$userSettingIsEnabledFlow$2$1(C88534a3 r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new PttTranscriptionConfig$userSettingIsEnabledFlow$2$1(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(this.this$0.A09());
        }
        throw AnonymousClass000.A0l();
    }
}
