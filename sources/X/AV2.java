package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

public final class AV2 implements NewsletterMetadataFields.ThreadMetadata.Settings {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BXs() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes.class, "reaction_codes");
        if (reactionCodes != null) {
            return new AV0(reactionCodes);
        }
        return null;
    }

    public AV2(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings settings) {
        this.A00 = settings;
    }
}
