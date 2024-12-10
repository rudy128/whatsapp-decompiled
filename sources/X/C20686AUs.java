package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

/* renamed from: X.AUs  reason: case insensitive filesystem */
public final class C20686AUs implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name A00;

    public String BaG() {
        return this.A00.A0F("text");
    }

    public String getId() {
        return C72453Mb.A0z(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C20686AUs(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
