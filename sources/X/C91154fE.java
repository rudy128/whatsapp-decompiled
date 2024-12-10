package X;

import android.view.MenuItem;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$markAsRead$1;

/* renamed from: X.4fE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91154fE implements C15930rR {
    public final /* synthetic */ ConversationFilterMenuHandler A00;
    public final /* synthetic */ String A01;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ConversationFilterMenuHandler conversationFilterMenuHandler = this.A00;
        String str = this.A01;
        if (menuItem.getItemId() != 2131429635) {
            return true;
        }
        AnonymousClass3MX.A1Q(new ConversationFilterMenuHandler$markAsRead$1(conversationFilterMenuHandler, str, (C30391dr) null), conversationFilterMenuHandler.A02);
        return true;
    }

    public /* synthetic */ C91154fE(ConversationFilterMenuHandler conversationFilterMenuHandler, String str) {
        this.A00 = conversationFilterMenuHandler;
        this.A01 = str;
    }
}
