package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.AUt  reason: case insensitive filesystem */
public final class C20687AUt implements NewsletterMetadataFields.ThreadMetadata.Picture {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image A00;

    public String BQg() {
        return this.A00.A0F("direct_path");
    }

    public void Bat() {
        this.A00.A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public String getId() {
        return C20125A8k.A08(this.A00);
    }

    public C20687AUt(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Image image) {
        this.A00 = image;
    }

    public /* bridge */ /* synthetic */ void Bb6() {
    }
}
