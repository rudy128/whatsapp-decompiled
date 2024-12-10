package X;

import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.SuggestionsEngine", f = "SuggestionsEngine.kt", i = {0, 0}, l = {145}, m = "getNewChatRecentlySeenTenuredContactsOnly", n = {"this", "excludedJids"}, s = {"L$0", "L$1"})
/* renamed from: X.3FQ  reason: invalid class name */
public final class AnonymousClass3FQ extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestionsEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FQ(SuggestionsEngine suggestionsEngine, C30391dr r2) {
        super(r2);
        this.this$0 = suggestionsEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A06((Set) null, this);
    }
}
