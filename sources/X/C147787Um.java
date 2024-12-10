package X;

import com.whatsapp.ml.v2.repo.MLModelRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.repo.MLModelRepository", f = "MLModelRepository.kt", i = {0, 0, 0}, l = {202}, m = "saveModel$app_productinfra_ml_ml", n = {"this", "model", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.7Um  reason: invalid class name and case insensitive filesystem */
public final class C147787Um extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MLModelRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147787Um(MLModelRepository mLModelRepository, C30391dr r2) {
        super(r2);
        this.this$0 = mLModelRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass708) null, this);
    }
}
