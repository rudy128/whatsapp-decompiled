package X;

import com.whatsapp.infra.graphql.generated.usermetadata.NotificationUserReachoutTimelockUpdateResponseImpl;

/* renamed from: X.41u  reason: invalid class name and case insensitive filesystem */
public final class C820441u extends AnonymousClass2SE {
    public final C57972jw A00;

    public C820441u(C57972jw r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A02(C172768tz r5) {
        C18070vi.A0d(r5, 0);
        C20125A8k A09 = r5.A00.A09(NotificationUserReachoutTimelockUpdateResponseImpl.Xwa2NotifyAccountReachoutTimelock.class, "xwa2_notify_account_reachout_timelock");
        C18070vi.A0X(A09);
        this.A00.A00(A09.A0G("is_active"), A09.A0F("time_enforcement_ends"));
    }

    public Class A00() {
        return NotificationUserReachoutTimelockUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationUserReachoutTimelockUpdate";
    }
}
