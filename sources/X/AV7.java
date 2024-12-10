package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

public final class AV7 implements NewsletterMetadataFields {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BZb() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State state = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State.class, "state");
        if (state != null) {
            return new C20679AUl(state);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BaL() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new AV3(threadMetadata);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata Bbe() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata.class, "viewer_metadata");
        if (viewerMetadata != null) {
            return new AV6(viewerMetadata);
        }
        return null;
    }

    public AV7(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin xwa2NotifyNewsletterOnJoin) {
        this.A00 = xwa2NotifyNewsletterOnJoin;
    }
}
