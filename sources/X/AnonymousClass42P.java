package X;

import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.42P  reason: invalid class name */
public class AnonymousClass42P extends AnonymousClass9BZ {
    public final AnonymousClass1KB A00;
    public final WeakReference A01;

    public void A0J() {
        AnonymousClass1FU r0 = (AnonymousClass1FU) this.A01.get();
        if (r0 != null) {
            r0.CEx();
            this.A00.A08(2131895356, 0);
        }
    }

    public void A0K() {
        AnonymousClass1FU r0 = (AnonymousClass1FU) this.A01.get();
        if (r0 != null) {
            r0.CEx();
            this.A00.A08(2131895357, 0);
        }
    }

    public AnonymousClass42P(AnonymousClass1KB r2, AnonymousClass11P r3, GroupChatInfoActivity groupChatInfoActivity, AnonymousClass12M r5, AnonymousClass1EC r6, UserJid userJid) {
        super(r3, r5, r6, userJid);
        this.A00 = r2;
        this.A01 = AnonymousClass3MW.A0z(groupChatInfoActivity);
    }
}
