package X;

import com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel", f = "NewChatSuggestedContactsPrefetchViewModel.kt", i = {0}, l = {73, 74, 78, 82}, m = "prefetchAndCacheSuggestionsBasedOnVariant", n = {"this"}, s = {"L$0"})
/* renamed from: X.7UD  reason: invalid class name */
public final class AnonymousClass7UD extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewChatSuggestedContactsPrefetchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UD(NewChatSuggestedContactsPrefetchViewModel newChatSuggestedContactsPrefetchViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = newChatSuggestedContactsPrefetchViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NewChatSuggestedContactsPrefetchViewModel.A07(this.this$0, this);
    }
}
