package X;

import com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.graphql.MLModelMetadataGraphqlFetcher", f = "MLModelMetadataGraphqlFetcher.kt", i = {0, 0, 0, 0}, l = {131}, m = "fetch-BWLJW6A", n = {"this", "name", "supportedCompression", "version"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: X.7V2  reason: invalid class name */
public final class AnonymousClass7V2 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MLModelMetadataGraphqlFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V2(MLModelMetadataGraphqlFetcher mLModelMetadataGraphqlFetcher, C30391dr r2) {
        super(r2);
        this.this$0 = mLModelMetadataGraphqlFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A00((String) null, (String) null, this, 0));
    }
}
