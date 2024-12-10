package X;

import com.whatsapp.data.repository.MetaAISearchRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.repository.MetaAISearchRepository", f = "MetaAISearchRepository.kt", i = {0}, l = {66}, m = "getEmptyStateSearchSuggestions", n = {"this"}, s = {"L$0"})
/* renamed from: X.7Tl  reason: invalid class name and case insensitive filesystem */
public final class C147517Tl extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAISearchRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147517Tl(MetaAISearchRepository metaAISearchRepository, C30391dr r2) {
        super(r2);
        this.this$0 = metaAISearchRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this);
    }
}
