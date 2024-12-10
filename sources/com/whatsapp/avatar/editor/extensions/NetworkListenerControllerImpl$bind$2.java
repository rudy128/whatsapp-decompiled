package com.whatsapp.avatar.editor.extensions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.editor.extensions.NetworkListenerControllerImpl$bind$2", f = "NetworkListenerControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NetworkListenerControllerImpl$bind$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $sendEvent;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkListenerControllerImpl$bind$2(C30391dr r2, C22821Di r3) {
        super(2, r2);
        this.$sendEvent = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        NetworkListenerControllerImpl$bind$2 networkListenerControllerImpl$bind$2 = new NetworkListenerControllerImpl$bind$2(r4, this.$sendEvent);
        networkListenerControllerImpl$bind$2.L$0 = obj;
        return networkListenerControllerImpl$bind$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$sendEvent.invoke(this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NetworkListenerControllerImpl$bind$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
