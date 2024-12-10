package X;

import com.whatsapp.favorite.FavoritesChatsSuggestionManager;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoritesChatsSuggestionManager", f = "FavoritesChatsSuggestionManager.kt", i = {0, 0, 1}, l = {36, 46}, m = "getSuggestionsResult", n = {"this", "suggestionJobs", "this"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: X.4ut  reason: invalid class name and case insensitive filesystem */
public final class C100674ut extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FavoritesChatsSuggestionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100674ut(FavoritesChatsSuggestionManager favoritesChatsSuggestionManager, C30391dr r2) {
        super(r2);
        this.this$0 = favoritesChatsSuggestionManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((Set) null, this);
    }
}
