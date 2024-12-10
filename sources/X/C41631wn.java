package X;

import com.whatsapp.lists.ListsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository", f = "ListsRepository.kt", i = {}, l = {181}, m = "getLists", n = {}, s = {})
/* renamed from: X.1wn  reason: invalid class name and case insensitive filesystem */
public final class C41631wn extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41631wn(ListsRepository listsRepository, C30391dr r2) {
        super(r2);
        this.this$0 = listsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A08(this);
    }
}
