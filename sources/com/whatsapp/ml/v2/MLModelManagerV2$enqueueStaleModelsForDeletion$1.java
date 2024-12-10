package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8AS;
import X.AnonymousClass8Ak;
import X.C122716Rq;
import X.C1407873b;
import X.C162248Jv;
import X.C196269uj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.ml.v2.worker.StaleModelDeletionWorkerV2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$enqueueStaleModelsForDeletion$1", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$enqueueStaleModelsForDeletion$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122716Rq $mlModelType;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$enqueueStaleModelsForDeletion$1(C1407873b r2, C122716Rq r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$mlModelType = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLModelManagerV2$enqueueStaleModelsForDeletion$1(this.this$0, this.$mlModelType, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1407873b r0 = this.this$0;
            AnonymousClass8Ak A00 = r0.A01.A00(this.$mlModelType, false);
            C196269uj r1 = new C196269uj(StaleModelDeletionWorkerV2.class);
            r1.A04(A00.BV1().A00());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.$mlModelType.name());
            C1407873b.A02((C162248Jv) r1.A00(), this.this$0, (AnonymousClass8AS) null, AnonymousClass000.A0y("_stale_deletion", A10));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$enqueueStaleModelsForDeletion$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
