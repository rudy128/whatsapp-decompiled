package X;

import com.whatsapp.ml.v2.MLModelDownloaderManagerV2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelDownloaderManagerV2", f = "MLModelDownloaderManagerV2.kt", i = {}, l = {96}, m = "append", n = {}, s = {})
/* renamed from: X.7TP  reason: invalid class name */
public final class AnonymousClass7TP extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MLModelDownloaderManagerV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TP(MLModelDownloaderManagerV2 mLModelDownloaderManagerV2, C30391dr r2) {
        super(r2);
        this.this$0 = mLModelDownloaderManagerV2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MLModelDownloaderManagerV2.A01(this.this$0, (AnonymousClass8Ak) null, this);
    }
}
