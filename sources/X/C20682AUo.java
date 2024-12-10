package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.AUo  reason: case insensitive filesystem */
public final class C20682AUo implements NewsletterMetadataFields.ThreadMetadata.Description {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description A00;

    public String BaG() {
        return this.A00.A0F("text");
    }

    public String getId() {
        return C72453Mb.A0z(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C20682AUo(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Description description) {
        this.A00 = description;
    }
}
