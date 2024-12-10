package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;

public final class AVA implements NewsletterMetadataFields {
    public final NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange A00;

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.State BZb() {
        NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state = (NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) this.A00.A09(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class, "state");
        if (state != null) {
            return new C20680AUm(state);
        }
        return null;
    }

    public AVA(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange xwa2NotifyNewsletterOnStateChange) {
        this.A00 = xwa2NotifyNewsletterOnStateChange;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ThreadMetadata BaL() {
        return null;
    }

    public /* bridge */ /* synthetic */ NewsletterMetadataFields.ViewerMetadata Bbe() {
        return null;
    }
}
