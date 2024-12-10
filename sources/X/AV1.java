package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

public final class AV1 implements NewsletterMetadataFields.ThreadMetadata.Settings {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BXs() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes.class, "reaction_codes");
        if (reactionCodes != null) {
            return new C20693AUz(reactionCodes);
        }
        return null;
    }

    public AV1(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings settings) {
        this.A00 = settings;
    }
}
