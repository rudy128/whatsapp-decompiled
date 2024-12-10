package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C122716Rq;
import X.C1407873b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$cancelDownloadInternal$2", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$cancelDownloadInternal$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isSilentUpdate;
    public final /* synthetic */ C122716Rq $mlModelType;
    public int label;
    public final /* synthetic */ C1407873b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$cancelDownloadInternal$2(C1407873b r2, C122716Rq r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$mlModelType = r3;
        this.$isSilentUpdate = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MLModelManagerV2$cancelDownloadInternal$2(this.this$0, this.$mlModelType, r6, this.$isSilentUpdate);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1407873b.A03(this.this$0, this.$mlModelType, this.$isSilentUpdate, true);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$cancelDownloadInternal$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
