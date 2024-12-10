package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.AUl  reason: case insensitive filesystem */
public final class C20679AUl implements NewsletterMetadataFields.State {
    public final NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State A00;

    public GraphQLXWA2NewsletterStateType Baq() {
        return (GraphQLXWA2NewsletterStateType) this.A00.A0D(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public C20679AUl(NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.State state) {
        this.A00 = state;
    }
}
