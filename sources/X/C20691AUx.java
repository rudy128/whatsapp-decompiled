package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.AUx  reason: case insensitive filesystem */
public final class C20691AUx implements NewsletterMetadataFields.ThreadMetadata.Preview {
    public final NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview A00;

    public String BQg() {
        return this.A00.A0F("direct_path");
    }

    public void Bau() {
        this.A00.A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public String getId() {
        return C20125A8k.A08(this.A00);
    }

    public C20691AUx(NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview preview) {
        this.A00 = preview;
    }

    public /* bridge */ /* synthetic */ void Bb7() {
    }
}
