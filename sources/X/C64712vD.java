package X;

import android.view.View;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler$showContextMenuIfAvailable$1;

/* renamed from: X.2vD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64712vD implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass28H A02;

    public final boolean onLongClick(View view) {
        AnonymousClass28H r0 = this.A02;
        View view2 = this.A01;
        int i = this.A00;
        ConversationFilterMenuHandler conversationFilterMenuHandler = r0.A02;
        Object obj = r0.A05.get(i);
        C18070vi.A0X(obj);
        C41531wa r6 = (C41531wa) obj;
        C18070vi.A0d(r6, 1);
        C37571pl r2 = conversationFilterMenuHandler.A02;
        ConversationFilterMenuHandler$showContextMenuIfAvailable$1 conversationFilterMenuHandler$showContextMenuIfAvailable$1 = new ConversationFilterMenuHandler$showContextMenuIfAvailable$1(view2, r6, conversationFilterMenuHandler, (C30391dr) null, i);
        C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, conversationFilterMenuHandler$showContextMenuIfAvailable$1, r2);
        return true;
    }

    public /* synthetic */ C64712vD(View view, AnonymousClass28H r2, int i) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = i;
    }
}
