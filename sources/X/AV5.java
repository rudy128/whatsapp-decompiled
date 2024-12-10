package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

public final class AV5 implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description BQW() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description description = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new C20682AUo(description);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name BVC() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name name = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new C20685AUr(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BX7() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture picture = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture.class, "picture");
        if (picture != null) {
            return new C20689AUv(picture);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BXR() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview preview = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new C20692AUy(preview);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings BZ6() {
        NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings settings = (NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings) this.A00.A09(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Settings.class, "settings");
        if (settings != null) {
            return new AV2(settings);
        }
        return null;
    }

    public GraphQLXWA2NewsletterVerifyState BbN() {
        return (GraphQLXWA2NewsletterVerifyState) this.A00.A0D(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
    }

    public GraphQLXWA2NewsletterVerifySource BbO() {
        return (GraphQLXWA2NewsletterVerifySource) this.A00.A0D(GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
    }

    public AV5(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }

    public /* bridge */ /* synthetic */ String BPf() {
        return null;
    }

    public /* bridge */ /* synthetic */ String BRt() {
        return null;
    }

    public /* bridge */ /* synthetic */ String BSE() {
        return null;
    }

    public /* bridge */ /* synthetic */ String BTE() {
        return null;
    }

    public /* bridge */ /* synthetic */ String BZp() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFieldsImpl.ThreadMetadata.WamoSub Bbk() {
        return null;
    }
}
