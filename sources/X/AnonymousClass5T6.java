package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.lists.ListsManagerFragment;

/* renamed from: X.5T6  reason: invalid class name */
public final class AnonymousClass5T6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5T6(ListsManagerFragment listsManagerFragment) {
        super(1);
        this.this$0 = listsManagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C42011xT A0O;
        BM5 bm5;
        Number number = (Number) obj;
        if (number != null) {
            ListsManagerFragment listsManagerFragment = this.this$0;
            int intValue = number.intValue();
            RecyclerView recyclerView = listsManagerFragment.A01;
            if (!(recyclerView == null || (A0O = recyclerView.A0O(intValue)) == null || (bm5 = listsManagerFragment.A00) == null)) {
                bm5.A0A(A0O);
            }
        }
        return C27621Wu.A00;
    }
}
