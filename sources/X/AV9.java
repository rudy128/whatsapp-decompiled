package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

public final class AV9 implements NewsletterMetadataFields {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BaL() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata threadMetadata = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.class, "thread_metadata");
        if (threadMetadata != null) {
            return new AV4(threadMetadata);
        }
        return null;
    }

    public AV9(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate xwa2NotifyNewsletterOwnerOnMetadataUpdate) {
        this.A00 = xwa2NotifyNewsletterOwnerOnMetadataUpdate;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BZb() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata Bbe() {
        return null;
    }
}
