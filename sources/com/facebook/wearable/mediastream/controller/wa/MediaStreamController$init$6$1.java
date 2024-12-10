package com.facebook.wearable.mediastream.controller.wa;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.C22874BTj;
import X.C22953BWz;
import X.C22973BXt;
import X.C24712CGy;
import X.C25817CmU;
import X.C26226CvH;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import X.CLC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.controller.wa.MediaStreamController$init$6$1", f = "MediaStreamController.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
public final class MediaStreamController$init$6$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C26226CvH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaStreamController$init$6$1(C26226CvH cvH, C30391dr r3) {
        super(2, r3);
        this.this$0 = cvH;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MediaStreamController$init$6$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MediaStreamController$init$6$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C24712CGy.A01.A04("sup:MediaStreamController", "Latency has built up beyond reproach!!!  Disconnect!!", (Throwable) null);
            CLC clc = this.this$0.A0E;
            if (clc != null) {
                clc.A00.A06(C22973BXt.A00);
            }
            this.this$0.A0D(AnonymousClass00R.A15);
            this.label = 1;
            if (C62882s9.A00(this, 500) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C25817CmU cmU = this.this$0.A0G;
        if (cmU != null) {
            cmU.A01(new C22953BWz("STREAM_STOPPED_REASON_HIGH_LATENCY"));
        }
        this.this$0.A0C((C22874BTj) null, new C22953BWz("STREAM_STOPPED_REASON_HIGH_LATENCY"));
        return C27621Wu.A00;
    }
}
