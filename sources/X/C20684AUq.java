package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;

/* renamed from: X.AUq  reason: case insensitive filesystem */
public final class C20684AUq implements NewsletterMetadataFields.ThreadMetadata.Name {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name A00;

    public String BaG() {
        return this.A00.A0F("text");
    }

    public String getId() {
        return C72453Mb.A0z(this.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C20684AUq(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Name name) {
        this.A00 = name;
    }
}
