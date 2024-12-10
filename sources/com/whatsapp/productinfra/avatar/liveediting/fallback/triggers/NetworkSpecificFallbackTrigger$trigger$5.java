package com.whatsapp.productinfra.avatar.liveediting.fallback.triggers;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.C24236Bxq;
import X.C24305Bz2;
import X.C25179CaV;
import X.C27038DQj;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.NetworkSpecificFallbackTrigger$trigger$5", f = "NetworkSpecificFallbackTrigger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NetworkSpecificFallbackTrigger$trigger$5 extends C30431dv implements C36001nB {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ C27038DQj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkSpecificFallbackTrigger$trigger$5(C27038DQj dQj, C30391dr r3) {
        super(3, r3);
        this.this$0 = dQj;
    }

    public final Object invokeSuspend(Object obj) {
        C24305Bz2 bz2;
        String A00;
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.I$0 == 0) {
                bz2 = C24305Bz2.EDITOR_SCREEN_PREVIEW_INITIAL_CHECK_FAILED;
                A00 = C24236Bxq.A07.A00();
                str = "unsupported_network";
            } else {
                bz2 = C24305Bz2.EDITOR_SCREEN_PREVIEW_NOT_ON_SUPPORTED_NETWORK;
                A00 = C24236Bxq.A06.A00();
                str = null;
            }
            return AnonymousClass1D6.A01(bz2, new C25179CaV(str, A00));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0M = AnonymousClass000.A0M(obj);
        NetworkSpecificFallbackTrigger$trigger$5 networkSpecificFallbackTrigger$trigger$5 = new NetworkSpecificFallbackTrigger$trigger$5(this.this$0, (C30391dr) obj3);
        networkSpecificFallbackTrigger$trigger$5.I$0 = A0M;
        return networkSpecificFallbackTrigger$trigger$5.invokeSuspend(C27621Wu.A00);
    }
}
