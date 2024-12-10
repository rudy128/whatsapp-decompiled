package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

/* renamed from: X.5TA  reason: invalid class name */
public final class AnonymousClass5TA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TA(ListsHomeFragment listsHomeFragment) {
        super(1);
        this.this$0 = listsHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C42011xT A0O;
        BM5 bm5;
        Number number = (Number) obj;
        if (number != null) {
            ListsHomeFragment listsHomeFragment = this.this$0;
            int intValue = number.intValue();
            RecyclerView recyclerView = listsHomeFragment.A01;
            if (!(recyclerView == null || (A0O = recyclerView.A0O(intValue)) == null || (bm5 = listsHomeFragment.A00) == null)) {
                bm5.A0A(A0O);
            }
        }
        return C27621Wu.A00;
    }
}
