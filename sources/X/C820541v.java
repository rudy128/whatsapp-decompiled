package X;

import com.whatsapp.infra.graphql.generated.usermetadata.NotificationUserBrigadingUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState;

/* renamed from: X.41v  reason: invalid class name and case insensitive filesystem */
public final class C820541v extends AnonymousClass2SE {
    public final C39531tE A00;
    public final AnonymousClass1KB A01;

    public void A02(C172768tz r5) {
        C18070vi.A0d(r5, 0);
        Enum A0D = r5.A00.A09(NotificationUserBrigadingUpdateResponseImpl.Xwa2NotifyBrigading.class, "xwa2_notify_brigading").A0D(GraphQLXWA2BrigadingState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "state");
        C18070vi.A0X(A0D);
        this.A01.CGP(new C21433Ak0(this, A0D, 25));
    }

    public Class A00() {
        return NotificationUserBrigadingUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationUserBrigadingUpdate";
    }

    public C820541v(AnonymousClass1KB r1, C39531tE r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
