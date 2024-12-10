package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

/* renamed from: X.AUw  reason: case insensitive filesystem */
public final class C20690AUw implements NewsletterMetadataFields.ThreadMetadata.Preview {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview A00;

    public String BQg() {
        return this.A00.A0F("direct_path");
    }

    public void Bau() {
        this.A00.A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public String getId() {
        return C20125A8k.A08(this.A00);
    }

    public C20690AUw(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.ThreadMetadata.Preview preview) {
        this.A00 = preview;
    }

    public /* bridge */ /* synthetic */ void Bb7() {
    }
}
