package X;

import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1;
import com.whatsapp.util.Log;

/* renamed from: X.4gx  reason: invalid class name and case insensitive filesystem */
public class C92224gx implements C26181Rd {
    public final int A00;
    public final Object A01;

    public C92224gx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BvR() {
        if (this.A00 != 0) {
            ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = (ConversationsSuggestedContactsViewModel) this.A01;
            conversationsSuggestedContactsViewModel.A06.unregisterObserver(this);
            AnonymousClass3MW.A1X(conversationsSuggestedContactsViewModel.A0M, new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(conversationsSuggestedContactsViewModel, (C30391dr) null), C41561wd.A00(conversationsSuggestedContactsViewModel));
            return;
        }
        Log.i("JoinLinkedSubGroupViewModelloadGroupInfo/xmppHandlerConnected");
        AnonymousClass3VM r1 = (AnonymousClass3VM) this.A01;
        r1.A0I.unregisterObserver(this);
        r1.A0U(true);
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }
}
