package X;

import com.whatsapp.lists.ListsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository", f = "ListsRepository.kt", i = {}, l = {186}, m = "getHiddenLists", n = {}, s = {})
/* renamed from: X.3FB  reason: invalid class name */
public final class AnonymousClass3FB extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FB(ListsRepository listsRepository, C30391dr r2) {
        super(r2);
        this.this$0 = listsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A07(this);
    }
}
