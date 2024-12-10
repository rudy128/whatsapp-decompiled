package com.whatsapp.flows.network.phoenix;

import X.A0I;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C170638qQ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.flows.network.assetverification.FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.network.phoenix.FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1", f = "FlowsPslDownloadManager.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ CountDownLatch $latch;
    public int label;
    public final /* synthetic */ C170638qQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(C170638qQ r2, CountDownLatch countDownLatch, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$latch = countDownLatch;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(this.this$0, this.$latch, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A0I a0i = (A0I) this.this$0.A01.get();
            this.label = 1;
            if (C30451dy.A00(this, a0i.A03, new FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(a0i, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$latch.countDown();
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
