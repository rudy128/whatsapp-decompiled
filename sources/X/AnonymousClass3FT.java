package X;

import com.whatsapp.lists.ListsRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository", f = "ListsRepository.kt", i = {0, 0, 0}, l = {425}, m = "reorderFavorites", n = {"this", "conversations", "labelInfo"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.3FT  reason: invalid class name */
public final class AnonymousClass3FT extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FT(ListsRepository listsRepository, C30391dr r2) {
        super(r2);
        this.this$0 = listsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03((C41761x1) null, (List) null, this);
    }
}
