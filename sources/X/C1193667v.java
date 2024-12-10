package X;

import com.whatsapp.dobverification.AgeCollectionNotificationHandler$handleNotification$1$1;
import com.whatsapp.dobverification.DosaRepository;
import com.whatsapp.infra.graphql.generated.age_collection.NotificationAgeCollectionResponseImpl;
import com.whatsapp.infra.graphql.generated.age_collection.enums.GraphQLXWA2AgeCollectionStatus;

/* renamed from: X.67v  reason: invalid class name and case insensitive filesystem */
public final class C1193667v extends AnonymousClass2SE {
    public final DosaRepository A00;

    public C1193667v(DosaRepository dosaRepository) {
        C18070vi.A0d(dosaRepository, 1);
        this.A00 = dosaRepository;
    }

    public void A02(C172768tz r4) {
        C18070vi.A0d(r4, 0);
        Enum A0D = C108985cd.A0I(r4.A00, NotificationAgeCollectionResponseImpl.Xwa2NotifyAgeCollection.class, "xwa2_notify_age_collection").A0D(GraphQLXWA2AgeCollectionStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "status");
        C18070vi.A0X(A0D);
        AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AgeCollectionNotificationHandler$handleNotification$1$1(this, (GraphQLXWA2AgeCollectionStatus) A0D, (C30391dr) null));
    }

    public Class A00() {
        return NotificationAgeCollectionResponseImpl.class;
    }

    public String A01() {
        return "NotificationAgeCollection";
    }
}
