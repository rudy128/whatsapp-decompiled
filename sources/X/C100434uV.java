package X;

import com.whatsapp.lists.ListsManagerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel", f = "ListsManagerViewModel.kt", i = {0}, l = {310}, m = "deleteMembers", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uV  reason: invalid class name and case insensitive filesystem */
public final class C100434uV extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100434uV(ListsManagerViewModel listsManagerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = listsManagerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ListsManagerViewModel.A04((C41761x1) null, this.this$0, this);
    }
}
