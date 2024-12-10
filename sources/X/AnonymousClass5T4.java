package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.lists.ListsManagerBottomSheetFragment;
import com.whatsapp.lists.ListsManagerFragment;

/* renamed from: X.5T4  reason: invalid class name */
public final class AnonymousClass5T4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5T4(ListsManagerFragment listsManagerFragment) {
        super(1);
        this.this$0 = listsManagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        DialogFragment dialogFragment;
        AnonymousClass42Y r6 = (AnonymousClass42Y) obj;
        C18070vi.A0d(r6, 0);
        Fragment fragment = this.this$0.A0E;
        if ((fragment instanceof ListsManagerBottomSheetFragment) && (dialogFragment = (DialogFragment) fragment) != null) {
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
            AnonymousClass1D6.A03("labelInfo", r6.A00, r1, 0);
            AnonymousClass3MY.A16(AnonymousClass9O6.A00(r1), dialogFragment, "create_new_list_result");
            dialogFragment.A28();
        }
        return C27621Wu.A00;
    }
}
