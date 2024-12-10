package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterWamoSubStatus;

public final class AV6 implements NewsletterMetadataFields.ViewerMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata A00;

    public GraphQLXWA2NewsletterMuteSetting BV8() {
        return (GraphQLXWA2NewsletterMuteSetting) this.A00.A0D(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
    }

    public GraphQLXWA2NewsletterRole BYO() {
        return (GraphQLXWA2NewsletterRole) this.A00.A0D(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
    }

    public GraphQLXWA2NewsletterWamoSubStatus Bbl() {
        return (GraphQLXWA2NewsletterWamoSubStatus) this.A00.A0D(GraphQLXWA2NewsletterWamoSubStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "wamo_sub_status");
    }

    public AV6(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ViewerMetadata viewerMetadata) {
        this.A00 = viewerMetadata;
    }
}
