package X;

import com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel", f = "NewChatSuggestedContactsPrefetchViewModel.kt", i = {0}, l = {152}, m = "prefetchAndCacheRecentlySeenTenuredUserOnlyVariantData", n = {"this"}, s = {"L$0"})
/* renamed from: X.7Uv  reason: invalid class name and case insensitive filesystem */
public final class C147877Uv extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewChatSuggestedContactsPrefetchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147877Uv(NewChatSuggestedContactsPrefetchViewModel newChatSuggestedContactsPrefetchViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = newChatSuggestedContactsPrefetchViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NewChatSuggestedContactsPrefetchViewModel.A05(this.this$0, this);
    }
}
