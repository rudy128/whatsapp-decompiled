package X;

import com.whatsapp.lists.ListsManagerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel", f = "ListsManagerViewModel.kt", i = {}, l = {321}, m = "addMembers", n = {}, s = {})
/* renamed from: X.4tp  reason: invalid class name and case insensitive filesystem */
public final class C100014tp extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100014tp(ListsManagerViewModel listsManagerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = listsManagerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ListsManagerViewModel.A03((C41761x1) null, this.this$0, this);
    }
}
