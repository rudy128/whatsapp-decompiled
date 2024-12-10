package com.whatsapp.flows.network.assetverification;

import X.A0I;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9XS;
import X.C108945cZ;
import X.C138506xC;
import X.C171978sa;
import X.C171998sc;
import X.C172478tU;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.network.assetverification.FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2", f = "FlowsAssetVerificationManager.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ A0I this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(A0I a0i, C30391dr r3) {
        super(2, r3);
        this.this$0 = a0i;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 = new FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(this.this$0, r4);
        flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2.L$0 = obj;
        return flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        A0I a0i;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            a0i = this.this$0;
            try {
                if (!a0i.A02.compareAndSet(false, true)) {
                    return C171998sc.A00;
                }
                C172478tU A00 = a0i.A00.A00();
                this.L$0 = a0i;
                this.label = 1;
                obj = A00.CBx(this, C23761Hn.A01);
                if (obj == r6) {
                    return r6;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else if (i == 1) {
            a0i = (A0I) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = A0I.A00(a0i, (AnonymousClass9XS) null, (C138506xC) obj);
        A0I a0i2 = this.this$0;
        Throwable A002 = C30671eK.A00(obj2);
        if (A002 == null) {
            return obj2;
        }
        a0i2.A02.set(false);
        return a0i2.A01(C171978sa.A00, (AnonymousClass9XS) null, A002.getMessage(), A002);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
