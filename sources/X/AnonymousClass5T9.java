package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.lists.home.ListsHomeActivity;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

/* renamed from: X.5T9  reason: invalid class name */
public final class AnonymousClass5T9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5T9(ListsHomeActivity listsHomeActivity) {
        super(1);
        this.this$0 = listsHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            ListsHomeActivity listsHomeActivity = this.this$0;
            Fragment A0O = listsHomeActivity.getSupportFragmentManager().A0O(2131430999);
            if (A0O instanceof ListsHomeFragment) {
                ((ListsHomeFragment) A0O).A25();
            }
            ListsHomeActivity.A03(listsHomeActivity);
        }
        return C27621Wu.A00;
    }
}
