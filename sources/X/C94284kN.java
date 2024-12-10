package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4kN  reason: invalid class name and case insensitive filesystem */
public class C94284kN implements C72093Kp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C94284kN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CC1() {
        switch (this.A00) {
            case 0:
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(((Context) this.A02).getPackageName(), "com.whatsapp.settings.SettingsContactsActivity");
                ((Fragment) this.A01).A1k(A0A);
                return;
            case 1:
                C94604kt.A03((C94604kt) this.A01, (AnonymousClass73C) this.A02);
                return;
            case 2:
                ConversationsFragment conversationsFragment = ((C34091ju) this.A01).A0Q;
                AnonymousClass1BI r2 = ((AnonymousClass1E7) this.A02).A0J;
                conversationsFragment.BqW((UserJid) r2, conversationsFragment.A0s.A0O(r2));
                return;
            default:
                ((Fragment) this.A01).startActivityForResult((Intent) this.A02, 1);
                return;
        }
    }
}
