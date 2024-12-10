package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment;
import java.util.Set;

/* renamed from: X.3AL  reason: invalid class name */
public class AnonymousClass3AL implements C72323Lm {
    public final /* synthetic */ AnonymousClass1GP A00;
    public final /* synthetic */ C34091ju A01;

    public AnonymousClass3AL(AnonymousClass1GP r1, C34091ju r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BG5() {
        AnonymousClass1GP r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0Q;
        conversationsFragment.A2f.CGD(new C49272Pv((DialogFragment) new Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A22, (Set) conversationsFragment.A3g, true), new Object[0]);
    }

    public void Bc3(boolean z) {
        AnonymousClass1GP r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0Q;
        conversationsFragment.A2f.CGD(new C49272Pv((DialogFragment) new Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A22, (Set) conversationsFragment.A3g, z), new Object[0]);
    }
}
