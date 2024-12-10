package com.whatsapp.productinfra.avatar.liveediting.fallback.triggers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.NetworkSpecificFallbackTrigger$trigger$2", f = "NetworkSpecificFallbackTrigger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NetworkSpecificFallbackTrigger$trigger$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public NetworkSpecificFallbackTrigger$trigger$2(C30391dr r2) {
        super(2, r2);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        NetworkSpecificFallbackTrigger$trigger$2 networkSpecificFallbackTrigger$trigger$2 = new NetworkSpecificFallbackTrigger$trigger$2(r3);
        networkSpecificFallbackTrigger$trigger$2.L$0 = obj;
        return networkSpecificFallbackTrigger$trigger$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        NetworkSpecificFallbackTrigger$trigger$2 networkSpecificFallbackTrigger$trigger$2 = new NetworkSpecificFallbackTrigger$trigger$2((C30391dr) obj2);
        networkSpecificFallbackTrigger$trigger$2.L$0 = obj;
        return networkSpecificFallbackTrigger$trigger$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
