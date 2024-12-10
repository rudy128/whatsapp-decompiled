package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.AUv  reason: case insensitive filesystem */
public final class C20689AUv implements NewsletterMetadataFields.ThreadMetadata.Picture {
    public final NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture A00;

    public String BQg() {
        return this.A00.A0F("direct_path");
    }

    public void Bat() {
        this.A00.A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public String getId() {
        return C20125A8k.A08(this.A00);
    }

    public C20689AUv(NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.ThreadMetadata.Picture picture) {
        this.A00 = picture;
    }

    public /* bridge */ /* synthetic */ void Bb6() {
    }
}
