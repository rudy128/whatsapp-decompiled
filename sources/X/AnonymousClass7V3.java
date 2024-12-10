package X;

import com.whatsapp.ml.v2.MLModelDownloaderManagerV2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelDownloaderManagerV2", f = "MLModelDownloaderManagerV2.kt", i = {0, 0, 0, 0, 1}, l = {74, 78, 78}, m = "processDownloading", n = {"this", "provider", "progressListener", "$this$processDownloading_u24lambda_u241", "fileProgressListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: X.7V3  reason: invalid class name */
public final class AnonymousClass7V3 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MLModelDownloaderManagerV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V3(MLModelDownloaderManagerV2 mLModelDownloaderManagerV2, C30391dr r2) {
        super(r2);
        this.this$0 = mLModelDownloaderManagerV2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass8Ak) null, (String) null, this, (C36001nB) null);
    }
}
