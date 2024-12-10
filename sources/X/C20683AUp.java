package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

/* renamed from: X.AUp  reason: case insensitive filesystem */
public final class C20683AUp implements NewsletterMetadataFields.ThreadMetadata.Description {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description A00;

    public String BaG() {
        return this.A00.A0F("text");
    }

    public String getId() {
        return C72453Mb.A0z(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C20683AUp(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description description) {
        this.A00 = description;
    }
}
