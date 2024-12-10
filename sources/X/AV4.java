package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;

public final class AV4 implements NewsletterMetadataFields.ThreadMetadata {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata A00;

    public String BPf() {
        return null;
    }

    public String BRt() {
        return null;
    }

    public String BSE() {
        return null;
    }

    public String BTE() {
        return null;
    }

    public String BZp() {
        return null;
    }

    public GraphQLXWA2NewsletterVerifyState BbN() {
        return null;
    }

    public GraphQLXWA2NewsletterVerifySource BbO() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Description BQW() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description description = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description.class, "description");
        if (description != null) {
            return new C20683AUp(description);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Name BVC() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name name = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (name != null) {
            return new C20686AUs(name);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Picture BX7() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Picture picture = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Picture) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Picture.class, "picture");
        if (picture != null) {
            return new C20688AUu(picture);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Preview BXR() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview preview = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview.class, "preview");
        if (preview != null) {
            return new C20691AUx(preview);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata.Settings BZ6() {
        NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings settings = (NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings) this.A00.A09(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.class, "settings");
        if (settings != null) {
            return new AV1(settings);
        }
        return null;
    }

    public AV4(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata threadMetadata) {
        this.A00 = threadMetadata;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFieldsImpl.ThreadMetadata.WamoSub Bbk() {
        return null;
    }
}
