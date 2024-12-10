package X;

import android.view.ViewGroup;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.4mf  reason: invalid class name and case insensitive filesystem */
public class C95704mf implements C107335Zh {
    public final int A00;
    public final Object A01;

    public C95704mf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Boi() {
        if (this.A00 != 0) {
            AnonymousClass4aY r3 = (AnonymousClass4aY) this.A01;
            AnonymousClass10I A0w = AnonymousClass3MX.A0w(r3);
            UserJid A0j = AnonymousClass3MW.A0j(r3);
            if (A0j != null) {
                C98704ra.A00(A0w, r3, A0j, 26);
            }
            C108645c3 r1 = r3.A4e;
            if (r1 != null && r1.BT1()) {
                r1.BF9();
                ((ViewGroup) r3.A2Q.getWindow().getDecorView()).removeView(r3.A4d);
                ConversationListView conversationListView = r3.A2B;
                C36771oR r2 = r3.A1n;
                C18070vi.A0d(r2, 0);
                Set set = conversationListView.A0U.A00;
                synchronized (set) {
                    set.remove(r2);
                }
                r3.A4d = null;
            }
        }
    }
}
