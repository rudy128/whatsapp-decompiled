package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput;
import com.whatsapp.suggestions.networking.SuggestedContactsFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.networking.SuggestedContactsFetcher", f = "SuggestedContactsFetcher.kt", i = {}, l = {41}, m = "fetch", n = {}, s = {})
/* renamed from: X.4uf  reason: invalid class name and case insensitive filesystem */
public final class C100534uf extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestedContactsFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100534uf(SuggestedContactsFetcher suggestedContactsFetcher, C30391dr r2) {
        super(r2);
        this.this$0 = suggestedContactsFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((XWA2GrowthSuggestedContactsInput) null, this);
    }
}
