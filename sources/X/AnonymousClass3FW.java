package X;

import com.whatsapp.lists.ListsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository", f = "ListsRepository.kt", i = {0, 0, 0, 1}, l = {120, 123}, m = "updateListHidden", n = {"this", "labelInfo", "newHidden", "status"}, s = {"L$0", "L$1", "Z$0", "J$0"})
/* renamed from: X.3FW  reason: invalid class name */
public final class AnonymousClass3FW extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FW(ListsRepository listsRepository, C30391dr r2) {
        super(r2);
        this.this$0 = listsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05((C41761x1) null, this, 0, false);
    }
}
