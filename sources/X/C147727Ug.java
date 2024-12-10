package X;

import com.whatsapp.data.repository.MetaAiTypeaheadRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.repository.MetaAiTypeaheadRepository", f = "MetaAiTypeaheadRepository.kt", i = {0, 0, 0}, l = {76}, m = "getTypeaheadSearchSuggestions", n = {"this", "queryParams", "fromCache"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: X.7Ug  reason: invalid class name and case insensitive filesystem */
public final class C147727Ug extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAiTypeaheadRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147727Ug(MetaAiTypeaheadRepository metaAiTypeaheadRepository, C30391dr r2) {
        super(r2);
        this.this$0 = metaAiTypeaheadRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((Object) null, this, 0);
    }
}
