package X;

import com.whatsapp.infra.graphql.generated.usernames.UsernameSetNotificationResponseImpl;

/* renamed from: X.8uX  reason: invalid class name and case insensitive filesystem */
public final class C173108uX extends AnonymousClass2SE {
    public final AnonymousClass1M4 A00;

    public C173108uX(AnonymousClass1M4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Class A00() {
        return UsernameSetNotificationResponseImpl.class;
    }

    public String A01() {
        return "UsernameSetNotification";
    }

    public void A02(C172768tz r4) {
        UsernameSetNotificationResponseImpl.Xwa2NotifyUsernameOnChange xwa2NotifyUsernameOnChange = (UsernameSetNotificationResponseImpl.Xwa2NotifyUsernameOnChange) C199129zU.A00(r4).A09(UsernameSetNotificationResponseImpl.Xwa2NotifyUsernameOnChange.class, "xwa2_notify_username_on_change");
        if (xwa2NotifyUsernameOnChange.A0H() != null) {
            AnonymousClass1E2 A0H = xwa2NotifyUsernameOnChange.A0H();
            C18070vi.A0X(A0H);
            this.A00.Bdc(A0H, C72453Mb.A0z(xwa2NotifyUsernameOnChange, "username"));
        }
    }
}
