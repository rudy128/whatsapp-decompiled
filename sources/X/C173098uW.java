package X;

import com.whatsapp.infra.graphql.generated.usernames.UsernameDeleteNotificationResponseImpl;

/* renamed from: X.8uW  reason: invalid class name and case insensitive filesystem */
public final class C173098uW extends AnonymousClass2SE {
    public final AnonymousClass1M4 A00;

    public C173098uW(AnonymousClass1M4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Class A00() {
        return UsernameDeleteNotificationResponseImpl.class;
    }

    public String A01() {
        return "UsernameDeleteNotification";
    }

    public void A02(C172768tz r5) {
        UsernameDeleteNotificationResponseImpl.Xwa2NotifyUsernameDelete xwa2NotifyUsernameDelete = (UsernameDeleteNotificationResponseImpl.Xwa2NotifyUsernameDelete) C199129zU.A00(r5).A09(UsernameDeleteNotificationResponseImpl.Xwa2NotifyUsernameDelete.class, "xwa2_notify_username_delete");
        if (xwa2NotifyUsernameDelete.A0H() != null) {
            AnonymousClass1E2 A0H = xwa2NotifyUsernameDelete.A0H();
            C18070vi.A0X(A0H);
            String A0z = C72453Mb.A0z(xwa2NotifyUsernameDelete, "display_name");
            AnonymousClass1M4 r1 = this.A00;
            r1.Bdc(A0H, "");
            r1.Bdb(A0H, A0z);
        }
    }
}
