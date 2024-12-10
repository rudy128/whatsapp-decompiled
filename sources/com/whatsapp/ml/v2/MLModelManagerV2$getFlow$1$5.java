package com.whatsapp.ml.v2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6TT;
import X.AnonymousClass8Ak;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelManagerV2$getFlow$1$5", f = "MLModelManagerV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLModelManagerV2$getFlow$1$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass8Ak $provider;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLModelManagerV2$getFlow$1$5(AnonymousClass8Ak r2, C30391dr r3) {
        super(2, r3);
        this.$provider = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        MLModelManagerV2$getFlow$1$5 mLModelManagerV2$getFlow$1$5 = new MLModelManagerV2$getFlow$1$5(this.$provider, r4);
        mLModelManagerV2$getFlow$1$5.L$0 = obj;
        return mLModelManagerV2$getFlow$1$5;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                this.$provider.BkW((AnonymousClass6TT) this.L$0);
            } catch (Exception e) {
                Log.e("MLModelManagerV2/notifyModelDownloadStatus/failed to notify provider", e);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLModelManagerV2$getFlow$1$5) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
