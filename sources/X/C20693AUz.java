package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;

/* renamed from: X.AUz  reason: case insensitive filesystem */
public final class C20693AUz implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes A00;

    public AnonymousClass1IX BNT() {
        return this.A00.A0C("blocked_codes");
    }

    public String BRE() {
        return this.A00.A0F("enabled_ts_sec");
    }

    public GraphQLXWA2NewsletterReactionCodesSettingValue BbA() {
        GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue = (GraphQLXWA2NewsletterReactionCodesSettingValue) this.A00.A0D(GraphQLXWA2NewsletterReactionCodesSettingValue.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value");
        C18070vi.A0X(graphQLXWA2NewsletterReactionCodesSettingValue);
        return graphQLXWA2NewsletterReactionCodesSettingValue;
    }

    public C20693AUz(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.ReactionCodes reactionCodes) {
        this.A00 = reactionCodes;
    }
}
