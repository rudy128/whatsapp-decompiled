package X;

import android.app.Activity;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.42Q  reason: invalid class name */
public class AnonymousClass42Q extends AnonymousClass9BZ {
    public final AnonymousClass1KB A00;
    public final WeakReference A01;

    public void A0J() {
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A01.get();
        if (viewGroupInviteActivity != null) {
            ViewGroupInviteActivity.A03(viewGroupInviteActivity, 2131895356);
        }
    }

    public void A0K() {
        Activity activity = (Activity) this.A01.get();
        if (activity != null) {
            this.A00.A08(2131895357, 0);
            activity.finish();
        }
    }

    public AnonymousClass42Q(AnonymousClass1KB r2, AnonymousClass11P r3, AnonymousClass12M r4, ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass1EC r6, UserJid userJid) {
        super(r3, r4, r6, userJid);
        this.A00 = r2;
        this.A01 = AnonymousClass3MW.A0z(viewGroupInviteActivity);
    }
}
