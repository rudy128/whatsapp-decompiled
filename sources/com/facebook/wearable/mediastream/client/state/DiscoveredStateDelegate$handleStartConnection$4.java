package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.BQm;
import X.BXK;
import X.C147317Sr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.DiscoveredStateDelegate$handleStartConnection$4", f = "DiscoveredStateDelegate.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
public final class DiscoveredStateDelegate$handleStartConnection$4 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BXK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveredStateDelegate$handleStartConnection$4(BXK bxk, C30391dr r3) {
        super(2, r3);
        this.this$0 = bxk;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DiscoveredStateDelegate$handleStartConnection$4(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DiscoveredStateDelegate$handleStartConnection$4(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            BXK bxk = this.this$0;
            AnonymousClass1G0 A05 = BQm.A0Q.A05();
            AnonymousClass1G2 r0 = bxk.A02;
            this.label = 1;
            if (A05.BFC(this, r0) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw new C147317Sr();
    }
}
