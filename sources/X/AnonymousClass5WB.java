package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.lists.ListsConversationManagementActivity;
import com.whatsapp.lists.ListsConversationsManagementViewModel;
import com.whatsapp.lists.ListsConversationsManagementViewModel$updateLabelInfo$1;
import com.whatsapp.lists.ListsManagerFragment;
import com.whatsapp.lists.ListsManagerViewModel;
import com.whatsapp.lists.ListsManagerViewModel$getConversations$1;

/* renamed from: X.5WB  reason: invalid class name */
public final class AnonymousClass5WB extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ ListsConversationManagementActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5WB(ListsConversationManagementActivity listsConversationManagementActivity) {
        super(2);
        this.this$0 = listsConversationManagementActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ListsManagerFragment listsManagerFragment;
        C41761x1 r3;
        Bundle bundle = (Bundle) obj2;
        C18070vi.A0d(bundle, 1);
        if (bundle.getBoolean("labelInfoKey")) {
            Fragment A0O = this.this$0.getSupportFragmentManager().A0O(2131430999);
            if (!(!(A0O instanceof ListsManagerFragment) || (listsManagerFragment = (ListsManagerFragment) A0O) == null || (r3 = this.this$0.A00) == null)) {
                ListsManagerViewModel A0p = AnonymousClass3Ma.A0p(listsManagerFragment);
                A0p.A05 = true;
                A0p.A00 = r3;
                AnonymousClass1OX A00 = C41561wd.A00(A0p);
                ListsManagerViewModel$getConversations$1 listsManagerViewModel$getConversations$1 = new ListsManagerViewModel$getConversations$1(r3, A0p, (C30391dr) null);
                AnonymousClass1OR r6 = AnonymousClass1OR.A00;
                Integer A0w = AnonymousClass3MW.A0w(r6, listsManagerViewModel$getConversations$1, A00);
                ListsConversationsManagementViewModel listsConversationsManagementViewModel = (ListsConversationsManagementViewModel) this.this$0.A02.getValue();
                long j = r3.A03;
                C30451dy.A02(A0w, r6, new ListsConversationsManagementViewModel$updateLabelInfo$1(listsConversationsManagementViewModel, (C30391dr) null, j), C41561wd.A00(listsConversationsManagementViewModel));
            }
        }
        return C27621Wu.A00;
    }
}
