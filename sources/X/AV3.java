package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

public final class AV3 implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata A00;

    public NewsletterMetadataFields.ThreadMetadata.Settings BZ6() {
        return null;
    }

    public String BPf() {
        return this.A00.A0F("creation_time");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description BQW() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description description = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new C20681AUn(description);
        }
        return null;
    }

    public String BRt() {
        return this.A00.A0F("followers_count");
    }

    public String BSE() {
        return this.A00.A0F("handle");
    }

    public String BTE() {
        return this.A00.A0F("invite");
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name BVC() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new C20684AUq(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BX7() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image image = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image.class, "image");
        if (image != null) {
            return new C20687AUt(image);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BXR() {
        NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview preview = (NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview) this.A00.A09(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new C20690AUw(preview);
        }
        return null;
    }

    public String BZp() {
        return this.A00.A0F("subscribers_count");
    }

    public GraphQLXWA2NewsletterVerifyState BbN() {
        return (GraphQLXWA2NewsletterVerifyState) this.A00.A0D(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
    }

    public GraphQLXWA2NewsletterVerifySource BbO() {
        return (GraphQLXWA2NewsletterVerifySource) this.A00.A0D(GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
    }

    public AV3(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFieldsImpl.ThreadMetadata.WamoSub Bbk() {
        return null;
    }
}
