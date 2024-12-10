package X;

import com.whatsapp.lists.ListsManagerFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerFragment", f = "ListsManagerFragment.kt", i = {0, 0, 1}, l = {243, 245}, m = "updateListFilterIfNeeded", n = {"this", "labelInfo", "result"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: X.4uu  reason: invalid class name and case insensitive filesystem */
public final class C100684uu extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100684uu(ListsManagerFragment listsManagerFragment, C30391dr r2) {
        super(r2);
        this.this$0 = listsManagerFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A25(this);
    }
}
