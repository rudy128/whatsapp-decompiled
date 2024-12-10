package X;

import com.whatsapp.lists.ListsManagerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel", f = "ListsManagerViewModel.kt", i = {0, 0}, l = {155}, m = "createList", n = {"this", "entryPoint"}, s = {"L$0", "L$1"})
/* renamed from: X.4uv  reason: invalid class name and case insensitive filesystem */
public final class C100694uv extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100694uv(ListsManagerViewModel listsManagerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = listsManagerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0U((Integer) null, (String) null, this);
    }
}
