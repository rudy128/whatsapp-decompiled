package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.AUm  reason: case insensitive filesystem */
public final class C20680AUm implements NewsletterMetadataFields.State {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State A00;

    public GraphQLXWA2NewsletterStateType Baq() {
        return (GraphQLXWA2NewsletterStateType) this.A00.A0D(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public C20680AUm(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state) {
        this.A00 = state;
    }
}
