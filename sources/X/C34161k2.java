package X;

import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.conversationslist.filter.ConversationFilterViewModel;

/* renamed from: X.1k2  reason: invalid class name and case insensitive filesystem */
public class C34161k2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ConversationsFragment A00;

    public void onViewDetachedFromWindow(View view) {
    }

    public C34161k2(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onViewAttachedToWindow(View view) {
        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel;
        ConversationsFragment conversationsFragment = this.A00;
        C110495fx r0 = conversationsFragment.A1e;
        if (r0 != null && (conversationsSuggestedContactsViewModel = r0.A04) != null) {
            ConversationFilterViewModel conversationFilterViewModel = conversationsFragment.A1k;
            if (conversationFilterViewModel != null) {
                conversationsSuggestedContactsViewModel.A00 = conversationFilterViewModel.A00;
            }
            conversationsSuggestedContactsViewModel.A0D.A09(conversationsFragment.A1G());
            conversationsSuggestedContactsViewModel.A0D.A0A(conversationsFragment.A1G(), new C91604fx(conversationsFragment, 8));
            C41731wy r3 = conversationsSuggestedContactsViewModel.A0F;
            r3.A09(conversationsFragment.A1G());
            r3.A0A(conversationsFragment.A1G(), new C91604fx(conversationsFragment, 9));
        }
    }
}
