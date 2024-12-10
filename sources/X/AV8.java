package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

public final class AV8 implements NewsletterMetadataFields {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BaL() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata threadMetadata = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new AV5(threadMetadata);
        }
        return null;
    }

    public AV8(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate xwa2NotifyNewsletterOnMetadataUpdate) {
        this.A00 = xwa2NotifyNewsletterOnMetadataUpdate;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BZb() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata Bbe() {
        return null;
    }
}
