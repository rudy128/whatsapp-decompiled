package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C98494rF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1", f = "WfsNativeAuthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $results;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$2$1(C30391dr r2, C98494rF r3) {
        super(2, r2);
        this.$results = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        WfsNativeAuthManager$getSsoList$2$2$1 wfsNativeAuthManager$getSsoList$2$2$1 = new WfsNativeAuthManager$getSsoList$2$2$1(r4, this.$results);
        wfsNativeAuthManager$getSsoList$2$2$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$results.element = this.L$0;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
