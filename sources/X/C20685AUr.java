package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;

/* renamed from: X.AUr  reason: case insensitive filesystem */
public final class C20685AUr implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name A00;

    public String BaG() {
        return this.A00.A0F("text");
    }

    public String getId() {
        return C72453Mb.A0z(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C20685AUr(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
